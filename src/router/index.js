import Vue from 'vue'
import Router from 'vue-router'
import Login from "../views/Login";
import Index from "../views/Index";

Vue.use(Router);

export default new Router({
  routes: [{
    path: "/",
    component: Login,
  }, {
    path: "/login",
    name: "login",
    component: Login,
  }, {
    path: "/index",
    name: "index",
    component: Index,
  }]
});
