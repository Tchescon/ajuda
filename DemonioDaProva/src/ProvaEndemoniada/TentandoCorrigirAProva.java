package ProvaEndemoniada;

import java.util.Scanner;


public class TentandoCorrigirAProva {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[] eleitores = new int[5];
        int[] federal = new int[3];
        int[] estadual = new int[3];
        int[] senador = new int[3];
        int[] governador = new int[3];
        int[] presidente = new int[3];

        int eleitor = 0;


        int controleVoto = 0;

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Escolha opção desejada");
            System.out.println("1- Inicar Votação");
            System.out.println("2- Consultar voto de um eleitor");
            System.out.println("3- Exibir Resultado");
            System.out.println("4- Mostar Vencedores");
            System.out.println("0- Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("FINALIZADO");
                    break;

                case 1:
                    System.out.println("Digite numero eleitor: ");
                    eleitor = sc.nextInt();
                    if (eleitor != 1001 && eleitor != 1002 && eleitor != 1003 && eleitor != 1004 && eleitor != 1005) {
                        System.out.println("ELEITOR INVALIDO");
                        break;
                    }


                    for (int i = 0; i < eleitores.length; i++) {
                        if (eleitores[i] == eleitor) {
                            System.out.println("Eleitor Existente !");
                            break;
                        }
                    }

                    eleitores[controleVoto] = eleitor;

                    boolean candidatoValido = true;
                    do {
                        System.out.println("José Bombinha -  101");
                        System.out.println("Ana Silva - 102");
                        System.out.println("Carlos Lima - 103");
                        System.out.println("Qual seu Voto para Deputado Federal");
                        int votoFederal = sc.nextInt();

                        if (votoFederal != 101 && votoFederal != 102 && votoFederal != 103) {
                            System.out.println("DEPUTADO FEDERAL INCORRETO");
                            candidatoValido = false;
                        } else {
                            federal[controleVoto] = votoFederal;
                            candidatoValido = true;
                        }

                    } while (candidatoValido == false);


                    do {
                        System.out.println("Taffe da Galera - 201");
                        System.out.println("Rodrigo Pato Depenado - 202");
                        System.out.println("Mariana Costa - 203");
                        System.out.println("Qual seu voto para Deputado Estadual?");
                        int votoEstadual = sc.nextInt();

                        if (votoEstadual != 201 && votoEstadual != 202 && votoEstadual != 203) {
                            System.out.println("DEPUTADO ESTADUAL INCORRETO");
                            candidatoValido = false;
                        } else {
                            federal[controleVoto] = votoEstadual;
                            candidatoValido = true;

                        }
                    } while (candidatoValido == false);


                    do {
                        System.out.println("Huilson Clone - 301");
                        System.out.println("Juliana Rocha - 302");
                        System.out.println("Roberto Martins - 303");
                        System.out.println("Qual seu voto para Senador?");
                        int votoSenador = sc.nextInt();

                        if (votoSenador != 301 && votoSenador != 302 && votoSenador != 303) {
                            System.out.println("SENADOR INCORRETO");
                            candidatoValido = false;
                        } else {
                            federal[controleVoto] = votoSenador;
                            candidatoValido = true;

                        }
                    } while (candidatoValido == false);


                    do {
                        System.out.println("Patrick Cobra - 401");
                        System.out.println("Fernanda Souza - 402");
                        System.out.println("Ricardo Oliveira - 403");
                        System.out.println("Qual seu voto para Governador");
                        int votoGovernador = sc.nextInt();

                        if (votoGovernador != 401 && votoGovernador != 402 && votoGovernador != 403) {
                            System.out.println("GOVERNADOR INCORRETO");
                            candidatoValido = false;
                        } else {
                            federal[controleVoto] = votoGovernador;
                            candidatoValido = true;

                        }
                    } while (candidatoValido == false);


                    do {
                        System.out.println("Carl Johnson - 501");
                        System.out.println("Alessandro das Redes - 502");
                        System.out.println("Lucas Ferreira - 503");
                        System.out.println("Qual seu voto para Presidente?");
                        int votoPresidente = sc.nextInt();

                        if (votoPresidente != 501 && votoPresidente != 502 && votoPresidente != 503) {
                            System.out.println("PRESIDENTE INCORRETO");
                            candidatoValido = false;
                        } else {
                            federal[controleVoto] = votoPresidente;
                            candidatoValido = true;

                        }
                    } while (candidatoValido == false);


                    controleVoto++;

                case 2:
            }
        }
    }
}



