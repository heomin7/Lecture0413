package majorleague.service;

import majorleague.model.Park;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public interface IParkService {

    int NotUsCountry(List<Park> list);  //바디가 없는 추상 메소드, 원래 abstract가 붙지만, 기본적으로 인터페이스 메소드는 abstract이므로 생략가능
    int NickNameCount(List<Park> parkList);
    double ParkNameAverage(List<Park> parkList);


}
