package com.sun.jna;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes31.dex */
public class CallbackParameterContext extends FromNativeContext {
    public Object[] args;
    public int index;
    public Method method;

    public Object[] getArguments() {
        return this.args;
    }

    public int getIndex() {
        return this.index;
    }

    public Method getMethod() {
        return this.method;
    }

    public CallbackParameterContext(Class<?> cls, Method method, Object[] objArr, int i) {
        super(cls);
        this.method = method;
        this.args = objArr;
        this.index = i;
    }
}
