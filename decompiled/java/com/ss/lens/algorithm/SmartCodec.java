package com.ss.lens.algorithm;

import X.C08FF;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class SmartCodec {
    public static boolean isLibLoaded;
    public long mNativePtr;

    private native SmartCodecResult nativeGetSmartCodecBufferOutput(long j, SmartCodecResult smartCodecResult);

    private native SmartCodecResult nativeGetSmartCodecGLOutput(long j, SmartCodecResult smartCodecResult);

    private native long nativeInitSmartCodec(int i, int i2, int i3, int i4, float f, int i5, int i6, int i7, String str, String str2, String str3, boolean z);

    private native void nativeReleaseSmartCodec(long j);

    private native int nativeSmartCodecBufferProcess(long j, byte[] bArr, int i, int i2, float f, float f2, int i3);

    private native int nativeSmartCodecGLProcess(long j, int i, int i2, int i3, float[] fArr, float f, float f2, int i4);

    public void ReleaseSmartCodec() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseSmartCodec(j);
        this.mNativePtr = 0L;
    }

    public enum InputMode {
        UNKNOWN,
        SURFACE_RGBA,
        BUFFER_YUV,
        BUFFER_RGBA;

        public static InputMode valueOf(String str) {
            return (InputMode) C08FF.LIZ(InputMode.class, str);
        }
    }

    public enum Preset {
        SLOW,
        MEDIUM,
        FAST;

        public static Preset valueOf(String str) {
            return (Preset) C08FF.LIZ(Preset.class, str);
        }
    }

    public static void INVOKESTATIC_com_ss_lens_algorithm_SmartCodec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public SmartCodecResult GetSmartCodecBufferOutput(SmartCodecResult smartCodecResult) {
        long j = this.mNativePtr;
        if (j == 0) {
            return smartCodecResult;
        }
        return nativeGetSmartCodecBufferOutput(j, smartCodecResult);
    }

    public SmartCodecResult GetSmartCodecGLOutput(SmartCodecResult smartCodecResult) {
        long j = this.mNativePtr;
        if (j == 0) {
            return smartCodecResult;
        }
        return nativeGetSmartCodecGLOutput(j, smartCodecResult);
    }

    public int SmartCodecBufferProcess(byte[] bArr, int i, int i2, int i3, float f, float f2, int i4) {
        long j = this.mNativePtr;
        if (j != 0 && i > 0 && i2 > 0) {
            return nativeSmartCodecBufferProcess(j, bArr, i, i2, f, f2, i4);
        }
        return -1;
    }

    public int SmartCodecProcess(int i, int i2, int i3, float[] fArr, float f, float f2, int i4) {
        long j = this.mNativePtr;
        if (j != 0 && i2 > 0 && i3 > 0) {
            return nativeSmartCodecGLProcess(j, i, i2, i3, fArr, f, f2, i4);
        }
        return -1;
    }

    public synchronized boolean InitSmartCodec(int i, int i2, int i3, int i4, float f, int i5, Preset preset, InputMode inputMode, String str, String str2, boolean z, String str3) {
        if (!isLibLoaded) {
            try {
                INVOKESTATIC_com_ss_lens_algorithm_SmartCodec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                INVOKESTATIC_com_ss_lens_algorithm_SmartCodec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                INVOKESTATIC_com_ss_lens_algorithm_SmartCodec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fastcv");
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            try {
                INVOKESTATIC_com_ss_lens_algorithm_SmartCodec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                e2.printStackTrace();
                return false;
            }
        }
        long jNativeInitSmartCodec = nativeInitSmartCodec(i2, i, i4, i3, f, i5, preset.ordinal(), inputMode.ordinal(), str, str2, str3, z);
        this.mNativePtr = jNativeInitSmartCodec;
        if (jNativeInitSmartCodec == 0) {
            return false;
        }
        return true;
    }
}
