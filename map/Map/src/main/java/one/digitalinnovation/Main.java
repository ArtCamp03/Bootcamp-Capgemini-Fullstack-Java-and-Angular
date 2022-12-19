package one.digitalinnovation;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        // MAP -> [chave, valor]
        Map<String, String> aluno = new HashMap<>();
        aluno.put("Nome", "Joao");
        aluno.put("Idade", "27");
        aluno.put("Turma", "A");
        aluno.put("Media", "9.5");

        System.out.println(aluno);

        // retorna todas as chaves
        System.out.println(aluno.keySet());

        // retorna todas os valores
        System.out.println(aluno.values());

        // lsita de alunos
        List<Map<String, String>> listAlunos = new ArrayList<>();
        listAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "Jose");
        aluno2.put("Idade", "25");
        aluno2.put("Turma", "B");
        aluno2.put("Media", "8.5");

        listAlunos.add(aluno2);

        System.out.println(listAlunos);

        // verifica se tem uma determinada chave
        System.out.println(aluno.containsKey("Nome"));
    }
}
