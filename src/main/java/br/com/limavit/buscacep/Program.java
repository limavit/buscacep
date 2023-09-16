package br.com.limavit.buscacep;

import java.util.Scanner;

import br.com.limavit.buscacep.domain.Endereco;
import br.com.limavit.buscacep.service.ServicoDeCep;

public class Program {

	public static void main(String[] args) throws Exception {
		System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);

        System.out.println(endereco.toString());
        
        
        

	}

}
