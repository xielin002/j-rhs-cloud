<template>
  <div class="login">
    {{ message }}
    <input v-model="username" placeholder="用户名">
    <input v-model="password" placeholder="密码">
    <button v-on:click="login">登陆 </button>
  </div>
</template>
 
<script>
    export default {
      name: "login",
      data() {
        return {
          message: 'Hello Vue!',
          username: '',
          password: ''
        }
      },
      http: {
        headers: {'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'}
      },
      methods: {
          login:function () {
              //alert("1");
              this.$http.get('http://localhost:9901/test/get',{name:this.username},
              {emulateJSON:true}).then(function(res){
                  console.log(res.data);
                  //window.location.href = 'index.html';
              },function(res){
                  console.log(res.status);
              });
          }
      },
      created:function(){
      }
 
    }
</script>
 
<style scoped>
 
</style>
