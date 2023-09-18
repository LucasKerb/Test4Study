public class TesteFun4Study{
  
    

    public static void main(String[]args){
    
    int contagemC = 1;
    int opcao;
    int contagemE = 1;
    char resposta;
    
    do{
        
    System.out.println("\nCadastre a Cidade"+ contagemC + ":\n");
Cidade Cidade = new Cidade(Teclado.leInt("Informe o código: "),
                       Teclado.leString("Informe a descrição: "),
                       Teclado.leString("Informe a UF: "));

                    
    do{ 
                 
   System.out.println("\nCadastre o Estudante" + contagemE +":\n");
Estudante Estudante = new Estudante(Teclado.leInt("Informe o código: "),
                             Teclado.leString("Informe o nome: "),
                             Teclado.leString("Informe a data de nascimento: "),
                             Teclado.leString("Informe o e-mail: "),
                             Teclado.leString("Informe a senha: "),
                             Cidade);
                            
                   System.out.println("DETALHES DO ESTUDANTE");
                   System.out.println("ESTUDANTE"+ contagemE + ":");
                   Cidade.exibeDados();
                   Estudante.exibeDados();
                   
                   


resposta= Teclado.leChar(("GOSTARIA DE ALTERAR ALGUM DADO DO ESTUDANTE? S = Sim ou 0 = Nao:"));

if (resposta == 0){
System.out.println("ESTUDANTE CADSTRADO COM SUCESSO!");
contagemE++;}


if((resposta == 'S')||(resposta == 's')){

do{ System.out.println("ESTUDANTE "+ contagemE + ":\n");
    System.out.println("1 - NOME");
    System.out.println("2 - DATA DE NASCIMENTO");
    System.out.println("3 - E-MAIL");
    System.out.println("4 -  SENHA");
    System.out.println("5 - NAO FAZER MAIS ALTERACOES");
opcao = Teclado.leInt("DIGITE A OPCAO NA QUAL DESEJA FAZER ALGUMA ALTERACAO:");
switch(opcao){
    case 1:
    Estudante.setNome(Teclado.leString("DIGITE O NOVO NOME:"));
    break;
    case 2:
    Estudante.setDataNascimento(Teclado.leString("DIGITE A NOVA DATA DE NASCIMENTO:"));
    break;
    case 3:
    Estudante.setEmail(Teclado.leString("DIGITE O NOVO E-MAIL:"));
    break;
    case 4:
    Estudante.atualizaSenha();
    break;
    case 5:
    System.out.println("ESTUDANTE CADASTRADO COM SUCESSO");
    
    continue;
}


}while(opcao != 5);
}
contagemE++;
Estudante.exibeDados();
resposta = Teclado.leChar("DESEJA CONTINUAR O CADASTRO DE ESTUDANTES? S = SIM, 0 = NAO:");
if(resposta == 'S'){
    Cidade.adicionaNovoEstudante();
}
if( resposta == '0' && contagemE <4){
System.out.println("VOCE AINDA NAO ATINGIU O NUMERO MINIMO DE ESTUDANTES = 4");
resposta =  Teclado.leChar("POR FAVOR CADASTRE MAIS ESTUDANTES! S= PARA CONTINUAR:");
}
Estudante.exibeDados(); 
Cidade.exibeDados();

}
while (resposta !='0' || contagemE < 4);
resposta=Teclado.leChar("VOCE DESEJA CONTINUAR A CADASTRAR CIDADES? S = SIM, 0 = NAO:");
if (resposta == 's'){
    contagemC++;
}
}
while (resposta != '0');

   

}
}