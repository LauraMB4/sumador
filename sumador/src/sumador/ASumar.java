package sumador;

public class ASumar {

	/** 
	 * El metodo que recibe un String de tipo numerico y devuelve la suma de los caracteres/cifras
	 * Si es negativo no devuelve nada
	 * @param string cadena a convertir
	 * @return la cadena = suma de sus digitos
	 */
	public String mostrar(String string) {
		// TODO Auto-generated method stub
		
		if (string.length()==1)  
			return (string + " = " + string);
		if (string.charAt(0)=='-')
			return null;
		return (string + " = " + total(string));
	}

	public int total(String valor_inicial) {
        int suma = 0;

        for (int i = 0; i < valor_inicial.length(); i++) {
            // Cadena de un dígito.
            String digito = valor_inicial.substring(i, i+1);
            suma = suma + Integer.parseInt(digito);
        }
        return suma;
	}
}