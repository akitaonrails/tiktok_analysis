package com.ss.android.ttve.nativePort;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes36.dex */
public class TEBundle {
    public long mHandle;
    public static Queue<TEBundle> sPools = new ArrayDeque(8);
    public static final Object sPoolSync = new Object();

    private native long nativeCreate();

    private native boolean nativeGetBool(long j, String str);

    private native float nativeGetFloat(long j, String str);

    private native int[] nativeGetIntArray(long j, String str);

    private native long nativeGetLong(long j, String str);

    private native String nativeGetString(long j, String str);

    private native String[] nativeGetStringArray(long j, String str);

    public static native void nativeRelease(long j);

    public static native void nativeReleaseAll(long[] jArr);

    private native int nativeSetBool(long j, String str, boolean z);

    private native int nativeSetByteBuffer(long j, String str, ByteBuffer byteBuffer);

    private native int nativeSetDouble(long j, String str, double d);

    private native int nativeSetDoubleArray(long j, String str, double[] dArr);

    private native int nativeSetFloat(long j, String str, float f);

    private native int nativeSetFloatArray(long j, String str, float[] fArr);

    private native int nativeSetHandle(long j, String str, long j2);

    private native int nativeSetInt(long j, String str, int i);

    private native int nativeSetIntArray(long j, String str, int[] iArr);

    private native int nativeSetLong(long j, String str, long j2);

    private native int nativeSetString(long j, String str, String str2);

    private native int nativeSetStringArray(long j, String str, String[] strArr);

    static {
        TENativeLibsLoader.loadRecorder();
    }

    public static void cleanAll() {
        synchronized (sPoolSync) {
            try {
                if (!sPools.isEmpty()) {
                    int size = sPools.size();
                    long[] jArr = new long[size];
                    for (int i = 0; i < size; i++) {
                        TEBundle tEBundlePoll = sPools.poll();
                        jArr[i] = tEBundlePoll.getHandle();
                        tEBundlePoll.mHandle = 0L;
                    }
                    nativeReleaseAll(jArr);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static TEBundle obtain() {
        TEBundle tEBundlePoll;
        synchronized (sPoolSync) {
            try {
                tEBundlePoll = !sPools.isEmpty() ? sPools.poll() : new TEBundle();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tEBundlePoll;
    }

    public void recycle() {
        synchronized (sPoolSync) {
            try {
                if (!sPools.contains(this)) {
                    sPools.add(this);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public TEBundle() {
        this.mHandle = nativeCreate();
    }

    public void finalize() throws Throwable {
        super.finalize();
        long j = this.mHandle;
        if (j != 0) {
            nativeRelease(j);
        }
    }

    public long getHandle() {
        return this.mHandle;
    }

    public TEBundle(long j) {
        this.mHandle = j;
    }

    public boolean getBool(String str) {
        return nativeGetBool(this.mHandle, str);
    }

    public float getFloat(String str) {
        return nativeGetFloat(this.mHandle, str);
    }

    public int[] getIntArray(String str) {
        return nativeGetIntArray(this.mHandle, str);
    }

    public long getLong(String str) {
        return nativeGetLong(this.mHandle, str);
    }

    public String getString(String str) {
        return nativeGetString(this.mHandle, str);
    }

    public String[] getStringArray(String str) {
        return nativeGetStringArray(this.mHandle, str);
    }

    public int setBool(String str, boolean z) {
        return nativeSetBool(this.mHandle, str, z);
    }

    public int setByteBuffer(String str, ByteBuffer byteBuffer) {
        return nativeSetByteBuffer(this.mHandle, str, byteBuffer);
    }

    public int setDouble(String str, double d) {
        return nativeSetDouble(this.mHandle, str, d);
    }

    public int setDoubleArray(String str, double[] dArr) {
        return nativeSetDoubleArray(this.mHandle, str, dArr);
    }

    public int setFloat(String str, float f) {
        return nativeSetFloat(this.mHandle, str, f);
    }

    public int setFloatArray(String str, float[] fArr) {
        return nativeSetFloatArray(this.mHandle, str, fArr);
    }

    public int setHandle(String str, long j) {
        return nativeSetHandle(this.mHandle, str, j);
    }

    public int setInt(String str, int i) {
        return nativeSetInt(this.mHandle, str, i);
    }

    public int setIntArray(String str, int[] iArr) {
        return nativeSetIntArray(this.mHandle, str, iArr);
    }

    public int setLong(String str, long j) {
        return nativeSetLong(this.mHandle, str, j);
    }

    public int setString(String str, String str2) {
        return nativeSetString(this.mHandle, str, str2);
    }

    public int setStringArray(String str, String[] strArr) {
        return nativeSetStringArray(this.mHandle, str, strArr);
    }
}
