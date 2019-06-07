import Vue from 'vue';
import App from './App';
import router from './router';

// 배포 관련 tip 출력 option
Vue.config.productionTip = false;

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  render: h => h(App)
});
