import domain.Aeroporto;
import domain.Cidade;
import domain.Cliente;
import domain.Escala;
import domain.Passagem;
import domain.ProgramacaoVoo;
import domain.Voo;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        Cidade cidadeUdia = new Cidade("Uberlandia", 750000);
        cidadeUdia.setCodigo(2);
        Cidade cidade1 = new Cidade("São Paulo",12000000);
        Cidade cidade2 = new Cidade("Curitiba",1700000);

        Aeroporto aeroportoUdia = new Aeroporto("Tenente Coronel Aviador César Bombonato","23° 37′ 34″ S, 46° 39′ 23″ O",cidade1);
        aeroportoUdia.setCodigo(3);
        Aeroporto aeroporto1 = new Aeroporto("Congonhas","23° 37′ 34″ S, 46° 39′ 23″ O",cidade1);
        Aeroporto aeroporto2 = new Aeroporto("Afonso Pena","25° 31′ 54″ S, 49° 10′ 34″ O",cidade2);

        Voo voo1 = new Voo("G3 1687", aeroportoUdia, aeroporto1);
        Voo voo2 = new Voo("G3 1126", aeroporto1, aeroporto2);

        ProgramacaoVoo programacao1 = new ProgramacaoVoo(voo1, 
                                                         LocalDateTime.of(2024, 9, 29, 15, 30),
                                                         LocalDateTime.of(2024, 9, 29, 16, 50),
                                                         "BOEING 737-800 JET",
                                                         180);

        ProgramacaoVoo programacao2 = new ProgramacaoVoo(voo2, 
                                                         LocalDateTime.of(2024, 9, 29, 19, 05),
                                                         LocalDateTime.of(2024, 9, 29, 20, 20),
                                                         "BOEING 737-800 JET",
                                                         180);

        Cliente cliente = new Cliente("000.000.000-22","Carlos Eduardo","carloseduardodantas@iftm.edu.br");
               
        Passagem passagem = new Passagem("DJEVSZ", 600.56, cliente);

        Escala escala = new Escala(programacao1,passagem,"25F");
        Escala escala1 = new Escala(programacao2,passagem,"32F");
        
        


        

    }
}
