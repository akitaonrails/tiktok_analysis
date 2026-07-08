package com.bytedance.ies.cutsame.downloaderv2;

import X.C0WZX;
import X.C2204961BRm;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class WuZhuiDownloaderListenerInvocationHandler implements InvocationHandler {
    public final long nativeCallbackPtr;

    public native void nativeOnFailure(long j, String str, int i, String str2);

    public native void nativeOnProgress(long j, float f);

    public native void nativeOnSuccess(long j, NLEModel nLEModel);

    public WuZhuiDownloaderListenerInvocationHandler(long j) {
        this.nativeCallbackPtr = j;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        name.getClass();
        switch (name) {
            case "onSuccess":
                nativeOnSuccess(this.nativeCallbackPtr, (NLEModel) objArr[0]);
                return null;
            case "onFailure":
                nativeOnFailure(this.nativeCallbackPtr, (String) objArr[0], ((Integer) objArr[1]).intValue(), (String) objArr[2]);
                return null;
            case "onProgress":
                nativeOnProgress(this.nativeCallbackPtr, ((Float) objArr[0]).floatValue());
                return null;
            default:
                return C2204961BRm.a0(method, this, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Ypn5c8zr9ebr7G/8YGukYGga3v2+3S7Ar9cJ+XB82cC/AOhEa4AJ67JDZeJbzpZoDjF6FPpcnHsd/qQcUKSs=", null));
        }
    }
}
