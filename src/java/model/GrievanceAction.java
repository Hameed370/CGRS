package model;

import java.util.Date;

public class GrievanceAction {
    private String GRACID,GRID,ActionDetail,ActionStatus;
    private Date ActionDate;

    public GrievanceAction(String GRACID, String GRID, String ActionDetail, String ActionStatus, Date ActionDate) {
        this.GRACID = GRACID;
        this.GRID = GRID;
        this.ActionDetail = ActionDetail;
        this.ActionStatus = ActionStatus;
        this.ActionDate = ActionDate;
    }

    public String getGRACID() {
        return GRACID;
    }

    public void setGRACID(String GRACID) {
        this.GRACID = GRACID;
    }

    public String getGRID() {
        return GRID;
    }

    public void setGRID(String GRID) {
        this.GRID = GRID;
    }

    public String getActionDetail() {
        return ActionDetail;
    }

    public void setActionDetail(String ActionDetail) {
        this.ActionDetail = ActionDetail;
    }

    public String getActionStatus() {
        return ActionStatus;
    }

    public void setActionStatus(String ActionStatus) {
        this.ActionStatus = ActionStatus;
    }

    public Date getActionDate() {
        return ActionDate;
    }

    public void setActionDate(Date ActionDate) {
        this.ActionDate = ActionDate;
    }

    @Override
    public String toString() {
        return "GrievanceAction{" + "GRACID=" + GRACID + ", GRID=" + GRID + ", ActionDetail=" + ActionDetail + ", ActionStatus=" + ActionStatus + ", ActionDate=" + ActionDate + '}';
    }
    
    
    
    
}
