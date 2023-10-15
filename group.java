import java.util.*;

public class group{
    private int group_count;
    private int capacity;
    private String UW_ID;

    public group(int capacity, String ID){
        this.capacity = 0;
        this.UW_ID = ID;
        group_count++;

    }

    public void delete_group(int capacity){
        capacity = 0;
        group_count--;
    }

}