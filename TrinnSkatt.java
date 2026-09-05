import static javax.swing.JOptionPane.*;

public class TrinnSkatt {

    public static double trinnEn(int inntekt){
        if(inntekt >= 318301){
            return (318300-226100) * 0.017;
        }
        else if(226101 <= inntekt){
            return (inntekt - 226100) * 0.017;

        }
        return 0.0;
    }

public static double trinnTo(int inntekt){
        if (inntekt >= 725051){
            return (725050-318300) * 0.04;
        }
        else if (318301 <= inntekt){
            return (inntekt - 318300) * 0.04;
        }
        return 0.0;

    }


public static double trinnTre(int inntekt){
        if (inntekt >= 980101){
            return (980100-725050) * 0.137;
        }
        else if ( 725051 <= inntekt){
            return (inntekt - 725050) * 0.137;
        }
        return 0.0;

    }


public static double trinnFire(int inntekt){
        if (inntekt >= 1467201){
            return (1467200-980100) * 0.168;
        }
        else if( 980101 <= inntekt){
            return (inntekt - 980100) * 0.168;
        }

        return 0.0;
    }



public static double trinnFem(int inntekt){
        if (inntekt >= 1467201){
            return (inntekt-1467200) * 0.178;
        }
        return 0.0;
    }

    public static void main(String[] args){

        // Variabel som adderer trinnskattene
        double trinnskatten = 0.0;

        // Får inn ett bruttobeløp fra bruker i heltall
        int inntekt = Integer.parseInt(showInputDialog("Bruttoinntekt: "));

        // Funksjoner som regner ut og returnerer trinnskattene
        trinnskatten += trinnEn(inntekt);
        trinnskatten += trinnTo(inntekt);
        trinnskatten += trinnTre(inntekt);
        trinnskatten += trinnFire(inntekt);
        trinnskatten += trinnFem(inntekt);

        // Viser totale trinnskatten på skjermen
        showMessageDialog(null, "Trinnskatten: " + (String.format("%.2f", trinnskatten)));


    }

}
