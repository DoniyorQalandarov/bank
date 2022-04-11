public class Variables {
    public static void main(String args[]) {
        int a = 10;
        char ch = 'c';
        byte b = 5;
        short sh = 50;
        boolean aBoolean = true;
        long l = 554546875;
        double d = 45.2;
        float f = 54556;
        System.out.println(a);
        System.out.println(ch);
        System.out.println(b);
        System.out.println(sh);
        System.out.println(aBoolean);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);

        System.out.println("Intermediate values");
        System.out.println("int min value:" + Integer.MIN_VALUE);
        System.out.println("int max value:" + Integer.MAX_VALUE);
        System.out.println("char min value:" + Character.MIN_VALUE);
        System.out.println("char max value:" + Character.MAX_VALUE);
        System.out.println("byte min value:" + Byte.MIN_VALUE);
        System.out.println("byte max value:" + Byte.MAX_VALUE);
        System.out.println("short min value:" + Short.MIN_VALUE);
        System.out.println("short max value:" + Short.MAX_VALUE);
        System.out.println("boolean min value:" + Boolean.TYPE.isPrimitive());
        System.out.println("long min value:" + Long.MIN_VALUE);
        System.out.println("long max value:" + Long.MAX_VALUE);
        System.out.println("double min value:" + Double.MIN_VALUE);
        System.out.println("double max value:" + Double.MAX_VALUE);
        System.out.println("float min value:" + Float.MIN_VALUE);
        System.out.println("float max value:" +Float.MAX_VALUE);

    }
}
