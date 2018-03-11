package Utils;

//рандомное созднание почтовых ящиков
public class Utils {
    public class Random{
        public  String getRandomEmail(){
            return System.currentTimeMillis()+"@mail.ru";
        }
    }
}
