package com.example.demo.database;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Funcionario;


public class BancoFuncionario {
        private List<Funcionario> funcionario;

        public BancoFuncionario() {
            this.funcionario = new ArrayList<>();
        }

        // Insere um novo produto na lista
        public void insert(Funcionario p) {
            funcionario.add(p);
        }

        // Busca um produto pelo ID
        public Funcionario findOne(int id) {
            for (Funcionario p : funcionario) {
                if (p.getIdFuncionario() == id) {
                    return p;
                }
            }
            return null; // Retorna null se não encontrar
        }

        // Retorna todos os produtos cadastrados
        public List<Funcionario> findAll() {
            return new ArrayList<>(funcionario);
        }

        // Atualiza um produto existente na lista
        public boolean update(Funcionario p) {
            for (int i = 0; i < funcionario.size(); i++) {
                if (funcionario.get(i).getIdFuncionario() == p.getIdFuncionario()) {
                    funcionario.set(i, p);
                    return true; // Retorno indicando que a atualização foi feita
                }
            }
            return false; // Retorna falso se o produto não foi encontrado
        }

        // Remove um produto pelo ID
        public boolean delete(int id) {
            return funcionario.removeIf(p -> p.getIdFuncionario() == id);
        }
    }

