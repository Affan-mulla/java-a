package A1;

public class Test extends Student8 {
    int sub1,sub2;

    void getMarks(int s1,int s2){
        this.sub1 = s1;
        this.sub2 = s2;
    }

    void putMarks(){
        System.out.println("Subject 1 :"+sub1);
        System.out.println("Subject 2 :"+sub2);
    }
}
