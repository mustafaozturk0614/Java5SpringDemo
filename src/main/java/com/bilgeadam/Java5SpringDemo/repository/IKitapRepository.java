package com.bilgeadam.Java5SpringDemo.repository;

import com.bilgeadam.Java5SpringDemo.repository.entity.Kitap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IKitapRepository extends JpaRepository<Kitap,Long> {

    Kitap findByBaslik(String baslik);


    Optional<Kitap> findOptionalByBaslik(String baslik);

    List<Kitap> findAllBySayfaSayisi(int sayi);

    Kitap findByYazarIsmi(String isim);
}
