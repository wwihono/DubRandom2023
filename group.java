import java.util.*;

public class group{
    private int group_count;
    private int capacity;
    private int maxCap;
    private String UW_ID;
    private String activity;

    public group(int capacity, String ID, String activity, int max){
        this.capacity = 0;
        this.UW_ID = ID;
        this.activity = activity;
        this.maxCap = max;
        group_count++;

    }

    public void delete_group(int capacity){
        capacity = 0;
        group_count--;
    }
    
    public void join_group(){
        capacity++;
    }

}
