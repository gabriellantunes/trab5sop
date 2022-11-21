import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int frame1 = 1;

        System.out.println("Digite o Tempo de Carga do Frame numero " + frame1 + " :");
        int tempodecarga = leitor.nextInt();

        System.out.println("Digite a Quantidade Referencia do Frame numero " + frame1 + " :");
        int quantidaderef = leitor.nextInt();

        System.out.println("Digite o Tempo da ultima referencia do Frame numero " + frame1 + " :");
        int tempoultimaref = leitor.nextInt();

        System.out.println("Digite o BR, APENAS O VALOR 0 OU 1 SERAO ACEITOS !!");
        int BR = leitor.nextInt();

        //condição do BR
        if (BR != 0 && BR != 1) {
            System.out.println("VALOR INCORRETO !!, APENAS O VALOR 0 OU 1 SERAO ACEITOR");
            System.exit(0); //fecar sem erros
        }

        //condição do BM
        System.out.println("Digite o BM, APENAS O VALOR 0 OU 1 SERAO ACEITOS !!");
        int BM = leitor.nextInt();
        if (BM != 0 && BM != 1) {
            System.out.println("VALOR INCORRETO !!, APENAS O VALOR 0 OU 1 SERAO ACEITOS");
            System.exit(0); //fecar sem erros
        }

        int[] array1 = new int [6];

        array1 [0] = frame1;
        array1 [1] = tempodecarga;
        array1 [2] = quantidaderef;
        array1 [3] = tempoultimaref;
        array1 [4] = BR;
        array1 [5] = BM;

        System.out.println();

        //desenvolved by gabe
        //---------------------------------------------------------- Segundo array

        int[] array2 = new int[6];

        System.out.println();

        System.out.println("Digite o Tempo de Carga da segunda linha");
        int tempodecarga2 = leitor.nextInt();

        System.out.println("Digite a Quantidade Referencia da segunda linha:");
        int quantidaderef2 = leitor.nextInt();

        System.out.println("Digite o Tempo da ultima referencia da segunda linha:");
        int tempoultimaref2 = leitor.nextInt();

        System.out.println("Digite o BR, APENAS O VALOR 0 OU 1 SERAO ACEITOS");
        int BR2 = leitor.nextInt();

        //condição do BR
        if (BR2 != 0 && BR2 != 1) {
            System.out.println("Valor incorreto, APENAS O VALOR 0 OU 1 SERAO ACEITOS");
            System.exit(0); //fecar sem erros
        }

        System.out.println("Digite o BM, APENAS O VALOR 0 OU 1 SERAO ACEITOS");
        int BM2 = leitor.nextInt();
        if (BM2 != 0 && BM2 != 1) {
            System.out.println("VALOR INCORRETO, APENAS O VALOR 0 OU 1 SERAO ACEITOS");
            System.exit(0); //fecar sem erros
        }

        array2 [0] = array1[0] + frame1;
        array2 [1] = tempodecarga2;
        array2 [2] = quantidaderef2;
        array2 [3] = tempoultimaref2;
        array2 [4] = BR2;
        array2 [5] = BM2;


        //desenvolved by gabe
        //--------------------------------------------------------- Terceiro array

        int[] array3 = new int[6];

        System.out.println();

        System.out.println("Digite o Tempo de Carga da terceira linha");
        int tempodecarga3 = leitor.nextInt();

        System.out.println("Digite a Quantidade Referencia da terceira linha:");
        int quantidaderef3 = leitor.nextInt();

        System.out.println("Digite o Tempo da ultima referência da terceira linha:");
        int tempoultimaref3 = leitor.nextInt();

        System.out.println("Digite o BR, APENAS 0 OU 1 SERAO ACEITOS ");
        int BR3 = leitor.nextInt();

        if (BR3 != 0 && BR3 != 1) {
            System.out.println("Valor incorreo, APENAS 0 OU 1 SERAO ACEITOS");
            System.exit(0); //fecar sem erros
        }

        System.out.println("Digite o BM da terceira linha :");
        int BM3 = leitor.nextInt();
        if (BM3 != 0 && BM3 != 1) {
            System.out.println("VALOR INCORRETO, APENAS O VALOR 0 OU 1 SERAO ACEITOS");
            System.exit(0); //fecar sem erros
        }

        array3 [0] = array2[0] + frame1;
        array3 [1] = tempodecarga3;
        array3 [2] = quantidaderef3;
        array3 [3] = tempoultimaref3;
        array3 [4] = BR3;
        array3 [5] = BM3;

        //desenvolved by gabe
        //------------------------------------------------------ Quarto array

        int[] array4 = new int[6];

        System.out.println();

        System.out.println("Digite o Tempo de Carga da quarta linha: ");
        int tempodecarga4 = leitor.nextInt();

        System.out.println("Digite a Quantidade Referencia da quarta linha: ");
        int quantidaderef4 = leitor.nextInt();

        System.out.println("Digite o Tempo da ultima referência da quarta linha: ");
        int tempoultimaref4 = leitor.nextInt();

        System.out.println("Digite o BR, APENAS O VALOR 0 OU 1 SERAO ACEITOS");
        int BR4 = leitor.nextInt();

        if (BR4 != 0 && BR4 != 1) {
            System.out.println("Valor incorreo, APENAS O VALOR 0 OU 1 SERAO ACEITOS");
            System.exit(0); //fecar sem erros
        }

        System.out.println("Digite o BM, APENAS O VALOR 0 OU 1 SERAO ACEITOS");
        int BM4 = leitor.nextInt();
        if (BM4 != 0 && BM4 != 1) {
            System.out.println("VALOR INCORRETO, APENAS O VALOR 0 OU 1 SERAO ACEITOS");
            System.exit(0); //fecar sem erros
        }

        array4 [0] = array3[0] + frame1;
        array4 [1] = tempodecarga4;
        array4 [2] = quantidaderef4;
        array4 [3] = tempoultimaref4;
        array4 [4] = BR4;
        array4 [5] = BM4;


        System.out.println("Frame         | Tempo de Carga      |       Quantidade Referencia        |        Tempo da Ultima Referencia       |             Br         |          BM");

        //desenvolved by gabe
        //---------------------------------------------------------------------primeira linha
        System.out.print(array1[0] + "                  ");

        System.out.print(array1[1] + "                                  ");

        System.out.print(array1[2] + "                                       ");

        System.out.print(array1[3] + "                             ");

        System.out.print(array1[4] + "                         ");

        System.out.print(array1[5]);

        System.out.println();

        //----------------------------------------------------------------------segunda linha
        System.out.print(array2[0] + "                  ");

        System.out.print(array2[1] + "                                  ");

        System.out.print(array2[2] + "                                       ");

        System.out.print(array2[3] + "                             ");

        System.out.print(array2[4] + "                         ");

        System.out.print(array2[5]);

        System.out.println();

        //------------------------------------------------------------------terceira linha
        System.out.print(array3[0] + "                  ");

        System.out.print(array3[1] + "                                  ");

        System.out.print(array3[2] + "                                       ");

        System.out.print(array3[3] + "                             ");

        System.out.print(array3[4] + "                         ");

        System.out.print(array3[5]);

        System.out.println();

        //---------------------------------------------------------------------quarta linha
        System.out.print(array4[0] + "                  ");

        System.out.print(array4[1] + "                                  ");

        System.out.print(array4[2] + "                                       ");

        System.out.print(array4[3] + "                             ");

        System.out.print(array4[4] + "                         ");

        System.out.print(array4[5]);

        System.out.println();

        //FIFO
        int fifo1 = array1[1];
        int fifo2 = array2[1];
        int fifo3 = array3[1];
        int fifo4 = array4[1];

        //Logica do primeiro FIFO
        if (fifo1 > fifo2) {
            if (fifo1 > fifo3) {
                if (fifo1 > fifo4) {
                    System.out.println();
                    System.out.println("FIFO:");
                    System.out.println("O maior Tempo de Carga e : " + fifo1);
                    System.out.println("Frame a ser substituido: " + array1[0]);
                }
            }
        }

        //Logica do segundo FIFO
        if (fifo2 > fifo1) {
            if (fifo2 > fifo3) {
                if (fifo2 > fifo4) {
                    System.out.println();
                    System.out.println("FIFO:");
                    System.out.println("O maior Tempo de Carga e: " + fifo2);
                    System.out.println("Frame a ser substituido: " + array2[0]);
                }
            }
        }

        //logica do terceiro FIFO
        if (fifo3 > fifo1) {
            if (fifo3 > fifo2) {
                if (fifo3 > fifo4) {
                    System.out.println();
                    System.out.println("FIFO:");
                    System.out.println("O maior Temmpo de Carga e: " + fifo3);
                    System.out.println("Frame a ser substituido: " + array3[0]);
                }
            }
        }

        //logica do quarto FIFO
        if (fifo4 > fifo1) {
            if (fifo4 > fifo2) {
                if (fifo4 > fifo3) {
                    System.out.println();
                    System.out.println("FIFO:");
                    System.out.println("O maior Temmpo de Carga e: " + fifo4);
                    System.out.println("Frame a ser substituido: " + array4[0]);
                }
            }
        }

        System.out.println();

        //LFU - Menor quantidade de referencia mostrar o frame
        int lfu1 = array1[2];
        int lfu2 = array2[2];
        int lfu3 = array3[2];
        int lfu4 = array4[2];

        //Logica do primeiro LFU
        if (lfu1 < lfu2) {
            if (lfu1 < lfu3) {
                if (lfu1 < lfu4) {
                    System.out.println("LFU:");
                    System.out.println("Menor quantidade de referencia: " + lfu1);
                    System.out.println("Frame a ser substituido: " + array1[0]);
                }
            }
        }

        //Logica do segundo LFU
        if(lfu2 < lfu1) {
            if (lfu2 < lfu3) {
                if (lfu2 < lfu4) {
                    System.out.println("LFU:");
                    System.out.println("Menor quantidade de referencia: " + lfu2);
                    System.out.println("Frame a ser substituido: " + array2[0]);
                }
            }
        }

        //Logica do terceiro LFU
        if (lfu3 < lfu1) {
            if (lfu3 < lfu2) {
                if (lfu3 < lfu4) {
                    System.out.println("LFU:");
                    System.out.println("Menor quantidade de referencia: " + lfu3);
                    System.out.println("Frame a ser substituido: " + array3[0]);
                }
            }
        }

        //Logica do quarto LFU
        if (lfu4 < lfu1) {
            if (lfu4 < lfu2) {
                if (lfu4 < lfu3) {
                    System.out.println("LFU:");
                    System.out.println("Menor quantidade de referencia: " + lfu4);
                    System.out.println("Frame a ser substituido: " + array4[0]);
                }
            }
        }

        System.out.println();

        //LRU - Maior Tempo da ultima referencia
        int lru1 = array1[3];
        int lru2 = array2[3];
        int lru3 = array3[3];
        int lru4 = array4[3];

        //Logica do primeiro LRU
        if (lru1 > lru2) {
            if (lru1 > lru3) {
                if (lru1 > lru4) {
                    System.out.println("LRU:");
                    System.out.println("Maior Tempo da ultima referencia: " + lru1);
                    System.out.println("Frame a ser substituido: " + array1[0]);
                }
            }
        }

        //Logica do segundo LRU
        if (lru2 > lru1) {
            if (lru2 > lru3) {
                if (lru2 > lru4) {
                    System.out.println("LRU:");
                    System.out.println("Maior tempo da ultima referencia: " + lru2);
                    System.out.println("Frame a ser substituido:" + array2[0]);
                }
            }
        }

        //Logica do terceiro LRU
        if (lru3 > lru1) {
            if (lru3 > lru2) {
                if (lru3 > lru4) {
                    System.out.println("LRU:");
                    System.out.println("Maior tempo da ultima referencia: " + lru3);
                    System.out.println("Frame a ser substituido: " + array3[0]);
                }

            }
        }

        //Logica do quarto LRU
        if (lru4 > lru1) {
            if (lru4 > lru2) {
                if (lru4 > lru3) {
                    System.out.println("LRU:");
                    System.out.println("Maior tempo da ultima referencia: " + lru4);
                    System.out.println("Frame a ser substituido: " + array4[0]);
                }
            }
        }

        System.out.println();

        //desenvolved by gabe
        //NRU
        if (BR == 1 && BM == 1 || BR == 0 && BM == 0) {
            System.out.println("Valores da primeira linha condiz com a logica NRU");
            System.out.println("Frame a ser substituido: " + array1[0]);
            System.out.println();
        }

        if (BR2 == 1 && BM2 == 1 || BR2 == 0 && BM2 == 0) {
            System.out.println("Valores da segunda linha condiz com a logica NRU");
            System.out.println("Frame a ser substituido: " + array2[0]);
            System.out.println();
        }

        if (BR3 == 1 && BM3 == 1 || BR3 == 0 && BM3 == 0) {
            System.out.println("Valores da terceira linha condiz com a logica NRU");
            System.out.println("Frame a ser substituido: " + array2[0]);
            System.out.println();
        }

        if (BR4 == 1 && BM4 == 1 || BR4 == 0 && BM4 == 0) {
            System.out.println("Valores da quarta linha condiz com a logica NRU");
            System.out.println("Frame a ser substituido: " + array2[0]);
            System.out.println();
        }
    }
}