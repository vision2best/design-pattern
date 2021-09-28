package design.prototype;

/**
 * @author : zhanghuang
 * @date : 2021-09-27 3:14 下午
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;//这里需要注意对象浅copy 和深拷贝

    public Resume() {
    }

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    public void setPersonInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public Resume(WorkExperience workExperience) throws CloneNotSupportedException {
        this.workExperience = workExperience.clone();
    }

    public void setWorkExperience(String timeArea, String company) {
        workExperience.setTimeArea(timeArea);
        workExperience.setCompany(company);
    }

    public void display() {
        System.out.println("Resume");
        System.out.println("姓名：" + name);
        System.out.println("性别：" + sex);
        System.out.println("年龄：" + age);
        System.out.println("工作经历：" + workExperience.getTimeArea() + "：" + workExperience.getCompany());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public Resume clone() throws CloneNotSupportedException {
        Resume resume = new Resume(this.workExperience);
        resume.name = this.name;
        resume.sex = this.sex;
        resume.age = this.age;
        return resume;
    }
}
