package sumador;

public class ASumar {

	public String mostrar(String string) {
		// TODO Auto-generated method stub
		String total = string;
		
		if (string.length()==1)  
			return (string + " = " + total);
		if (string.charAt(0)=='-')
			return null;
		return total;
	}

}
