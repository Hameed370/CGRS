
package model;

import java.util.Date;

public class Grievance {
    private String GRID, Subject,Category,SubCategory,StudentID,Detail,Status;
    private Date postDate;

    public String getGRID() {
        return GRID;
    }

    public Grievance(String GRID, String Subject, String Category, String SubCategory, String StudentID, String Detail, Date postDate) {
        this.GRID = GRID;
        this.Subject = Subject;
        this.Category = Category;
        this.SubCategory = SubCategory;
        this.StudentID = StudentID;
        this.Detail = Detail;
        this.Status = "Active";
        this.postDate = postDate;
    }

    public Grievance() {
    }

    @Override
    public String toString() {
        return "Grievance{" + "GRID=" + GRID + ", Subject=" + Subject + ", Category=" + Category + ", SubCategory=" + SubCategory + ", StudentID=" + StudentID + ", Detail=" + Detail + ", Status=" + Status + ", postDate=" + postDate + '}';
    }

    
    public void setGRID(String GRID) {
        this.GRID = GRID;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getSubCategory() {
        return SubCategory;
    }

    public void setSubCategory(String SubCategory) {
        this.SubCategory = SubCategory;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
    
    
    
}
