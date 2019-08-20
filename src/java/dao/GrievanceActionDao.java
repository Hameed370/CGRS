package dao;

import java.util.List;
import model.GrievanceAction;

public interface GrievanceActionDao {
    public List<GrievanceAction> getAllGrievances();
    public GrievanceAction getGrievanceByID(String GRACID);
    public String getLastID();
    public boolean addGrievance(GrievanceAction g);
    public boolean updateGrievance(GrievanceAction g);
    public boolean deleteGrievance(GrievanceAction g);
}
