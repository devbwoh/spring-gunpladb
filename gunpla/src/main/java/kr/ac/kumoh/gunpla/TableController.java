package kr.ac.kumoh.gunpla;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

@Controller
public class TableController {
    
    @Autowired 
    private MechanicRepository mechanicRepository;
    
	@GetMapping("/")
    public String table(Model m) {
        Iterable<Mechanic> list = mechanicRepository.findAll();
        // for (Mechanic unit : list) {
        //     System.out.println(unit.getName());    
        // }
        
        m.addAttribute("mechanic", list);
        return "index";
	}
}