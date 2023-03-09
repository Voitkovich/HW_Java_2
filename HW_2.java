// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

    
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;


public class HW_2 {
    public static void main(String[] args) throws IOException{      
        String text = new String(Files.readAllBytes(Paths.get("My_Text.txt")));   
        System.out.println(text);                                                      
        String [] arr = text.split("\n");                                        
        for(int i = 0; i < arr.length; i++) {                                   
            System.out.println(Need_words(arr[i]));                                // Запукаем ф-цию  
        }

        // Path path = Paths.get("My_Text.txt");
        // String content = null;
        // try {
        //     byte[] encoded = Files.readAllBytes(path);
        //     content = new String(encoded);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        //  String [] arr = content.split("\n");                                        
        // for(int i = 0; i < arr.length; i++) {                                   
        //     System.out.println(Need_words(arr[i]));                                
        // }
        // System.out.println(content);
    }
    public static StringBuilder Need_words(String line) {
        String line1 = line.replaceAll("\"", "");    
        StringBuilder out_res = new StringBuilder("");            
        String [] peoples = line1.split(",");              
        String [] words = {"Студент ", " получил ", " по предмету "};  //  Создем список слов, которые нужно добавить     
        for (int i =0; i < peoples.length; i++) {                       
            String[] arr2 = peoples[i].split(":");            
            out_res.append(words[i]);                          
            out_res.append(arr2[1]);                                 
            }
        return out_res;                                             // Возвращаем итоговый список
    }
}


