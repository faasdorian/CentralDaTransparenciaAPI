package br.zenith.centraldatransparenciaapi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "EXPENSES")
public class Expense {
	
	@Id
	@Column(name = "EXPENSE_ID")
	private Long expenseId;
	@Column(name = "EXPENSE_VALUE")
	private Double expenseValue;
	@Column(name = "ORGAO")
	private String orgao;
	@Column(name = "EVENTO")
	private String evento;
	@Column(name = "NOME_FORNECEDOR")
	private String nomeFornecedor;
	@Column(name = "DATA_EMISSAO")
	private String dataEmissao;
	@ManyToOne
	@JoinColumn(name = "CITY_ID")
	City city;

	public Expense() {
	}

	public Expense(Long expenseId, Double expenseValue, String orgao, String evento, String nomeFornecedor, String dataEmissao) {
		this.expenseId = expenseId;
		this.expenseValue = expenseValue;
		this.orgao = orgao;
		this.evento = evento;
		this.nomeFornecedor = nomeFornecedor;
		this.dataEmissao = dataEmissao;
	}

	@Override
	public String toString() {
		return "Expense{" +
				"expenseId=" + expenseId +
				", expenseValue=" + expenseValue +
				", orgao='" + orgao + '\'' +
				", evento='" + evento + '\'' +
				", nomeFornecedor='" + nomeFornecedor + '\'' +
				", dataEmissao='" + dataEmissao + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Expense expense = (Expense) o;

		if (expenseId != null ? !expenseId.equals(expense.expenseId) : expense.expenseId != null) return false;
		if (expenseValue != null ? !expenseValue.equals(expense.expenseValue) : expense.expenseValue != null)
			return false;
		if (orgao != null ? !orgao.equals(expense.orgao) : expense.orgao != null) return false;
		if (evento != null ? !evento.equals(expense.evento) : expense.evento != null) return false;
		if (nomeFornecedor != null ? !nomeFornecedor.equals(expense.nomeFornecedor) : expense.nomeFornecedor != null)
			return false;
		return dataEmissao != null ? dataEmissao.equals(expense.dataEmissao) : expense.dataEmissao == null;
	}

	@Override
	public int hashCode() {
		int result = expenseId != null ? expenseId.hashCode() : 0;
		result = 31 * result + (expenseValue != null ? expenseValue.hashCode() : 0);
		result = 31 * result + (orgao != null ? orgao.hashCode() : 0);
		result = 31 * result + (evento != null ? evento.hashCode() : 0);
		result = 31 * result + (nomeFornecedor != null ? nomeFornecedor.hashCode() : 0);
		result = 31 * result + (dataEmissao != null ? dataEmissao.hashCode() : 0);
		return result;
	}
}
