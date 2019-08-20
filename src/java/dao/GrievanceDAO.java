package dao;

import java.util.List;
import model.Grievance;

public interface GrievanceDAO {
    public List<Grievance> getAllGrievances();
    public Grievance getGrievanceByID(String GRID);
    public boolean addGrievance(Grievance g);
    public boolean updateGrievance(Grievance g);
    public boolean deleteGrievance(Grievance g);
}
