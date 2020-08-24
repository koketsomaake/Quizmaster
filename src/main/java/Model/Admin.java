package Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Admin")
public class Admin {

    @Id
    @Column(name="Admin_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long adminId;

    @Column(name = "NAME")
    private String adminName;

    @Column(name = "SURNAME")
    private String adminSurname;

    @Column(name = "DEPARTMENT")
    private String adminDepartment;

    @Column(name = "Password")
    private String adminPassword;

    @OneToMany
     Recruit recruits;

    @OneToMany
    private List<Recruit> recruit;

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminSurname() {
        return adminSurname;
    }

    public void setAdminSurname(String adminSurname) {
        this.adminSurname = adminSurname;
    }

    public String getAdminDepartment() {
        return adminDepartment;
    }

    public void setAdminDepartment(String adminDepartment) {
        this.adminDepartment = adminDepartment;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Recruit getRecruits() {
        return recruits;
    }

    public void setRecruits(Recruit recruits) {
        this.recruits = recruits;
    }

    public List<Recruit> getRecruit() {
        return recruit;
    }

    public void setRecruit(List<Recruit> recruit) {
        this.recruit = recruit;
    }
}
