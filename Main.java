/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.io.IOException;
import java.util.Scanner;



class Main {
  public static void main(String[] args) {
    try {
      while(true){
      Scanner scanner = new Scanner(System.in);
      Service s = new Service();
        {
          System.out.println("1.Dodaj Studenta");
          System.out.println("2.Wyświetl liste studentów");
          System.out.println("0.Opuść program");
          int wybor = scanner.nextInt();
          switch(wybor)
            {
              case 1:
                System.out.println("Podaj Imię:");
                String imie = scanner.next();
                System.out.println("Podaj Nazwisko:");
                String nazwisko = scanner.next();
                System.out.println("Podaj wiek:");
                int wiek = scanner.nextInt();
                System.out.println("Podaj date urodzenia:");
                String dataurodzenia = scanner.next();
                s.addStudent(new Student(imie, nazwisko, wiek, dataurodzenia));
                break;
              case 0:
                System.exit(0);
              case 2:
                var students = s.getStudents();
                for(Student current : students) {
                System.out.println(current.ToString());
            }
              default:
              break;
            }
          }
        }
    } catch (IOException e) 
      { 
    }
  }
} 