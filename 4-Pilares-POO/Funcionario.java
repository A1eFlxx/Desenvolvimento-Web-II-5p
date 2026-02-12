public abstract class Funcionario {

    private static final double SALARIO_MINIMO = 1620;

    private String nome;
    private String cpf;
    private Double salario;

    public Funcionario(String nome, String cpf, Double salario) {
        this.nome = nome;            //this = isso
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() == 11){
            this.cpf = cpf;
        }
    }

    public Double getSalario() {   
        return salario.doubleValue();
    }

    public void setSalario(Double salario) {               //no set vc adiciona suas regras de negocio
        if(salario < SALARIO_MINIMO){
            System.out.println("Salario informado menos que salario minimo");
        }else{
            this.salario = salario.doubleValue();         //doubleValue() faz vc salvar o valor ao inves do local da memoria
           
        }
    }

   public abstract String getFuncao();

}