package hw3;

import java.util.*;

public class Dijkstra {

    Dijkstra() {
        
        int w[][] = {
            {0, 1, -1, -1, -1, -1, 2, -1},
            {1, 0, 5, -1, 3, -1, -1, -1},
            {-1, 5, 0, 10, -1, 8, -1, -1},
            {-1, -1, 10, 0, -1, -1, -1, 11},
            {-1, 3, -1, -1, 0, 6, 4, -1},
            {-1, -1, 8, -1, 6, 0, -1, 9},
            {2, -1, -1, -1, 4, -1, 0, 7},
            {-1, -1, -1, 11, -1, 9, 7, 0}
        };

        /*int path[];
        path = dijkstra(w);
        for (int i = 0; i < path.length; i++) {
            System.out.println(path[i]);
        }*/

    }

    int[] dijkstra(int w[][]) {

        ArrayList list = new ArrayList();
        int d[];
        d = new int[w[0].length];
        d = w[0].clone();
        boolean isVisited[] = new boolean[w[0].length];
        list.add(0, 0);
        int min;
        int index = 0;
        int count = 0;
        isVisited[0] = true;
        int end = 3;
        int pre[] = new int[w[0].length];

        for (int i = 1; i < w[0].length; i++) {
            if (d[i] != -1) {
                pre[i] = 0;
                //System.out.println(i+"pre="+pre[i]);
            }
        }

        while (count < w[0].length) {

            min = Integer.MAX_VALUE;  //infinite
            for (int j = 0; j < w[0].length; j++) {
                if (isVisited[j] == false && d[j] < min && d[j] != -1 && d[j] != 0) {
                    min = d[j];
                    index = j;
                    //System.out.println("index="+index);
                }
            }

            if (index == end) {
                //System.out.println(index);
                //System.out.println(isVisited[index]);
                isVisited[end] = true;
                list.add(++count, end);
                break;
            }

            isVisited[index] = true;
            list.add(++count, index);

            for (int k = 0; k < w[0].length; k++) {
                if (isVisited[k] == false && d[k] == -1 && w[index][k] != -1) {  //previous unreach, now reach
                    d[k] = d[index] + w[index][k];
                    pre[k] = index;
                } else if (isVisited[k] == false && w[index][k] != -1 && d[index] + w[index][k] < d[k]) { //previous reach, now more shorter
                    d[k] = d[index] + w[index][k];
                    pre[k] = index;
                }
                //System.out.println("d[k]=" + d[k]);
                //System.out.println("index="+index);
                //System.out.println(k+"pre=" + pre[k]);

            }
        }

        ArrayList path_list = new ArrayList();
        int temp = pre[end];
        while (temp != 0) {
            path_list.add(temp);
            temp = pre[temp];
        }
        path_list.add(0);

        int path[];
        path = new int[path_list.size() + 1];
        for (int m = path_list.size(); m > 0; m--) {
            path[path_list.size() - m] = (int) path_list.get(m - 1);
            path[path_list.size()] = end;
            //System.out.println(path[path_list.size()-m]);
        }
        return path;
    }

}
