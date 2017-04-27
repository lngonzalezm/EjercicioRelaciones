package ejerciciofecha;

public class Fecha {

	

	public Boolean esAnoBisiesto(Boolean a ) {
		if(dia==29&&mes==2)
                {
                    a=true;
                }
                
                return a;
	}

	public static int dia;
	public static int mes;
	public static int ano;
	public static String[]  namesDay;
	public static String[] namesMonths;

    public Fecha(int dia, int mes, int ano, String[] namesDay, String[] namesMonths) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.namesDay = namesDay;
        this.namesMonths = namesMonths;
    }
        
        

}
