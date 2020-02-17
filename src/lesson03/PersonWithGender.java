package lesson03;

public class PersonWithGender {
    String firstName, secondName;
    int age;
    Gender gender;

    public PersonWithGender(String firstName, String secondName, int age, Gender gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonWithGender that = (PersonWithGender) o;

        if (age != that.age) return false;
        if (!firstName.equals(that.firstName)) return false;
        if (!secondName.equals(that.secondName)) return false;
        return gender == that.gender;
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + secondName.hashCode();
        result = 31 * result + age;
        result = 31 * result + gender.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PersonWithGender{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static void main(String[] args) {
        PersonWithGender p1 = new PersonWithGender(
                "Ivan",
                "Ivanov",
                15,
                Gender.MALE);
        System.out.println(p1);
        System.out.println(p1.gender.getGender());
    }
}
