public class Main {
    public static void main(String[] args) {
        HospitalSite site = new HospitalSite();

        patient p = new patient("Aibek");
        site.appointmentObserver(p);

        site.addAppointment("11:30");
        site.addAppointment("12:30");

        site.removeAppointment("11:30");

    }
}
