package com.bytedance.android.monitorV2.spark_tracing.gen;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkTracingNative {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public long mNativeObj;

    public static native String do_compute(long j, String str, String str2);

    public static native String do_computeExpr(long j, String str, String str2);

    public static native void do_delete(long j);

    public static native String[] do_getChildIds(long j, String str);

    public static native String do_getProperties(long j, String str);

    public static native String do_getProperty(long j, String str, String str2, boolean z);

    public static native String do_getUsedReferences(long j);

    public static native boolean do_isContextPropsExists(long j, String str);

    public static native void do_newContextProps(long j, String str, long j2, boolean z, boolean z2);

    public static native void do_setContextPropsAliveState(long j, String str, boolean z);

    public static native void do_setContextPropsFinalState(long j, String str, boolean z);

    public static native Boolean do_setManifest(long j, String str);

    public static native Boolean do_setProperties(long j, String str, String str2, long j2, long j3);

    public static native Boolean do_setProperty(long j, String str, String str2, String str3, long j2, long j3);

    public static native String do_snapshot(long j);

    public static native void do_update(long j);

    public static native void do_updateLink(long j, String str, String str2, int i);

    public static native long init(SparkTracingNativeConfig sparkTracingNativeConfig, SparkTracingNativeClient sparkTracingNativeClient);

    public static native void initLogger(boolean z);

    public synchronized void delete() {
        long j = this.mNativeObj;
        if (j != 0) {
            do_delete(j);
            this.mNativeObj = 0L;
        }
    }

    public final String getUsedReferences() {
        return do_getUsedReferences(this.mNativeObj);
    }

    public final String snapshot() {
        return do_snapshot(this.mNativeObj);
    }

    public final void update() {
        do_update(this.mNativeObj);
    }

    public void finalize() throws Throwable {
        try {
            delete();
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    public final String[] getChildIds(String str) {
        return do_getChildIds(this.mNativeObj, str);
    }

    public final String getProperties(String str) {
        return do_getProperties(this.mNativeObj, str);
    }

    public final boolean isContextPropsExists(String str) {
        return do_isContextPropsExists(this.mNativeObj, str);
    }

    public final Boolean setManifest(String str) {
        return do_setManifest(this.mNativeObj, str);
    }

    public SparkTracingNative(SparkTracingNativeConfig sparkTracingNativeConfig, SparkTracingNativeClient sparkTracingNativeClient) {
        this.mNativeObj = init(sparkTracingNativeConfig, sparkTracingNativeClient);
    }

    public final String compute(String str, String str2) {
        return do_compute(this.mNativeObj, str, str2);
    }

    public final String computeExpr(String str, String str2) {
        return do_computeExpr(this.mNativeObj, str, str2);
    }

    public final void setContextPropsAliveState(String str, boolean z) {
        do_setContextPropsAliveState(this.mNativeObj, str, z);
    }

    public final void setContextPropsFinalState(String str, boolean z) {
        do_setContextPropsFinalState(this.mNativeObj, str, z);
    }

    public SparkTracingNative(InternalPointerMarker internalPointerMarker, long j) {
        this.mNativeObj = j;
    }

    public final String getProperty(String str, String str2, boolean z) {
        return do_getProperty(this.mNativeObj, str, str2, z);
    }

    public final void updateLink(String str, String str2, int i) {
        do_updateLink(this.mNativeObj, str, str2, i);
    }

    public final void newContextProps(String str, long j, boolean z, boolean z2) {
        do_newContextProps(this.mNativeObj, str, j, z, z2);
    }

    public final Boolean setProperties(String str, String str2, long j, long j2) {
        return do_setProperties(this.mNativeObj, str, str2, j, j2);
    }

    public final Boolean setProperty(String str, String str2, String str3, long j, long j2) {
        return do_setProperty(this.mNativeObj, str, str2, str3, j, j2);
    }
}
