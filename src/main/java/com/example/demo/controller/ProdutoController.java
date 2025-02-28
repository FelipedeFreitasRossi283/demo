package com.example.demo.controller;


import com.example.demo.database.BancoProduto;
import com.example.demo.model.Produto;

import java.util.List;

public class ProdutoController {

    BancoProduto bc = new BancoProduto();

    public void inserirNoBanco(Produto p) {
        bc.insert(p);
    }

    public List<Produto> pegarTodosOsProdutos() {
        return bc.findAll();
    }
}