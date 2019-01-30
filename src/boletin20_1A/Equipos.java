/*A seguinte táboa recolle los goles marcados polos 20 equipos de 1ª  división 
*en cada unha das 36 xornadas. 
*Hacer con un menú y switch case.
*Equipo/xornada    X1   X2     X3 ……
*        Celta    3     4        2
*        Depor    1     2        1 
*        Málaga   3     0        1
*
* Pídese: 
* 20_1A Gravar e imprimir a táboa. 
* 20_1B Obter unha listaxe dos equipos por orde de menor n° de goles na liga. 
* 20_1C Indicar o equipo que marca máis goles en cada xornada. 
* 20_1D Que equipo e en que xornada se rexistran máis goles? 
* 20_1E Consultas por equipo e xornada indicando o n° de goles. 
*
 */
package boletin20_1A;

import javax.swing.JOptionPane;

/**
 *
 * @author mrebelladofernandez
 */
public class Equipos {

    int equipo = 3;        //Creo un array para ter os equipos.
    int xornadas = 4;      //Creo un array para ter as xornadas.
    int[][] goles = {{2, 4, 5, 6}, {1, 8, 9, 6}, {2, 3, 6, 8}};//new int[equipo][xornadas];    //Creo unha matriz para meter os goles dos equipos nas xornadas.
    String[] nomEquipo = {"Celta    ", "Deportivo", "Malaga   "};
    String[] nomXornada = {"X1", "X2", "X3", "X4"};

    //Imprimir táboa:
    public int darValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("Numero de goles"));
    }

    public void amosar() {
        System.out.print("\t");
        for (int o = 0; o < nomXornada.length; o++) {
            System.out.print("\t" + nomXornada[o] + " "); //\t tabulador

        }
        System.out.println("\n");
        for (int i = 0; i < goles.length; i++) {
            System.out.print(nomEquipo[i]);
            System.out.print("| ");

            for (int j = 0; j < goles[i].length; j++) {
                System.out.print("\t " + goles[i][j] + " ");

            }
            System.out.println("|\n");
        }

    }

}
