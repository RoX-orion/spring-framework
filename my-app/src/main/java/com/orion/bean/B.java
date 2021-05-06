package com.orion.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Copyright (c) 2021 RoX-orion. All rights reserved.
 *
 * @author RoX-orion
 * @date 2021-05-06
 * @since 1.0.0
 */

@Component
public class B {

//	@Autowired
	private A a;

	public void setA(A a) {
		this.a = a;
	}

	public void print() {
		System.out.println(a);
	}
}
