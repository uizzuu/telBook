package main;

import db.DBConn;
import dto.TelDto;
import view.UserView;

import java.sql.Connection;
import java.util.Scanner;

public class TelBookMain {
    public static void main(String[] args) {
        // DB연결
        // Connection conn = DBConn.getConnection();
        UserView userView = new UserView();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.입력 2.수정 3.삭제 4.목록보기 5.검색 6.종료");
            int num = sc.nextInt();
            switch (num) {
                case 1 :
                    userView.insertView();
                    break;
                case 2 :
                    userView.updateView();
                    break;
                case 3 :
                    userView.deleteView();
                    break;
                case 4 :
                    userView.findAllView();
                    break;
                case 5 :
                    userView.searchView();
                    break;
                case 6 :
                    userView.deleteView();
                    return;
            }
        }
    }
}
