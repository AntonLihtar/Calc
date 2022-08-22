class ArabRom {
    public boolean arabic(String number) {          //проверяет число на значение от1 до 10
        String[] arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};   ///и возвращает тру или исключение
        for (String sxs : arabic) {
            if (!number.equals(sxs))
                continue;
            return true;
        }
        return false;
    }

    public boolean roman(String number) {          //проверяет число на значение от1 до 10
        String rom = "I,II,III,IV,V,VI,VII,VIII,IX,X";   ///и возвращает тру
        return (rom.contains(number));
    }
}
