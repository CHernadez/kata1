package stringcalculator;

public class Add {

	Utilerias utileria= new Utilerias();
	
	public int add(String cadena)
	{
		//Si la cadena es vacia devuelve 0;		
		if("".equals(cadena))
		  {
			return 0;			
		  }
		
		//obtine los valores numéricos de la cadena
		String [] valores= obtenerValoresNumericos(cadena);
		
		utileria.validarNegativos(valores);
		
		return obtenerSuma(valores);
		
		
	}
	
	private String [] obtenerValoresNumericos (String cadena)
	{
		String separador=",";
		
		String[]  valores = cadena .split(separador);
		
		return valores;
		
	}
	
	private int obtenerSuma (String[] valoresASumar)
	{
		int suma=0;
		for(String valor:valoresASumar)
		{
		suma += utileria.convertirStringAInt(valor);	
			
		}
		
		return suma;
	}
}
