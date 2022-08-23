package com.wb.spring.designpattern.singleton;

import java.io.Serializable;

/**
 * Created by wangbin33 on 2020/1/1.
 * 测试序列化破坏单例模式.
 *
 * 注意：该种方式在序列化时会破坏单例
 */
public class SeriableSingleton implements Serializable {
	private static final long serialVersionUID = 9031246629662423238L;
	public static final SeriableSingleton INSTANCE = new SeriableSingleton();
	private SeriableSingleton() {}

	public static SeriableSingleton getInstance() {
		return INSTANCE;
	}
}
