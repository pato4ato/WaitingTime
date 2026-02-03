public class Main {

    public static void main(String[] args) {

        GestoreFile gestore = new GestoreFile();
        Modello modello = gestore.leggiJSON();

        if (modello == null) {
            System.out.println("Errore nella lettura del file JSON");
            return;
        }

        System.out.println("Anno di riferimento: " + modello.getAnnoRiferimento());

        for (Modello.Apiario a : modello.getListaApiari()) {
            System.out.println("\nApiario:");
            System.out.println("Numero arnie: " + a.getNumeroArnie());
            System.out.println("Comune: " + a.getPosizione().getComune());

            System.out.println("Apicoltori:");
            for (Modello.Apicoltore ap : a.getApicoltori()) {
                System.out.println("- " + ap.getNominativo());
            }

            System.out.println("Produzione: " +
                    a.getProduzione().getDenominazione() +
                    " (" + a.getProduzione().getQuantitaKg() + " kg)");
        }
    }
}
