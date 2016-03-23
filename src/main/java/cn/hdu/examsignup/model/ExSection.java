package cn.hdu.examsignup.model;
// Generated 2012-3-26 19:37:27 by Hibernate Tools 3.4.0.CR1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.directwebremoting.annotations.DataTransferObject;

/**
 * ExSection generated by hbm2java
 */
@DataTransferObject
public class ExSection  implements java.io.Serializable {


     private String id;
     private ExInstitution exInstitution;
     private Integer sectionnum;
     private String theoryflag;
     private String operateflag;
     private Date starttime;
     private Set exArrangements = new HashSet(0);

    public ExSection() {
    }

	
    public ExSection(String id) {
        this.id = id;
    }
    public ExSection(String id, ExInstitution exInstitution, Integer sectionnum, String theoryflag, String operateflag, Date starttime, Set exArrangements) {
       this.id = id;
       this.exInstitution = exInstitution;
       this.sectionnum = sectionnum;
       this.theoryflag = theoryflag;
       this.operateflag = operateflag;
       this.starttime = starttime;
       this.exArrangements = exArrangements;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public ExInstitution getExInstitution() {
        return this.exInstitution;
    }
    
    public void setExInstitution(ExInstitution exInstitution) {
        this.exInstitution = exInstitution;
    }
    public Integer getSectionnum() {
        return this.sectionnum;
    }
    
    public void setSectionnum(Integer sectionnum) {
        this.sectionnum = sectionnum;
    }
    public String getTheoryflag() {
        return this.theoryflag;
    }
    
    public void setTheoryflag(String theoryflag) {
        this.theoryflag = theoryflag;
    }
    public String getOperateflag() {
        return this.operateflag;
    }
    
    public void setOperateflag(String operateflag) {
        this.operateflag = operateflag;
    }
    public Date getStarttime() {
        return this.starttime;
    }
    
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }
    public Set getExArrangements() {
        return this.exArrangements;
    }
    
    public void setExArrangements(Set exArrangements) {
        this.exArrangements = exArrangements;
    }




}


