public class Modello {

    private int anno_riferimento;
    private Apiario[] lista_apiari;

    public int getAnnoRiferimento() {
        return anno_riferimento;
    }

    public Apiario[] getListaApiari() {
        return lista_apiari;
    }

    public static class Apiario {
        private Apicoltore[] apicoltori;
        private int numero_arnie;
        private Posizione posizione;
        private Produzione produzione;

        public Apicoltore[] getApicoltori() {
            return apicoltori;
        }

        public int getNumeroArnie() {
            return numero_arnie;
        }

        public Posizione getPosizione() {
            return posizione;
        }

        public Produzione getProduzione() {
            return produzione;
        }
    }

    public static class Apicoltore {
        private int id;
        private String nominativo;

        public int getId() {
            return id;
        }

        public String getNominativo() {
            return nominativo;
        }
    }

    public static class Posizione {
        private String comune;
        private String provincia;
        private String regione;

        public String getComune() {
            return comune;
        }

        public String getProvincia() {
            return provincia;
        }

        public String getRegione() {
            return regione;
        }
    }

    public static class Produzione {
        private String denominazione;
        private String tipologia;
        private double quantita_kg;

        public String getDenominazione() {
            return denominazione;
        }

        public String getTipologia() {
            return tipologia;
        }

        public double getQuantitaKg() {
            return quantita_kg;
        }
    }
}
