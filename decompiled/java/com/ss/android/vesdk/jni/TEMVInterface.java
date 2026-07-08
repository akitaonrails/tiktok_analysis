package com.ss.android.vesdk.jni;

import X.C2484209oO;
import android.text.TextUtils;
import com.ss.android.ttve.model.VEMVAudioAlgorithmResult;
import com.ss.android.vesdk.VESize;
import java.util.Arrays;

/* JADX INFO: loaded from: classes36.dex */
public class TEMVInterface {
    public int mHostTrackIndex = -1;
    public long mNative;

    private native int nativeAddAudioTrackMV(long j, String str, int i, int i2, int i3, int i4, int i5, boolean z, float f);

    private native int nativeAddVideoTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i, VESize[] vESizeArr, int i2, int i3, boolean[] zArr, float f);

    private native Object nativeGetMVOriginalBackgroundAudio(long j);

    private native Object nativeGetServerAlgorithmConfig(long j);

    private native Object nativeInitMVResources(long j, String str, String[] strArr, String[] strArr2, int[] iArr, String str2, int i, int i2, boolean z, boolean z2, boolean z3, String[] strArr3, int i3, int i4, int i5, int i6);

    private native int nativeInitVideoEditorMV(long j, String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean z);

    private native int nativeInitVideoEditorMVLoadCache(long j, String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean[] zArr, String[] strArr5);

    private native int nativeSetAudioBeatAlgorithmResult(long j, VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult);

    private native int nativeSetExternalAlgorithmResult(long j, String str, String str2, String str3, int i);

    private native int nativeSetMVDataJson(long j, String str);

    public void clearNative() {
        this.mNative = 0L;
    }

    public Object getMVOriginalBackgroundAudio() {
        long j = this.mNative;
        if (j != 0) {
            return nativeGetMVOriginalBackgroundAudio(j);
        }
        C2484209oO.LIZJ("TEMVInterface", "getMVOriginalBackgroundAudio error, mNative == 0");
        return null;
    }

    public Object getServerAlgorithmConfig() {
        long j = this.mNative;
        if (j != 0) {
            return nativeGetServerAlgorithmConfig(j);
        }
        C2484209oO.LIZJ("TEMVInterface", "getServerAlgorithmConfig error, mNative == 0");
        return null;
    }

    public TEMVInterface(long j) {
        this.mNative = j;
    }

    public int setMVAudioBeatAlgorithmResult(VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult) {
        long j = this.mNative;
        if (j == 0) {
            C2484209oO.LIZJ("TEMVInterface", "setExternalAlgorithmResult error, mNative == 0");
            return -112;
        }
        return nativeSetAudioBeatAlgorithmResult(j, vEMVAudioAlgorithmResult);
    }

    public int setMVDataJson(String str) {
        long j = this.mNative;
        if (j == 0) {
            C2484209oO.LIZJ("TEMVInterface", "setExternalAlgorithmResult error, mNative == 0");
            return -112;
        }
        return nativeSetMVDataJson(j, str);
    }

    public int setExternalAlgorithmResult(String str, String str2, String str3, int i) {
        long j = this.mNative;
        if (j == 0) {
            C2484209oO.LIZJ("TEMVInterface", "setExternalAlgorithmResult error, mNative == 0");
            return -112;
        }
        return nativeSetExternalAlgorithmResult(j, str, str2, str3, i);
    }

    public int addAudioTrackForMV(String str, int i, int i2, int i3, int i4, int i5, boolean z, float f) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeAddAudioTrackMV(this.mNative, str, i, i2, i3, i4, i5, z, f);
    }

    public int addVideoTrackForMV(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i, VESize[] vESizeArr, int i2, boolean[] zArr, float f) {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        int i3 = this.mHostTrackIndex;
        if (i3 < 0) {
            return -105;
        }
        return nativeAddVideoTrack(j, strArr, strArr2, iArr, iArr2, iArr3, iArr4, iArr5, i, vESizeArr, i3, i2, zArr, f);
    }

    public Object initMVResources(String str, String[] strArr, String[] strArr2, int[] iArr, String str2, int i, int i2, boolean z, boolean z2, boolean z3, String[] strArr3, int i3, int i4, int i5, int i6) {
        return nativeInitMVResources(this.mNative, str, strArr, strArr2, iArr, str2, i, i2, z, z2, z3, strArr3, i3, i4, i5, i6);
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean z) {
        float[] fArr2 = fArr;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr2 == null) {
            fArr2 = new float[strArr.length];
            Arrays.fill(fArr2, 1.0f);
        }
        int iNativeInitVideoEditorMV = nativeInitVideoEditorMV(this.mNative, strArr, iArr, iArr2, iArr3, iArr4, strArr2, iArr5, iArr6, iArr7, iArr8, iArr9, strArr3, strArr4, fArr2, i, z);
        if (iNativeInitVideoEditorMV < 0) {
            return iNativeInitVideoEditorMV;
        }
        this.mHostTrackIndex = iNativeInitVideoEditorMV;
        return 0;
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean[] zArr, String[] strArr5) {
        float[] fArr2 = fArr;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr2 == null) {
            fArr2 = new float[strArr.length];
            Arrays.fill(fArr2, 1.0f);
        }
        int iNativeInitVideoEditorMVLoadCache = nativeInitVideoEditorMVLoadCache(this.mNative, strArr, iArr, iArr2, iArr3, iArr4, strArr2, iArr5, iArr6, iArr7, iArr8, iArr9, strArr3, strArr4, fArr2, i, zArr, strArr5);
        if (iNativeInitVideoEditorMVLoadCache < 0) {
            return iNativeInitVideoEditorMVLoadCache;
        }
        this.mHostTrackIndex = iNativeInitVideoEditorMVLoadCache;
        return 0;
    }
}
