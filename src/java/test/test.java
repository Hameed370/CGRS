
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import daoimpl.GrievanceDAOImpl;
import java.util.Arrays;
import java.util.List;
import model.Grievance;

/**
 *
 * @author MRuser
 */
public class test {
    public static void main(String[] args) {
        GrievanceDAOImpl gdi = new GrievanceDAOImpl();
//        List<Grievance> gd = gdi.getAllGrievances();
//        for (Grievance gd1 : gd) {
//            System.out.println(gd1);
//        }
        String s = gdi.getLastID();
        System.out.println(s);
        char[] str = s.toCharArray();
        int len = str.length;
        str[len-1]+=1;
        System.out.println(str);    
        
    }
    
}
