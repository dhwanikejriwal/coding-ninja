package Generics;

public class PairUse {
    public static void main (String args[]){

//        Creating pair of same type
//        Pair<String> ps=new Pair<String>("aa","bb");
//        System.out.println(ps.getFirst()+" "+ps.getSecond());
//        Pair <Integer> pI=new Pair<Integer>(10,20);
//        System.out.println(pI.getFirst()+" "+pI.getSecond());

//        Creating pair of different type
//        Pair<Double,Integer> pD=new Pair<Double,Integer>(3.12,3.44);
//        System.out.println(pD.getFirst()+" "+pD.getSecond());

//        Creating Pair inside a pair
        Pair <String,Integer> pInner=new Pair<>();

        Pair <Pair<String,Integer>,String> p=new Pair<>();
        p.setFirst(pInner);
        p.setSecond("abcd");
        System.out.println(p.getFirst()+" "+p.getSecond());
        System.out.println(p.getFirst().getFirst());
        System.out.println(p.getFirst().getSecond());


    }
}
