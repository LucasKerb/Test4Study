public class Cidade {
  
        private int codigo;
        private String descricao;
        private String uf;
        private int quantidadeEstudantes;
     
        
		public  Cidade (int Codigo, String Descricao, String UF){
            codigo =  Codigo;
            descricao = Descricao;
            uf = UF;
        }
        public int getCodigo(){
            return codigo;
        }
        public String getDescricao(){
            return descricao;
        }
        public String getUf(){
            return uf;
        }
        public void setDescricao(String Descricao){
            descricao = Descricao;
        }
        public void setUf(String UF){
            uf =  UF;
        }
        public void adicionaNovoEstudante(){
            quantidadeEstudantes = quantidadeEstudantes + 1;
        }
        public void exibeDados(){
            System.out.println("CODIGO:"+codigo);
            System.out.println("DESCRICAO:"+descricao);
            System.out.println("UF:"+ uf);
            System.out.println("QUANTIDADE DE ESTUDANTES:"+ quantidadeEstudantes);
        }

    
}
