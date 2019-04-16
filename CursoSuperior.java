package model.curso;

public class CursoSuperior extends Curso {
    
    private double notaNP1; 
    private double notaNP2;
    private double media;
    private double reposicao;
    private double exame;

    public CursoSuperior (String aNome) {
        super(aNome);
                
        this.notaNP1 = 0.0;
        this.notaNP2 = 0.0;
        this.media = 0.0;
        this.reposicao = 0.0;
        this.exame = 0.0;
        
    }
    
    public void setNotaP1(double nota) {
        this.notaNP1 = nota; 
    }

    public void setNotaP2(double nota){
        this.notaNP2 = nota; 
    }

    public void setNotaReposicao(double nota) {
        this.reposicao = nota; 
    }

    public void setNotaExame(double nota) {
        this.exame = nota; 
    }

    public double getNotaP1(){
        return notaNP1;
    }

    public double getNotaP2(){
        return notaNP2;
    }

    public double getNotaReposicao() {
        return reposicao;
    }

    public double getNotaExame(){
        return exame;
    }
    
    public double getMedia () {
        return media;
    }

    @Override
    public double getMedia(){
        
        if (getNotaP1() >  )
        
        
    }
    
}
    
       

    
}
