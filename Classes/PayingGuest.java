package Classes;

public class PayingGuest {
    enum PayingGuestType{BOYS,GIRLS,UNISEX}

    private boolean admissionOpen;
    private String foodForToday;
    private byte vacancy;

    short id;
    String name;
    long contactNumber;
    String address;
    String emailId;
    String website;
    PayingGuestType type;

    public PayingGuest(boolean admissionOpen, String foodForToday, byte vacancy,
                       short id, String name, long contactNumber, String address,
                       String emailId, String website, PayingGuestType type) {
        this.admissionOpen = admissionOpen;
        this.foodForToday = foodForToday;
        this.vacancy = vacancy;
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
        this.emailId = emailId;
        this.website = website;
        this.type = type;
    }

    public void setAdmissionOpen(boolean admissionOpen) {
        this.admissionOpen = admissionOpen;
    }

    public void setFoodForToday(String foodForToday) {
        this.foodForToday = foodForToday;
    }

    public void setVacancy(byte vacancy) {
        this.vacancy = vacancy;
    }

    boolean admission(){
        return admissionOpen;
    }

    String food(){
        return foodForToday;
    }

    boolean vacancy(byte vacancy){
        return this.vacancy >= vacancy;
    }
}
