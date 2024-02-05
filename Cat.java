public class Cat {
    private double originWeight;
    private double weight;
    private double foodWeigh;

    private double minWeight;
    private double maxWeight;
    private final int eyes = 2;
    private final int ears = 2;

    private boolean catPoop;

    private static int count = 0;
    private static int countDead;

    public Cat() {

        weight = (int) 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1500;
        maxWeight = 8000;

        catPoop = Math.random() > 0.5;
        count ++;
    }
public void setCatColour(Colours colours) {}
    public void meow() {
        weight = minWeight - 1;
        System.out.println("Meow");
        countDead--;
    }
    public static int getCount()
    {
        return count;
    }

    public void setCountDead() {
        if (weight < minWeight)
            countDead--;
        else if (weight > maxWeight)
            countDead--;
    }

    public static int getCountDead() {
        return countDead;
    }
    public void feed(Double amount) {
        weight = weight + amount;
        System.out.println("Кушает: " + amount + " ед.");
    }
    public void drink(Double amount) {
        weight += amount;
       /* System.out.println("Чел пьет:" + amount + "ед.");*/
    }
    public void poop(Double amount) {
        weight = weight - amount;
        System.out.println("Покакал и теперь весит " + weight );
    }
    public double getWeight()
    {
        return weight;
    }
    public void foodWeigh()
    {
        this.foodWeigh = getWeight() - weight;
    }
    public double getFoodWeigh()
    {
        return foodWeigh;
    }
    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

}
 /*   public static void catFeed()
    {
        Scanner count = new Scanner(System.in);
        System.out.println("Сколько раз покормить кота?");
        int feedTimes = count.nextInt();

        if(feedTimes > 1 && feedTimes < 5)
            System.out.println("Вы покормили кота " + feedTimes + " раза");
        else if (feedTimes <= 10 && feedTimes > 4)
            System.out.println("Вы покормили кота " + feedTimes + " раз");
        else
            System.out.println("Вы покормили кота " + feedTimes + " раз");
    }*/