package ArockiaMatha;

public class StudentNotFoundException extends RuntimeException{
    public String message;
    StudentNotFoundException(){

    }StudentNotFoundException(String m){
        super(m);
        this.message=m;
    }

}
