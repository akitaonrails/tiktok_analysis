package com.sun.jna;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public interface Callback {
    public static final List<String> FORBIDDEN_NAMES = Collections.unmodifiableList(Arrays.asList("hashCode", "equals", "toString"));

    /* JADX INFO: loaded from: classes31.dex */
    public interface UncaughtExceptionHandler {
        void uncaughtException(Callback callback, Throwable th);
    }
}
