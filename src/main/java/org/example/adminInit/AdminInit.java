package org.example.adminInit;

import org.example.dbConnection.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminInit {
    boolean t = true;
    int n;
    public void Admin(){
        while (t){
            adminMenu();
            switch (n){
                case 1:
                    //

                    break;
                    
            }

        }

    }

    public void adminMenu(){
        System.out.println("""
    *** Admin Menu ***
    (Card)
    1. Create Card(number,exp_date)
    2. Card List
    3. Update Card (number,exp_date)
    4. Change Card status
    5. Delete Card

    (Terminal)
    6. Create Terminal (code unique,address)
    7. Terminal List
    8. Update Terminal (code,address)
    9. Change Terminal Status
    10. Delete

    (Profile)
    11. Profile List
    12. Change Profile Status (by phone)

    (Transaction)
    13. Transaction List
        CardNumber, TerminalNumber, Amount,TransactionDate,Type (oxirgi birinchi ko'rinadi)
    14. Company Card Balance
        (card bo'ladi shu cardga to'lovlar tushadi. bu sql da insert qilinga bo'ladi)

       (Statistic)
    15. Bugungi to'lovlar
         CardNumber, TerminalNumber, Amount,TransactionDate,Type (oxirgi birinchi ko'rinadi)
    16. Kunlik to'lovlar (bir kunlik to'lovlar):
        Enter Date: yyyy-MM-dd
          CardNumber, TerminalNumber, Amount,TransactionDate,Type (oxirgi birinchi ko'rinadi)
    17. Oraliq to'lovlar:
        Enter FromDate: yyyy-MM-dd
        Enter ToDate:   yyyy-MM-dd
    18. Umumiy balance (company card dagi pulchalar)
    19. Transaction by Terminal:
        Enter terminal number:
    20. Transaction By Card:
        Enter Card number:
                """);
    }
    public void card(){

    }

    public void createAdmin(){
        try {
        Connection connection = DBConnection.getConnection();
        String sql = "insert into Userjon (name,surname,phone,)";
            PreparedStatement pr = connection.prepareStatement(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
