class Summa {
    public String summa(String text, String number1, String number2) throws Exception {
        ArabRom arabRom = new ArabRom();
        ConvertNumToRoman convertNumToRoman = new ConvertNumToRoman();
        RomanToNum romanToNum = new RomanToNum();
        Calculate calculate = new Calculate();
        if (arabRom.roman(number1)) {
            if (arabRom.roman(number2)) {
                int num1Rom = romanToNum.romanToNumber(number1);
                int num2Rom = romanToNum.romanToNumber(number2);
                int summaRom = calculate.calculate(text, num1Rom, num2Rom);
                if (!(summaRom < 1))
                    return convertNumToRoman.convertanNumToRom(summaRom);    //Вывод конвертируемого римского числа (ответа)

                else
                    throw new Exception("В римской системе нет отрицательных чисел и 0");
            } else
                throw new Exception("Используются оодновременно разные системы исчисления или неподходящие числа ");

        } else {
            if (arabRom.arabic(number1)) {
                if (arabRom.arabic(number2)) {
                    int num1 = Integer.parseInt(number1);  //пЕРВОЕ ЧИСЛО ПРЕОБРАЗУЕМ ИЗ СТРОКИ В ЦЕЛОЕ
                    int num2 = Integer.parseInt(number2);         // ВТОРОЕ ЧИСЛО
                    int summaInt = calculate.calculate(text, num1, num2);    //ВЫЧИСЛЯЕМ СУММУ ЦЕЛЫХ
                    return Integer.toString(summaInt);
                } else
                    throw new Exception("Используются оодновременно разные системы исчисления");
            } else
                throw new Exception("Используются неподходящие числа");
        }
    }
}
