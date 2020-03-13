public interface Eat {
    static  String getRed(){
        return "Red";
    }
    default String getColor(){
        return "getColor";
    }
    int getNumber();
    int getBigNumber();
}
