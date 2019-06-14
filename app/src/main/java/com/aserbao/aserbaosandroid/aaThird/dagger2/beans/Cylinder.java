package com.aserbao.aserbaosandroid.aaThird.dagger2.beans;

import android.util.Log;

import javax.inject.Inject;

import static com.aserbao.aserbaosandroid.aaThird.dagger2.beans.Car.TAG;

/**
 * 功能:气缸
 *
 * @author aserbao
 * @date : On 2019/5/29 5:16 PM
 * @project:AserbaosAndroid
 * @package:com.aserbao.aserbaosandroid.aaThird.dagger2.beans
 */
public class Cylinder {
    @Inject
    public Cylinder() {
        Log.e(TAG, "Cylinder: 的构造方法" );
    }
}
