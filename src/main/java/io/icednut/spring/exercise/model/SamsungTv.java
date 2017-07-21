package io.icednut.spring.exercise.model;

/**
 * @author wangeun.lee@sk.com
 * @created 2017. 7. 21.
 */
public class SamsungTv implements Tv {

    @Override
    public void powerOn() {
        System.out.println("Samsung Tv -- 전원켜기");
    }
}
