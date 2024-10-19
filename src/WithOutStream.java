/*
"Aditi",100
"Aditi",100
"Aditi",100
---
"Steve",200
-------
"David",300
------
"ketty",400
"ketty",300


----
Map : String , list of marks as value



* */
import java.util.*;
public class WithOutStream
{
    public static void main(String [] args)
    {
        Map<String,List<Integer>> map=new HashMap<>();
        map.put("Aditi",new ArrayList<Integer>(Arrays.asList(100,100,100)));
        map.put("ketty",new ArrayList<Integer>(Arrays.asList(200,100,200)));
        map.put("Devid",new ArrayList<Integer>(Arrays.asList(600,100,200)));
        map.put("Tom",new ArrayList<Integer>(Arrays.asList(100)));
        map.put("Steven",new ArrayList<Integer>(Arrays.asList(100,800,900)));

        Map<String,Double> avgmarksmap=new HashMap<>();
        Double max= Double.MIN_VALUE;
        String key="";
        for(Map.Entry<String,List<Integer>> entry :map.entrySet())
        {
            Double avg=0.0;
            int sum=0;
            ArrayList<Integer> list= (ArrayList<Integer>) entry.getValue();
            for(Integer element:list)
            {
                sum=sum+element;
            }
            avg= (double) (sum/list.size());
            if(avg>max)
            {
                max=avg;
                key=entry.getKey();
            }
            avgmarksmap.put(entry.getKey(),avg);

        }
        System.out.println("key : max avg "+max+":"+key);

    }






}
