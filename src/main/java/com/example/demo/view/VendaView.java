package com.example.demo.view;

import com.example.demo.controller.VendaController;
import com.example.demo.model.Venda;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class VendaView {

       VendaController pc = new VendaController();

        @GetMapping("/venda")
        public List<Venda> getAllVenda(){
            return pc.pegarTodosOsProdutos();
        }

        @PostMapping("/venda")
        public String postNovoVenda(@RequestBody Venda v){
            pc.inserirNoBanco(v);
            return "Sucesso";
        }
    }
}
