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
        BancoFuncionario bcoClientes = new BancoFuncionario();
        BancoProduto bcoProdutos = new BancoProduto();

        public List<Venda> getAllVendas() {
            return bcoVendas.findAll();
        }

        public Boolean save(Venda v) {
            List<Funcionario> clientesCadastrados = bcoClientes.findAll();
            List<Produto> produtosCadastrados = bcoProdutos.findAll();

            Funcionario clienteEnviado = v.getComissaoPorVenda();
            List<Produto> produtoEnviados = v.getProduto();

            // verifica se o cliente está dentro da lista
            if (bcoClientes.findOne(clienteEnviado.getIdCliente()) == null){
                return false;
            }

            // verifica se os produtos enviados estão dentro da lista
            for (Produto p : produtoEnviados){
                if (bcoProdutos.findOne(p.getIdProduto()) == null){
                    return false;
                }
            }

            bcoVendas.insert(v);
            return true;
        }
    }

