import axios from 'axios'
import qs from 'qs';

const baseUrls = {
  main: 'http://localhost:8601/study-security/',
};
const timeout = 5000;
const mainServer = axios.create({
  baseURL: baseUrls.main,
  timeout: timeout
});
mainServer.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded;charset=UTF-8';
// 添加请求拦截器
mainServer.interceptors.request.use(function (config) {
  // 在发送请求之前做些什么
  let params = dealWithParams(config.method, config.params || config.data);
  config[config.method === 'post' ? 'data' : 'params'] = params;
  return config;
}, function (error) {
  // 对请求错误做些什么
  return Promise.reject(error);
});
// 添加响应拦截器
mainServer.interceptors.response.use(function (response) {
    // 对响应数据做点什么
    if (response.status === 200) {
      if (response.data.code == '1') {
        return Promise.resolve(response.data.data);
      } else {
        return Promise.reject(response.data.message);
      }
    }
    return Promise.reject(response);
  },
  function (error) {
    // 对响应错误做点什么
    return Promise.reject(error);
  });
/**
 * 处理参数并添加token
 * @param params
 * @return {{}}
 */
function dealWithParams(method, params) {
  if (!params) params = {};
  if (method == 'post') {
    return qs.stringify(params);
  } else {
    return params;
  }
}

function getPromise(type, url, params) {
  let options = {
    url: url,
    method: type,
  };
  options[type == 'post' ? 'data' : 'params'] = dealWithParams(type, params);
  return axios(options);
}

const batchRequest = function (config) {
  let requests = [];
  config.forEach(e => {
    requests.push(getPromise(e.type || 'post', e.url, e.params));
  });
  return axios.all(requests);
};

export {mainServer, batchRequest, baseUrls}
