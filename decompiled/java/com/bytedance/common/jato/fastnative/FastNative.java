package com.bytedance.common.jato.fastnative;

import X.C2104908Ml;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes14.dex */
public class FastNative {
    public static ExecutorService LIZ;

    public static class Stub {
        public void stubMethod() {
            System.out.println("stubMethod");
        }
    }

    public static native Method[] getMethodsNative(String[] strArr, String[] strArr2, String[] strArr3);

    public static native Method[] nativeModifyFastNativeInner(Method[] methodArr, boolean z, boolean z2);

    static {
        C2104908Ml.LIZIZ();
    }

    public static void LIZIZ(String[] strArr, String[] strArr2, String[] strArr3) {
        nativeModifyFastNativeInner(getMethodsNative(strArr, strArr2, strArr3), false, false);
    }

    public static void LIZ(boolean z, String[] strArr, String[] strArr2, String[] strArr3) {
        Method[] methodsNative = getMethodsNative(strArr, strArr2, strArr3);
        int i = 0;
        while (methodsNative != null && methodsNative.length > 0 && i != 3) {
            i++;
            methodsNative = nativeModifyFastNativeInner(methodsNative, z, true);
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
