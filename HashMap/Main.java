package Tomas;

import java.util.HashMap;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Tom");
        myMap.put(2, "Greg");
        myMap.put(3, "Louise");
        myMap.put(4, "Annette");

        if (!myMap.isEmpty()) {
            for (HashMap.Entry mapEntry : myMap.entrySet()) {
                System.out.println("The key is " + mapEntry.getKey() + ", and the value is " + mapEntry.getValue());
            }

            for (Integer i : myMap.keySet()) {
                System.out.println("The key is: " + i + ", and the value is: " + myMap.get(i));
            }

            Iterator<HashMap.Entry<Integer, String>> myIter = myMap.entrySet().iterator();
            while(myIter.hasNext()){
                //HashMap.Entry<Integer,String> entry = myIter.next();
                if(myIter.next().getValue().equals("Greg")){
                    myIter.remove();
                }
            }

            for (HashMap.Entry mappy : myMap.entrySet()) {
                System.out.println("The key is: " + mappy.getKey() + ", and the value is: " + mappy.getValue());
            }
            System.out.println("The size of the Hashmap is: " + myMap.size());
        }
        HashMap<Integer, String> newHash = (HashMap)myMap.clone();
        System.out.println("New");
        for(HashMap.Entry thisMap : newHash.entrySet()){

            System.out.println("The key is: " + thisMap.getKey() + ", and the value is: " + thisMap.getValue());
        }
        newHash.putAll(myMap);
        newHash.replace(2, "Gregory");
        newHash.replaceAll((k,v)->"Annette");
        for(HashMap.Entry thisMap : newHash.entrySet()){

            System.out.println("The key is: " + thisMap.getKey() + ", and the value is: " + thisMap.getValue());
        }
        HashMap<Integer, String> twoHash = new HashMap<>(myMap);
        //  or without params twoHash.putAll(newHash);
        System.out.println("twoHash" + twoHash);
    }
    }

