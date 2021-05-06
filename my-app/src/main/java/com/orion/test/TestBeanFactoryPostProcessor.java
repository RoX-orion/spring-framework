package com.orion.test;

import com.orion.bean.A;
import com.orion.bean.B;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * Copyright (c) 2021 RoX-orion. All rights reserved.
 *
 * @author RoX-orion
 * @date 2021-05-06
 * @since 1.0.0
 */

@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//获取xx的BeanDefinition
		ScannedGenericBeanDefinition b = (ScannedGenericBeanDefinition) beanFactory.getBeanDefinition("b");
		//设置xx的注入模型为By Type
		b.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
		//设置所有自动注入属性为A的则忽略
//		beanFactory.ignoreDependencyType(A.class);
	}
}
