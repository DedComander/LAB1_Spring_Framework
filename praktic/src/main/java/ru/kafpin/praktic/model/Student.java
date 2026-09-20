package ru.kafpin.praktic.model;

public class Student {
    private long id;
    private String name;
    private String lastName;
    private String patronymic;
    private String email;
    private int admissionYear;

    public Student() {}

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPatronymic() { return patronymic; }
    public void setPatronymic(String patronymic) { this.patronymic = patronymic; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getAdmissionYear() { return admissionYear; }
    public void setAdmissionYear(int admissionYear) { this.admissionYear = admissionYear; }


    public String getGroup() {
        String year = String.valueOf(admissionYear);
        String lastTwo = year.length() >= 2
                ? year.substring(year.length() - 2)
                : String.format("%02d", admissionYear);
        return "ПИН-1" + lastTwo;
    }

    // Логин: student-<группа латиницей без дефиса>-<id>
    public String getLogin() {
        String group = getGroup().toLowerCase()
                .replace("п", "p")
                .replace("и", "i")
                .replace("н", "n")
                .replace("-", "");
        return "student-" + group + "-" + id;
    }
}
