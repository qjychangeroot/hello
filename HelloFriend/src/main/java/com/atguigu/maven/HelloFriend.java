package com.atguigu.maven;

public class HelloFriend {

	/**
	 * 在maven工程中需要引用其他的jar包或者其他的项目 必须通过坐标在maven仓库中获取 如果连接的是本地maven仓库，则在本地仓库中找到即可使用
	 * 
	 * -如果引用的是自己创建的项目，必须通过命令将项目将安装到maven本地仓库中
	 * 
	 * @param name
	 * @return
	 */
	public String sayHelloToFriend(String name) {

		Hello hello = new Hello();
		String str = hello.sayHello(name) + " I am " + this.getMyName();
		System.out.println(str);

		return str;
	}

	public String getMyName() {
		return "John";
	}

}
