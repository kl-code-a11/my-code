package test;

public class UpdateStu implements Comparable<Object>{
    String name;
    long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UpdateStu(String name, long id) {
        this.name = name;
        this.id = id;
    }
    public  int compareTo(Object o){
        UpdateStu upstu =(UpdateStu)o;
        int result=id>upstu.id?1:(id== upstu.id?0:-1);
        return result;
    }
}
