package com.example.demo.model;

import java.time.LocalDate;
import java.util.ArrayList;


    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class Venda {
        private Integer idVenda;
        private LocalDate dataDaVenda;
        private ArrayList<Produto> produto;
        private Funcionario cliente;
    }
