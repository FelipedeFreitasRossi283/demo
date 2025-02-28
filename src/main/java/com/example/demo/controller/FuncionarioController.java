package com.example.demo.controller;

import com.example.demo.database.BancoFuncionario;
import com.example.demo.model.Funcionario;

import java.util.List;

public class FuncionarioController {

        BancoFuncionario bc = new BancoFuncionario();
        public List<Funcionario> getAllFuncionario() {
            return bc.findAll();
        }

        public Boolean save(Funcionario c) {
            bc.insert(c);
            return true;
        }
    }

