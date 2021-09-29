import java.util.ArrayList;
import java.util.List;

public class HospitalSite implements Observable{
    private List<String> appointment= new ArrayList<>();
    private List<Observer> observers= new ArrayList<>();


    public void addAppointment(String appointment){
        this.appointment.add(appointment);
        notifyAllPatient();
    }
    public void removeAppointment(String appointment){
        this.appointment.remove(appointment);
        notifyAllPatient();
    }
    @Override
    public void appointmentObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyAllPatient() {
        for (Observer observer: observers){
            observer.update(this.appointment);
        }
    }

    @Override
    public void deleteAppointment(Observer observer) {
        this.observers.remove(observer);
    }
}
