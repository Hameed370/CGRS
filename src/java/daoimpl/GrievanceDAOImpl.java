package daoimpl;

import dao.GrievanceDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Grievance;

public class GrievanceDAOImpl implements GrievanceDAO{
List<Grievance> l;
Grievance g;
Connection conn;
    PreparedStatement ps;
    public GrievanceDAOImpl() {
        try {
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/NIITGrievance", "sa", "pass");
            System.out.println("Connected");
        } catch (Exception e) {
            System.err.println("Error :"+e.getMessage());
        }
    }


    
    @Override
    public List<Grievance> getAllGrievances() {
        l = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM GRIEVANCE");
            while (rs.next()) {                
                g = new  Grievance();
                g.setGRID(rs.getString(1));
                g.setSubject(rs.getString(2));
                g.setCategory(rs.getString(3));
                g.setSubCategory(rs.getString(4));
                g.setStudentID(rs.getString(5));
                g.setDetail(rs.getString(6));
                g.setPostDate(rs.getDate(7));
                g.setStatus(rs.getString(8));
                l.add(g);
            }
        } catch (Exception e) {
            System.err.println("Error while fetching"+e.getMessage());
        }
        return l;
    }

    @Override
    public Grievance getGrievanceByID(String GRID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addGrievance(Grievance g) {
        
        try {
            ps = conn.prepareStatement("insert into grievance values (?,?,?,?,?,?,?,?)");
            ps.setString(1, g.getGRID());
            ps.setString(2, g.getSubject());
            ps.setString(3, g.getCategory());
            ps.setString(4, g.getSubCategory());
            ps.setString(5, g.getStudentID());
            ps.setString(6, g.getDetail());
            ps.setDate(7, (java.sql.Date) g.getPostDate());
            ps.setString(8, g.getStatus());
            int res = ps.executeUpdate();
            if (res != 0) {
                return true;
            } 
        } catch (Exception e) {
            System.err.println("Error : "+e.getMessage());
        }
    return false;
    }

    @Override
    public boolean updateGrievance(Grievance g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteGrievance(Grievance g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String getLastID()
    {
        String id = "";
        try{
        Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT max(GRID) FROM GRIEVANCE");
            while (rs.next()) {   
                id = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Error while fetching");
        }
        
        return id;
    }
    
}
