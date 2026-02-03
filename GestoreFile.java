import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class GestoreFile {

    public GestoreFile() {
    }

    public Modello leggiJSON() {
        String riga;
        StringBuilder fileJSON = new StringBuilder();

        try (BufferedReader file = new BufferedReader(new FileReader("miele.json"))) {
            while ((riga = file.readLine()) != null) {
                fileJSON.append(riga);
            }
        } catch (IOException e) {
            System.out.println("File non trovato! " + e.getMessage());
            return null;
        }

        Gson gson = new Gson();
        return gson.fromJson(fileJSON.toString(), Modello.class);
    }
}
