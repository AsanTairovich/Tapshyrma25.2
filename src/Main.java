import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<City> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Код жазыныз");
        City city=new City(12,"New York");
        list.add(new City(scanner.nextInt(), "Bishkek"));
        list.add(new City(scanner.nextInt(), "Bishkek"));
        list.add(new City(scanner.nextInt(), "Bishkek"));
        list.add(new City(scanner.nextInt(), "Bishkek"));
        list.add(new City(scanner.nextInt(), "Bishkek"));
        TreeSet<City> treeSet = new TreeSet<>(city.cityComparator);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getCode()%2==1){
                treeSet.add(list.get(i));
            }
        }
        System.out.println(treeSet);
    }
}