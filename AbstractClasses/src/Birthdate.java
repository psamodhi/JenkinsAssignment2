public interface Birthdate {

    // every filed in an interface is going to be static and final
    // that means the same values apply to every class, that implements this interface
    // daarom is abstarct class hangier soms
    int date = 6;  // bij interfaces ben je verplicht variables te initialize
    void printBirthday();
}
