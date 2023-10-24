import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static String[] eng = new String[3];
    static String[] uzb = new String[3];
    static int counter = 0;

    static String adminLogin = "admin";
    static String adminParol = "125232";

    static String userLogin = "user";
    static String userParol = "0777";


    public static void main(String[] args) {
        // menu
        // book - kitob
        // pencil - ruchka

        // 1.show words
        // 2.add words
        // 3.delete
        // 4.test
        registration();




    }


    public static void addWords(){
        if(counter==0){
            System.out.println();
            System.out.println("***ADD WORDS***");

            System.out.println("Qo'shmoqchi bo'lgan so'zni kiriting!");
            String[] addEng = new String[eng.length+2];
            String[] addUzb = new String[uzb.length+2];
            for(int i = 0; i < eng.length; i++){
                System.out.print(i+1 +") " +"English: ");
                Scanner scanner = new Scanner(System.in);
                eng[i] = scanner.next();
                System.out.print(i+1 +") " +"Uzbek: ");
                uzb[i] = scanner.next();

            }
            counter++;


            System.out.println("Belgilangan limitga yetib keldingiz!");
            System.out.print("Yana qo'shishni xoxlaysizmi? [ha/yoq]:  ");
            Scanner scanner = new Scanner(System.in);
            String receive = scanner.next();

//        String[] addEng = new String[eng.length+2];
//        String[] addUzb = new String[uzb.length+2];
            if(receive.equals("ha")){
                int q = eng.length;
                for(int i = 0; i < addEng.length; i++){
                    if(i>=q){
                        System.out.print(q+1 +") " +"English: ");
                        scanner = new Scanner(System.in);
                        addEng[q] = scanner.next();
                        System.out.print(q+1 +") " +"Uzbek: ");
                        addUzb[q] = scanner.next();
                        q++;
                    }
                    else{
                        addEng[i]= eng[i];
                        addUzb[i]= uzb[i];
                    }
                }
                eng = addEng;
                uzb = addUzb;
            }


            System.out.println();
            System.err.println("Asosiy menyuga chiqish uchun" + " [exit] yozing ");
            System.err.println("Dasturni yakunlash uchun [sleep] yozing");
            System.out.println();

            while(true){
                System.out.print("Kiriting: ");
                scanner = new Scanner(System.in);
                String something = scanner.next();
                if(something.equals("exit")){
                    mainMenu();
                }
                else if(something.equals("sleep")){
                    System.err.println("======ALVIDO======");
                    System.exit(0);
                }
                else{
                    System.err.println("Noto'g'ri amal kiritdingiz!");
                    System.out.println();
                }

            }
        }
        else{
            System.out.println("***ADD WORDS***");

            System.out.println("Qo'shmoqchi bo'lgan so'zni kiriting!");
            System.out.println("2 ta so'z qo'shishga ruhsat bor");
            System.out.println();
            String[] addEng = new String[eng.length+2];
            String[] addUzb = new String[uzb.length+2];
            Scanner scanner = new Scanner(System.in);
            int q = eng.length;
            for(int i = 0; i < addEng.length; i++){
                if(i>=q){
                    System.out.print(q+1 +") " +"English: ");
                    scanner = new Scanner(System.in);
                    addEng[q] = scanner.next();
                    System.out.print(q+1 +") " +"Uzbek: ");
                    addUzb[q] = scanner.next();
                    q++;
                }
                else{
                    addEng[i]= eng[i];
                    addUzb[i]= uzb[i];
                }
            }
            eng = addEng;
            uzb = addUzb;


//            System.out.println("Belgilangan limitga yetib keldingiz!");
//            System.out.println("Yana qo'shishni xoxlaysizmi? [ha/yoq]");

//        String[] addEng = new String[eng.length+2];
//        String[] addUzb = new String[uzb.length+2];


            System.out.println();
            System.err.println("Asosiy menyuga chiqish uchun" + " [exit] yozing ");
            System.err.println("Dasturni yakunlash uchun [sleep] yozing");
            System.out.println();

            while(true){
                System.out.print("Kiriting: ");
                scanner = new Scanner(System.in);
                String something = scanner.next();
                if(something.equals("exit")){
                    mainMenuAdmin();
                }
                else if(something.equals("sleep")){
                    System.err.println("======ALVIDO======");
                    System.exit(0);
                }
                else{
                    System.err.println("Noto'g'ri amal kiritdingiz!");
                    System.out.println();
                }

            }
        }



    }



    public static void showWordsUser(){
        System.out.println();
        System.out.println("***SHOW WORDS***");
        for(int i = 0; i < eng.length; i++){
            System.out.print((i+1) + ") "+ eng[i]+" - " + uzb[i] );
            System.out.println();
        }
        System.err.println("Asosiy menyuga chiqish uchun" + " [exit] yozing ");
        System.err.println("Dasturni yakunlash uchun [sleep] yozing");
        System.out.println();


        while(true){
            System.out.print("Kiriting: ");
            Scanner scanner = new Scanner(System.in);
            String something = scanner.next();
            if(something.equals("exit")){
                mainMenuUser();
            }
            else if(something.equals("sleep")){
                System.err.println("======ALVIDO======");
                System.exit(0);
            }
            else{
                System.err.println("Noto'g'ri amal kiritdingiz");
                System.out.println();
            }
        }
    }
    public static void activatedTests(){


        Random random = new Random();
        int m = random.nextInt(1, 3);



        if(m==1){
            System.out.println();
            String genENG[] = new String[eng.length];
            String genUZ[] = new String[uzb.length];
            genENG = eng;
            genUZ = uzb;

            String engAnswers[] = new String[4];
            String uzbAnswers[] = new String[4];
            String engAnswersSort[] = new String[4];
            String uzbAnswersSort[] = new String[4];
            for(int i = 0; i < 4; i++){
                int index = random.nextInt(genENG.length);
                uzbAnswers[i] = genUZ[index];
                uzbAnswersSort[i] = genUZ[index];
                engAnswersSort[i] = genENG[index];
                engAnswers[i] = genENG[index];


                String[] addEng = new String[genENG.length-1];
                String[] addUzb = new String[genUZ.length-1];
                int j = 0;
                for(int q = 0; q < addEng.length; q++){
                    if(genENG[q].equals(genENG[index]) || genUZ[q].equals(genENG[index])){
                        addEng[q]=genENG[j+1];
                        addUzb[q]=genUZ[j+1];
                        j = index+2;
                    }
                    else{
                        addEng[q]=genENG[j];
                        addUzb[q]=genUZ[j];
                        j++;
                    }
                }
                genENG = addEng;
                genUZ = addUzb;
            }

            Arrays.sort(engAnswersSort);
            Arrays.sort(uzbAnswersSort);


            String[] variants = {"a)", "b)", "c)", "d)"};
//            System.out.println(Arrays.toString(uzbAnswers));
//            System.out.println(Arrays.toString(engAnswersSort));
//            System.out.println(Arrays.toString(engAnswers));

            System.out.println("So'zning o'zbekchasini toping: " + engAnswers[0]);
            for(int i = 0; i < 4; i++){
                System.out.println(variants[i]+ uzbAnswersSort[i]);
            }
            System.out.print("Javobni kiriting: " );
            Scanner scanner = new Scanner(System.in);
            char receive = scanner.next().toCharArray()[0];
            switch (receive){
                case 'a':
                    if(uzbAnswersSort[0]== uzbAnswers[0]){
                        System.out.println("Barakalla, to'g'ri javob berdingiz :)");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    else{
                        System.out.println("Afsus, Noto'g'ri javob berdingiz :(");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    break;

                case 'b':
                    if(uzbAnswersSort[1]== uzbAnswers[0]){
                        System.out.println("Barakalla, to'g'ri javob berdingiz :)");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    else{
                        System.out.println("Afsus, Noto'g'ri javob berdingiz :(");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    break;

                case 'c':
                    if(uzbAnswersSort[2]== uzbAnswers[0]){
                        System.out.println("Barakalla, to'g'ri javob berdingiz :)");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    else{
                        System.out.println("Afsus, Noto'g'ri javob berdingiz :(");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    break;

                case 'd':
                    if(uzbAnswersSort[3]== uzbAnswers[0]){
                        System.out.println("Barakalla, to'g'ri javob berdingiz :)");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    else{
                        System.out.println("Afsus, Noto'g'ri javob berdingiz :(");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    break;

                default:
                    System.err.println("Noto'g'ri amal bajardingiz!");
                    mainMenuUser();
                    break;
            }

        }
        else if(m==2){
            System.out.println();
            String genENG[] = new String[eng.length];
            String genUZ[] = new String[uzb.length];
            genENG = eng;
            genUZ = uzb;

            String engAnswers[] = new String[4];
            String uzbAnswers[] = new String[4];
            String uzbAnswersSort[] = new String[4];
            String engAnswersSort[] = new String[4];
            for(int i = 0; i < 4; i++){
                int index = random.nextInt(genENG.length);
                uzbAnswers[i] = genUZ[index];
                uzbAnswersSort[i] = genUZ[index];
                engAnswersSort[i] = genENG[index];
                engAnswers[i] = genENG[index];
                String[] addEng = new String[genENG.length-1];
                String[] addUzb = new String[genUZ.length-1];
                int j = 0;
                for(int q = 0; q < addEng.length; q++){
                    if(genENG[q].equals(genENG[index]) || genUZ[q].equals(genENG[index])){
                        addEng[q]=genENG[j+1];
                        addUzb[q]=genUZ[j+1];
                        j = index+2;
                    }
                    else{
                        addEng[q]=genENG[j];
                        addUzb[q]=genUZ[j];
                        j++;
                    }
                }
                genENG = addEng;
                genUZ = addUzb;
            }

            Arrays.sort(uzbAnswersSort);
            Arrays.sort(engAnswersSort);


            String[] variants = {"a)", "b)", "c)", "d)"};
//                System.out.println(Arrays.toString(uzbAnswers));
//                System.out.println(Arrays.toString(engAnswers));
//                System.out.println(Arrays.toString(engAnswersSort));
//                System.out.println(Arrays.toString(uzbAnswersSort));

            System.out.println("So'zning inglizchasini toping: " + uzbAnswers[0]);
            for(int i = 0; i < 4; i++){
                System.out.println(variants[i]+ engAnswersSort[i]);
            }
            System.out.print("Javobni kiriting: " );
            Scanner scanner = new Scanner(System.in);
            char receive = scanner.next().toCharArray()[0];
            switch (receive){
                case 'a':
                    if(engAnswersSort[0]== engAnswers[0]){
                        System.out.println("Barakalla, to'g'ri javob berdingiz :)");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    else{
                        System.out.println("Afsus, Noto'g'ri javob berdingiz :(");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    break;

                case 'b':
                    if(engAnswersSort[1]== engAnswers[0]){
                        System.out.println("Barakalla, to'g'ri javob berdingiz :)");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    else{
                        System.out.println("Afsus, Noto'g'ri javob berdingiz :(");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    break;

                case 'c':
                    if(engAnswersSort[2]== engAnswers[0]){
                        System.out.println("Barakalla, to'g'ri javob berdingiz :)");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    else{
                        System.out.println("Afsus, Noto'g'ri javob berdingiz :(");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    break;

                case 'd':
                    if(engAnswersSort[3]== engAnswers[0]){
                        System.out.println("Barakalla, to'g'ri javob berdingiz :)");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    else{
                        System.out.println("Afsus, Noto'g'ri javob berdingiz :(");
                        System.out.print("Davom etasizmi?  [ha/yoq]: ");
                        String qabul = scanner.next();
                        if(qabul.equals("ha")){
                            activatedTests();
                        }
                        else{
                            mainMenuUser();
                        }
                    }
                    break;
                default:
                    System.err.println("Noto'g'ri amal bajardingiz!");
                    mainMenuUser();
                    break;
            }
        }

    }

    public static void showWordsAdmin(){
        System.out.println();
        System.out.println("***SHOW WORDS***");
        for(int i = 0; i < eng.length; i++){
            System.out.print((i+1) + ") "+ eng[i]+" - " + uzb[i] );
            System.out.println();
        }
        System.err.println("Asosiy menyuga chiqish uchun" + " [exit] yozing ");
        System.err.println("Dasturni yakunlash uchun [sleep] yozing");
        System.out.println();


        while(true){
            System.out.print("Kiriting: ");
            Scanner scanner = new Scanner(System.in);
            String something = scanner.next();
            if(something.equals("exit")){
                mainMenuAdmin();
            }
            else if(something.equals("sleep")){
                System.err.println("======ALVIDO======");
                System.exit(0);
            }
            else{
                System.err.println("Noto'g'ri amal kiritdingiz");
                System.out.println();
            }
        }
    }


    public static void deleteWords(){
        System.out.println();
        System.out.println("***DELETE WORDS***");
        System.out.println("O'chirmoqchi bo`lgan so'zingizni kiriting [EN/UZ]");
        Scanner scanner = new Scanner(System.in);
        System.out.print("So'zni kiriting: ");
        String receive = scanner.next();
        int forDel = 0;
        int count = -2;
        for(int i = 0; i < eng.length; i++){
            if(uzb[i].equals(receive) || eng[i].equals(receive)){
                System.out.println("["+receive+ "] - so'zi, lug'atning ichidan topildi va muvaffaqiyatli o'chirildi :)");
                forDel++;
                count = i;
                break;
            }

        }
        if(forDel>0){
            String[] addEng = new String[eng.length-1];
            String[] addUzb = new String[uzb.length-1];

            for(int i = 0, j=0; i < addEng.length; i++, j++){
                if(eng[i].equals(receive) || uzb[i].equals(receive)){
                    j++;
                }
                    addEng[i]=eng[j];
                    addUzb[i]=uzb[j];
            }
            eng = addEng;
            uzb = addUzb;


        }
        else{
            System.out.println("["+receive+ "] - so'zi, lug'atning ichidan topilmadi :(");
            System.out.println("Qaytatdan urinib ko`ring!");
            System.out.println();
            deleteWords();
        }



    }


    public static void testWords(){
        System.out.println();
        System.out.println("***TEST WORDS***");
        Random random = new Random();
        int n = random.nextInt(uzb.length);
        int m = random.nextInt(1, 3);  //1 - english   2-uzbek
        int correctCount = 0;

        if (m==1){
            System.out.print("["+ eng[n] + "] - so'zning o'zbekchasini toping: ");
            Scanner scanner = new Scanner(System.in);
            String receive = scanner.next();
            for(int i = 0; i < eng.length; i++){
                if(eng[i].equals(receive) || uzb[i].equals(receive)){
                    correctCount++;
                }
            }
            if(correctCount>0){
                System.out.println("Barakalla, to'g'ri javob berdingiz :)");
                System.out.print("O'yinni davom ettirasizmi? [ha/yoq]:  ");
                scanner = new Scanner(System.in);
                String answer = scanner.next();
                if(answer.equals("ha")){
                    testWords();
                }
                else{
                    mainMenuUser();
                }
            }
            else{
                System.err.println("Noto'g'ri javob berdingiz, Boshqa savollarga urinib ko'ring.");
                System.out.println();
                testWords();
            }
        }
        else if(m==2){
            System.out.print("["+ uzb[n] + "] - so'zning inglizchasini toping: ");
            Scanner scanner = new Scanner(System.in);
            String receive = scanner.next();
            for(int i = 0; i < eng.length; i++){
                if(eng[i].equals(receive) || uzb[i].equals(receive)){
                    correctCount++;
                }
            }
            if(correctCount>0){
                System.out.println("Barakalla, to'g'ri javob berdingiz :)");
                System.out.println("O'yinni davom ettirasizmi? [ha/yoq]");
                scanner = new Scanner(System.in);
                String answer = scanner.next();
                if(answer.equals("ha")){
                    testWords();
                }
                else{
                    mainMenuUser();
                }
            }
            else{
                System.out.println("Noto'g'ri javob berdingiz, Boshqa savollarga urinib ko'ring.");
                System.out.println();
                testWords();
            }
        }


    }







    public static void registration(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***REGISTRATION***");
        System.out.print("Loginni kiriting: ");
        String login = scanner.next();
        System.out.println();
        System.out.print("Parolni kiriting: ");
        String parol = scanner.next();

        if(login.equals(adminLogin) && parol.equals(adminParol)){
            System.out.println("***ADMIN MENUGA XUSH KELIBSIZ***");
            mainMenuAdmin();
        }
        else if(login.equals(userLogin) && parol.equals(userParol)){
            System.out.println("***USER MENUGA XUSH KELIBSIZ***");
            mainMenuUser();
        }
        else{
            System.err.println("Login yoki parolni xato kiritdingiz!!!");
            System.out.println("Qaytatdan urinib ko'ring!");
            System.out.println();
            registration();

        }
    }

    public static void mainMenuUser(){
        while(true){
            System.out.println("|--------------------------|");
            System.out.println("| (:WELCOME TO TRANSLATE:) |");
            System.out.println("|  >>>MAIN MENU<<<         |");
            System.out.println("| 1 - Show words           |");
            System.out.println("| 2 - Test words           |");
            System.out.println("| 3 - Activated tests      |");
            System.out.println("| 4 - Back to registration |");
            System.out.println("| 5 - Sleep the programm   |");
            System.out.println("|__________________________|");

            System.out.println();

            System.out.print("Tanlang: ");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    showWordsUser();
                    break;


                case 2:
                    testWords();
                    break;

                case 3:
                    activatedTests();
                    break;


                case 4:
                    registration();
                    break;

                case 5:
                    System.err.println("======ALVIDO======");
                    System.exit(0);

                default:
                    System.err.println("Noto'g'ri amal bajardingiz!");

            }
        }
    }



    public static void mainMenuAdmin(){
        while(true){
            System.out.println("|--------------------------|");
            System.out.println("| (:WELCOME TO TRANSLATE:) |");
            System.out.println("|  >>>MAIN MENU<<<         |");
            System.out.println("| 1 - Add words            |");
            System.out.println("| 2 - Show words           |");
            System.out.println("| 3 - Delete words         |");
            System.out.println("| 4 - Back to registration |");
            System.out.println("| 5 - Sleep the programm   |");
            System.out.println("|__________________________|");

            System.out.println();

            System.out.print("Tanlang: ");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    addWords();
                    break;

                case 2:
                    showWordsAdmin();
                    break;

                case 3:
                    deleteWords();
                    break;

                case 4:
                    registration();
                    break;

                case 5:
                    System.err.println("======ALVIDO======");
                    System.exit(0);

                default:
                    System.err.println("Noto'g'ri amal bajardingiz!");


            }
        }
    }

    public static void mainMenu(){
        while(true){
            System.out.println("|--------------------------|");
            System.out.println("| (:WELCOME TO TRANSLATE:) |");
            System.out.println("|  >>>MAIN MENU<<<         |");
            System.out.println("| 1 - Add words            |");
            System.out.println("| 2 - Show words           |");
            System.out.println("| 3 - Delete words         |");
            System.out.println("| 4 - Test words           |");
            System.out.println("| 5 - Sleep the programm   |");
            System.out.println("|__________________________|");

            System.out.println();

            System.out.print("Tanlang: ");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    addWords();
                    break;

                case 2:
                    showWordsAdmin();
                    break;

                case 3:
                    deleteWords();
                    break;

                case 4:
                    testWords();
                    break;

                case 5:
                    System.err.println("======ALVIDO======");
                    System.exit(0);

            }
        }
    }


}