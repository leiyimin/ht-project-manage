<template>
  <div>
    <el-container style="height: 100%">
      <el-header><h2>Springboot study</h2></el-header>
      <el-container>
        <el-aside>
          <ul>
            <li>
              <el-button type="primary" @click="test01">test01</el-button>
            </li>
            <li>
              <el-button type="primary" @click="test02">test02</el-button>
            </li>
          </ul>
        </el-aside>
        <el-main>Main</el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
import {test01, test02} from "@/api";

export default {
  name: "Index",
  methods: {
    test01() {
      test01({name: "helihuo"});
    },
    test02() {
      test02({id: 44444});
    }
  }
}
</script>

<style scoped>

</style>
