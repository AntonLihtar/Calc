import java.util.Scanner;

class Calc {


    public static void main(String[] args) throws Exception {

            System.out.println("ВВедите выражение из целых арабских или римских чисел:");
            Scanner scan = new Scanner(System.in);     // ввод с клавы
            String text = scan.nextLine();// строка текст с консоли
            String[] str = text.split("[+-/*]"); //вытаскиваем значение[0] и [1]

            if (!(str.length == 2))      // ПРОВЕРЯЕМ чтобы в массиве было 2 знака
                throw new Exception("формат математической операции не удовлетворяет заданию - два целых операнда и один оператор (+, -, /, *)");
            String number1 = str[0], number2 = str[1];
            Summa summa = new Summa();
            System.out.println(summa.summa(text, number1, number2));


    }


}

