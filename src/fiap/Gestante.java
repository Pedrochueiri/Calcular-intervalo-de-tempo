package fiap;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Gestante {
	private String nome;
	private LocalDate dataDaGestacao;

	public Gestante() {
	}

	public Gestante(String nome, LocalDate dataDaGestacao) {
		this.nome = nome;
		setDataDaGestacao(dataDaGestacao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDaGestacao() {
		return dataDaGestacao;
	}

	public void setDataDaGestacao(LocalDate dataDaGestacao) {
		try {
			LocalDate dataAtual = LocalDate.now();
			LocalDate data9M = LocalDate.now().minusMonths(9).minusDays(1);
			if (dataDaGestacao.isAfter(data9M) && dataDaGestacao.isBefore(dataAtual)) {
				this.dataDaGestacao = dataDaGestacao;
			}
			else {
				throw new Exception("Data fora dos parâmetros");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.exit(0);
		}

	}
	
	public int tempoDeGestacao() {
		LocalDate dataAtual = LocalDate.now();
		Period diff = Period.between(dataDaGestacao, dataAtual);
		return diff.getMonths();
	}

}
