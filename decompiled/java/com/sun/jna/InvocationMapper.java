package com.sun.jna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes31.dex */
public interface InvocationMapper {
    InvocationHandler getInvocationHandler(NativeLibrary nativeLibrary, Method method);
}
