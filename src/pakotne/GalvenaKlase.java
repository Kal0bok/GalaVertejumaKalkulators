package pakotne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GalvenaKlase {
    private int studSk, kritSk;
    private String[] studenti;
    private String[] kriteriji;
    private int[] kriterijaSvars;
    private int[][] kriterijaVertejums;
    private double[] semestraVertejums;
    private Scanner scan = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("0.#");

    public static void main(String[] args) {
    	
    }
    public void skaitIev() {
        do {
            System.out.println("Cik studentiem aprēķināsi gala vērtējumu?");
            while (!scan.hasNextInt()) {
                System.out.println("Cik studentiem aprēķināsi gala vērtējumu?");
                scan.next();
            }
            studSk = scan.nextInt();
        } while (studSk < 1);
        studenti = new String[studSk];
        scan.nextLine(); 
    }

    public void kritSk() {
        do {
            System.out.println("Kāds būs kritēriju skaits?");
            while (!scan.hasNextInt()) {
                System.out.println("Kāds būs kritēriju skaits?");
                scan.next();
            }
            kritSk = scan.nextInt();
        } while (kritSk < 1);
        kriteriji = new String[kritSk];
        kriterijaSvars = new int[kritSk];
        kriterijaVertejums = new int[studSk][kritSk];
        semestraVertejums = new double[studSk];
        scan.nextLine(); 
    }

    public void vardUzv() {
        for (int i = 0; i < studenti.length; i++) {
            do {
                System.out.println("Ievadi " + (i + 1) + ". studentu");
                studenti[i] = scan.nextLine();
            } while (!studenti[i].matches("^[\\p{L} ]+$"));
        }
    }

    public void defKrit() {
        for (int i = 0; i < kriteriji.length; i++) {
            do {
                System.out.println("Ievadi " + (i + 1) + ". kritēriju");
                kriteriji[i] = scan.nextLine().trim();
            } while (!kriteriji[i].matches("^[\\p{L} ]+$"));
        }
    }

    public void kritSvar() {
        int maxSvars = 100;
        for (int i = 0; i < kriteriji.length; i++) {
            double atlSvars;
            do {
                System.out.println("Ievadi " + (i + 1) + ". kritērija svaru (max: " + maxSvars + ")");
                while (!scan.hasNextInt()) {
                    System.out.println("Ievadi " + (i + 1) + ". kritērija svaru");
                    scan.next();
                }
            scan.nextLine(); 
        }
    }
}