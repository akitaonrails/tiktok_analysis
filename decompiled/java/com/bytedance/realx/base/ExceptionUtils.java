package com.bytedance.realx.base;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes4.dex */
public class ExceptionUtils {
    public static String stackTrace(Throwable th) {
        th.printStackTrace(new PrintWriter(new StringWriter()));
        return th.toString();
    }
}
