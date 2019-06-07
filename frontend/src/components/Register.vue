<template>
    <div>
      {{msg}}
      <h1 v-bind="data"></h1>
    </div>
</template>

<script>
    export default {
        name: "Register",
        data(){
          return {
            msg: 'hell register',
          }
        }
    }
</script>

<style scoped>

</style>
