package lesson03;

public enum Gender {
    FEMALE("Female"),
    MALE("male");



    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
