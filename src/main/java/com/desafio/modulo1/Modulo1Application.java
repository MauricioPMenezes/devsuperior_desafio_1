package com.desafio.modulo1;

import com.desafio.entities.Order;
import com.desafio.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Modulo1Application implements CommandLineRunner {


	Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		SpringApplication.run(Modulo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//System.out.println("Numero do Pedido: ");
		//int code=sc.nextInt();
		//System.out.println("Valor do Produto: ");
		//double valorproduto=sc.nextDouble();
		//System.out.println("Porcentagem do Desconto: ");
		//double descont=sc.nextDouble();

		System.out.println();


		OrderService orderService=new OrderService();

		// Primeiro Objeto order
		Order order=new Order(150,20.0,1034);
		double valortotal = orderService.total(order);
		System.out.println("Pedido Código : "+order.getCode());
		System.out.println("Valor Total: "+ valortotal);

		System.out.println();

		// Segundo Objeto order2
		Order order2=new Order(800.00,10.0,2284);
		valortotal = orderService.total(order2);
		System.out.println("Pedido Código : "+order2.getCode());
		System.out.println("Valor Total: "+ valortotal);

		System.out.println();

		// Terceiro Objeto order3
		Order order3=new Order(95.90,0.0,1309);
		valortotal = orderService.total(order3);
		System.out.println("Pedido Código : "+order3.getCode());
		System.out.println("Valor Total: "+ valortotal);

		sc.close();


	}
}
