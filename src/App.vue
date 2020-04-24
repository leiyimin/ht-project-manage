<template>
  <div id="app">
    <router-view class="r-v"></router-view>
  </div>
</template>

<script>

export default {
  name: 'App',
};
</script>

<style>
  html, body {
    margin: 0;
    padding: 0;
  }

  body {
    position: fixed;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
  }

  #app {

    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    height: 100%;
  }

  .r-v {
    height: 100%;
  }
</style>
