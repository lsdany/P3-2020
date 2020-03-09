package com.ld.list;

/**
 * @author luisdany israel pernillo
 * @id 7690-13-12063
 * @param <E>
 */

public class SimpleList<E> {

    private Node<E> start = null;
    private Node<E> end = null;
    private int size;
    private Node<E> actual = null;

    public SimpleList(){

    }

    public void addElement(E element){

        actual = new Node<>(element);

        if (start == null){
            // at list's beginning
            start = actual;
            end = actual;
        }else{
            end.setNext(actual);
            end = actual;
        }
        size++;
    }

    public int getSize(){
        return size;
    }


    public void show(){
        actual = start;
        while(actual != null){
            System.out.print("| "+actual.getData()+" |-->");
            actual = actual.getNext();
        }
    }

    /**
     * Only work if the values are numbers
     */
    public void orderList(){
        Integer[] arrayList = new Integer[size];
        int index = 0;
        actual = start;
        while(actual != null){
            if(actual.getData() instanceof Integer){
                arrayList[index] = (Integer) actual.getData();
            }
            if(actual.getData() instanceof String){
                arrayList[index] = Integer.parseInt((String)actual.getData());
            }
            actual = actual.getNext();
            index++;
        }


        if(arrayList.length > 0){

            int n = arrayList.length;
            int temp = 0;

            for(int i = 0; i < n; i++) {
                for(int j=1; j < (n-i); j++) {
                    if(arrayList[j-1] > arrayList[j]) {
                        temp = arrayList[j-1];
                        arrayList[j-1] = arrayList[j];
                        arrayList[j] = temp;
                    }
                }
            }

            size = 0;
            start = null;
            for(int i = 0; i < arrayList.length; i ++){
                addElement((E) arrayList[i]);
            }
        }

    }

}
