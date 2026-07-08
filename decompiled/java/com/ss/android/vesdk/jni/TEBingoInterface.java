package com.ss.android.vesdk.jni;

import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ttve.nativePort.TENativeServiceBase;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public class TEBingoInterface extends TENativeServiceBase {
    public int mHostTrackIndex = -1;
    public long mNative;
    public TEInterface mNativeEditor;

    private native int nativeAddVidoeClipWithAlgorithm(long j, String[] strArr);

    private native int nativeCheckScoresFile(long j, String str);

    private native int nativeDeleteVideoClipWithAlgorithm(long j, int i);

    private native int nativeGenAISolve(long j);

    private native int nativeGenRandomSolve(long j);

    private native List<VEClipAlgorithmParam> nativeGetAllVideoRangeData(long j);

    private native String nativeGetClipPath(long j, int i);

    private native int nativeInitBingoAlgorithm(long j);

    private native int nativeInitVideoEditorWithAlgorithm(long j, String[] strArr, int i);

    private native int nativeInitVideoEditorWithAlgorithmLoadCache(long j, String[] strArr, int i, boolean[] zArr, String[] strArr2);

    private native int nativeMoveVideoClipWithAlgorithm(long j, int i, int i2);

    private native int nativeProcessBingoFrames(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, float f, String str);

    private native int nativeRemoveAllVideoSound(long j);

    private native int nativeRemoveMusic(long j, int i);

    private native int nativeRestoreAllVideoSound(long j);

    private native int nativeSetAIRotation(long j, int i, int i2);

    private native int nativeSetInterimScoresToFile(long j, String str);

    private native int nativeSetMusicAndResult(long j, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, int i4);

    private native int nativeSetMusicAndResultLoadCache(long j, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, int i4, boolean[] zArr, String[] strArr);

    private native int nativeSetMusicCropRatio(long j, int i);

    private native int nativeUpdateAlgorithmFromNormal(long j);

    public void clearNative() {
        this.mNative = 0L;
    }

    public int genAISolve() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGenAISolve(j);
    }

    public List<VEClipAlgorithmParam> getAllVideoRangeData() {
        long j = this.mNative;
        if (j == 0) {
            return null;
        }
        return nativeGetAllVideoRangeData(j);
    }

    public int getRandomSolve() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGenRandomSolve(j);
    }

    public int initBingoAlgorithm() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeInitBingoAlgorithm(j);
    }

    public int removeAllVideoSound() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveAllVideoSound(j);
    }

    public int restoreAllVideoSound() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRestoreAllVideoSound(j);
    }

    public int updateAlgorithmFromNormal() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateAlgorithmFromNormal(j);
    }

    public TEBingoInterface(TEInterface tEInterface) {
        this.mNativeEditor = tEInterface;
        this.mNative = tEInterface.getNativeHandler();
    }

    public int addVidoeClipWithAlgorithm(String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeAddVidoeClipWithAlgorithm(j, strArr);
    }

    public int checkScoresFile(String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeCheckScoresFile(j, str);
    }

    public int deleteVideoClipWithAlgorithm(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeDeleteVideoClipWithAlgorithm(j, i);
    }

    public String getClipPath(int i) {
        long j = this.mNative;
        if (j == 0) {
            return "";
        }
        return nativeGetClipPath(j, i);
    }

    public int removeMusic(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveMusic(j, i);
    }

    public int setInterimScoresToFile(String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetInterimScoresToFile(j, str);
    }

    public int setMusicCropRatio(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetMusicCropRatio(j, i);
    }

    public int initVideoEditorWithAlgorithm(String[] strArr, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int iNativeInitVideoEditorWithAlgorithm = nativeInitVideoEditorWithAlgorithm(j, strArr, i);
        if (iNativeInitVideoEditorWithAlgorithm < 0) {
            return iNativeInitVideoEditorWithAlgorithm;
        }
        this.mHostTrackIndex = iNativeInitVideoEditorWithAlgorithm;
        return 0;
    }

    public int moveVideoClipWithAlgorithm(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeMoveVideoClipWithAlgorithm(j, i, i2);
    }

    public int setAIRotation(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetAIRotation(j, i, i2);
    }

    public int initVideoEditorWithAlgorithm(String[] strArr, int i, boolean[] zArr, String[] strArr2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int iNativeInitVideoEditorWithAlgorithmLoadCache = nativeInitVideoEditorWithAlgorithmLoadCache(j, strArr, i, zArr, strArr2);
        if (iNativeInitVideoEditorWithAlgorithmLoadCache < 0) {
            return iNativeInitVideoEditorWithAlgorithmLoadCache;
        }
        this.mHostTrackIndex = iNativeInitVideoEditorWithAlgorithmLoadCache;
        return 0;
    }

    public int processBingoFrames(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, float f, String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeProcessBingoFrames(j, byteBuffer, byteBuffer2, i, i2, f, str);
    }

    public int setMusicAndResult(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetMusicAndResult(j, i, i2, str, str2, str3, str4, str5, str6, i3, i4);
    }

    public int setMusicAndResultLoadCache(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4, boolean[] zArr, String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetMusicAndResultLoadCache(j, i, i2, str, str2, str3, str4, str5, str6, i3, i4, zArr, strArr);
    }
}
