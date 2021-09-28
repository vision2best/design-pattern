package design.prototype;

/**
 * @author : zhanghuang
 * @date : 2021-09-27 5:01 下午
 */
public class WorkExperience implements Cloneable{
    private String timeArea;
    private String company;

    public WorkExperience() {
    }

    public WorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected WorkExperience clone() throws CloneNotSupportedException {
        return (WorkExperience) super.clone();
    }
}
