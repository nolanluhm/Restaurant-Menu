package restaurant;

import java.util.ArrayList;
import java.util.Calendar;

public class Menu {

    private String restaurantName;
    private ArrayList<MenuItem> appetizers = new ArrayList<>();
    private ArrayList<MenuItem> mainCourse = new ArrayList<>();
    private ArrayList<MenuItem> dessert = new ArrayList<>();
    private Calendar lastUpdated;

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public ArrayList<MenuItem> getAppetizers() {
        return appetizers;
    }

    public void setAppetizers(ArrayList<MenuItem> appetizers) {
        this.appetizers = appetizers;
    }

    public ArrayList<MenuItem> getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(ArrayList<MenuItem> mainCourse) {
        this.mainCourse = mainCourse;
    }

    public ArrayList<MenuItem> getDessert() {
        return dessert;
    }

    public void setDessert(ArrayList<MenuItem> dessert) {
        this.dessert = dessert;
    }

    public Calendar getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Calendar lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
