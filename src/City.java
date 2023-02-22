import java.util.Comparator;

public class City {
    private int code;
    private String name;

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }



            Comparator<City> cityComparator = new Comparator<City>() {
                @Override
                public int compare(City o1, City o2) {
                    return o2.code- o1.code;
                }
            };

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
