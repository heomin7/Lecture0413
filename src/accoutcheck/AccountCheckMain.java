package accoutcheck;

import accoutcheck.service.AccountCheck;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class AccountCheckMain {
    public static void main(String[] args){

        Map<String, String> map = new HashMap<>();
        map.put("hedgar", "12345");
        map.put("hedgar0601", "54321");
        map.put("sepsba3", "13254");

        Scanner scanner = new Scanner(System.in);

        System.out.println("input your Account Info: ");

        AccountCheck ac = new AccountCheck();
        boolean flag = true;
        while(flag) {
            System.out.print("Id: ");
            String id = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            flag = ac.checkAccountInfo(map, id, password);
        }
    }
}
