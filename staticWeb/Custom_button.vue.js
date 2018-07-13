/**
 * Created by liupei on 2018/5/25.
 */
var custom_button={
  props:['text1'],
    data:
  function()
  {
    return {
      count: 0,
      index: 1
    }
  }
,
  template:'<button v-on:click="index++">you click me {{index}} times</button>',
}

//noinspection JSAnnotator
export default {
  name:custom_button
}
