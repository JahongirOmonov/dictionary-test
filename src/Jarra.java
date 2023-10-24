import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Jarra {
    static String[] eng = {"mouse", "car", "book", "apple", "water", "autumn", "winter"};
    static String[] uzb = {"sichqon", "mashina", "kitob", "olma", "suv", "kuz", "qish"};
    public static void main(String[] args) {
        activatedTests();

    }

    public static void activatedTests(){

        Random random = new Random();
        int m = random.nextInt(1, 2);



        if(m==1){
            String engAnswers[] = new String[4];
            String uzbAnswers[] = new String[4];
            String uzbAnswersSort[] = new String[4];
            for(int i = 0; i < 4; i++){
                int index = random.nextInt(eng.length);
                uzbAnswers[i] = uzb[index];
                uzbAnswersSort[i] = uzb[index];
                engAnswers[i] = eng[index];
                String[] addEng = new String[eng.length-1];
                String[] addUzb = new String[uzb.length-1];
                int j = 0;
                for(int q = 0; q < addEng.length; q++){
                    if(eng[q].equals(eng[index]) || uzb[q].equals(eng[index])){
                        addEng[q]=eng[j+1];
                        addUzb[q]=uzb[j+1];
                        j = index+2;
                    }
                    else{
                        addEng[q]=eng[j];
                        addUzb[q]=uzb[j];
                        j++;
                    }
                }
                eng = addEng;
                uzb = addUzb;
            }

            Arrays.sort(uzbAnswersSort);


            String[] variants = {"a)", "b)", "c)", "d)"};
            System.out.println(Arrays.toString(uzbAnswers));
            System.out.println(Arrays.toString(uzbAnswersSort));
            System.out.println(Arrays.toString(engAnswers));

            System.out.println("So'zning o'zbekchasini toping: " + engAnswers[0]);
            for(int i = 0; i < 4; i++){
                System.out.println(variants[i]+ uzbAnswersSort[i]);
            }
            System.out.println();
            System.out.print("Javobni kiriting: " );
            Scanner scanner = new Scanner(System.in);
            char receive = scanner.next().toCharArray()[0];
            switch (receive){
                case 'a':
                    if(uzbAnswersSort[0]== uzbAnswers[0]){
                        System.out.println("Barakalla, to'g'ri javob berdingiz :)");
                    }
                    else{
                        System.out.println("Afsus, Noto'g'ri javob berdingiz :(");
                    }
                    break;

                case 'b':
                    if(uzbAnswersSort[1]== uzbAnswers[0]){
                        System.out.println("Barakalla, to'g'ri javob berdingiz :)");
                    }
                    else{
                        System.out.println("Afsus, Noto'g'ri javob berdingiz :(");
                    }
                    break;

                case 'c':
                    if(uzbAnswersSort[2]== uzbAnswers[0]){
                        System.out.println("Barakalla, to'g'ri javob berdingiz :)");
                    }
                    else{
                        System.out.println("Afsus, Noto'g'ri javob berdingiz :(");
                    }
                    break;

                case 'd':
                    if(uzbAnswersSort[3]== uzbAnswers[0]){
                        System.out.println("Barakalla, to'g'ri javob berdingiz :)");
                    }
                    else{
                        System.out.println("Afsus, Noto'g'ri javob berdingiz :(");
                    }
                    break;
            }





        }
















    }
}
