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
        
        String izvele;
        do {
        	System.out.println("\nIzvelies metodi");
        	System.out.println("1. Ievadit skolenu skaitu");
        	System.out.println("2. Ievadit kriteriju skaitu");
        	System.out.println("3. Ievadit skolenu vardus");
        	System.out.println("4. Ievadit definet krietiju");
        	System.out.println("5. Ievadit kriteriju svaru");
        	System.out.println("6. sfsdfsdf");
        	System.out.println("7. Apturet");
        	
        	
        	
        }while();
        
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
	
	public static int[] kritSvarr(String[] kriteriji, Scanner scan) {
        int[] kritSvar = new int[kriteriji.length];
        int maxSvars = 100;
        for (int i = 0; i < kriteriji.length; i++) {
            double atlSvars;
            do {
                System.out.println("Ievadi " + (i + 1) + ". kritērija svaru (maks: " + maxSvars + "):");
                while (!scan.hasNextInt()) {
                    System.out.println("Ievadi " + (i + 1) + ". kritērija svaru:");
                    scan.next();
                }
            
                kritSvar[i] = scan.nextInt();
                atlSvars = (i < kriteriji.length - 1) ? (maxSvars - kritSvar[i]) / (double) (kriteriji.length - i - 1) : 0;
            } while (kritSvar[i] > maxSvars || kritSvar[i] < 5 ||
                    (i != kriteriji.length - 1 && kritSvar[i] == maxSvars) ||
                    (i == kriteriji.length - 1 && maxSvars != kritSvar[i]) ||
                    (i < kriteriji.length - 1 && atlSvars < 5));
            maxSvars -= kritSvar[i];
            scan.nextLine();
        }
        return kritSvar;
   
	}
}
