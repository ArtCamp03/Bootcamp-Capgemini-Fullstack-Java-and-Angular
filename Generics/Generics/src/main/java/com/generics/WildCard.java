package com.generics;

import java.util.List;

public class WildCard {
    // Unkonwn Wildcard
    piblic void imprimeLista(List<?> lsita){
        for(Object obj: lsita){
            System.out.println(obj);
        }

    }

    List<Aluno> minhaLista = new List<Aluno>();
    imprimeLista(minhaLista)

    // UpperBounded Wildcard
    piblic void imprimeLista(List<? extends Pessoa> lsitaPessoas){
        for(Pessoa p: lsitaPessoas){
            System.out.println(p);
        }

    }

    List<Aluno> minhaLista = new List<Aluno>();
    imprimeLista(minhaLista);

    // LowerBounded Wildcard -> so aceita da classe Pessoas pra cima
    piblic void imprimeLista(List<? super Pessoa> lsitaPessoas){
        for(Pessoa p: lsitaPessoas){
            System.out.println(p);
        }

    }

    List<Aluno> minhaLista = new List<Aluno>();
    imprimeLista(minhaLista);

}
