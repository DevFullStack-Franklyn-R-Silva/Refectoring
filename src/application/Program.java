package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;
import entities.Invoice;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite o imposto: ");
		float tax = sc.nextFloat();
		System.out.println("Digite o valor: ");
		float value = sc.nextFloat();
		
		Invoice invoice = new Invoice(tax, value, nome);
		
		Bill b = new Bill();
		System.out.println(b.print(invoice));
		
		sc.close();
	}


}
