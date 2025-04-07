package ie.atu.week12;

public class Patient {
    private String givenName;
    private String familyName;
    private String hseNumber;
    private int age;

    public Patient(String givenName, String familyName, String hseNumber, int age)
    {
        if (givenName == null || givenName.length() <= 2)
        {
            throw new IllegalArgumentException("Invalid given name length.");
        }
        if (familyName == null || familyName.length() <= 2)
        {
            throw new IllegalArgumentException("Invalid family name length.");
        }
        if (hseNumber == null || hseNumber.length() != 10)
        {
            throw new IllegalArgumentException("Invalid HSE number length.");
        }
        if (age < 0 || age > 120)
        {
            throw new IllegalArgumentException("Invalid age.");
        }
        this.givenName = givenName;
        this.familyName = familyName;
        this.hseNumber = hseNumber;
        this.age = age;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getHseNumber() {
        return hseNumber;
    }

    public void setHSENumber(String hseNumber) {
        this.hseNumber = hseNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
