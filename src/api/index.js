import {mainServer} from "./myAxios";

const apis = {
  test01: "test/f01",
};

export const test01 = function (params) {
  return mainServer.get(apis.test01, {params: params});
};
export const test02 = function (params) {
  return mainServer.get("http://localhost:9201/heatmap-demo/carTrack/getOne", {params: params});
};
