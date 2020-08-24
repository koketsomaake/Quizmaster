package Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Department")
public class Department {

    @Id
    @Column(name="Department_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;

    @Column(name = "NAME")
    private String departmentName;

    @OneToOne
    Admin admin;

    @OneToMany
    private List<Recruit> recruits;

    @ManyToMany
    private List<Quiz> quiz;

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Recruit> getRecruits() {
        return recruits;
    }

    public void setRecruits(List<Recruit> recruits) {
        this.recruits = recruits;
    }

    public List<Quiz> getQuiz() {
        return quiz;
    }

    public void setQuiz(List<Quiz> quiz) {
        this.quiz = quiz;
    }
}