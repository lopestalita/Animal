class Animal {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}

class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String especie, String alimento) {
        super(especie);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}

class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String especie, String caracteristica) {
        super(especie);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String toString() {
        return "Peixe: " + getEspecie() + ", Característica: " + caracteristica;
    }
}

public class Main {
    public static void main(String[] args) {
        Mamifero cachorro = new Mamifero("Cachorro", "Ração");

        Peixe peixe = new Peixe("Peixe-palhaço", "Listras coloridas");

        System.out.println("Mamifero: " + cachorro.getEspecie() + ", Alimento: " + cachorro.getAlimento());

        System.out.println(peixe);
    }
}
