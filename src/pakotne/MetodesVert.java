package pakotne;

    import java.text.DecimalFormat;
    import java.util.Scanner;

    public class MetodesVert {
        private String[] studenti;
        private String[] kriteriji;
        private int[] kriterijaSvars;
        private int[][] kriterijaVertejums;
        private double[] semestraVertejums;
        private Scanner scan;
        private DecimalFormat df;
        
        public MetodesVert(String[] studenti, String[] kriteriji, int[] kriterijaSvars,
                int[][] kriterijaVertejums, double[] semestraVertejums,
                Scanner scan, DecimalFormat df) {
     this.studenti = studenti;
     this.kriteriji = kriteriji;
     this.kriterijaSvars = kriterijaSvars;
     this.kriterijaVertejums = kriterijaVertejums;
     this.semestraVertejums = semestraVertejums;
     this.scan = scan;
     this.df = df;
 }

 public void vertSk() {
     for (int i = 0; i < kriterijaVertejums.length; i++) {
         for (int j = 0; j < kriterijaVertejums[i].length; j++) {
             do {
                 System.out.println("Ievadi " + studenti[i] + " vērtējumu par kritēriju " + kriteriji[j]);
                 while (!scan.hasNextInt()) {
                     System.out.println("Ievadi " + studenti[i] + " vērtējumu par kritēriju " + kriteriji[j]);
                     scan.next();
                 }
                 kriterijaVertejums[i][j] = scan.nextInt();
             } while (kriterijaVertejums[i][j] < 0 || kriterijaVertejums[i][j] > 10);
         }
     }
 }

 
 }


}