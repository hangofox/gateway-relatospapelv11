//DECLARACION DE PAQUETES:
package com.relatospapelv11.apigateway;

//IMPORTACION DE LIBRERIAS:
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//DECLARACION DE LA CLASE PRINCIPAL:
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayRelatosPapelv11Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayRelatosPapelv11Application.class, args);
	}
}
