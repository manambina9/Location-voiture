package examen;

public class examen {
    private String nom;
    private int hab;

    public examen(String nom, int hab) {
        this.nom = nom;
        this.hab = hab;
    }

    public String getStatus() {
        if (this.hab < 10000) {
            return "Petite";
        } else if (this.hab >= 10000 && this.hab <= 50000) {
            return "Moyenne";
        } else {
            return "Grande";
        }
    }

    public String estUnAmbohi() {
        if (this.nom.startsWith("Ambohi")) {
            return "Vrai";
        } else {
            return "Faux";
        }
    }
}

