package com.sun.jna;

/* JADX INFO: loaded from: classes31.dex */
public class FunctionResultContext extends FromNativeContext {
    public Object[] args;
    public Function function;

    public Object[] getArguments() {
        return this.args;
    }

    public Function getFunction() {
        return this.function;
    }

    public FunctionResultContext(Class<?> cls, Function function, Object[] objArr) {
        super(cls);
        this.function = function;
        this.args = objArr;
    }
}
