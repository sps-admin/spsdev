import IndexPage from './../components/IndexPage'
import MainPage from './../components/mainpage'
import Login from './../components/Login'

const routes=[
  {
    path:'/login',
    name:'login',
    component:Login
  },{
    path:'/',
    component:Login
  },
  {
    path:'/mainpage',
    component:MainPage
  }

]

export default routes

