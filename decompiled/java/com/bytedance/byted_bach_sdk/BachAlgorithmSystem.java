package com.bytedance.byted_bach_sdk;

import X.C08FF;
import android.os.SystemClock;
import com.bytedance.byted_bach_sdk.buffer.BachAlgorithmOutput;
import com.bytedance.byted_bach_sdk.finder.BachResourceFinder;
import com.bytedance.byted_bach_sdk.input.BachAlgorithmInput;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class BachAlgorithmSystem {
    public boolean isDestroyed;
    public BachResourceFinder m_finder;
    public long m_nativePtr;

    public static class BachInitConfig {
        public String applicationName;
        public String deviceName;
        public BachResourceFinder finder;
    }

    private native long nativeCreate(BachInitConfig bachInitConfig);

    private native void nativeDestroy(long j);

    private native int nativeExec(long j, BachAlgorithmInput bachAlgorithmInput);

    private native BachAlgorithmOutput nativeGetResult(long j, String str, int i);

    private native void nativeInitGraph(long j, String str);

    private native int nativeSetEnable(long j, String str, boolean z);

    private native int nativeSetFloatParams(long j, String str, HashMap<String, Float> map);

    private native int nativeSetIntParams(long j, String str, HashMap<String, Integer> map);

    private native int nativeSetStringParams(long j, String str, HashMap<String, String> map);

    static {
        INVOKESTATIC_com_bytedance_byted_bach_sdk_BachAlgorithmSystem_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bach-sdk-jni");
    }

    public void destroy() {
        if (this.isDestroyed) {
            return;
        }
        this.isDestroyed = true;
        nativeDestroy(this.m_nativePtr);
    }

    public void finalize() throws Throwable {
        super.finalize();
        destroy();
    }

    public enum BachErrorCode {
        NO_ERROR,
        INVALID_RES_FINDER,
        NOT_INIT,
        INVALID_CONFIG,
        INVALID_GRAPH,
        INVALID_MODEL,
        INVALID_TYPE,
        INVALID_NODE,
        INVALID_FORMAT,
        INTERNAL_ERROR,
        NONE_ERROR;

        public static BachErrorCode valueOf(String str) {
            return (BachErrorCode) C08FF.LIZ(BachErrorCode.class, str);
        }
    }

    public BachAlgorithmSystem(BachInitConfig bachInitConfig) {
        this.m_nativePtr = nativeCreate(bachInitConfig);
        this.m_finder = bachInitConfig.finder;
    }

    public static void INVOKESTATIC_com_bytedance_byted_bach_sdk_BachAlgorithmSystem_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public BachErrorCode execute(BachAlgorithmInput bachAlgorithmInput) {
        return BachErrorCode.values()[nativeExec(this.m_nativePtr, bachAlgorithmInput)];
    }

    public BachAlgorithmOutput getResult(String str) {
        return nativeGetResult(this.m_nativePtr, str, 0);
    }

    public void initGraph(String str) {
        nativeInitGraph(this.m_nativePtr, str);
    }

    public int enable(String str, boolean z) {
        return nativeSetEnable(this.m_nativePtr, str, z);
    }

    public BachAlgorithmOutput getResult(String str, int i) {
        return nativeGetResult(this.m_nativePtr, str, i);
    }

    public int setFloatParams(String str, HashMap<String, Float> map) {
        return nativeSetFloatParams(this.m_nativePtr, str, map);
    }

    public int setIntParams(String str, HashMap<String, Integer> map) {
        return nativeSetIntParams(this.m_nativePtr, str, map);
    }

    public int setStringParams(String str, HashMap<String, String> map) {
        return nativeSetStringParams(this.m_nativePtr, str, map);
    }
}
