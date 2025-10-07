package pakotne;

import java.text.DecimalFormat;
import java.util.Scanner;


public class GalvenaKlase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.#");
		
		int studSk = 0;
        int kritSk = 0;
        String[] studenti = null;
        String[] kriteriji = null;
        int[] kriterijaSvars = null;
        int[][] kriterijaVertejums = null;
        double[] semestraVertejums = null;
        
        
        
        public static int skaitIev(Scanner scan) {
            int studSk;
            do {
                System.out.println("Cik studentiem aprēķināsi gala vērtējumu?");
                while (!scan.hasNextInt()) {
                    System.out.println("Cik studentiem aprēķināsi gala vērtējumu?");
                    scan.next();
                }
                studSk = scan.nextInt();
            } while (studSk < 1);
            scan.nextLine();
            return studSk;
        }
	}

		
	public static int kritSk(int studSk, Scanner scan) {
        int kritSk;
        do {
            System.out.println("Kasds būs kritēriju skaits?");
            while (!scan.hasNextInt()) {
                System.out.println("Kāds būs kritsēriju skaits?");
                scan.next();
            }
            kritSk = scan.nextInt();
        } while (kritSk < 1);
        scan.nextLine();
        return kritSk;
    }
}

	public static String[] vardUzv(int studSk, Scanner scan) {
    String[] studenti = new String[studSk];
    for (int i = 0; i < studenti.length; i++) {
        do {
            System.out.println("Ievadi " + (i + 1) + ". studentu:");
            studenti[i] = scan.nextLine().trim();
        } while (!studenti[i].matches("^[\\p{L} ]+$"));
    }
    return studenti;
	}
}
		

	public static int kritSk(int studSk, Scanner scan) {
    int kritSk;
    do {
        System.out.println("Kāds būs kritēriju skaits?");
        while (!scan.hasNextInt()) {
            System.out.println("Kāds būs kritēriju skaits?");
            scan.next();
        }
        kritSk = scan.nextInt();
    } while (kritSk < 1);
    scan.nextLine();
    return kritSk;
		}
	}
		
				atlSvars = (maxSvars - kriterijaSvars[i]) / (double)(kriteriji.length - sk);
			} while(kriterijaSvars[i]>maxSvars || kriterijaSvars[i]<5 || 
				  (i != kriteriji.length-1 && kriterijaSvars[i] == maxSvars) ||
				  (i == kriteriji.length-1 && (maxSvars - kriterijaSvars[i])  > 0) 
				  || atlSvars < 5);
			maxSvars -= kriterijaSvars[i];
			sk++;
			scan.nextLine();
		}
		
		for(int i=0; i<kriterijaVertejums.length; i++) {
			for(int j=0; j<kriterijaVertejums[i].length; j++) {
				do {
					System.out.println("Ievadi "+studenti[i]+" vērtējumu par kritēriju "+kriteriji[j]);
					while(!scan.hasNextInt()) {
						System.out.println("Ievadi "+studenti[i]+" vērtējumu par kritēriju "+kriteriji[j]);
						scan.next();
					}
					kriterijaVertejums[i][j] = scan.nextInt();
				}while(kriterijaVertejums[i][j]<0 || kriterijaVertejums[i][j]>10);
			}
		}
		
		double rezultats;
		for(int i=0; i<studenti.length; i++) {
			rezultats=0;
			for(int j=0; j<kriteriji.length; j++) {
				rezultats += ((double) kriterijaSvars[j]/100)*kriterijaVertejums[i][j];
			}
			semestraVertejums[i] = rezultats;
		}
		

		for(int i=0; i<studenti.length; i++) {	
			for(int j=0; j<kriteriji.length; j++) {
				System.out.println("Studenta "+studenti[i]+" vērtējums par kritēriju "+kriteriji[j]+" ir "+kriterijaVertejums[i][j]+", kura svars ir "+kriterijaSvars[j]);
			}
			System.out.println("Semestra vērtējums ir "+df.format(semestraVertejums[i])+" balles"
					+ "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		}
		scan.close();
	}
}