package br.com.fiap.tdsr.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//A anota��o ser� mantida at� a execu��o
@Retention(RetentionPolicy.RUNTIME)
//Determina para quem se destina a anota��o 
@Target(ElementType.FIELD) //(Atributo)
public @interface ValidaVazio {

	String mensagem();
	
}