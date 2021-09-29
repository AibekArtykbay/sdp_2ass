import java.util.List;

public class patient implements Observer {
private String Name;
public patient(String Name){
    this.Name=Name;

}

    @Override
    public void update(List<String> appointment) {
        System.out.println("Hi" + Name + "we have a free appointment  to " + appointment);
    }
}
