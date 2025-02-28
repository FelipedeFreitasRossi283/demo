package com.example.demo.controller;

import com.example.demo.database.BancoProduto;
import com.example.demo.model.Produto;

import java.util.List;

public class ProdutoController {

        BancoProduto bp = new BancoProduto();

        public List<Produto> getAllProduto() {
            return bp.findAll();
        }

        public Boolean save(Produto p) {
            bp.insert(p);
            return true;
        }
    }
