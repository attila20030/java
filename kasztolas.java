
public class kasztolas {
    public static void main(String[] args)
    {
        double d = 99.1;
        long l = (long)d;
        int i = (int)l;
        byte b = 11;
        char c = 'a';
        short s = 2024;
        float f = 7.87f;

        System.out.println("Double value " + d);
        System.out.println("Long value " + l);
        System.out.println("Int value " + i);
        System.out.println("Byte value " + b);
        System.out.println("Char value " + c);
        System.out.println("Short value " + s);
        System.out.println("Float value " + f);
        System.out.println("String value " + "Hello Java");

        double doubleValue = 2024.2023;
        
        float floatValue = (float) doubleValue;
        long longValue = (long) floatValue;
        int intValue = (int) longValue;
        char charValue = (char) intValue;
        short shortValue = (short) charValue;

        byte byteValue = (byte) shortValue;
        System.out.println("Double-ből Floatba: " + floatValue);
        System.out.println("Float-ból Longba: " + longValue);
        System.out.println("Longból-Intbe: " + intValue);
        System.out.println("Intből-Charba: " + charValue);
        System.out.println("Char-ból Shortba: " + shortValue);
        System.out.println("Short-ból Byteba: " + byteValue);

    }
}
