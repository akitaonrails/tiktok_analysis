package com.ss.android.ugc.aweme.framework.services;

import X.C0WZX;
import X.C2204961BRm;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public class DynamicProxy {
    public static <T> T get(Class<?> cls) {
        if (cls != null && cls.isInterface()) {
            return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.ss.android.ugc.aweme.framework.services.DynamicProxy.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    if (method.getDeclaringClass() == Object.class) {
                        return C2204961BRm.a0(method, this, objArr, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOy6YpLLyz1hpohRKyL/okk75d173ZpFxdJL3v63PDs=", null));
                    }
                    Class<?> returnType = method.getReturnType();
                    if (returnType.isPrimitive()) {
                        return Defaults.defaultValue(returnType);
                    }
                    return method.getDefaultValue();
                }
            });
        }
        return null;
    }
}
