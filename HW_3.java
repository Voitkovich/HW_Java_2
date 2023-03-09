// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение). 
// Без встр. функций

public class HW_3 {
    public static void main(String[] args) {
        String isPalindrom = input.Str("Введите строку для проверки: ");
        System.out.println(PalindromM(isPalindrom));
    }

    private static boolean PalindromM(String line) {
        for (int i = 0; i < line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - 1 - i)){
                return false;
            }

        }
        return true;
    
}
}
