<template>
  <div class="first-app">
    {{msg}}
    <confirm text="注册" @message="getMessage"/>
  </div>
    
</template>

<script>
import Confirm from '../sub/Comfirm'
export default {
  name: 'First',
  components:{
      Confirm
  },
  data () {
    return {
      msg: 'Welcome to Your First App'
    }
  },
  methods:{
      getMessage(val){
        alert(val);
      }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
