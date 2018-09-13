package org.smart4j.framework.proxy;

/**
 * 代理接口
 */
public interface Proxy {
    /**
     * 执行链式代理
     *
     * @param chain 代理链
     * @return 代理方法结果
     * @throws Throwable
     */
    Object doProxy(ProxyChain chain) throws Throwable;
}
