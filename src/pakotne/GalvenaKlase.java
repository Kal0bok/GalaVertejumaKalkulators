package pakotne;

import java.text.DecimalFormat;
import java.util.Scanner;


public class GalvenaKlase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.#");
		
		int studSk = 0;
        int kritSk = 0;
        String[] stud= null;
        String[] krit = null;
        int[] kritSvar = null;
        int[][] kritVert = null;
        double[] semeVert = null;
	}
        
        
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

		
	public static int kritSkk(int studSk, Scanner scan) {
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
    String[] stud = new String[studSk];
    for (int i = 0; i < stud.length; i++) {
        do {
            System.out.println("Ievadi " + (i + 1) + ". studentu:");
            stud[i] = scan.nextLine().trim();
        } while (!stud[i].matches("^[\\p{L} ]+$"));
    }
    return stud;
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
		
	public static String[] defKrit(int kritSk, Scanner scan) {
        String[] kriteriji = new String[kritSk];
        for (int i = 0; i < kritSk; i++) {
            do {
                System.out.println("Ievadi " + (i + 1) + ". kritēriju:");
                kriteriji[i] = scan.nextLine().trim();
            } while (!kriteriji[i].matches("^[\\p{L} ]+$"));
        }
        return kriteriji;
    }
	}
	
	public static int[] kritSvar(String[] kriteriji, Scanner scan) {
        int[] kriterijaSvars = new int[kriteriji.length];
        int maxSvars = 100;
        for (int i = 0; i < kriteriji.length; i++) {
            double atlSvars;
            do {
                System.out.println("Ievadi " + (i + 1) + ". kritērija svaru (maks: " + maxSvars + "):");
                while (!scan.hasNextInt()) {
                    System.out.println("Ievadi " + (i + 1) + ". kritērija svaru:");
                    scan.next();
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