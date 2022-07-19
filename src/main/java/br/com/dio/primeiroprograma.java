package br.com.dio;

import br.com.dio.model.gato;

public class primeiroprograma {
    public static void main(String[] args) {
        gato Gato = new gato();
        System.out.println(Gato);

        livro Livro1 = new livro ("crime e castigo", 776);
        System.out.println(Livro1);

       /* int a = 5;
        int b = 3;

        System.out.println("hello world!" + (a+b));*/
    }

    static class livro {
        private String nome;
        private Integer numPaginas;

        public livro(String nome, Integer numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(Integer numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }
    }
}