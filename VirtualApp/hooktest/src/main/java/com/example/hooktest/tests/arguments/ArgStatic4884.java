package com.example.hooktest.tests.arguments;


/**
 * Created by weishu on 17/11/14.
 */
public class ArgStatic4884 extends AbsArgStaticCase {
    @Override
    protected void makeCall(long... args) {
        ArgumentTarget.arg4((int)args[0], args[1], args[2], (int)args[3]);
    }
}
