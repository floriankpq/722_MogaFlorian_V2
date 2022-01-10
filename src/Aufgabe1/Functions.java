package Aufgabe1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Functions {

    public List<Offerten> sortOffertenByPrice(List<Offerten> offerten){
        List<Offerten> of =  offerten
                .stream()
                .sorted(Comparator.comparingInt(Offerten::getPreis))
                .collect(Collectors.toList());

        Collections.reverse(of);
        return of;
    }

    public String getMostFrequentPlace(List<Offerten>  offerten){

        Map.Entry<Integer,Long> maxLocation = offerten.stream()
                .collect(Collectors.groupingBy(Offerten::getPreis,Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(NullPointerException::new);

        return maxLocation.getKey() + ": " + maxLocation.getValue();
    }


}
