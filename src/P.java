import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class P {

    public static void main(String[] args) {

        // Criando um codigo o qual me receba me dizendo olá, bom dia/tarde/noite e dizendo o horario e o dia
    String nome = "Davi";
            //ISO 8601
            //Para dizer o horario eu devo "importar" o "java.time.local" para assim utilizar o LocalDate.
            //O import deve estar encima do public class
            //Para passar para o PT BR eu devo importar o "java.util.Locale"


        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        //Locale brasil = new Locale("pt", "BR");
        //Não aparece o "language" e nem o "country"
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil));
        System.out.println(hoje.getDayOfYear());
        System.out.println(hoje.getDayOfMonth());
        String diasemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao;
        //Irei importar agora o "java.time.LocalDateTime" para saber o horario
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom Dia!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa Tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24){
                saudacao = "Boa Noite!";
        } else {
            saudacao = "Olá.";
        }
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diasemana, saudacao.toUpperCase());
    }
}
