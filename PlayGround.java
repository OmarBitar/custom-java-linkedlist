public class PlayGround {
	public static void main(String[] args) {
//		Integer x = 1;
//		if (x instanceof Integer) System.out.println("true");
//		int y = 2;
//		System.out.println(((Object)y).getClass().getName());
//		System.out.println(x.getClass().getName());

		ObjectsList test = new ObjectsList();
		test.append(1.4);
		test.append(22);
		test.append('a');
		test.append("hello world");
		for (int x = 0; x < test.getLength(); x++) {
			System.out.println(test.get(x));
		}


//		System.out.println(test.peek());
//		test.printData();
//		System.out.println(test.getLength());
//		ObjectsList test2 = new ObjectsList("hello world",1,'d');
//		System.out.println(NodeEnds.HEAD.status);
//		NodeEnds.HEAD.status = true;
//		System.out.println(NodeEnds.HEAD.status);
	}

}
