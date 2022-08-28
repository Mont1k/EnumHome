import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               String a = sc.next().toUpperCase();
               Days days = Days.valueOf(a);
                switch (days){
                    case MONDAY -> System.out.println("Дүйшөмбу - Session");
                    case TUESDAY -> System.out.println("Шейшемби - Practice");
                    case WEDNESDAY -> System.out.println("Шаршемби - Session");
                    case THURSDAY -> System.out.println("Бейшемби - Practice");
                    case FRIDAY -> System.out.println("Жума - Session");
                    case SATURDAY -> System.out.println("Ишемби - Chill");
                    case SUNDAY -> System.out.println("Жекшемби - Chill");
        //Proverka mmm GitHub
                }

                }
            }

