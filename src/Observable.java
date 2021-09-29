public interface Observable {
    void appointmentObserver(Observer observer);
    void notifyAllPatient();
    void deleteAppointment(Observer observer);
}
