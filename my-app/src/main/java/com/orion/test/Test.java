package com.orion.test;

import com.orion.app.AppConfig;
import com.orion.bean.B;
import com.orion.dao.MemberDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright (c) 2021 RoX-orion. All rights reserved.
 *
 * @author RoX-orion
 * @date 2021-04-19
 * @since 1.0.0
 */

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		B b = context.getBean(B.class);
		b.print();
	}
}
