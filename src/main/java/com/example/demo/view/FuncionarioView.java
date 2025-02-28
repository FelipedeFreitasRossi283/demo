package com.example.demo.view;

import com.example.demo.controller.FuncionarioController;
import com.example.demo.model.Funcionario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class FuncionarioView {

   FuncionarioController pc = new FuncionarioController();

        @GetMapping("/funcioario")
        public List<Funcionario> getAllFuncionario(){
            return pc.pegarTodoOFuncionario();
        }

        @PostMapping("/funcionario")
        public String postNovoFuncionario(@RequestBody Funcionario f){
            pc.inserirNoBanco(f);
            return "Sucesso";
        }
    }


