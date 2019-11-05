class PreetiKant{
	public static void concat1(String s1){
		s1 =  s1+"Kant";
	}
	public static void concat2(StringBuffer s2){
		s2.append("Kant");
	}
	public static void concat3(StringBuilder s3){
		s3.append("Kant");
	}

	public static void main(String[] args){
		String s1 = new String("Preeti");
		concat1(s1);
		System.out.println("String: "+s1);

		StringBuffer s2 = new StringBuffer("Preeti");
			concat2(s2);
			System.out.println("StringBuffer: " + s2);

		StringBuilder s3 = new StringBuilder("Preeti");
			concat3(s3);
			System.out.println("StringBuilder: "+ s3);
	}

}