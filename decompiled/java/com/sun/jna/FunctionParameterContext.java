package com.sun.jna;

/* JADX INFO: loaded from: classes31.dex */
public class FunctionParameterContext extends ToNativeContext {
    public Object[] args;
    public Function function;
    public int index;

    public Function getFunction() {
        return this.function;
    }

    public int getParameterIndex() {
        return this.index;
    }

    public Object[] getParameters() {
        return this.args;
    }

    public FunctionParameterContext(Function function, Object[] objArr, int i) {
        this.function = function;
        this.args = objArr;
        this.index = i;
    }
}
