package atividade5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 01- Faça um programa que solicite o nome do usuário, o peso e altura e que realize o cálculo do Índice de Massa
		// Corporal (IMC). 
		
        float altura, peso, imc;
		
		Scanner sc7 = new Scanner(System.in);
		System.out.println("digite sua altura (m): ");
		altura = sc7.nextFloat();
		System.out.println("digite seu peso (kg): ");
		peso = sc7.nextFloat();
		imc = peso / (altura * altura);
		System.out.println(imc);
		
		if (imc < 17) {
			System.out.println("você está muito abaixo do peso!");
		}
		else if ((imc >= 17) && (imc < 18.5)) {
			System.out.println("você está abaixo do peso!");
		}
		else if ((imc >= 18.5) && (imc < 25)) {
			System.out.println("você está no peso ideal!");
		}
		else if ((imc >= 25) && (imc < 30)) {
			System.out.println("você está com sobrepeso!");
		}
		else if ((imc >= 30) && (imc < 35)) {
			System.out.println("você está com obesidade!");
		}
		else if ((imc >= 35) && (imc <40)) {
			System.out.println("você está com obesidade severa!");
		}else {
			System.out.println("você está com obesidade mórbida!");
		}
		
		// 02 - Construa um programa que solicita o número final da placa de um veículo ao usuário e informa a data do
		// vencimento do IPVA. Por exemplo: se o final da placa for “1”, o vencimento é no mês de janeiro, se for “2”, o
		// vencimento é no mês de fevereiro, e assim por diante. Caso não seja nenhum dos meses existentes, o usuário deve
		// ser informado que digitou um valor inválido.
		
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("INFORME O NÚMERO FINAL DA PLACA: ");
		num = sc.nextInt();
		
		if(num==1) {
			System.out.println("VENCIMENTO EM JANEIRO!");
		}else if(num==2) {
			System.out.println("VENCIMENTO EM FEVEREIRO!");
		}else {
			System.out.println("VALOR INVÁLIDO");
		}
		
		// 03 - Faça um programa que deve comparar o valor digitado pelo usuário, aos dias da semana. Por exemplo, se o
		// usuário digitar 1, o programa irá retornar segunda feira. Utilize a estrutura condicional “IF -ELSE”
		
		int dia;
		
		System.out.println("DIGITE UM VALOR REFERENTE AO DIA DA SEMANA: ");
		dia = sc.nextInt();
		
		if(dia==1) {
			System.out.println("SEGUNDA-FEIRA!");
		}else if(dia==2) {
			System.out.println("TERÇA-FEIRA!");
		}else if(dia==3) {
			System.out.println("QUARTA-FEIRA!");
		}else if(dia==4) {
			System.out.println("QUINTA-FEIRA!");
		}else if(dia==5) {
			System.out.println("SEXTA-FEIRA!");
		}else if(dia==6) {
			System.out.println("SÁBADO!");
		}else if(dia==7) {
			System.out.println("DOMINGO!");
		}else {
			System.out.println("VALOR INVÁLIDO!");
		}
		
		// 04 -Faça um programa que deve comparar o valor digitado pelo usuário, aos dias da semana. Por exemplo, se o
		// usuário digitar 1, o programa irá retornar segunda feira. Utilize a estrutura “SWITCH-CASE”

		int dia1;	
		System.out.println("DIGITE UM VALOR REFERENTE AO DIA DA SEMANA: ");
		dia1 = sc.nextInt();
		
		switch(dia1) {
		case 1:
		    System.out.println("SEGUNDA-FEIRA!");
		    break;
		case 2:
			System.out.println("TERÇA-FEIRA!");
			break;
		case 3:
			System.out.println("QUARTA-FEIRA!");
			break;
		case 4:
			System.out.println("QUINTA-FEIRA!");
			break;
		case 5:
			System.out.println("SEXTA-FEIRA!");
			break;
		case 6:
			System.out.println("SÁBADO!");
			break;
		case 7:
			System.out.println("DOMINGO!");
			break;
		default:
			System.out.println("VALOR INSERIDO INVÁLIDO!");
		}
		
		// 05 -Faça um programa que deve informar ao usuário que ele digitou uma vogal, caso ele digite algo diferente de
		// uma vogal, o programa deve informá-lo, que não é uma vogal.
		
		String vogal;
		System.out.println("DIGITE UMA VOGAL: ");
		vogal = sc.next();
		switch(vogal) {
		case "a":
			System.out.println("VOGAL: A");
			break;
		case "e":
			System.out.println("VOGAL: E");
			break;
		case "i":
			System.out.println("VOGAL: I");
			break;
		case "o":
			System.out.println("VOGAL: O");
			break;
		case "u":
			System.out.println("VOGAL: U");
			break;
		default:
			System.out.println("NÃO FOI DIGITADO UMA VOGAL!");
		}
		
		// 01 - Faça um programa que imprima os números ímpares de 1 até o número 40.
		
		for(int c=1; c<=40; c++) {
			if (c % 2 != 0)
				System.out.println(c);
		}
		
		// 02 - Faça um programa que solicite do usuário 10 números, posteriormente o programa deve informar quantos
		// números digitados são pares e quantos são ímpares. 
		
		int pares = 0;
		int impares = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.println("digite um valor: ");
			int numero = sc.nextInt();
			if (numero % 2 == 0) {
				pares = pares + 1;
			}else {
				impares = impares + 1;
			}
		}
		
		System.out.println("quantidade de números pares: "+pares);
		System.out.println("quantidade de números impares: "+impares);
		
		// 03 - Faça um programa que solicite do usuário 5 números, posteriormente o programa deve mostrar a soma de
		// todos os números digitados, e a média de todos os números. 
		
		int soma = 0;
		double media = 0;
		
		for(int v=1; v<=5; v++) {
			System.out.println("digite um valor: ");
			int valor = sc.nextInt();
			soma = soma + valor;
			media = soma / 5;
		}
		
		System.out.println("soma de todos os números: "+soma);
		System.out.println("média dos números: "+ media);
		
		// 04 -Faça um programa que deve solicitar ao usuário a entrada de um número, sendo que se for digitado 0, o laço é
		// encerrado (de acordo com a condição), mas se outro número for digitado, uma somatória é feita e o programa
		// imprime o valor acumulado.
		
		int numero1 = 0;
		int soma1 = 0;
		
		do {
			System.out.println("digite um número: ");
			numero1 = sc.nextInt();
			soma1 = soma1 + numero1;
		}while(numero1 != 0);
		
		System.out.println("soma total: "+soma1);
		
		// 05 -Faça um programa que simule um caixa de um comércio. O programa receberá como entrada os valores
		// dos produtos que o usuário irá pagar por cada produto. O programa deverá encerrar a solicitação de valores,
		// quando o usuário digitar zero. Posteriormente o programa deve mostrar o total a ser pago, solicitar o valor
		// que o usuário irá fornecer para realizar o pagamento e o programa deverá retornar o valor do troco.
		
		int num1 = 1;
		double preco = 0;
		double somapreco = 0;
		double dinheiro = 0;
		
		do {
			System.out.println(num1+"º produto: R$");
			preco = sc.nextDouble();
			somapreco = somapreco + preco;
			num1 = num1 + 1;
		}while(preco != 0);
		
		System.out.println("total: R$"+somapreco);
		System.out.println("dinheiro: R$");
		dinheiro = sc.nextDouble();
		System.out.println("troco: R$"+(dinheiro-somapreco));
		
		// 06 – Faça um programa que solicite ao usuário um nome e uma senha, e repita o pedido caso o usuário informe um
		// nome e uma senha iguais. Caso o usuário digite valores diferentes, informe que o cadastro foi realizado com
		// sucesso.
		
		String nome = "";
		String senha = "";
		
		while(senha.equals(nome)) {
			System.out.println("digite um nome de cadastro: ");
			nome = sc.next();
			System.out.println("digite uma senha de cadastro: ");
			senha = sc.next();
			if(senha.equals(nome))
				System.out.println("DIGITE NOVAMENTE! USUÁRIO E SENHA IGUAIS");
		}
		
		System.out.println("CADASTRO REALIZADO COM SUCESSO!");
		
		
		// 07 - Os setores de uma festa possuem limitação de idade para que a entrada do cliente seja permitida.
		// Dessa forma, faça um programa que realize o cálculo da média entre as idades digitadas, e por fim,
		// determine sua classificação conforme as seguintes definições:
		int idade = 0;
		int somai = 0;
		double mediai = 0;
		
		for(int cont = 1;cont <= 5; cont++) {
			System.out.println("digite sua idade: ");
			idade = sc.nextInt();
			somai = somai + idade;
			mediai = somai / 5;
		}
		
		if(mediai <= 15)
			System.out.println("ESTUDANTE!");
		else if((mediai >= 20) && (mediai <= 50))
			System.out.println("MAIOR DE IDADE!");
		else if(mediai > 51)
			System.out.println("APOSENTADO!");
		
		
		
	}

}
