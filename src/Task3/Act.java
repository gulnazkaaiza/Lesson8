package Task3;

import java.util.Date;

public class Act {
    private int actNumber;
    private Date actDate;
    private String[] actList;

    public Act (){

    }

    public Act(int actNumber, Date actDate, String[] actList) {
      this.actNumber = actNumber;
       this.actDate = actDate;
       this.actList = actList;
    }

    public int getActNumber() {

        return actNumber;
    }

    public void setActNumber(int actNumber) {

        this.actNumber = actNumber;
    }

    public java.util.Date getDate() {

        return actDate;
    }

    public void setDate(java.util.Date date) {

        this.actDate = date;
    }


    public String[] getActList() {

        return actList;
    }

    public void setActList(String[] actList) {

        this.actList = actList;
    }
}
