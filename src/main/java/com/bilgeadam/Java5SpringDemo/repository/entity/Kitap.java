package com.bilgeadam.Java5SpringDemo.repository.entity;
/*
    Bir database olusturup bu databasede kitap ad�nda bir
    tabloyu kitap s�n�f�ndan olusturla�m
    - ba�l�k
    -yazarismi
    -sayfa say�s�
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Kitap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String baslik;
    private String yazarIsmi;
    private Integer sayfaSayisi;

}
