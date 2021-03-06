
public class Squad implements  java.lang.Comparable<Squad> {

	private String name_squad;
	private int n_abates;
	private int pontuacao;
	public String getName_squad() {
		return name_squad;
	}
	public void setName_squad(String name_squad) {
		this.name_squad = name_squad;
	}
	public int getN_abates() {
		return n_abates;
	}
	public void setN_abates(int n_abates) {
		this.n_abates = n_abates;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao += pontuacao;
		//this.pontuacao += 2*n;
	}
	public void atualizar (int pont, int n_abates, int v_abates) {
		this.pontuacao += pont;
		this.pontuacao += v_abates*n_abates;
	}
	public int compareTo(Squad o) {
		if(this.pontuacao < o.pontuacao) {
			return 1;
		}
		if (pontuacao > o.pontuacao) {
			return -1;
		}
		return 0;
	}
	
}
