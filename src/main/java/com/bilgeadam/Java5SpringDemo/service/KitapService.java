package com.bilgeadam.Java5SpringDemo.service;

import com.bilgeadam.Java5SpringDemo.repository.IKitapRepository;
import com.bilgeadam.Java5SpringDemo.repository.entity.Kitap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KitapService {
    @Autowired
    private IKitapRepository kitapRepository;


   public Kitap createBook(Kitap kitap){
    return     kitapRepository.save(kitap);
   }

   public List<Kitap> findAll(){
       return  kitapRepository.findAll();
   }


    public List<Kitap> findAllbySayfaSayisi(int sayi) {
       return kitapRepository.findAllBySayfaSayisi(sayi);
    }

    public Kitap findbyBaslik(String baslik) {
       return kitapRepository.findByBaslik(baslik);
    }

    public Kitap findOptionalByBaslik(String baslik){
       Optional<Kitap> optionalKitap=kitapRepository.findOptionalByBaslik(baslik);
       if (optionalKitap.isPresent()){
         return   optionalKitap.get();
       }else{
           throw  new RuntimeException("Kitap bulunamadý");
       }
    }
}
