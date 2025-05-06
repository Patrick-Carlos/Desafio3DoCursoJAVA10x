package com.desafio3;

import java.util.Scanner;

public class ProgramaNinjas {
    static Ninja[] ninjas = new Ninja[100];
    static int contador = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar Ninja");
            System.out.println("2. Adicionar Ninja Uchiha");
            System.out.println("3. Exibir Todos os Ninjas");
            System.out.println("4. Atualizar Habilidade de um Uchiha");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcao == 1) {
                Ninja n = new Ninja();
                System.out.print("Nome: ");
                n.nome = sc.nextLine();
                System.out.print("Idade: ");
                n.idade = sc.nextInt();
                sc.nextLine();
                System.out.print("Missão: ");
                n.missao = sc.nextLine();
                System.out.print("Nível de Dificuldade: ");
                n.nivelDificuldade = sc.nextLine();
                System.out.print("Status da Missão: ");
                n.statusMissao = sc.nextLine();

                ninjas[contador] = n;
                contador++;
                System.out.println("Ninja adicionado.");
            } else if (opcao == 2) {
                Uchiha u = new Uchiha();
                System.out.print("Nome: ");
                u.nome = sc.nextLine();
                System.out.print("Idade: ");
                u.idade = sc.nextInt();
                sc.nextLine();
                System.out.print("Missão: ");
                u.missao = sc.nextLine();
                System.out.print("Nível de Dificuldade: ");
                u.nivelDificuldade = sc.nextLine();
                System.out.print("Status da Missão: ");
                u.statusMissao = sc.nextLine();
                System.out.print("Habilidade Especial: ");
                u.habilidadeEspecial = sc.nextLine();

                ninjas[contador] = u;
                contador++;
                System.out.println("Uchiha adicionado.");
            } else if (opcao == 3) {
                for (int i = 0; i < contador; i++) {
                    System.out.println("\n--- Ninja " + (i + 1) + " ---");
                    ninjas[i].mostrarInformacoes();
                }
            } else if (opcao == 4) {
                System.out.print("Digite o nome do Uchiha para atualizar habilidade: ");
                String nomeBusca = sc.nextLine();
                boolean encontrado = false;

                for (int i = 0; i < contador; i++) {
                    // verificando se é Uchiha comparando classe diretamente
                    if (ninjas[i].getClass().getSimpleName().equals("Uchiha")) {
                        if (ninjas[i].nome.equalsIgnoreCase(nomeBusca)) {
                            System.out.print("Nova habilidade: ");
                            String novaHab = sc.nextLine();
                            // cast forçado porque sabemos que é Uchiha
                            ((Uchiha) ninjas[i]).habilidadeEspecial = novaHab;
                            System.out.println("Habilidade atualizada.");
                            encontrado = true;
                            break;
                        }
                    }
                }

                if (!encontrado) {
                    System.out.println("Uchiha não encontrado.");
                }
            } else if (opcao == 0) {
                executando = false;
                System.out.println("Encerrando...");
            } else {
                System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}