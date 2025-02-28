package com.example.demo.controller;

import com.example.demo.database.BancoFuncionario;
import com.example.demo.database.BancoProduto;
import com.example.demo.database.BancoVenda;
import com.example.demo.model.Funcionario;
import com.example.demo.model.Produto;
import com.example.demo.model.Venda;

import java.util.List;

public class VendaController {

        BancoVenda bcoVendas = new BancoVenda();
        BancoFuncionario bcoFuncionario = new BancoFuncionario();
        BancoProduto bcoProdutos = new BancoProduto();

        public List<Venda> getAllVendas() {
            return bcoVendas.findAll();
        }


        public Boolean save(Venda v) {
            List<Funcionario> funcionarioCadastrados = bcoFuncionario.findAll();
            List<Produto> produtosCadastrados = bcoProdutos.findAll();

            Funcionario funcionarioEnviado = v.getComissaoPorVenda();
            List<Produto> produtoEnviados = v.getProduto();

            if (bcoFuncionario.findOne(funcionarioEnviado.getIdFuncionario()) == null){
                return false;
            }

            for (Produto p : produtoEnviados){
                if (bcoProdutos.findOne(p.getIdProduto()) == null){
                    return false;
                }
            }

            bcoVendas.insert(v);
            return true;
        }
    }

