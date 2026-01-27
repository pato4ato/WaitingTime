import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;

/** Classe responsabile della gestione dei file */
public class GestoreFile {
    /** Costruttore della classe GestioneFile */
    public void GestoneFile() {}

    /** Legge il file JSON */
    public Esempio leggiJSON() {
        String riga, fileJSON = "";

        try (BufferedReader file = new BufferedReader(new FileReader("Mieli.json"))) {
            while ((riga = file.readLine()) != null) {
                fileJSON = fileJSON.concat("\n" + riga);
            }
        } catch (IOException e) {
            System.out.println("File non trovato! " + e.getMessage());
        }

        Gson jsonGaming = new Gson();
        Esempio oggettoJSON = jsonGaming.fromJson(fileJSON, Esempio.class);

        return oggettoJSON;
    }
}