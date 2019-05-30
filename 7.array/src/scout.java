public class scout {
    public static void main(String[] args) {

        int yuwen = 0;
        int shuxue = 1;
        int waiyu = 2;
        int wuli = 3;
        int huaxue = 4;
        int shengwu = 5;

        int totalscorecount = 6;
        double[] scores = new double[totalscorecount];

        String[] scoreNames = new String[totalscorecount];

        scoreNames[yuwen] = "语文";
        scoreNames[shuxue] = "数学";
        scoreNames[waiyu] = "外语";
        scoreNames[wuli] = "物理";
        scoreNames[huaxue] = "化学";
        scoreNames[shengwu] = "生物";

        for (int i = 0; i < totalscorecount; i++) {
            scores[i] = 80 + Math.random() * 20;
            System.out.println(scoreNames[i] + "score name: " + scores[i]);

        }

        double maxScore = 0;
        int maxScoreIndex = -1;

        for (int i = 0; i < totalscorecount; i++){
            if (scores[i] > maxScore){
                maxScore = scores[i];
                maxScoreIndex = i;
            }
        }

        System.out.println("the higer score is " + scoreNames[maxScoreIndex]+":"+maxScore);


    }
}
