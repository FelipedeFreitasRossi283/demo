package com.example.demo.database;

import com.example.demo.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class BancoVenda {

        private List<Venda> venda;

        public BancoVenda() {
            this.venda = new ArrayList<>();
        }

        // Insere um novo produto na lista
        public void insert(Venda p) {
            venda.add(p);
        }

        // Busca um produto pelo ID
        public Venda findOne(int id) {
            for (Venda p : venda) {
                if (p.getIdVenda() == id) {
                    return p;
                }
            }
            return null;
        }

        public List<Venda> findAll() {
            return new ArrayList<>(venda);
        }

        public boolean update(Venda p) {
            for (int i = 0; i < venda.size(); i++) {
                if (venda.get(i).getIdVenda() == p.getIdVenda()) {
                    venda.set(i, p);
                    return true;
                }
            }
            return false;
        }

        public boolean delete(int id) {
            return venda.removeIf(p -> p.getIdVenda() == id);
        }
    }

