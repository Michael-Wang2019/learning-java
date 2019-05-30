public class mathrandoms {
    public static void main(String[] args) {
        double randNum = 0;

        while (randNum < 0.5) {
            randNum = Math.random(); //得到一个随机的数
            System.out.println(randNum);
        }
        System.out.println("get a Num " + randNum);

        int rangeStart = 30;
        int rangeEnd = 31;

        int mod = rangeEnd - rangeStart;

        if(mod<=1){
            System.out.println("非法的数字范围"+rangeStart+'\t'+rangeEnd);
        }


        for (int i = 0; i < 50; i++) {
            int bigRandom = (int) (Math.random() * (rangeEnd * 100));

            int numberToGuess = (bigRandom % mod) + rangeStart;

            if (numberToGuess <= rangeStart){
                numberToGuess = rangeStart +1;
            } else if (numberToGuess > rangeEnd){
                numberToGuess = rangeEnd -1;
            }

            System.out.println("mod= " + mod + ",bigRandom=" + bigRandom);
        }
    }
}
