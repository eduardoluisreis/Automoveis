package Veiculos;

public class Carros {
    String Marca;
    String Modelo;
    String Cor;

    public Carros() {
    }

    public Carros(String marca, String modelo, String cor) {
        Marca = marca;
        Modelo = modelo;
        Cor = cor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }
}
