package com.bytedance.common.jato.jit.invokable;

import com.bytedance.common.jato.jit.JitCompiler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class JitBatchCompiler implements InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public Boolean invoke(Object obj, Method method, Object[] objArr) {
        if (objArr == null) {
            return Boolean.FALSE;
        }
        boolean z = true;
        for (Object obj2 : objArr) {
            if (obj2 instanceof Member) {
                if (z && JitCompiler.compile((Member) obj2)) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
