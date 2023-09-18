

public class Estudante {
    private int codigo;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private Cidade cidade;
  


    public Estudante(int Codigo, String Nome, String DataNascimento, String Email, String Senha, Cidade Cidade){
        codigo = Codigo;
        nome = Nome;
        dataNascimento =  DataNascimento;
        email =  Email;
        senha =  Senha;
        cidade = Cidade;
        cidade.adicionaNovoEstudante();
    }

    public int getCodigo(){
      return codigo;
    }
    public String getNome(){
        return nome;
    }
    public String getDataNascimento(){
        return dataNascimento;
    }
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
    public Cidade getCidade(){
        return cidade;
    }
    public void setCodigo(int Codigo){
        codigo = Codigo;
    }
    public void setNome(String Nome){
        nome = Nome;
    }
    public void setDataNascimento(String DataNascimento){
        dataNascimento = DataNascimento;
    }
    public void setEmail(String Email){
        email = Email;
    }
    public void setSenha(String Senha){
        senha = Senha;
    }
    public void setCidade(Cidade Cidade){
        cidade = Cidade;
    }
    public void exibeDados(){
        System.out.println("CODIGO:"+ codigo);
        System.out.println("NOME:"+ nome);
        System.out.println("DATA DE NASCIMENTO:"+ dataNascimento);
        System.out.println("E-MAIL:"+ email);
        System.out.println("SENHA:"+ senha);
        System.out.println(" Dados da Cidade ");
        cidade.exibeDados();
    }
    public void atualizaSenha(){
       
  
        
        System.out.println("ATUALIZACAO DE SENHA REQUERIDA: \n");
                String senha = Teclado.leString("DIGITE A SENHA CADASTRADA:");
		        String novaSenha = Teclado.leString("DIGITE UMA NOVA SENHA:");
                String repeteSenha = Teclado.leString("CONFIRME SUA SENHA:");
		        if((!getSenha().equals(senha)) && (novaSenha.equals(repeteSenha))){
                    setSenha(repeteSenha);
                    System.out.println("SENHA ALTERADA COM SUCESSO!");
                }
                else{
                    System.out.println("NAO FOI POSSIVEL COMPLETAR A ALTERACAO, POIS AS SENHAS DIGITADAS NAO CONFEREM!");
                }

		        if((getSenha()).equals(novaSenha)){
		            novaSenha = Teclado.leString("NOVA SENHA NAO PODE SER IGUAL A ANTERIOR, DIGITE NOVAMENTE:");
		        }
		        else {}
		        
		    
		        if ((novaSenha).equals(repeteSenha)){
		            setSenha(repeteSenha);
			        System.out.println("SENHA ALTERADA COM SUCESSO!");
		        }
		        

}

    
    
    
}