package kr.ac.kumoh.gunpla;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class ApiController {

    @Autowired 
    private MechanicRepository mechanicRepository;
    
	// @GetMapping("/")
	// public String home() {
	// 	return "index";
	// }
    
    @GetMapping(path="/mechanic")
    public @ResponseBody Iterable<Mechanic> getAllMechanic() {
		return mechanicRepository.findAll();
	}
}