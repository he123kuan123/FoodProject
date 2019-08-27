package com.atguigu.springboot.bean;

import java.io.Serializable;

public class Menu implements Serializable{
    private Integer mid;

    private String mname;

    private String murl;

    private String mtype;

    private String mmaterial;

    private String mtaste;

    private String maddtime;

    private String mscore;

    private String mdescription;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMurl() {
        return murl;
    }

    public void setMurl(String murl) {
        this.murl = murl == null ? null : murl.trim();
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype == null ? null : mtype.trim();
    }

    public String getMmaterial() {
        return mmaterial;
    }

    public void setMmaterial(String mmaterial) {
        this.mmaterial = mmaterial == null ? null : mmaterial.trim();
    }

    public String getMtaste() {
        return mtaste;
    }

    public void setMtaste(String mtaste) {
        this.mtaste = mtaste == null ? null : mtaste.trim();
    }

    public String getMaddtime() {
        return maddtime;
    }

    public void setMaddtime(String maddtime) {
        this.maddtime = maddtime == null ? null : maddtime.trim();
    }

    public String getMscore() {
        return mscore;
    }

    public void setMscore(String mscore) {
        this.mscore = mscore == null ? null : mscore.trim();
    }

    public String getMdescription() {
        return mdescription;
    }

    public void setMdescription(String mdescription) {
        this.mdescription = mdescription == null ? null : mdescription.trim();
    }

	@Override
	public String toString() {
		return "Menu [mid=" + mid + ", mname=" + mname + ", murl=" + murl + ", mtype=" + mtype + ", mmaterial="
				+ mmaterial + ", mtaste=" + mtaste + ", maddtime=" + maddtime + ", mscore=" + mscore + ", mdescription="
				+ mdescription + "]";
	}
    
    
}