package com.produto.api.controller;

import com.produto.api.model.Produto;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProdutoController{
    
    @GetMapping("/Produto")
    public String Produto(){
        return "Api Funcionando";
    }

    @PostMapping("/Produto")
    public Produto cadastrar(@RequestBody Produto produto){
        return produto;
    }
}