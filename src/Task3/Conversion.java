package Task3;

public class Conversion {
    public static Act conversionFromDogovorToAct (Dogovor dogovor){
        return new Act (dogovor.getDogovorNumber(), dogovor.getDogovorDate(), dogovor.getDogovorList());
    }
}
