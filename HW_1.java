// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class HW_1 {
public static void main(String[] args) {
//    int[] arr = new int[]{1,3,5,7,4,8,9,6,2};
//    sort_buble(arr);
//    for(int i = 0; i < arr.length; i++){
//        System.out.print(arr[i] + "\n");
//    }
// }
// public static void sort_buble (int[] arr) {
//     int len = arr.length;
//     for (int i = 0; i < len - 1; i++) {
//         for (int j = 0; j < len - i - 1; j++) {
//             if (arr[j] > arr[j + 1]) {
//                 int temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//             }
//         }
//     }
// }
// public void Logi() {
//     Logger logger = Logger.getLogger(HW_1.class.getName());
//     // ConsoleHandler ch = new ConsoleHandler();
//     FileHandler fh = new FileHandler("log.xml");

//     logger.addHandler(fh);

//     // SimpleFormatter sFormat = new SimpleFormatter();
//     // fh.setFormatter(sFormat);
//     XMLFormatter xml = new XMLFormatter();
//     fh.setFormatter(xml);
//     logger.info("Тест");
    
// }
// }
Logger log = Logger.getLogger("Logi");
    int[] arr = new int[] {1,2,5,8,4,9,6,3,7};
    int temp;
    try{
        FileHandler fh = new FileHandler("logi.log");
        log.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
    }
    catch(Exception e) {
        System.out.println(e.getMessage());
    }
    for (int i = 0; i < arr.length; i++){
        for (int j = 0; j < arr.length - 1 - 1; j++){
            if (arr[j] > arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                log.info(Arrays.toString(arr));
            }
        }
    }
    System.out.println(Arrays.toString(arr));
}
}