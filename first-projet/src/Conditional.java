public class Conditional {
   public static void main(String[] args) {
       double nota1 = 8.7;
       double nota2 = 2.3;
       double media = ( nota1 + nota2 ) / 2;

       System.out.println("A media e " + media);

       if( media < 7) {
        System.out.println("Reprovado");
       } else {
        System.out.println("Aprovado");  
       }

       double frequencia = 74.99;

       if( frequencia < 75 || media < 7 ) {
        System.out.println("Reprovado");
       } else {
        System.out.println("Aprovado");
       }

       boolean frequenciaMinima = frequencia >= 75;
       String mensagem = frequenciaMinima ? "Aprovado" : "Reprovado";
       
       System.out.println(mensagem);
   } 
}
