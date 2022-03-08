package studentsManage;

public class student {
    private String sid;
    private String age;
    private String name;
    private String address;

    public  student(){}

    public student(String sid, String age, String name, String address) {
        this.sid = sid;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
