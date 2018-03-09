package cn.itcast.spring.Demo1;

/**
 * 入门案例的实现类
 * @author ASUS
 *
 */
public class HelloServiceImpl implements HelloService {

	private String info;
	
	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public void sayHello() {
		System.out.println("Hello Spring." + info);
	}

}
