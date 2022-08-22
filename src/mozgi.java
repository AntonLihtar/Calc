public class mozgi {
    /*if (roman(number1)) {
        if (roman(number2)) {
            int num1Rom = romanToNumber(number1);
            int num2Rom = romanToNumber(number2);
            int summRom = calculate(text, num1Rom, num2Rom);
            if (!(summRom < 1))
                System.out.println(convertNumToRoman(summRom));
            else
                throw new Exception("В римской системе нет отрицательных чисел");
        } else
            throw new Exception("Используются оодновременно разные системы исчисления");

    } else {
        if (arabic(number1)) {
            if (arabic(number2)) {
                int num1 = Integer.parseInt(number1);  //пЕРВОЕ ЧИСЛО ПРЕОБРАЗУЕМ ИЗ СТРОКИ В ЦЕЛОЕ
                int num2 = Integer.parseInt(number2);         // ВТОРОЕ ЧИСЛО
                int summ = calculate(text, num1, num2);    //ВЫЧИСЛЯЕМ СУММУ ЦЕЛЫХ
                System.out.println(summ);
            } else
                throw new Exception("Используются оодновременно разные системы исчисления");
        } else
            throw new Exception("Используются оодновременно разные системы исчисления");
    }
}

    static boolean arabic(String number) {          //проверяет число на значение от1 до 10
        String[] arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};   ///и возвращает тру или исключение
        for (String sxs : arabic) {
            if (!number.equals(sxs))
                continue;
            return true;
        }
        return false;
    }

    static boolean roman(String number) {          //проверяет число на значение от1 до 10
        String rom = "I,II,III,IV,V,VI,VII,VIII,IX,X";   ///и возвращает тру или исключение
        return (rom.contains(number));
    }*/
}
