import dao.*;
import domain.*;
import java.time.LocalDate;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Especie cachorro = new Especie("Cachorro");
        EspecieDao especieDao = new EspecieDao();
        especieDao.inserir(cachorro);
        System.out.println(cachorro);

        AtendenteDao atendenteDao = new AtendenteDao();
        Atendente atendente = new Atendente(2000d,"Ana","349855855");
        atendenteDao.inserir(atendente);
        System.out.println(atendente);

        ClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente(atendente, "Rua das couves","Carlos", "349885855");
        LocalDate dataNascimento = LocalDate.of(2012, 10, 19);
        Pet pet = new Pet(dataNascimento,cachorro,GeneroEnum.FEMEA,"Layca",cliente);
        cliente.setPets(Arrays.asList(pet));
        clienteDao.inserir(cliente);
        System.out.println(cliente);
        System.out.println(cliente.getPets());

        Veterinario veterinario = new Veterinario("98532","Dra Camila","34838383");
        VeterinarioDao veterinarioDao = new VeterinarioDao();
        veterinarioDao.inserir(veterinario);
        System.out.println(veterinario);

        Tratamento tratamento = new Tratamento("Caroço na pata", veterinario);
        TratamentoDao tratamentoDao = new TratamentoDao();
        tratamentoDao.inserir(tratamento);
        System.out.println(tratamento);

        Consulta consulta = new Consulta(LocalDate.now(),"Detectado caroço na pata esquerda",tratamento,veterinario);
        ConsultaDao consultaDao = new ConsultaDao();
        consultaDao.inserir(consulta);
        System.out.println(consulta);

        Exame exame = new Exame("biópsia","Falso negativo",LocalDate.now(),consulta);
        ExameDao exameDao = new ExameDao();
        exameDao.inserir(exame);
        System.out.println(exame);
    }


}

