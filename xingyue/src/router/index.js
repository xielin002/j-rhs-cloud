import Vue from 'vue'
import Router from 'vue-router'
import First from '@/components/views/First'
import Login from '@/components/login/Login'
import Fail from '@/components/login/Fail'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/first',
      name: 'First',
      component: First
    },{
      path: '/login',
      name: 'Login',
      component: Login
    },{
      path: '/fail',
      name: 'Fail',
      component: Fail
    }

  ]
})
