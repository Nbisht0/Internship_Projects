import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Library_Management_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_students;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");

        System.out.println("Enter the class roll number of the Student");
         no_of_students = Integer.parseInt(sc.nextLine());   //sc.nextLine ki wajh se vo input string me lega but
        //we need to take it as an integer as we've to use in the loop

        for (int i = 0; i < no_of_students; i++) {
            System.out.println(" Enter Student Details " + (i + 1) + "  ");
            

            System.out.println("Enter the name of the Student ( in lower case )");
            String name = sc.nextLine().toLowerCase();  //student name

            System.out.println(" Enter your department ");
            String departname = sc.nextLine();

            System.out.println(" Enter College name ");
            String clg_name = sc.nextLine();


            checked tick;
            switch (name) {

                case "nidhi bisht":

                    tick = new checked("nidhi bisht" ,
                            new String[]{"Engineering Physics - Ab9097" , "Maths 1 - B1MATH01"} ,
                            LocalDate.of(2025, 1 , 5) ,
                            LocalDate.of(2025 , 2 , 5) );

                    break;

                case "aayush kumar":

                    tick = new checked("aayush kumar" ,
                            new String[]{ "C Programming - C1234 " , "Electrical - E1005"} ,
                            LocalDate.of(2025 , 2 , 10) ,
                            LocalDate.of(2025 , 3, 10));
                    break;

                case "shahroz ali":

                    tick = new checked("shahroz ali" ,
                            new String[]{"Digital Logic - Dl012" , "Data Structures - DS1001"} ,
                            LocalDate.of(2025 , 3 , 1) ,
                            LocalDate.of(2025 , 4 , 1));
                    break;

                case "ankit joshi":

                    tick = new checked("ankit joshi" ,
                            new String[]{"OOP in JAVA - J001 " , "Database System - DB108"} ,
                            LocalDate.of(2025, 1,20) ,
                            LocalDate.of(2025 , 2 , 20));
                    break;

                default:

                    System.out.println(" No Record Found for " + name);
                    System.out.println("                            ");
                    continue;

            }

               if (tick != null) {
                   tick.student_library_record();
                   System.out.println("Student name: " + tick.student_name);
                   System.out.println("Department: " + departname);
                   System.out.println("College: " + clg_name);
                   tick.Academic_books();
                   System.out.println(" Issued date: " + tick.book_issued().format(formatter));
                   System.out.println(" Return date: " + tick.book_return().format(formatter));
                   System.out.println();
               }
        }
        sc.close();

    }
}
interface library_management_system{




    LocalDate book_issued();
    LocalDate book_return();


    default void student_library_record(){
        System.out.println("                                      ");
        System.out.println("--------------RECORD OF THE BOOKS ISSUED-----------" );

    }
}

interface  books{
    default void Academic_books(){
        System.out.println("          Books issued        " );
        System.out.println("Subject : Engineering Physics                Book ID : AB9097");
        System.out.println("Subject : Engineering Chemistry              Book ID : B0B678");
        System.out.println("Subject : Advance Engineering Mathematics    Book ID : A690K7");
        System.out.println("Subject : Theory of Automata                 Book ID : R7256Q");


    }
}

class checked implements library_management_system , books {

    public String student_name;
    private String[] books;
    private LocalDate issuedDate;
    private LocalDate returnDate;

    public checked(String student_name , String[] books , LocalDate issuedDate , LocalDate returnDate) {
        this.student_name = student_name;
        this.books = books;
        this.issuedDate = issuedDate;
        this.returnDate = returnDate;
    }


    @Override
    public LocalDate book_issued() {
        return issuedDate;

    }

    @Override
    public LocalDate book_return() {
        return returnDate;
    }

    public void Academic_books(){
        System.out.println("        Books issued       ");
        for(int i = 0 ; i < books.length ; i++){
            System.out.println(" -  " + books[i]);
        }
    }
}


