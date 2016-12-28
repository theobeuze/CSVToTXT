package com.theobeuze;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File f = new File("/Users/theobeuze/Desktop/TimeZone.txt");

        try
        {
            FileWriter fw = new FileWriter(f);

            String chemin = "/Users/theobeuze/Desktop/TimeZone.csv";
            BufferedReader fichier_source = new BufferedReader(new FileReader(chemin));
            String chaine;
            int i = 1;

            while((chaine = fichier_source.readLine())!= null)
            {
                if(i > 1)
                {
                    String[] tabChaine = chaine.split(";");
                    fw.write(tabChaine[0].replace("/","_").replace("-","_") + '(' + '"' + tabChaine[0] + '"' + ',' + '"' + tabChaine[1] + '"' + ',' + '"' + tabChaine[2] + '"' + ')' + ',' + "\n");
                }
                i++;
            }
            fichier_source.close();
            fw.close();
        }
        catch (IOException e)
        {
            System.out.println("Le fichier est introuvable !");
        }
    }
}

