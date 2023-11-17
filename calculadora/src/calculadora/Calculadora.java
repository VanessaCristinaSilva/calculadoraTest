package calculadora;
//@vanessacristina
//version 1.1
//@since 22.09

// Uma classe simples ao qual realiza operações de soma, subtração, multiplicação e divisão

public class Calculadora {
	
//Realiza uma operação de adição
	//@param a o primeiro operando
	//@param b o segundo operando
	//@return o resultado da adição
	
    public static double somar(double a, double b) {
        return a + b;
    }

  //Realiza uma operação de subtração
  	//@param a o operando do qual será subtraído
  	//@param b o operando a ser subtraído
  	//@return o resultado da subtração
    
    public static double subtrair(double a, double b) {
        return a - b;
    }

  //Realiza uma operação de multiplicação
  	//@param a o operando do qual será multiplicado
  	//@param b o  operando a ser multiplicado
    //@return o resultado da multiplicação
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
  //Realiza uma operação de divisão
  	//@param a o operando do qual será dividido
  	//@param b o operando a ser dividido
  	//@return o resultado da divisão
    
    public static double dividir(double a, double b) {
        return a / b;
    }
}