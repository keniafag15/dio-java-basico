package edu.kenia.segundasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Gleyson";
        String segundoNome = "Sampaio";

        String nomeCOmpleto = nomeCOmpleto(primeiroNome, segundoNome);
        System.out.println(nomeCOmpleto);
    }
    public static String nomeCOmpleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}