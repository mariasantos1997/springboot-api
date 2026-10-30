package com.produto.api.controller;

import com.produto.api.model.Produto;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();

    @GetMapping("/Produto")
    public List<Produto> Produto() {

        return produtos;
    }

    @PostMapping("/Produto")
    public Produto cadastrar(@RequestBody Produto produto) {
        produtos.add(produto);

        return produto;
    }


    @GetMapping("/Produto/{id}")
    public Produto buscarPorId(@PathVariable Long id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                return produto;
            }
        }
        return null;
    }

    @DeleteMapping("/Produto/{id}")
    public String excluir(@PathVariable Long id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                produtos.remove(produto);
                return "Produto excluido com sucesso";
            }
        }
        return "Produto nao encontrado";
    }
}
