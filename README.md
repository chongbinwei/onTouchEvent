# onTouchEvent
事件拦截和分发机制
对于Android 事件分发拦截，总结起来就是： 
先由外向里，再由里向外。 
由外向里的过程中：onInterceptTouchEvent 方法（ViewGroup才有）的返回值决定是否拦截触摸事件（true：拦截，false：不拦截）。如果 ViewGroup 拦截了触摸事件，那么其 onTouchEvent 就会被调用用来处理触摸事件。 
由里向外的过程中：onTouchEvent 方法的返回值决定是否处理完成触摸事件（true：已经处理完成，不需要给父 ViewGroup 处理，false：还没处理完成 ，需要传递给父 ViewGroup 处理）。
--------------------- 
