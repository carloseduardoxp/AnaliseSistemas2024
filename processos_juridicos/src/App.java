import domain.Audiencia;
import domain.Custo;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Processo;
import domain.Tribunal;
import domain.Vara;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Tribunal tribunal = new Tribunal("Tribunal Regional do Trabalho da 3ª Região");

        Vara vara = new Vara("Vara do Trabalho", tribunal);

        PessoaFisica pessoa = new PessoaFisica("000.999.999-99", "joao@gmail.com", "João");
        PessoaJuridica pessoaJurifica = new PessoaJuridica("000-111-222-333-12","chimpurimpula@gmail.com","Chimpurimpula Games");

        Processo processo = new Processo(pessoa, LocalDate.of(2024,11,5),"0001234-56.2024.5.03.0001", pessoaJurifica, vara);

        Audiencia audiencia = new Audiencia(LocalDate.of(2024,11,6), processo, "Pede comprovantes de justiça gratuita à parte autora");

        Custo custo = new Custo(LocalDate.of(2024,11,8),"matrícula atualizada", processo, 20.0);

        
    }
}
