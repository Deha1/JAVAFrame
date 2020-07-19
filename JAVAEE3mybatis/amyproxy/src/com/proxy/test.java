package com.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

import com.inter.Buyhouse;
import com.inter.buyer;

public class test {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class proxyClazz= Proxy.getProxyClass(buyer.class.getClassLoader(), Buyhouse.class);
		Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);
		Buyhouse buyer1 =(Buyhouse)constructor.newInstance(new buyerProxy(new buyer()));
		buyer1.buy();
	}

}
