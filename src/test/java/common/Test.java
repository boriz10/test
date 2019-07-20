package common;

public class Test {

    @org.junit.Test
    public void test() {
        OsCheck.OSType ostype = OsCheck.getOperatingSystemType();
        System.out.printf(ostype.toString());
    }
}
