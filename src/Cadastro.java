import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Pessoa>pessoas;
    
    public Cadastro(){
        pessoas=new ArrayList<>();
    }
    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);

    }
    public List<Pessoa>listarPessoas(){
        return pessoas;
        
    }
}
