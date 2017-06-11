package org.smart4j.framework.Proxy;

/**
 * Created by sxhcgw on 2017/6/11.
 */
public interface Proxy {
    /**
     * 执行链式代理
     */

    Object doProxy(ProxyChain proxyChain) throws Throwable;
}

