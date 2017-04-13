package majorleague.service;

import majorleague.model.Park;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ParkService implements IParkService {
    public int NotUsCountry(List<Park> parkList){
        int notUsCount = 0;
        for(Park e: parkList){
            if(!e.getCountry().equals("US")){
                notUsCount++;
            }
        }
        return notUsCount;
    }

    public int NickNameCount(List<Park> parkList){

        int nickNameCount = 0;

        for (Park e: parkList){
            if(e.getParkAlias().length() > 0){
                nickNameCount++;
            }
        }
        return nickNameCount;
    }

    public double ParkNameAverage(List<Park> parkList){
        int sum = 0;

        for(Park e: parkList){
            sum += e.getParkName().length();
        }

        return (double)sum / parkList.size();
    }
}
