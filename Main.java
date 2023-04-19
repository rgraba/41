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
      Scanner scanner = new Scanner(System.in);
      Service s = new Service();
        {
          System.out.println("1.Dodaj Studenta");
          int wybor = scanner.nextInt();
          switch(wybor)
            {
              case 1:
                System.out.println("Podaj Imię:");
                String imie = scanner.next();
                System.out.println("Podaj wiek:");
                int wiek = scanner.nextInt();
                s.addStudent(new Student(imie, wiek));
                break;
              default:
                System.out.println("Zły wybór");
                break;
            }
                var students = s.getStudents();
                for(Student current : students) {
                System.out.println(current.ToString());
                }
        }
    } catch (IOException e) { 
    }
  }
}