public class Main {
    public static void main(String[] args) {
       SmartPhone iphone = new SmartPhone("iPhone11", "iOS", 2900, 7.45, "1920x1080",12.0f, true, 8,2.0f);
       SmartWatch appleWatch = new SmartWatch("AppleWatchS3", "WatchOS", 230,4.50,true,false,"rojo",5,16);

        System.out.println(iphone.toString());
        System.out.println(appleWatch.toString());
    }
}
