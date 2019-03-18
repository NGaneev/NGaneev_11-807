class KnuthMorrisPratt {
    static int count; //каунтер итераций

    //Метод создающий массив Pi
    static int[] prefixFunction(String pattern) {
        int[] p = new int[pattern.length()];//Длина массива Pi = длине образа без пробелов

        int k = 0;//k - значение обозначающее префикс и суффикс максимальной длины образа

        //Цикл заполняет массив Pi
        //По дефолту первое значение префикс функции равно 0,поэтому начинаем заполнять массив с индекса "1"
        //Если символ с индексом k совпадает с символом с индексом i,значение k увеличивается на одну единицу и выполняется цикл еще раз
        //Если символы не совпадают,Pi[i] = 0
        for (int i = 1; i < pattern.length(); i++) {
            while (k > 0 && pattern.charAt(k) != pattern.charAt(i))
                k = p[k - 1];
            if (pattern.charAt(k) == pattern.charAt(i))
                ++k;
            p[i] = k;
        }
        return p;
    }

    //Метод с алгоритмом КМП
    static long kmpMatcher(String s, String pattern) {

        //Если образ пуст,возвращается 0
        int m = pattern.length();
        if (m == 0)
            return 0;

        //Массив Pi,который был выше позволяет избежать лишних сравнений
        int[] p = prefixFunction(pattern);
        for (int i = 0, k = 0; i < s.length(); i++)
            for (; ; k = p[k - 1]) {
                if (pattern.charAt(k) == s.charAt(i)) {
                    count++;//увеличение счетчика итераций на одну единицу
                    if (++k == m) //в случае совпадения k и длины образа,алгоритм останавливается,т.к. это значит,что образ найден
                        return i + 1 - m;
                    break;
                }
                if (k == 0)
                    break;
            }
            return -1;
    }
}


