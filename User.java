package proposalSystem;

import java.util.Scanner;

public class User extends Login {

    private Gender gender;
    private RoleUser role;

    public void userLogin() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Username : ");
        username = sc.nextLine();

        System.out.print("Password : ");
        password = sc.nextLine();

        if(loginStatus()) {

            System.out.println("Login Success");

            // เลือกเพศ
            System.out.print("Gender (M/F): ");
            gender = Gender.valueOf(sc.nextLine().toUpperCase());

            // เลือก role
            System.out.print("Role (PublicRelation / Division / Manager): ");
            role = RoleUser.valueOf(sc.nextLine());

            System.out.println("\n----- User Info -----");
            System.out.println("Gender : " + gender);
            System.out.println("Role : " + role);

        } else {
            System.out.println("Login Failed");
        }
    }
}
