import java.util.Scanner; 

public class ConP {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); 

        int totalFuncionarios = 20; 
        int contador = 0; 

        int atrasados = 0; 
        int saiuCedo = 0; 

        while (contador < totalFuncionarios){
            System.out.println("Funcionário " + (contador + 1)); 
            
            System.out.println("Horário de entrada (somente hora, ex:8):"); 
            int entrada = sc.nextInt(); 

            System.out.println("Horário de saída (somente hora, ex:17):"); 
            int saida = sc.nextInt(); 
             
            // regras 
            if (entrada < 8 || entrada > 9) { 
                atrasados++; 
            }

            if (saida < 17 || saida > 18) { 
                saiuCedo++; 
            }

            contador++; 
            System.out.println("-------------------------------------------");
        }

        System.out.println("=== RESULTADO FINAL ==="); 
        System.out.println("Atrasados: " + atrasados); 
        System.out.println("Saíram mais cedo: " + saiuCedo); 

        sc.close(); 
    }
}
