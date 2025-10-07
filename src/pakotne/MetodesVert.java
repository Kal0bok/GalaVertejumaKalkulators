package pakotne;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodesVert {
	
	Scanner scan = new Scanner(System.in);

	
	// Gala vērtējuma aprēķināšana
	  void verapr() {
			double rezultats;
			for(int i=0; i<studenti.length; i++) {
				rezultats=0;
				for(int j=0; j<kriteriji.length; j++) {
					rezultats += ((double) kriterijaSvars[j]/100)*kriterijaVertejums[i][j];
				}
				semestraVertejums[i] = rezultats;
			}
	}
			// Gala vērtējumu izvadīšana
			  void vertizvad() {
			for(int i=0; i<studenti.length; i++) {	
				for(int j=0; j<kriteriji.length; j++) {
					System.out.println("Studenta "+studenti[i]+" vērtējums par kritēriju "+kriteriji[j]+" ir "+kriterijaVertejums[i][j]+", kura svars ir "+kriterijaSvars[j]);
				}
				System.out.println("Semestra vērtējums ir "+df.format(semestraVertejums[i])+" balles"
						+ "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			}
			
			String izvele;

	        do {
	            izvele = (String) JOptionPane.showInputDialog(null,
	                    "Izvēlies darbību", "Darbību izvēle",
	                    JOptionPane.QUESTION_MESSAGE, null, darbsar, darbsar[0]);

	            if (izvele == null) {
	                izvele = "Apturēt";
	            }
			
			switch(izvele) {
			case "Ievadit audzekņus":
				sakitaievade();
				varduzv();
				break;
				
			case "Ievadit kriterijus":
				kritsk();
				break;
				
			case "Ievadit kriteriju svarus":
				krit()
				minimal();
				break;
				
			case "Ievadit vertejumus":
				kritetiji()
				break;
				
			case "Labot kriteriju":
				labotkrit();
				break;
	
			case "Labot kriterija svaru":
				labotkritsvar();
				break;
	
			case "Labot ieguto vertejumu":
				labotvert();
				break;
	
			case "Aprekinat gala vertejumu":
	
				break;
				
			case "Saglabat rezultatus faila":
				
				break;
				
			case "Nolasit rezultatus faila":
				
				break;
	
	break;
			}
			
			
			
			
			}
	
}