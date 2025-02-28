package com.example.demo.database;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Funcionario;


public class BancoFuncionario {
        private List<Funcionario>funcionario;

        public BancoFuncionario() {
            this.funcionario = new ArrayList<>();
        }

        // Insere um novo produto na lista
        public void insert(Funcionario f) {
            funcionario.add(f);
        }

        public Funcionario findOne(int id) {
            for (Funcionario f : funcionario) {
                if (f.getIdFuncionario() == id) {
                    return f;
                }
            }
            return null;
        }


        public List<Funcionario> findAll() {
            return new ArrayList<>(funcionario);
        }

        public boolean update(Funcionario f) {
            for (int i = 0; i < funcionario.size(); i++) {
                if (funcionario.get(i).getIdFuncionario() == f.getIdFuncionario()) {
                    funcionario.set(i, f);
                    return true;
                }
            }
            return false;
        }


        public boolean delete(int id) {
            return funcionario.removeIf(f -> f.getIdFuncionario() == id);
        }
    }

