public class Aluno {
    private String nome;
    private String ra; 
    private double[] notas;
    private double presenca; 
    private boolean ead; 
    private double notaFinal;
    
    
    public Aluno(String nome, String ra, double[] notas, double presenca) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
        this.presenca = presenca;
        this.ead = false;
        calcularNotaFinal();
    }

    
    public Aluno(String nome, String ra, double[] notas) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
        this.ead = true;
        calcularNotaFinal();
    }

    private void calcularNotaFinal() 
    {
        if (notas.length == 2) {
            notaFinal = (notas[0] + notas[1]) / 2;

        } else if (notas.length == 3) {
            notaFinal = (notas[0] + 2 * notas[1] + 4 * notas[2]) / 7;

        } else if (notas.length == 4) {
            notaFinal = (notas[0] * 0.15) + (notas[1] * 0.30) + (notas[2] * 0.10) + (notas[3] * 0.45);
        }
    }

    
    public String verificarSituacao() {

        if (ead) {
            return notaFinal >= 5 ? "Aprovado" : "Reprovado";
        }
        
        else {
            return (notaFinal >= 5 && presenca >= 75) ? "Aprovado" : "Reprovado";
        }
    }

    
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.printf("Nota Final: %.2f%n", notaFinal);
        System.out.println("Situação: " + verificarSituacao());
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
        calcularNotaFinal();
    }

    public double getPresenca() {
        return presenca;
    }

    public void setPresenca(double presenca) {
        this.presenca = presenca;
    }

    public boolean isEad() {
        return ead;
    }

    public void setEad(boolean ead) {
        this.ead = ead;
    }
}