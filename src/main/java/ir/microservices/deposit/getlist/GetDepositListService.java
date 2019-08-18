package ir.microservices.deposit.getlist;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GetDepositListService {

	@RequestMapping("/getDepositNumbers")
	public List<String> getDepositNumbers(){
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return Arrays.asList("11111111" , "222222" , "4444444" , "55555555" , "6666666666666");
		
	} 
	
	
	public static void main(String[] args) {
		SpringApplication.run(GetDepositListService.class, args);
	}
	
	
}
