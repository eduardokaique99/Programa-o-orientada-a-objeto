import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class ExercicioTres {
    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 3 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Tabuada com Arquivo                               |");
        System.out.println("| 2 - Ler e imprimir arquivo de texto                   |");
        System.out.println("| 3 - Operações básicas com a Main                      |");
        System.out.println("| 4 - Exponenciação com Precisão Arbitrária             |");
        System.out.println("| 5 - Nome aleatório de 5 pessoas                       |");
        System.out.println("| 6 - Calcular Raio e Área                              |");
        System.out.println("| 7 - Avaliar se TXT tem JAVA                           |");
        System.out.println("| 8 - 10 primeiros dígitos                              |");
        System.out.println("| 9 - Área com a Main                                   |");
        System.out.println("| 10 - Receba nome de arquivo na Main com valores       |");
        System.out.println("| 11 - Ler e imprimir arquivo de texto                  |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que receba um valor e calcule a tabuada deste valor, salvando seu resultado em um arquivo de texto.
            case 1:
            int[] tabuada = new int[10];
            try{
                System.out.println("Informe o número:");
                int number = scanner.nextInt();
                tabuada = tabuada(number);
                System.out.println("TABUADA");
                for (int i = 1; i <= 10; i++) { 
                System.out.println(i + " x " + number + " = " + tabuada[i-1]);  
                    }

                BufferedWriter escrita = new BufferedWriter(new FileWriter("C:/Users/eduardo.furlaneto/OneDrive - SENAC-SC/Programa-o-orientada-a-objeto/texto.txt"));
                
                for (Integer integer : tabuada) {
                    escrita.append(integer + "\n");
                    }
                    escrita.close();
                } catch (Exception e) {
                    System.err.println("Deu ruim parceiro");
                    }
                
                break;
            // 2) Crie um programa que leia e imprima no console todas as linhas de um arquivo de texto.
            case 2:
            try{
                BufferedReader leitura = new BufferedReader(new FileReader("C:/Users/eduardo.furlaneto/OneDrive - SENAC-SC/Programa-o-orientada-a-objeto/texto.txt"));
                String value = "";
                System.out.println("DADOS DO ARQUIVO");
                while (true){
                    if(value != null)
                    System.out.println(value);
                    else
                    break;
                    value = leitura.readLine();
                }
                leitura.close();
            } catch (IOException exception){
                System.out.println("Erro de exceção I/O: " + exception.getMessage());
            }
                // lerArquivoTexto(String arquivo);
                break;
            // 3) Crie um programa que receba como entrada da classe Main dois valores numéricos e calcule as operações básicas com eles.
            case 3:
                // operacoesBasicas(int numeroUm, int numeroDois)
                break;
            // 4) Crie um programa que execute uma operação de Exponenciação com o valor inteiro com precisão arbitrária.
            case 4:
                // bigIntExpo(BigInteger base, int pow);
                break;
            // 5) Crie um programa que receba o nome de 5 pessoas e aleatorize eles.
            case 5:
                // aleatorizarPessoas();
                break;
            // 6) Crie um programa que calcule o raio e a área de uma circunferência (`C = 2πr` e `A = π(r²)`).
            case 6:
                // areaECircunferencia(double raio);
                break;
            // 7) Crie um programa que avalie se um arquivo de texto possui a string "JAVA".
            case 7:
                // hasJava(String arquivo);
                break;
            // 8) Crie um programa que leia as linhas de um arquivo e imprima no console apenas os 10 primeiros digitos de cada linha.
            case 8:
                // dezDigitos()
                break;
            // 9) Crie um programa que receba como entrada da classe Main dois valores numéricos e calcule a área dos valores (`area = lado1 * lado2`).
            case 9:
                // calculaArea(double numeroUm, double numeroDois);
                break;
            // 10) Crie um programa que receba como entrada da classe Main o nome de um arquivo de texto que contenha valores numéricos e some todos os valores, imprimindo no console a soma.
            case 10:
                // somaValoresArquivo(String arquivo);
                break;
            // ## DESAFIO - Crie um Jogo da Forca com Arquivos de Texto**
            case 11:
                // forcaComTxt();
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        
    }

    public static int[] tabuada(int number) {
        int[] tabuada = new int[10];
        for (int i = 1; i <= 10; i++) {
            tabuada[i-1] = number * i;
        }
        return tabuada;
    }

    public static void lerArquivoTexto(String arquivo) {
        
    }

    public static int[] operacoesBasicas(int numeroUm, int numeroDois) {
        return new int[4];
    }

    public static BigInteger bigIntExpo(BigInteger base, int pow) {
        return base;
    }

    public static void aleatorizarPessoas(String pessoas[]) {
        
    }

    public static double[] areaECircunferencia(double raio) {
        return new double[2];
    }

    public static boolean hasJava(String arquivo) {
        return false;
    }

    public static void dezDigitos(String arquivo) {
        
    }

    public static double calculaArea(double numeroUm, double numeroDois) {
        return 0;
    }

    public static double somaValoresArquivo(String arquivo) {
        return 0;
    }

    public static void forcaComTxt() {
        
    }
}