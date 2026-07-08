package com.bytedance.common.jato.jit.invokable;

import com.bytedance.common.jato.jit.JitCompiler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class JitSaveProfile implements InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        JitCompiler.forceSaveProfile();
        return Boolean.TRUE;
    }
}
