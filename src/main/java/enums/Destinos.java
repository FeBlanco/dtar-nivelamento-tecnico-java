package enums;

public enum Destinos {
    PORTUGAL("Portugal"),
    ESPANHA("Espanha"), ALEMANHA("Alemanha"),
    BRASIL("Brasil"),
    ARGENTINA("Argentina"),
    JAPÃO("Japão"),
    PERNAMBUCO ("Pernambuco");

    private String pais;

    Destinos(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return this.pais;
    }

}
