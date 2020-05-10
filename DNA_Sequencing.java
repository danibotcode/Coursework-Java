public class DNA {

  public static void main(String[] args) {
//DNA sequencing program which will detertmine whethere there ///is a protein in a strand of DNA

String dna1 = "ATGCGATACGCTTGA";
String dna2 = "ATGCGATACGTGA";
String dna3 = "ATTAATATGTACTGA";

//store dna value
String dna = dna3;

//print length of DNA
System.out.println("Length: " + dna.length());

//find beginning index of protien
int start = dna.indexOf("ATG");
System.out.println("Start: " + start);

//find ending index of protien
int stop = dna.indexOf("TGA");
System.out.println("Stop: " + stop);

if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
  String protein = "";
  protein = dna.substring(start, stop+3);
System.out.println("Condition 1 and 2 are satisfied.");
System.out.println("Protein: "+ protein);
} else {
  System.out.println("No protein");
}

  }

}

