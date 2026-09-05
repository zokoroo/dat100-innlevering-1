import static javax.swing.JOptionPane.*;


public class Fakultet {

    public static void regnf(int tall){
        int verdi = 1;
        for (int i = 1; i <= tall; i++){
                 verdi *= i;
        }
        showMessageDialog(null,verdi);
    }

    public static void main(String[] args) {
        // Henter inn tall
        int tall = Integer.parseInt(showInputDialog("tall: "));

        //Regner fakultet
        regnf(tall);
    }
}