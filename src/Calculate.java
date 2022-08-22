class Calculate {
    public int calculate(String str, int num1, int num2) throws Exception {  //Принимает 2 числа и знак и возвращает сумму

        int x;
        if (str.contains("+")) {
            x = num1 + num2;
        } else if (str.contains("-")) {
            x = num1 - num2;
        } else if (str.contains("/")) {
            x = num1 / num2;
        } else if (str.contains("*")) {
            x = num1 * num2;
        } else {
            throw new Exception("строка не является математической операцией");
        }

        return x;
    }
}
