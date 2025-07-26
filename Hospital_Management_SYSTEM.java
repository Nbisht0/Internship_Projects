import java.util.Scanner;

public class Hospital_Management_SYSTEM {
    //20 july 2025

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for(;;) {
            System.out.println("Enter the name of the patient : ");
            String patient_name = scanner.nextLine();

            System.out.println("Patient's age : ");
            int age = Integer.parseInt(scanner.nextLine());


            Core_connect_Hospital hospital = new Core_connect_Hospital(patient_name, age);
            hospital.showdetails();

            System.out.println("\nDo you want to enter another patient? (yes/no)");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (!choice.equals("yes") && !choice.equals("y")) {
                break;  // 🔁 exit the loop
            }
        }

        scanner.close();


        }

}
    class Core_connect_Hospital {
    private String patient_name;     //scanner class me name puchhne ke baad bhi maii uska constructor bana kr call kyu karr rahi hu
    private int age;
    private String disease;
    private String Department;
    private String doctorname;
    private String roomname;
    private String wardno;
    private long fees;
    private String admitdate;
    private String dischargedate;

    public Core_connect_Hospital(String patient_name, int age) {
        this.patient_name = patient_name;
        this.age = age;
    }

        public void showdetails() {
            System.out.println("Patient's name : " + patient_name);
            System.out.println("Patient's age : " + age);


            if( age < 18){
                disease = "viral fever";
                Department = "Pediatrics";
                doctorname = "Mr. M.K Mishra";
                roomname = " Room no: 101";
                wardno ="Ward no. A";
                fees = 150;
                admitdate = "22/05/24";
                dischargedate = "04/07/25";
            }
            else if( age>=18 && age<= 30 ) {
                disease = "Skin allergy";
                Department = "Dermatology";
                doctorname = "Ms. Meena Rana";
                roomname = " Room no: 118";
                wardno ="Ward no. K";
                fees = 2000;
                admitdate = "18/02/24";
                dischargedate = "04/05/25";

            }
            else if( age >= 31 && age<= 60) {
                disease = "Heart disease";
                Department = "Cardiology";
                doctorname = "Mrs.Kritika Saavran Tyagi";
                roomname = " Room no: 118";
                wardno ="Ward no. C";
                fees = 5000;
                admitdate = "16/03/25";
                dischargedate = "28/12/25";

            }
            else  {
                disease = "Arthrities";
                Department = "Orthopedic";
                doctorname = "Mrs.Kartik Singh";
                roomname = " Room no: 118";
                wardno ="Ward no. F";
                fees = 1200;
                admitdate = "16/03/25";
                dischargedate = "28/12/25";
            }
            System.out.println("Disease : " + disease);
            System.out.println("Department : " + Department);
            System.out.println("Doctor : " + doctorname);
            System.out.println("Room : " + roomname );
            System.out.println("Ward no : " + wardno);
            System.out.println("Fees : " + fees);
            System.out.println("Admit Date : " + admitdate);
            System.out.println("Discharge Date : " + dischargedate);

        }

    }


