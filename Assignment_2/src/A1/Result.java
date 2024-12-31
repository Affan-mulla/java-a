package A1;

public class Result extends Test implements Sports {
    int total;
    public void putSports() {
        System.out.println("Sports Marks : "+sp_marks);        
    }

    void display() {
        total = sub1 + sub2 + sp_marks;
        putData();
        putMarks();
        putSports();
        System.out.println("Total Marks: "+total);
    }

    

}
    

