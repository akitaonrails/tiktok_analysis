package com.bytedance.sysoptimizer;

/* JADX INFO: loaded from: classes4.dex */
public interface ExceptionCatcher {
    boolean analysis(Throwable th);

    boolean registerCondition();
}
