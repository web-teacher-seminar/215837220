import java.util.LinkedList;

public class MyMap {
    private LinkedList<Pair>[] values;
    private int size;
    public MyMap(int m) {
        values = new LinkedList[m];
        size = m;

    }
    public void set(String key,int value){
        //if (size>0){
        int index= Math.abs(key.hashCode()%size);
        if(values[index]==null){
            values[index]=new LinkedList<>();
            values[index].add(new Pair(key,value));
            return;
        }
        for(Pair pair : values[index]){
            if(pair.getKey().equals(key)){
                pair.setValue(value);
                return;
            }
        }
        values[index].add(new Pair(key,value));
      }

    public Pair get(String key) {
        int index = Math.abs(key.hashCode() % size);
        for (Pair pair : values[index]) {
            if (pair.getKey().equals(key)) {
                return pair;
            }
        }
        return null;

    }
    public Boolean hashKey(String key) {
        int index = Math.abs(key.hashCode() % size);
        for (Pair pair : values[index]) {
            if (pair.getKey().equals(key)) {
                return true;
            }
        }
        return  false;

    }



    public LinkedList<Pair>[] getValues() {
        return values;
    }

    public void print(){
        for(LinkedList<Pair> pairs : values){
            if(pairs==null){continue;}
            for(Pair pair : pairs){
                System.out.println(pair.getKey()+':'+pair.getValue());
            }
        }
    }
}

