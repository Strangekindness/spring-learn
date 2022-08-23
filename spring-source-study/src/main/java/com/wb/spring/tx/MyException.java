package com.wb.spring.tx;

/**
 * @author wangbin33
 */
public class MyException extends Exception {
	private static final long serialVersionUID = 9031246629662423738L;
	public MyException() {
	}
	public MyException(String msg) {
		super(msg);
	}
}
