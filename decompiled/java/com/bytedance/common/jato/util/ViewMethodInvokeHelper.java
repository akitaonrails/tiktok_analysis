package com.bytedance.common.jato.util;

import X.C2104908Ml;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewMethodInvokeHelper {
    public static native void getViewConstructMethod(Class<?> cls);

    public static native void invokeViewConstruct(Class<?> cls, Object obj, Object obj2, Object obj3);

    public static boolean warmUpViewConstructMethod(Class<?> cls) {
        if (C2104908Ml.LIZ()) {
            getViewConstructMethod(cls);
        }
        return C2104908Ml.LIZ();
    }

    public static boolean invokeViewConstructByAttrs(Class<?> cls, Object obj, Object obj2, Object obj3) {
        if (C2104908Ml.LIZ()) {
            invokeViewConstruct(cls, obj, obj2, obj3);
        }
        return C2104908Ml.LIZ();
    }
}
