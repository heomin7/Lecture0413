package majorleague2.service;

import majorleague2.model.Park;

import java.util.List;
import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ParkService implements IParkService {
    public int NotUsCountry(Map<String, Park> map){
        int notUsCount = 0;

        for(String key: map.keySet()){
            if(!map.get(key).getCountry().equals("US")){
                notUsCount++;
            }
        }

        return notUsCount;
    }

    public int NickNameCount(Map<String, Park> map){

        int nickNameCount = 0;

        for (String key: map.keySet()){
            if(map.get(key).getParkAlias().length() > 0){
                nickNameCount++;
            }
        }
        return nickNameCount;
    }

    public double ParkNameAverage(Map<String, Park> map){
        int sum = 0;

        for(String key: map.keySet()){
            sum += map.get(key).getParkName().length();
        }


        return (double)sum / map.size();
    }
}
