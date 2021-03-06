package com.chuyx.proxy;

/**
 * 代理模式
 *  通过代理模式访问控制被代理对象的（简单看来，代理对象和被代理对象都实现了一个接口（其实不实现也可以，但是为了方法的统一，实现一下）
 *                                 ，就是在代理对象里放一个被代理对象作为属性，通过代理对象去操作被代理对象属性的方法和属性）
 *  作用：代理前操作和代理后操作（比如买手机中间商）
 *  其他：
 *      代理模式还有JDK代理和CGLIB代理
 *  如本示例
 *      照片代理对象代理了真实的照片，可以去控制真实对象的展示方法和文件名
 * @author yuxiang.chu
 * @date 2021/11/22 15:54
 **/
public interface Image {

    void display();
}
