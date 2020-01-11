package SingleThreadedExcution1;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Testing Gate");
		Gate gate = new Gate();
		new UserThread(gate,"Alice","Alaska").start();
		new UserThread(gate,"Bobby","Brazil").start();
		new UserThread(gate,"Chris","Canada").start();
	}

}
