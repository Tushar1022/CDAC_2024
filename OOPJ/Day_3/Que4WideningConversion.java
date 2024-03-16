class Que4WideningConversionpublic  {
    public static void main(String[] args) {
        int intValue = 100;

        long longValue = intValue;

     
        float floatValue = longValue;
        double doubleValue = longValue;
        boolean booleanValue = (intValue != 0);
        String stringValue = String.valueOf(intValue);

        // Print the results
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Boolean value: " + booleanValue);
        System.out.println("String value: " + stringValue);
    }
}
