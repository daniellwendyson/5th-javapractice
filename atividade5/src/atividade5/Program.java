package atividade5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 01- Fa�a um programa que solicite o nome do usu�rio, o peso e altura e que realize o c�lculo do �ndice de Massa
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
			System.out.println("voc� est� muito abaixo do peso!");
		}
		else if ((imc >= 17) && (imc < 18.5)) {
			System.out.println("voc� est� abaixo do peso!");
		}
		else if ((imc >= 18.5) && (imc < 25)) {
			System.out.println("voc� est� no peso ideal!");
		}
		else if ((imc >= 25) && (imc < 30)) {
			System.out.println("voc� est� com sobrepeso!");
		}
		else if ((imc >= 30) && (imc < 35)) {
			System.out.println("voc� est� com obesidade!");
		}
		else if ((imc >= 35) && (imc <40)) {
			System.out.println("voc� est� com obesidade severa!");
		}else {
			System.out.println("voc� est� com obesidade m�rbida!");
		}
		
		// 02 - Construa um programa que solicita o n�mero final da placa de um ve�culo ao usu�rio e informa a data do
		// vencimento do IPVA. Por exemplo: se o final da placa for �1�, o vencimento � no m�s de janeiro, se for �2�, o
		// vencimento � no m�s de fevereiro, e assim por diante. Caso n�o seja nenhum dos meses existentes, o usu�rio deve
		// ser informado que digitou um valor inv�lido.
		
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("INFORME O N�MERO FINAL DA PLACA: ");
		num = sc.nextInt();
		
		if(num==1) {
			System.out.println("VENCIMENTO EM JANEIRO!");
		}else if(num==2) {
			System.out.println("VENCIMENTO EM FEVEREIRO!");
		}else {
			System.out.println("VALOR INV�LIDO");
		}
		
		// 03 - Fa�a um programa que deve comparar o valor digitado pelo usu�rio, aos dias da semana. Por exemplo, se o
		// usu�rio digitar 1, o programa ir� retornar segunda feira. Utilize a estrutura condicional �IF -ELSE�
		
		int dia;
		
		System.out.println("DIGITE UM VALOR REFERENTE AO DIA DA SEMANA: ");
		dia = sc.nextInt();
		
		if(dia==1) {
			System.out.println("SEGUNDA-FEIRA!");
		}else if(dia==2) {
			System.out.println("TER�A-FEIRA!");
		}else if(dia==3) {
			System.out.println("QUARTA-FEIRA!");
		}else if(dia==4) {
			System.out.println("QUINTA-FEIRA!");
		}else if(dia==5) {
			System.out.println("SEXTA-FEIRA!");
		}else if(dia==6) {
			System.out.println("S�BADO!");
		}else if(dia==7) {
			System.out.println("DOMINGO!");
		}else {
			System.out.println("VALOR INV�LIDO!");
		}
		
		// 04 -Fa�a um programa que deve comparar o valor digitado pelo usu�rio, aos dias da semana. Por exemplo, se o
		// usu�rio digitar 1, o programa ir� retornar segunda feira. Utilize a estrutura �SWITCH-CASE�

		int dia1;	
		System.out.println("DIGITE UM VALOR REFERENTE AO DIA DA SEMANA: ");
		dia1 = sc.nextInt();
		
		switch(dia1) {
		case 1:
		    System.out.println("SEGUNDA-FEIRA!");
		    break;
		case 2:
			System.out.println("TER�A-FEIRA!");
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
			System.out.println("S�BADO!");
			break;
		case 7:
			System.out.println("DOMINGO!");
			break;
		default:
			System.out.println("VALOR INSERIDO INV�LIDO!");
		}
		
		// 05 -Fa�a um programa que deve informar ao usu�rio que ele digitou uma vogal, caso ele digite algo diferente de
		// uma vogal, o programa deve inform�-lo, que n�o � uma vogal.
		
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
			System.out.println("N�O FOI DIGITADO UMA VOGAL!");
		}
		
		// 01 - Fa�a um programa que imprima os n�meros �mpares de 1 at� o n�mero 40.
		
		for(int c=1; c<=40; c++) {
			if (c % 2 != 0)
				System.out.println(c);
		}
		
		// 02 - Fa�a um programa que solicite do usu�rio 10 n�meros, posteriormente o programa deve informar quantos
		// n�meros digitados s�o pares e quantos s�o �mpares. 
		
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
		
		System.out.println("quantidade de n�meros pares: "+pares);
		System.out.println("quantidade de n�meros impares: "+impares);
		
		// 03 - Fa�a um programa que solicite do usu�rio 5 n�meros, posteriormente o programa deve mostrar a soma de
		// todos os n�meros digitados, e a m�dia de todos os n�meros. 
		
		int soma = 0;
		double media = 0;
		
		for(int v=1; v<=5; v++) {
			System.out.println("digite um valor: ");
			int valor = sc.nextInt();
			soma = soma + valor;
			media = soma / 5;
		}
		
		System.out.println("soma de todos os n�meros: "+soma);
		System.out.println("m�dia dos n�meros: "+ media);
		
		// 04 -Fa�a um programa que deve solicitar ao usu�rio a entrada de um n�mero, sendo que se for digitado 0, o la�o �
		// encerrado (de acordo com a condi��o), mas se outro n�mero for digitado, uma somat�ria � feita e o programa
		// imprime o valor acumulado.
		
		int numero1 = 0;
		int soma1 = 0;
		
		do {
			System.out.println("digite um n�mero: ");
			numero1 = sc.nextInt();
			soma1 = soma1 + numero1;
		}while(numero1 != 0);
		
		System.out.println("soma total: "+soma1);
		
		// 05 -Fa�a um programa que simule um caixa de um com�rcio. O programa receber� como entrada os valores
		// dos produtos que o usu�rio ir� pagar por cada produto. O programa dever� encerrar a solicita��o de valores,
		// quando o usu�rio digitar zero. Posteriormente o programa deve mostrar o total a ser pago, solicitar o valor
		// que o usu�rio ir� fornecer para realizar o pagamento e o programa dever� retornar o valor do troco.
		
		int num1 = 1;
		double preco = 0;
		double somapreco = 0;
		double dinheiro = 0;
		
		do {
			System.out.println(num1+"� produto: R$");
			preco = sc.nextDouble();
			somapreco = somapreco + preco;
			num1 = num1 + 1;
		}while(preco != 0);
		
		System.out.println("total: R$"+somapreco);
		System.out.println("dinheiro: R$");
		dinheiro = sc.nextDouble();
		System.out.println("troco: R$"+(dinheiro-somapreco));
		
		// 06 � Fa�a um programa que solicite ao usu�rio um nome e uma senha, e repita o pedido caso o usu�rio informe um
		// nome e uma senha iguais. Caso o usu�rio digite valores diferentes, informe que o cadastro foi realizado com
		// sucesso.
		
		String nome = "";
		String senha = "";
		
		while(senha.equals(nome)) {
			System.out.println("digite um nome de cadastro: ");
			nome = sc.next();
			System.out.println("digite uma senha de cadastro: ");
			senha = sc.next();
			if(senha.equals(nome))
				System.out.println("DIGITE NOVAMENTE! USU�RIO E SENHA IGUAIS");
		}
		
		System.out.println("CADASTRO REALIZADO COM SUCESSO!");
		
		
		// 07 - Os setores de uma festa possuem limita��o de idade para que a entrada do cliente seja permitida.
		// Dessa forma, fa�a um programa que realize o c�lculo da m�dia entre as idades digitadas, e por fim,
		// determine sua classifica��o conforme as seguintes defini��es:
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
