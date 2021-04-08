
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillettController {

    @Autowired
    private KundeRepository rep;

    @PostMapping("/lagre")
    public void lagreBillett(Billett innbillett){
        rep.Lagrekunde(innbillett);
        System.out.println(innbillett);
    }

    @GetMapping("/billetter")
    public List<Billett> hentAlle(){
        return rep.hentalleBilletter();
    }

    @GetMapping("/slett")
    public void slettAlle(){
        rep.slettAllebilletter();
    }
}
