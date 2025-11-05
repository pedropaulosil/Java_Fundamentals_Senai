package geralPackage;

abstract class Ninja {
	protected String nome;
	protected String cla;
	
	public Ninja(String nome, String cla) {
		this.nome = nome;
		this.cla = cla;	
	}
	public abstract void exibirHabilidades();	
	public abstract void mostrarAcoes();
}
