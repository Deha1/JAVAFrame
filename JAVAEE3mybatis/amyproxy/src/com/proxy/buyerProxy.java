package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.aspesct.Buyerthinking;

public class buyerProxy implements InvocationHandler{

	Object object;
	
	public buyerProxy(Object object)
	{
		this.object=object;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("看房开始");
		Buyerthinking.befr();
		Object result = method.invoke(object, args);
		Buyerthinking.aftr();
		System.out.println("买房结束");
		return null;
	}

}
