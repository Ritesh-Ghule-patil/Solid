package com.aurionpro.test;


import com.aurionpro.model.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		
		Invoice invoice = new Invoice("101", "Sugar", 100, 9, 5);
		System.out.println(invoice.toString());
		System.out.println(invoice.getAmmount());
		System.out.println(invoice.calculateDiscount());
		System.out.println(invoice.calculatetax());
		System.out.println(invoice.calculateTotal());
		
	}
}
