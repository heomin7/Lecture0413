package majorleague2;

import majorleague2.model.Park;
import majorleague2.service.ParkService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ParkExample {
    public static void main(String[] args) {

        Map<String, Park> map = new HashMap<>();
        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("src\\Parks.csv"));


            String line = "";

            br.readLine();

            int countryCnt = 0;
            int nickNameCount = 0;
            double parkNameAverage = 0.0;

            while ((line = br.readLine()) != null) {
                String[] splitted = line.split(",");

                Park park = new Park(splitted[1], splitted[2], splitted[3], splitted[4], splitted[5]);

                map.put(splitted[0], park);

                ParkService ps = new ParkService();

                countryCnt = ps.NotUsCountry(map);
                nickNameCount = ps.NickNameCount(map);
                parkNameAverage = ps.ParkNameAverage(map);
            }

            System.out.println("국가가 US가 아닌 볼파크수?: " + countryCnt);
            System.out.println("별명이 있는 볼 파크 수는?: " + nickNameCount);
            System.out.printf("볼 파크 이름의 글자 평균은?: %.1f\n", parkNameAverage);

        }catch (FileNotFoundException fne){
            System.out.println("파일이름이 잘못되었거나 없어요.");
        }catch (IOException ie){
            System.out.println("파일을 실제로 IO하다가 에러가 발생했어요");
        }

    }
}
