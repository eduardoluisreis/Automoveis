package Clientes;

public class Clientes {
    String Nome;
    int Idade;
    String Sexo;

    public Clientes() {
    }

    public Clientes(String nome, int idade, String sexo) {
        Nome = nome;
        Idade = idade;
        Sexo = sexo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }
}
