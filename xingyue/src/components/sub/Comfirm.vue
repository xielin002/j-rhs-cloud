<template>
  <div class="confirm-button">
    <button @click="getButtonClick">{{text || '确认'}}</button>
  </div>
    
</template>

<script>
export default {
  name: 'confirm-button',
  props:["text"],
  data () {
    return {
      msg: '你好'
    }
  },
  methods:{
    getButtonClick(){
      this.$emit("message", this.msg);
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
