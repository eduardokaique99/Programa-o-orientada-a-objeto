import java.util.Scanner;

//import sun.tools.jstat.SymbolResolutionClosure;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - Número primo                                     |");
        System.out.println("+-------------------------------------------------------+");
        
        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`)
            case 1:
                try {
                    System.out.println("Qual a primeira nota?");
                    Double notaUm = scanner.nextDouble();
                    System.out.println("Qual a segunda nota?");
                    Double notaDois = scanner.nextDouble();
                    System.out.println("Qual a terceira nota?");
                    Double notaTres = scanner.nextDouble();
                    System.out.println("A média dessas notas é: " +media(notaUm, notaDois, notaTres));
                } catch (Exception e) {
                    System.err.println("Deu ruim parceiro");
                }
                break;
            // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            case 2:
            try {
                System.out.println("Informe o tamanho do primeiro lado:");
                Double ladoUm = scanner.nextDouble();
                System.out.println("Informe o tamanho do segundo lado:");
                Double ladoDois = scanner.nextDouble();
                System.out.println("A área do objeto é: " +area(ladoUm, ladoDois) + " mm²");
            } catch (Exception e) {
                System.err.println("Deu ruim parceiro");
            }
                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
            case 3:
            try {
                System.out.println("Informe a largura do objeto:");
                Double largura = scanner.nextDouble();
                System.out.println("Informe a altura do objeto:");
                Double altura = scanner.nextDouble();
                System.out.println("Informe a profundidade do objeto:");
                Double profundidade = scanner.nextDouble();
                System.out.println("O volume do objeto é: " +volume(largura, altura, profundidade) +" mm³");
            } catch (Exception e) {
                System.err.println("Deu ruim parceiro");
            }    
                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
            case 4:
            try {
                System.out.println("Informe um número:");
                int base = scanner.nextInt();
                System.out.println("Informe outro número:");
                int verificador = scanner.nextInt();
                System.out.println(valorMaiorQueDobro(base, verificador));
                if(true){
                System.out.println("O valor " + base +" é maior que o dobro do valor " + verificador);
                }
                else {
                System.out.println("O valor " + base +" é menor que o dobro do valor " + verificador);
                }
            } catch (Exception e) {
                System.err.println("Os valores são iguais.");
            }
                break;
            // 5) Crie um programa que calcule _bhaskara_
            case 5:
                System.out.println(bhaskara(2, 3, 5));
                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)
            case 6:
            try {
                System.out.println("Informe a distância a ser percorrida(km):");
                Double distancia = scanner.nextDouble();
                System.out.println("Informe o tempo disponível(h):");
                Double tempo = scanner.nextDouble();
                System.out.println("A velocidade necessaria para percorrer o trajeto é " +mediaViagem(distancia, tempo) +" km/h");
            } catch (Exception e) {
                System.err.println("Deu ruim parceiro");
            }    
                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
            case 7:
            try {
                System.out.println("Informe seu salario:");
                Double faturamento = scanner.nextDouble();
                System.out.println("Informe o valor total dos impostos:");
                Double qtdImposto = scanner.nextDouble();
                System.out.println(percentualImposto(faturamento, qtdImposto) +" %");
            } catch (Exception e) {
                System.err.println("Deu ruim parceiro");
            }    
                break;
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:
            try {
                System.out.println("Informe um número:");
                int valor = scanner.nextInt();
                boolean result = parOuImpar(valor);
                System.out.println();
                if(result){
                System.out.println("O valor " +valor +" é um número par.");
                }
                else {
                System.out.println("O valor " +valor +" é um número impar.");
                }
            } catch (Exception e) {
                System.err.println("O valor não existe.");
            }
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
                // compareString(String stringUm, String stringDois)
                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
            case 10:
                // convertString(String valor);
                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
            case 11:
            try {
                System.out.println("Informe seu salario:");
                Double salario = scanner.nextDouble();
                double percentual = percentualImpostoSalario(salario);
                if(percentual == 0){
                    System.out.println("Valor de imposto é: " + percentual + " %");
                } else if(percentual == 7.5) {
                    System.out.println("Valor de imposto é: " + percentual + " %");
                } else if(percentual == 15) {
                    System.out.println("Valor de imposto é: " + percentual + " %");
                } else if(percentual == 22.5) {
                    System.out.println("Valor de imposto é: " + percentual + " %");
                } else if(percentual == 27.5) {
                    System.out.println("Valor de imposto é: " + percentual + " %");
                } 
            } catch (Exception e) {
                System.err.println("Deu ruim parceiro");
            }    
                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:
                System.out.println(testePrimo(6));
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double media(double notaUm, double notaDois, double notaTres) {
    
        double media = (notaUm + notaDois + notaTres)/3;

        return media;
    }

    public static double area(double ladoUm, double ladoDois) {

        double area = ( ladoUm * ladoDois);

        return area;
    }

    public static double volume(double largura, double altura, double profundidade) {

        double volume = ( largura * altura * profundidade);

        return volume;
    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {

        if(base > (verificar*2)) {
            return true;
        } else {
            return false;}
    }

    public static double[] bhaskara(int a, int b, int c) {
         
        double delta = (b*b-4*a*c);
        
        return new double[1];
    }

    public static double mediaViagem(double distancia, double tempo) {

        double mediaViagem = distancia / tempo;

        return mediaViagem;
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {

        double percentualImposto = (faturamento / qtdImposto);

        return percentualImposto;
    }

    public static boolean parOuImpar(int valor) {

        if (valor%2==0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean compareString(String stringUm, String stringDois) {
        return false;
    }

    public static int convertString(String valor) {
        return 0;
    }

    public static double percentualImpostoSalario(double salario) {

        if(salario <= 1903.98){
            return 0;
        } else if((salario > 1903.98) && (salario <= 2826.65)) {
            return 7.5;
        } else if((salario > 2826.65) && (salario <= 3751.05)) {
            return 15;
        } else if((salario > 3751.05) && (salario <= 4664.68)) {
            return 22.5;
        } else if(salario > 4664.68) {
            return 27.5;
        }

        return -1;
    }

    public static boolean testePrimo(int valor) {

        int di =0;
        int x;
        for (x=1;x<=valor;x++)
 		{
		    if (valor % x == 0) {
                di++;
            }
        }
                if (di == 2)
            {
                return true;
            } else {
                return false;
            }
    }

}