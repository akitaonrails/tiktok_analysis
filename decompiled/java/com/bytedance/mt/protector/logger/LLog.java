package com.bytedance.mt.protector.logger;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class LLog {
    private final native void nativePrintCompleteLog(String str, String str2);

    static {
        new LLog();
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new Object() { // from class: X.0VSU
        };
        System.getProperty("line.separator");
    }
}
