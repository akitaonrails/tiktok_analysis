package com.ss.bytertc.base.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes4.dex */
public class ExceptionUtils {
    public static String cause(Throwable th) {
        String string = null;
        while (th != null && th.getCause() != null) {
            string = th.getCause().toString();
            th = th.getCause();
        }
        return string;
    }

    public static String stackTrace(Throwable th) {
        th.printStackTrace(new PrintWriter(new StringWriter()));
        return th.toString();
    }
}
