package com.ttnet.org.chromium.base;

import J.N;
import java.lang.Thread;

/* JADX INFO: loaded from: classes14.dex */
public class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler LIZ;
    public final boolean LIZIZ;
    public boolean LIZJ;

    public static void installHandler(boolean z) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z));
    }

    public JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.LIZ = uncaughtExceptionHandler;
        this.LIZIZ = z;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (!this.LIZJ) {
            this.LIZJ = true;
            N.M9gfm$zh(this.LIZIZ, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.LIZ;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
