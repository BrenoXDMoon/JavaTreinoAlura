package br.com.alura.modelo;

public class Aula {

	private String titulo;
	private Integer tempoEmMinutos;
	
	
	public Aula(String titulo, Integer tempoEmMinutos) {
		this.titulo = titulo;
		this.tempoEmMinutos = tempoEmMinutos;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getTempoEmMinutos() {
		return tempoEmMinutos;
	}
	public void setTempoEmMinutos(Integer tempoEmMinutos) {
		this.tempoEmMinutos = tempoEmMinutos;
	}

	@Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempoEmMinutos + " minutos]";
    }
}
