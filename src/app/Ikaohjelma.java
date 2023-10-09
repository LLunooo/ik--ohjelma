package app;

public class Ikaohjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ika = 77;
		
		// Tulostusehdot
		
		if(ika >= 0 && ika < 18)
		{
			System.out.println("olet alaikäinen");
		}
		if(ika == 15)
				{
					System.out.println("saat nyt ajaa mopoa");
				}
		if(ika >= 16 && ika <= 17)
			{
				System.out.println("voit nyt ajaa kevaria");
			}
		else if(ika == 18)
				{
					System.out.println("onnea täysi-ikäisyydestä saat nyt hommata ajokortin!");
				}
		else if(ika == 100)
				{
					System.out.println("100!!!");
					System.out.println("100!!");
					System.out.println("!!!");
				}
	    else if(ika >= 65)
	    {
	    	System.out.println("olet eläkeiässä");
	    }
		if(ika == 65)
			{
				System.out.println("Onnittelut eläkkeelle pääsystä!");
			}
	    else if(ika == 58)
	    	{
	    		System.out.println("olet oikeutettu varhaiseläkkeelle");
	    	}
		if(ika >= 40 && ika <= 50)
		{
			System.out.println("Onnittelut keski-iän saavutttamisesta");
		}
	    if(ika % 10 == 0 && ika >= 18)
		{
			System.out.println("onnittelut tasavuosikymmenistä!!");
		}
	    if(ika >= 18)
	    {
	    	System.out.println("olet aikuinen");
	    }
		
	}

}
