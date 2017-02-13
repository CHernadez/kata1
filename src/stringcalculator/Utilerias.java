package stringcalculator;

public class Utilerias {
	
	public int convertirStringAInt(String valorString)
	{
		int valorEntero= Integer.valueOf(valorString);
		
		if(valorEntero>1000){
			return 0;
		}
		else
			return valorEntero;
	}
	
	public void validarNegativos(String [] valores)
	{
		String valoresNegativos = "";
		for (String valor : valores) {
			if (valor.startsWith("-"))
				valoresNegativos += "," + valor;
		}
		if (!"".equals(valoresNegativos))
			throw new RuntimeException("Negativos no soportados: "
					+ valoresNegativos.substring(1));
	}
}
