import java.util.Scanner;

public class Sorting {

    int length;
    int[] elements;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Sorting sort = new Sorting();

        sort.length = sc.nextInt();
        sort.elements = new int[sort.length];

        for(int i=0; i<sort.length; i++){
            sort.elements[i] = sc.nextInt();
        }

        //sort.insertionSort();
        //sort.selectionSort();
        //sort.bubbleSort();
        //sort.print();

        for(int i=0;i<sort.elements.length;i++){
            int v = Math.abs(sort.elements[i]) -1;
            if(sort.elements[v] < 0) System.out.println("This is return Value: "+(v + 1));
            sort.elements[v] = -sort.elements[v];
            for (int j: sort.elements)
                System.out.print(j+"\t");
            System.out.println();
        }
    }

    void print(){
        for(int i:elements){
            System.out.print(i+"\t");
        }
    }

    void insertionSort(){

        for(int i=1; i<length; i++){
            int key = elements[i];
            int j = i-1;
            while(j >= 0 && elements[j] > key){
                elements[j+1] = elements[j];
                j -= 1;
            }
            elements[j+1] = key;
        }
    }

    void selectionSort(){
        for(int i=0; i<length-1; i++){
            int minIndex = i;
            for(int j = i+1; j<length; j++)
                if(elements[j] < elements[minIndex])
                    minIndex = j;
            if(minIndex != i){
                elements[i] += elements[minIndex];
                elements[minIndex] = elements[i] - elements[minIndex];
                elements[i] = elements[i] - elements[minIndex];
            }
        }
    }

    void bubbleSort(){
        boolean swapped = true;

        while(swapped){
            swapped= false;
            for(int i=0; i<length-1; i++){
                if(elements[i] > elements[i+1]){
                    elements[i] += elements[i+1];
                    elements[i+1] = elements[i] - elements[i+1];
                    elements[i] = elements[i] - elements[i+1];
                    swapped = true;
                }
            }
        }
    }
}
