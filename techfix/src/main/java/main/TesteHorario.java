package main;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.hibernate.context.internal.ThreadLocalSessionContext;

public class TesteHorario {
    
    public static void main(String[] args) {
        
        // Retorna data. Padrão: Ano-Mês-Dia
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);

        // Retorna tempo. Padrão: Hora-Minuto-Segundo-Nanosegundo
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        // Retorna data + tempo. Padrão: Ano-Mês-Dia "T" Hora-Minuto-Segundo-Nanosegundo
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);

        // Retorna data. Recebe uma String para definir o formato.
        // Inputs: 
        // HH:mm:ss = Hora:minuto:segundo
        // dd-MM-yyyy = dia-mês-ano
        // E = dia da semana (3 letras, idioma local)
        // Qualquer símbolo é aceito como separador.
        DateTimeFormatter myDateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm E dd/MM/yy");
        String myDateTimeFinal = myDateTime.format(myDateTimeFormatter);
        System.out.println(myDateTimeFinal);

        // Definindo horários como strings
        String horaUm = "19:30";
        String horaDois = "21:45";

        // Usando um formatter de hora:minuto
        DateTimeFormatter timeFormatHHMM = DateTimeFormatter.ofPattern("HH:mm");
        // Convertendo as strings em horários válidos e atribuindo à novas variáveis
        LocalTime horarioUm = LocalTime.parse(horaUm, timeFormatHHMM);
        LocalTime horarioDois = LocalTime.parse(horaDois, timeFormatHHMM);

        // ChronoUnit.MINUTS.between é usado para calcular a diferença entre dois horários
        long minutosEntre = ChronoUnit.MINUTES.between(horarioUm, horarioDois);
        System.out.println(minutosEntre);

        // Métodos para comparar horários:
        if (horarioUm.isBefore(horarioDois)) { // .isBefore para comparar se vem antes
            System.out.println(horarioUm + " vem antes de " + horarioDois);
        } else if (horarioUm.isAfter(horarioDois)) { // .isAfter para comparar se vem depois
            System.out.println(horarioUm + " vem depois de " + horarioDois);
        } else {
            System.out.println("Os dois horários são iguais");
        }

        System.out.println(horarioUm.compareTo(horarioDois));
    }
}