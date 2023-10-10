package ValidateBinaryTree;

import java.util.Scanner;

public class Bt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Edges");

        int edges = sc.nextInt();

        int[] sets = new int[edges*2];

        int[] parent = new int[edges];
        int k=0;
        for(int i=0;i<edges*2;i++)
        {
            sets[i]=sc.nextInt();
            if(i%2!=0)
            {
                parent[k]=sets[i];
                k++;
            }
        }
      int count = 0;
      for(int i=0;i<edges;i++)
      {
          int temp = parent[i];
          if(count>2)
          {
              System.out.println("False");
              System.exit(0);
          }
           count = 0;
          for(int j=0;j<edges;j++)
          {
              if(temp==parent[j])
              {
                  count++;
              }
          }
      }
      System.out.println("True");
    }
}
