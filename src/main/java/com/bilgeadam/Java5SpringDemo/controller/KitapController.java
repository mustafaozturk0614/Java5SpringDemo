package com.bilgeadam.Java5SpringDemo.controller;

import com.bilgeadam.Java5SpringDemo.repository.entity.Kitap;
import com.bilgeadam.Java5SpringDemo.service.KitapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*

    -findallmetodu yazalým
    -
    -
 */
@RestController
@RequestMapping("/kitap")
public class KitapController {
    @Autowired
    private KitapService kitapService;

    @GetMapping("/save")
    public Kitap createBook(String baslik,String yazarIsmi,Integer sayfaSayisi){
        Kitap kitap= Kitap.builder()
                .baslik(baslik)
                .yazarIsmi(yazarIsmi)
                .sayfaSayisi(sayfaSayisi)
                .build();
        return kitapService.createBook(kitap);
    }
    @GetMapping("/findall")
    public List<Kitap> findall(){
        return kitapService.findAll();
    }
    @GetMapping("/findbysayfasayisi")
    public List<Kitap> findAllbySayfaSayisi(int sayi){
        return kitapService.findAllbySayfaSayisi(sayi);
    }

    @GetMapping("/findbybaslik")
    public ResponseEntity<Kitap> findbyBaslik(String baslik){
        if (baslik==null||baslik.equals("")){
            return ResponseEntity.badRequest().build();
        }else  {
            return ResponseEntity.ok(kitapService.findbyBaslik(baslik));
        }
    }

    @GetMapping("/findbybaslik2")
    public ResponseEntity<Kitap> findOptionalByBaslik(String baslik){
        return ResponseEntity.ok(kitapService.findOptionalByBaslik(baslik));
    }




}
