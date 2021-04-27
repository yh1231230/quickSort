package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        //普通方式加小数
        System.out.println(0.1+0.2);

        Integer i1=Integer.valueOf("100");
        //自动装箱
        Integer i2=100;
        //包装类转字符串
        String s1=i1.toString();
        //字符串转基本数据类型
        float f1=Float.parseFloat(s1);
        Float f2=3.1415926f;
        String s2=f2.toString();

        //通过BigDecimal精确计算
        BigDecimal bigDecimal1=new BigDecimal(s2);
        BigDecimal bigDecimal2=new BigDecimal("3");
        /*
        BigDecimal 加法add() 减法subtract() 乘法multiply() 除法divide()
        BigDecimal的重载方法 （对象2，保留小数位数，舍入模式）
        舍入模式
        1：RoundingMode.UP进1法
        2：RoundingMode.FLOOR去尾法
        3：RoundingMode.HALF_UP四舍五入
        */
        System.out.println(bigDecimal1.divide(bigDecimal2,8, RoundingMode.HALF_UP));
    }
}
