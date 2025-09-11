public class Main {
    public static void main(String[]args){
        int age;
        double note;
        float temperature;
        char charactere;
        String phrase;

        final int TEMPERATURE_EBULITION;
        TEMPERATURE_EBULITION=100;
        //TEMPERATURE_EBULITION=102;
        age=18;//Nombre entier
        note=87.5;//.5 ect..
        temperature=22.7f;//f précise que c'est un float
        charactere='$';//Dois être un seul charactere
        phrase="Bonjour";//VARCHAR

        System.out.println(TEMPERATURE_EBULITION);
        System.out.println("Age de l'individu est "+age);
        //Opération dans l'affichage
        System.out.println("Somme égale à "+(10009%10));
        System.out.println("La note de l'individu est "+note);
        System.out.println("La temperature est de "+temperature);
        System.out.println("Tu aime le "+charactere);
        System.out.println("Au revoir "+phrase);

        Boolean succes;
        succes=Boolean.TRUE;

        double moyEx;
        double moyTp;

        moyTp=69;
        moyEx=49;

        if(moyEx>=50&&moyTp>=50){
            System.out.println("Bravo");
        }else{
         System.out.println("Echec");
         }


    }
};
