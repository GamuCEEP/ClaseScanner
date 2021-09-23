package claseescaner;

public class Tipos_de_datos {

	public static void main(String[] args) {
		
		byte byte_var = Byte.MAX_VALUE;
		short short_var = Short.MAX_VALUE;
		int int_var = Integer.MAX_VALUE;
		long long_var = Long.MAX_VALUE;
		float float_var = Float.MAX_VALUE;
		double double_var = Double.MAX_VALUE;
		char char_var = Character.MAX_VALUE;
		boolean bool_var = Boolean.TRUE;
		
		System.out.println(
				byte_var+"\n"+
				short_var+"\n"+
				int_var+"\n"+
				long_var+"\n"+
				float_var+"\n"+
				double_var+"\n"+
				char_var+"\n"+
				(int)char_var+"\n"+
				bool_var);
	}
}
