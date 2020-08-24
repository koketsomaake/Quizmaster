package Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Recruit {
    @Id
    @GeneratedValue
    private long recruitId;

    @Column
    private String recruitName;
    @Column
    private String recruitSurname;
    @Column
    private String recruitDepartment;
    @Column
    private String recruitEmail;
    @Column
    private String recruitPassword;

    @ManyToOne
    Department department;

    @ManyToOne
    Admin admin;

    @ManyToMany
    private List<Quiz> quiz;


    public long getRecruitId() {
        return recruitId;
    }

    public void setRecruitId(long recruitId) {
        this.recruitId = recruitId;
    }

    public String getRecruitName() {
        return recruitName;
    }

    public void setRecruitName(String recruitName) {
        this.recruitName = recruitName;
    }

    public String getRecruitSurname() {
        return recruitSurname;
    }

    public void setRecruitSurname(String recruitSurname) {
        this.recruitSurname = recruitSurname;
    }

    public String getRecruitDepartment() {
        return recruitDepartment;
    }

    public void setRecruitDepartment(String recruitDepartment) {
        this.recruitDepartment = recruitDepartment;
    }

    public String getRecruitEmail() {
        return recruitEmail;
    }

    public void setRecruitEmail(String recruitEmail) {
        this.recruitEmail = recruitEmail;
    }

    public String getRecruitPassword() {
        return recruitPassword;
    }

    public void setRecruitPassword(String recruitPassword) {
        this.recruitPassword = recruitPassword;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Quiz> getQuiz() {
        return quiz;
    }

    public void setQuiz(List<Quiz> quiz) {
        this.quiz = quiz;
    }
}
