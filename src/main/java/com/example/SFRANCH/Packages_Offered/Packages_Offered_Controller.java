package com.example.SFRANCH.Packages_Offered;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class Packages_Offered_Controller {

    private final Packages_Offered_Services packages_offered_services;


    public Packages_Offered_Controller(Packages_Offered_Services packages_offered_services) {
        this.packages_offered_services = packages_offered_services;
    }

    @GetMapping
    public List<Packages_Offered> getPackagesOffered(){
        return packages_offered_services.getPackagesOffered();
    }

    @GetMapping("packages")
    public String packages(){
        return "packages";
    }

    @GetMapping("text")
    public String text(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "text";
    }

    @GetMapping("packages_new")
    public String packages_new(){
        return "packages_new";
    }

    @GetMapping("welcome")
    public String welcome(){ return "welcome" ;}

    @GetMapping("activities")
    public String activities(){ return "activities" ;}

    @GetMapping("gallery")
    public String gallery(){ return "gallery"; }

    @GetMapping("FAQ")
    public String FAQ(){ return "FAQ" ;}


    @GetMapping({"/", "/index"})
    public String index(){ return "index" ;}
    /*Code for Animated Button*/

    @GetMapping({"activities/horseback", "horseback"})
    public String horseback(){ return "horseback" ;}

    @GetMapping({"activities/cattle_drive", "cattle_drive"})
    public String cattle_drive(){ return "cattle_drive" ;}

    @GetMapping({"activities/group_events", "group_events"})
    public String group_events(){ return "group_events" ;}

    @GetMapping({"activities/fishing", "fishing"})
    public String fishing(){ return "fishing" ;}

    @GetMapping({"activities/wagon_ride", "wagon_ride"})
    public String wagon_ride(){ return "wagon_ride" ;}

    @GetMapping({"activities/picnics", "picnics"})
    public String picnics(){ return "picnics" ;}

    @GetMapping("about_us")
    public String about_us(){ return "about_us" ;}

    @GetMapping("blog")
    public String blog(){ return "blog" ;}

    @GetMapping("location")
    public String location(){ return "location" ;}

    @GetMapping("privacy")
    public String privacy(){ return "privacy" ;}

    @GetMapping("sitemap")
    public String sitemap(){ return "sitemap" ;}

}

