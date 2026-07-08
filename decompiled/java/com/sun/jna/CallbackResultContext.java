package com.sun.jna;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes31.dex */
public class CallbackResultContext extends ToNativeContext {
    public Method method;

    public Method getMethod() {
        return this.method;
    }

    public CallbackResultContext(Method method) {
        this.method = method;
    }
}
