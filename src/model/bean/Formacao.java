package model.bean;

import java.sql.Date;

public class Formacao {

	private long idFormacao;
	private String nomeFormacao;
	private String instituicaoFormacao;
	private Date dataInicialFormacao;
	private Date dataFinalFormacao;

	public Formacao(String nomeFormacao, String instituicaoFormacao, Date dataInicialFormacao,
			Date dataFinalFormacao) {
		setNomeFormacao(nomeFormacao);
		setInstituicaoFormacao(instituicaoFormacao);
		setDataInicialFormacao(dataInicialFormacao);
		setDataFinalFormacao(dataFinalFormacao);
	}

	public String getNomeFormacao() {
		return nomeFormacao;
	}

	public void setNomeFormacao(String nomeFormacao) {
		this.nomeFormacao = nomeFormacao;
	}

	public String getInstituicaoFormacao() {
		return instituicaoFormacao;
	}

	public void setInstituicaoFormacao(String instituicaoFormacao) {
		this.instituicaoFormacao = instituicaoFormacao;
	}

	public Date getDataInicialFormacao() {
		return dataInicialFormacao;
	}

	public void setDataInicialFormacao(Date dataInicialFormacao) {
		this.dataInicialFormacao = dataInicialFormacao;
	}

	public Date getDataFinalFormacao() {
		return dataFinalFormacao;
	}

	public void setDataFinalFormacao(Date dataFinalFormacao) {
		this.dataFinalFormacao = dataFinalFormacao;
	}

	public long getIdFormacao() {
		return idFormacao;
	}

}
