package br.com.limavit.buscacep.domain;

public class Endereco {
	
	    private String logradouro;
	    private String bairro;
	    private String localidade;

	    public String getLogradouro() {
	        return logradouro;
	    }

	    public String getBairro() {
	        return bairro;
	    }

	    public String getLocalidade() {
	        return localidade;
	    }

	    @Override
	    public String toString() {
	        return "Endereco{" + "logradouro=" + logradouro + ", bairro=" + bairro + ", localidade=" + localidade + '}';
	    }
}
