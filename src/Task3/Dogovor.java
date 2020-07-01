//Реализовать два класса: договор и акт. В каждом сделать поля:
//номер, дата, список товаров (массив строк). Написать класс со статическим методом
// конвертации договора в акт (на вход передавать договор, на выходе получаем акт).
package Task3;

import java.util.Date;

public class Dogovor {
    private int dogovorNumber;
    private Date dogovorDate;
    private String[] dogovorList;

    public Dogovor(int dogovorNumber, Date dogovorDate, String dogovorList[]) {
        this.dogovorNumber = dogovorNumber;
        this.dogovorDate = dogovorDate;
        this.dogovorList = dogovorList;
    }

    public int getDogovorNumber() {
        return dogovorNumber;
    }

    public void setDogovorNumber(int dogovorNumber) {

        this.dogovorNumber = dogovorNumber;
    }

    public java.util.Date getDogovorDate() {

        return dogovorDate;
    }

    public void setDogovorDate(Date dogovorDate) {

        this.dogovorDate = dogovorDate;
    }

    public String[] getDogovorList() {

        return dogovorList;
    }

    public void setDogovorList(String[] dogovorList) {

        this.dogovorList = dogovorList;
    }
}
