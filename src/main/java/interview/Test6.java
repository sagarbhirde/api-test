package interview;

public class Test6 {

    private static Test6 instance;

    private Test6(){

    }

    public static Test6 getInstance(){
        if(instance == null){
            instance= new Test6();
        }
        return instance;
    }

    public void main(String[] args) {
        Test6 test6 = Test6.this.getInstance();
        Test6 testnew = Test6.getInstance();
        Boolean result =test6==testnew;


    }

}
