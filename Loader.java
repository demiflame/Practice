
import java.util.Scanner;

public class Loader
{
    public static void main(String[] args)
    {
        Cat shrek = new Cat();
        shrek.setCatColour(Colours.RED);
        Cat vasya = new Cat();
        vasya.setCatColour(Colours.BLACK);
        Cat murka = new Cat();
        murka.setCatColour(Colours.GREY);
        Cat cat = new Cat();
        System.out.println(Cat.getCount());
        vasya.meow();
        shrek.meow();
        System.out.println(vasya.getWeight());
        System.out.println(shrek.getWeight());
        System.out.println(murka.getWeight());
        System.out.println(cat.getWeight());
        System.out.println(Cat.getCount() + Cat.getCountDead()) ;

    }
}
/* Scanner name = new Scanner(System.in);
        System.out.println("\tНазовите кота:");

        String catName;
        catName = name.nextLine();
        System.out.println("Имя кота: " + catName);
        new Cat(catName);

        System.out.println(catName + " весит " + Cat.getWeight());
        System.out.println(Cat.getStatus());

        Scanner watToDo = new Scanner(System.in);
        System.out.println("\tПокормить - 1 \n\tДать воды - 2 \n\tПокакац - 3");
        int varIn = watToDo.nextInt();
        if(varIn == 1){
            Cat.catFeed();
            System.out.println("Вес кота: " + Cat.getWeight());
        }
        else if( varIn == 2){
            Cat.drink(50.0);
        }
        else {
            Cat.poop(75.0);
        }*/