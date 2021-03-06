package com.platzi.javatest.util;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {

    @Test
    public  void repeat_string_once() {

        String result2 = StringUtil.repeat("hola", 1);
        Assert.assertEquals("hola",result2);
    }

    @Test
    public  void repeat_string_multiple_times() {

        String result = StringUtil.repeat("hola", 3);
        Assert.assertEquals("holaholahola",result);
    }


    @Test
    public  void repeat_string_zero_times() {

        String result = StringUtil.repeat("hola", 0);
        Assert.assertEquals("",result);
    }

    @Test(expected = IllegalArgumentException.class)
    public  void repeat_string_negative_times() {

        String result = StringUtil.repeat("hola", -1);
        Assert.assertEquals("",result);
    }

    @Test
    public void string_is_not_empty() {
        assertFalse(StringUtil.isEmpty("hola"));
    }

    @Test
    public void string_is_empty() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void string_null_is_empty() {
        assertTrue(StringUtil.isEmpty(null));
    }
}