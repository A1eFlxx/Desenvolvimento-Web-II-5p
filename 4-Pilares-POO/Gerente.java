public class Gerente extends Funcionario implements Autenticavel {

    private String senha = "7355608";

    @Override
    private String getFuncao(){
        return "Gerente";
    }

public boolean login(String senha){
    return this.senha.equals(senha);
}

    
 
}
