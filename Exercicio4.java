public class Exercicio4 {

    public static void main(String[] args) {


        String nome="Edgar";
        double salariofixo=0,totalvendas=0,percentualvendas=0,salariofinal=0;

        salariofixo=3000.50;
        totalvendas=2543.35;
        percentualvendas=(totalvendas/100)*15;
        salariofinal=salariofixo+percentualvendas;

        System.out.println("Nome do funcionario: " + nome );
        System.out.println("Salario Fixo: " + salariofixo );
        System.out.println("Salario Final: " + salariofinal );

        
    }

}