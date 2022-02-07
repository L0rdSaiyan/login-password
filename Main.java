import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		Random aleatorio = new Random();
		
		String login, password, confirm;
		int random_password=aleatorio.nextInt(1000000000), confirm2;
		
		
		System.out.println("Informe um nome de usuário: ");
		login=reader.nextLine();
		
		while(login.length()>30){
		    
		    System.out.println("O seu nome de usuário ultrapassou o limite de 30 caracteres ("+login.length()+"). \n\nInforme um nome de usuário:  ");
		    login=reader.nextLine();
		    
	}
		
	         System.out.println("Informe uma senha de usuário (deve conter no mínimo 6 caracteres)    (Se desejar uma senha gerada \n                                                                     aleatóriamente, informe \"Random\"): ");
	          password=reader.nextLine();
	 
	         
	                 if(password.toLowerCase().equals("random") || (password.toLowerCase().equals("aleatório")) || (password.toLowerCase().equals("aleatorio"))) {
	               
	               
	                  System.out.println("Senha gerada: "+random_password);
	               
	                   System.out.println("Confirme a sua senha: ");
	                    confirm2=reader.nextInt();
	               
	                     while(!(confirm2==random_password)){
	                   
	                      System.out.println("Senhas não conferem!");
	                       confirm2=reader.nextInt();
	                   
	               }
	               
	                        if(confirm2==random_password){
	                  
	                         System.out.println("Cadastro concluido!");
	                          System.out.println("Nome de usuário: "+login.toUpperCase()+"\nSenha: "+random_password);
	                  
	                  
	              }
              
	           }else{
	           
	           
        	                    while(password.length()<6){
	     
	     
	                               System.out.println("Sua senha não contêm mais de 6 caracteres. Por favor, insira uma senha válida. \n\nInforme uma senha de usuário (deve conter no mínimo 6 caracteres)");
                                  password=reader.nextLine();	     
	     
	 }
	 
	                             System.out.println("Confirme sua senha: ");
	                            confirm=reader.nextLine();
	 
	                          while(!(confirm.equals(password))){
	     
	                        System.out.println("Senhas não conferem!");
	                       confirm=reader.nextLine();
	     
	 }
	 
	                     if(confirm.equals(password)){
	     
	                    System.out.println("\nCadastro concluído!");
	                   System.out.println("\nNome de usuário: "+login.toUpperCase()+" \nSenha: "+password);
	     
	     
	 }
	 
	 
	  
	               
	           }
	    
	    
	}
}
