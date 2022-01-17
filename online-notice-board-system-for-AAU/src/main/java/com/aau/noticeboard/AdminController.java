package com.aau.noticeboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class AdminController{
    @GetMapping("/")
    public String admin() {
        return "admin";
    }
    // @GetMapping("/edit")
    // public String EditOffice() {
    //     return "EditOffice";
    // }
    @PostMapping("/save")
    public String addOffice(@ModelAttribute ("office")
           office office) {
     officeList.addAttribute(office);
     return "redirect:/";
           }
     
    @PostMapping("/delete/{id}")
    public String deleteOffice(@PathVariable(name="id") Long id{
             officeAccount.deleteoffice(id);
             return "admin";
    }
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value="id" Long id),
    Model model) {
        Office office=officeList.getOfficeById(id);
        model.addAttribute ("office",office);
        return "EditOffice"; 
        
    }


    
        
}

    
    
