package Cryptoexpress.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import Cryptoexpress.app1.RoninFunctions.EchoMe;



@SpringBootApplication
@RestController
public class App1Application {
	@Autowired
	private Myconfig myconfig;

	public static void main(String[] args) {
		//App1Application myapp = new App1Application();
		EchoMe.print("TESTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
		//EchoMe.print(" myusername: " + myapp.myconfig.getMyusername()+ "\n myservicname: " + myapp.myconfig.getMyservicname() + "\n");
		SpringApplication.run(App1Application.class, args);
	}
	
	@GetMapping("/message")
	public String getMessage(){
	 return "Welcome Taha!!<br> [Username]:" +  myconfig.getMyusername() + "<br> [Service name]:" + myconfig.getMyservicname();
	}
}
