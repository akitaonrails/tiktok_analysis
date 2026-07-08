package com.tiktok.ttm.ttmparam.container;

import X.C199641139j;
import X.C1DUA;
import X.C1DUJ;
import X.C1DYV;
import X.C1DYY;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS40S1101000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public class TTMContainer {
    public static final C1DUJ Companion = new Object() { // from class: X.1DUJ
    };
    public static Gson gson = new Gson();
    public long nativeAddress;

    public static final native long ttmNativeClear(long j);

    public static final native boolean ttmNativeContains(long j, String str);

    public static final native long ttmNativeCreate(boolean z);

    public static final native long ttmNativeCreateFromJSON(String str, int i);

    public static final native long ttmNativeGetAddress(long j, String str, int i, int i2);

    public static final native boolean ttmNativeGetBoolean(long j, String str, int i, boolean z);

    public static final native double ttmNativeGetDouble(long j, String str, int i, double d);

    public static final native List<String> ttmNativeGetKeys(long j, List<String> list);

    public static final native long ttmNativeGetLong(long j, String str, int i, long j2);

    public static final native int ttmNativeGetMemorySize(long j);

    public static final native String ttmNativeGetString(long j, String str, int i);

    public static final native int ttmNativeGetValueType(long j);

    public static final native boolean ttmNativePutAddress(long j, String str, int i, long j2);

    public static final native boolean ttmNativePutBoolean(long j, String str, int i, boolean z);

    public static final native boolean ttmNativePutDouble(long j, String str, int i, double d);

    public static final native boolean ttmNativePutLong(long j, String str, int i, long j2);

    public static final native boolean ttmNativePutString(long j, String str, int i, String str2);

    public static final native void ttmNativeRelease(long j);

    public static final native boolean ttmNativeRemove(long j, String str, int i);

    public static final native int ttmNativeSize(long j);

    public static final native String ttmNativeToString(long j);

    public final void clear() {
        tryCatch(new AwS579S0100000_35(this, 183));
    }

    public final int getNativeMemorySize() {
        try {
            long j = this.nativeAddress;
            if (j == 0) {
                return 0;
            }
            Companion.getClass();
            return ttmNativeGetMemorySize(j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public final C1DYV getType() {
        long j = this.nativeAddress;
        if (j == 0) {
            return C1DYV.TTM_UNKNOW_TYPE;
        }
        C1DYY c1dyy = C1DYV.Companion;
        Companion.getClass();
        int iTtmNativeGetValueType = ttmNativeGetValueType(j);
        c1dyy.getClass();
        return iTtmNativeGetValueType != 0 ? iTtmNativeGetValueType != 1 ? iTtmNativeGetValueType != 2 ? iTtmNativeGetValueType != 3 ? iTtmNativeGetValueType != 4 ? iTtmNativeGetValueType != 5 ? C1DYV.TTM_UNKNOW_TYPE : C1DYV.TTM_STR_TYPE : C1DYV.TTM_BOOL_TYPE : C1DYV.TTM_DOUBLE_TYPE : C1DYV.TTM_LONG_TYPE : C1DYV.TTM_LIST_TYPE : C1DYV.TTM_MAP_TYPE;
    }

    public final int size() {
        try {
            long j = this.nativeAddress;
            if (j == 0) {
                return 0;
            }
            Companion.getClass();
            return ttmNativeSize(j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public final long getNativeAddress$machine_core_release() {
        return this.nativeAddress;
    }

    public TTMContainer(boolean z) {
        Companion.getClass();
        this.nativeAddress = ttmNativeCreate(z);
        ReferenceQueue<TTMContainer> referenceQueue = C1DUA.LIZ;
        C1DUA.LIZIZ.put(new C199641139j(this, C1DUA.LIZ), Boolean.TRUE);
    }

    public final void setNativeAddress$machine_core_release(long j) {
        this.nativeAddress = j;
    }

    public final Object tryCatch(Function0<? extends Object> function0) {
        try {
            return function0.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public TTMContainer(long j) {
        this.nativeAddress = j;
    }

    public TTMContainer(long j, boolean z) {
        this.nativeAddress = j;
        ReferenceQueue<TTMContainer> referenceQueue = C1DUA.LIZ;
        C1DUA.LIZIZ.put(new C199641139j(this, C1DUA.LIZ), Boolean.TRUE);
    }

    public final TTMContainer getContainValue(String str, int i) {
        Object objTryCatch = tryCatch(new AwS40S1101000_35(this, str, i, 0));
        if (objTryCatch instanceof TTMContainer) {
            return (TTMContainer) objTryCatch;
        }
        return null;
    }
}
