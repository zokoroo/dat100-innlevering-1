import static javax.swing.JOptionPane.*;

public class KarakterSkala {

    public static void karakter(int poeng){

        // Finner ut om poengsum er for stor eller for liten

        if ( poeng >= 90) {
            showMessageDialog(null, "A");
        }
        else if ( poeng >= 80) {
            showMessageDialog(null, "B");
        }
        else if ( poeng >= 60) {
            showMessageDialog(null, "C");
        }
        else if ( poeng >= 50) {
            showMessageDialog(null, "D");
        }
        else if ( poeng >= 40) {
            showMessageDialog(null, "E");
        }
        else {
            showMessageDialog(null, "F");
        }

    }


    public static void main(String[] args){

        // For løkke som holder styr på at det vises 10 karakter
        for (int i = 1; i <= 10; i++){

            int poeng = Integer.parseInt(showInputDialog("Poengsum: "));

            // do-while løkke som spør om poengsum frem til det er innenfor skalaen
            do {

                if (poeng > 100){
                    showMessageDialog(null,"Poengsum er for stort");
                    poeng = Integer.parseInt(showInputDialog("Poengsum: "));
                }
                else if (poeng < 0) {
                    showMessageDialog(null, "Poengsum for liten");
                    poeng = Integer.parseInt(showInputDialog("Poengsum: "));
                }


            }while (poeng > 100 || poeng < 0);

            // Funksjon som regner ut karakter
            karakter(poeng);
        }

    }

}






