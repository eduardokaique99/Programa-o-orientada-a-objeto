import java.util.ArrayList;

public class Pessoa {
        public String nome;
        public double peso;
        public double altura;
        public String dataNascimento;

    public static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    

    public Pessoa(String nome, double peso, double altura, String dataNascimento) {
                this.nome = nome;
                this.peso = peso;
                this.altura = altura;
                this.dataNascimento = dataNascimento;
                
                pessoas.add(this);
    }
    public double imc() {
        return 0;
    }

    public String imcTexto() {
        return "";
    }
    
}
