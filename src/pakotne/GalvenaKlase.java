package pakotne;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GalvenaKlase {
	public static void main(String[] args) {
		int studSk, kritSk;
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.#");
		
		ArrayList<Vert> gar = new ArrayList<>();
		
		 
		// Audzēkņu skaita ievade
		static void sakitaievade() {
		do {
			System.out.println("Cik studentiem aprēķināsi gala vērtējumu?");
			while(!scan.hasNextInt()) {
				System.out.println("Cik studentiem aprēķināsi gala vērtējumu?");
				scan.next();
			}
			studSk = scan.nextInt();
		}while(studSk<1);
		String[] studenti = new String[studSk];
		}
		// Vērtēšanas kritēriju skaita ievade
		static void kritsk() {
				do {
					System.out.println("Kāds būs kritēriju skaits?");
					while(!scan.hasNextInt()) {
						System.out.println("Kāds būs kritēriju skaits?");
						scan.next();
					}
					kritSk = scan.nextInt();
				}while(kritSk<1);
				String[] kriteriji = new String[kritSk];
				int[] kriterijaSvars = new int[kritSk];
				int[][] kriterijaVertejums = new int[studSk][kritSk];
				double[] semestraVertejums = new double[studSk];
		
		scan.nextLine();
		}
		
		// Ievada audzēkņu vārdus, uzvārdus
		static void varduzv() {
		for(int i=0; i<studenti.length; i++) {
			do {
				System.out.println("Ievadi "+(i+1)+". studentu");
				studenti[i] = scan.nextLine().trim();
			} while(!studenti[i].matches("^[\\p{L} ]+$"));
		}
		}
		
		// Definē kritērijus
		static void krit() {
		int maxSvars = 100, sk = 1;
		double atlSvars;
		for(int i=0; i<kriteriji.length; i++) {
			do {
				System.out.println("Ievadi "+(i+1)+". kritēriju");
				kriteriji[i] = scan.nextLine().trim();
			} while(!kriteriji[i].matches("^[\\p{L} ]+$"));
		}
		
			// Norāda katra kritērija svaru
		static void kritsvar() {
			do {
				System.out.println("Ievadi "+(i+1)+". kritērija svaru (max: "+maxSvars+")");
				while(!scan.hasNextInt()) {
					System.out.println("Ievadi "+(i+1)+". kritērija svaru");
					scan.next();
				}
				kriterijaSvars[i] = scan.nextInt();
			}
				/* Minimālā KATRA ATLIKUŠĀ kritērija svars ir 5
				 * kopējai svaru vērtībai ir jābūt 100 (ne mazāk, ne vairāk)
				*/
			static void minimal() {
				atlSvars = (maxSvars - kriterijaSvars[i]) / (double)(kriteriji.length - sk);
			} while(kriterijaSvars[i]>maxSvars || kriterijaSvars[i]<5 || 
				  (i != kriteriji.length-1 && kriterijaSvars[i] == maxSvars) ||
				  (i == kriteriji.length-1 && (maxSvars - kriterijaSvars[i])  > 0) 
				  || atlSvars < 5);
			maxSvars -= kriterijaSvars[i];
			sk++;
		}
		}
		
		static void vertejumi() {
			
			String[] masSar = new String[gar.size()];
            for (int i = 0; i < gar.size(); i++) {
            	masSar[i] = gar.get(i).info();
            }
            String izvMas = (String) JOptionPane.showInputDialog(null,
                    "Izvēlies mašīnu no garāžas:", "Garāžas izvēle",
                    JOptionPane.QUESTION_MESSAGE, null, masSar, masSar[0]);
            if (izvMas != null) {
                for (Masina m : gar) {
                    if (m.info().equals(izvMas)) {
                        aktMas = m;
                        JOptionPane.showMessageDialog(null,
                                "Izvēlēta mašīna:\n" + aktMas.info(),
                                "Informācija", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                    
                    static void labotvert() {
            			
            			String[] masSar = new String[gar.size()];
                        for (int i = 0; i < gar.size(); i++) {
                        	masSar[i] = gar.get(i).info();
                        }
                        String izvMas = (String) JOptionPane.showInputDialog(null,
                                "Izvēlies mašīnu no garāžas:", "Garāžas izvēle",
                                JOptionPane.QUESTION_MESSAGE, null, masSar, masSar[0]);
                        if (izvMas != null) {
                            for (Masina m : gar) {
                                if (m.info().equals(izvMas)) {
                                    aktMas = m;
                                    JOptionPane.showMessageDialog(null,
                                            "Izvēlēta mašīna:\n" + aktMas.info(),
                                            "Informācija", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                                
                                static void labotkrit() {
                        			
                        			String[] masSar = new String[gar.size()];
                                    for (int i = 0; i < gar.size(); i++) {
                                    	masSar[i] = gar.get(i).info();
                                    }
                                    String izvMas = (String) JOptionPane.showInputDialog(null,
                                            "Izvēlies mašīnu no garāžas:", "Garāžas izvēle",
                                            JOptionPane.QUESTION_MESSAGE, null, masSar, masSar[0]);
                                    if (izvMas != null) {
                                        for (Masina m : gar) {
                                            if (m.info().equals(izvMas)) {
                                                aktMas = m;
                                                JOptionPane.showMessageDialog(null,
                                                        "Izvēlēta mašīna:\n" + aktMas.info(),
                                                        "Informācija", JOptionPane.INFORMATION_MESSAGE);
                                                break;
                                            }
                                            
                                            static void labotkritsvar() {
                                    			
                                    			String[] masSar = new String[gar.size()];
                                                for (int i = 0; i < gar.size(); i++) {
                                                	masSar[i] = gar.get(i).info();
                                                }
                                                String izvMas = (String) JOptionPane.showInputDialog(null,
                                                        "Izvēlies mašīnu no garāžas:", "Garāžas izvēle",
                                                        JOptionPane.QUESTION_MESSAGE, null, masSar, masSar[0]);
                                                if (izvMas != null) {
                                                    for (Masina m : gar) {
                                                        if (m.info().equals(izvMas)) {
                                                            aktMas = m;
                                                            JOptionPane.showMessageDialog(null,
                                                                    "Izvēlēta mašīna:\n" + aktMas.info(),
                                                                    "Informācija", JOptionPane.INFORMATION_MESSAGE);
                                                            break;
                                                        }
                }
            }
		
		}
		
		
		
		
		
		
		
		
		
		scan.close();
			
		}
}