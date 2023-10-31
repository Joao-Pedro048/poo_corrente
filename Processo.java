public class Processo extends Thread{
    private String nome;
    private int numeroInteracoes;
    private int prioridade;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroInteracoes() {
        return numeroInteracoes;
    }
    public void setNumeroInteracoes(int numeroInteracoes) {
        this.numeroInteracoes = numeroInteracoes;
    }
    public int getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    public Processo(){

    }
    public Processo(String nome, int numeroInteracoes, int prioridade){
        this.nome=nome;
        this.numeroInteracoes=numeroInteracoes;
        this.prioridade=prioridade;
    }
    public void run(){
        for (int i = 0; i < numeroInteracoes; i++){
            System.out.println("Processo:" +nome+ ":"+i);

            try{
                Thread.sleep(i*100);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    }

//vamos criar uma classe Processo herdar de Thread
//classe vai ter dois atributos
//String nome e o numeroIrteracoes
//método contrutor com esses dois atributos acima
//método run, no corpo dele estrutura de repeticao
//10 interacoes
//nome e as interacoes