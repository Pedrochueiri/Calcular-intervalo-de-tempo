package fiap;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;

	public Pessoa() {
	}

	public Pessoa(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		setDataNascimento(dataNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		LocalDate dataAtual = LocalDate.now();
		LocalDate rEliz = LocalDate.parse("1899-12-31");
		try {
			if (dataNascimento.isAfter(rEliz) && dataNascimento.isBefore(dataAtual)) {
				this.dataNascimento = dataNascimento;
			} else {
				throw new Exception("Data fora do período permitido");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.exit(0);// encerra a execução do programa
		}

	}

	public int calculaIdade() {
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataNascimento, dataAtual);
		return periodo.getYears();
	}

}
