package myPackage;

class myMath {
    public static final double PI = 3.141592653589793;
    public static final double g =9.8;

    public static int max(int num1,int num2){
    int result;
    if (num1>num2)
        result = num1;
    else
        result = num2;
    
    return result;
    }

    public static int add(int num1, int num2){
        int result = num1+num2;
        return result;
    }

    public static int add(int num1, int num2, int num3){
        int result = num1+num2+num3;
        return result;
    }

    public static int sub(int num1, int num2){
        int result = num1 - num2;
        return result;
    }

    public static int mul(int num1, int num2){
        int result = num1*num2;
        return result;
    }
}


