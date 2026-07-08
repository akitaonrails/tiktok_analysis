package com.ss.android.ttve.nativePort;

import X.C0HLZ;
import X.C0VSJ;
import X.C1DMO;
import X.C2188811AlT;
import X.C2254461DLw;
import X.C2484209oO;
import X.C448700Hie;
import X.EnumC20137713qp;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.ttve.model.VETransformResult;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.algorithm.VEBachAlgorithmParam;
import com.ss.android.vesdk.algorithm.VEBachQRCodeResult;
import com.ss.android.vesdk.algorithm.VEBachSceneRecognitionResult;
import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;
import com.ss.android.vesdk.algorithm.s;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.utils.BitmapLoader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public final class TEVideoUtils {
    public static long getFrameInterval;

    public interface AVInterleaveCheckListener {
        void onInfo(int i, boolean z, long j);
    }

    /* JADX INFO: loaded from: classes28.dex */
    public interface CompileProbeListener {
        void onCompileProbeResult(int i, int i2, float f, int i3, int i4, int i5, int i6, float f2);
    }

    /* JADX INFO: loaded from: classes28.dex */
    public interface CompileProbeListener2 {
        void onCompileProbeResult2(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, float f3);
    }

    public interface DetectQRCodeListener {
        void onDetectQRCodeResult(int i, boolean z);
    }

    public interface ExecuteCommandAndDumpInfoListener {
        void updateFFmpegInfo(String str);
    }

    /* JADX INFO: loaded from: classes34.dex */
    public interface ExecuteCommandListener {
        void onProgressChanged(int i);
    }

    public static native int nativeAVInterleaveCheckExecute(long j, int i);

    public static native long nativeAVInterleaveCheckInit(String str, long j, AVInterleaveCheckListener aVInterleaveCheckListener);

    public static native boolean nativeApplyLensNightEnhance(int i, int i2, int i3, int i4, String str, String str2, byte[][] bArr, byte[] bArr2);

    public static native void nativeCancelCompileProbe();

    public static native int nativeCheckAudioFile(String str);

    public static native int nativeCheckMVResourceIntegrity(String str);

    public static native int nativeCheckMp3File(String str);

    public static native void nativeClearCacheDiskDir(boolean z);

    public static native int nativeClearWavSeg(String str, int i, int i2);

    public static native int nativeCompileProbe(String str, String str2, int i, int i2, long j, long j2, int i3, int i4, int i5, long j3, double d, CompileProbeListener compileProbeListener, CompileProbeListener2 compileProbeListener2, int i6);

    public static native int nativeConcat(String[] strArr, String str, int i);

    public static native int nativeConcatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i, String str, String str2, String str3, String str4);

    public static native int nativeConverBitmapToRGBA(Bitmap bitmap, String str);

    public static native int nativeConverRGBAToIMG(String str, String str2, int i, int i2);

    public static native int nativeConvertJpegToMp4(String str, String str2, int i, boolean z);

    public static native long nativeCreateCurveSpeedUtils(float[] fArr, float[] fArr2);

    public static native long nativeCreateGetFrameHandler(String str);

    public static native long nativeCreateRTAudioWaveformMgr(int i, int i2, float f, int i3);

    public static native void nativeCurveSpeedDestroy(long j);

    public static native int nativeDecryptVideo(String str, String str2, String str3);

    public static native int nativeDeleteRTAudioWaveformMgr(long j);

    public static native int nativeDetachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long j, long j2, float[] fArr, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeDetachAudioFromVideosCallback(String str, Object obj, String[] strArr, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long j, long j2, float[] fArr, int i, int i2, int i3);

    public static native int nativeDetectAudioMetrics(String str, String str2, String str3, Object obj);

    public static native byte[][] nativeDetectScanPicture(Bitmap bitmap, String str, String str2, DetectQRCodeListener detectQRCodeListener);

    public static native int nativeExecuteFFmpegCommand(String str, ExecuteCommandListener executeCommandListener);

    public static native int nativeExecuteFFmpegCommandAndDumpInfo(String str, ExecuteCommandListener executeCommandListener, ExecuteCommandAndDumpInfoListener executeCommandAndDumpInfoListener);

    public static native int nativeExtractVideo(String str, String str2);

    public static native VEFaceDetectCropResult nativeFaceDetectScanPicture(Bitmap bitmap, boolean z, String str, String str2, String str3);

    public static native boolean nativeFileEncrypted(String str);

    public static native int nativeFindAudioSegmentStartTimeInOrigin(String str, int i, String str2, int i2, int i3);

    public static native String nativeFindBestRemuxSuffix(String str);

    public static native int nativeGenerateMuteWav(String str, int i, int i2, int i3);

    public static native Object nativeGetAudioAlgorithmResult(String str, String str2, int i, int i2);

    public static native int nativeGetAudioFileInfo(String str, int[] iArr);

    public static native int nativeGetAudioFileInfoForAllTracks(String str, int[][] iArr);

    public static native double nativeGetAudioVolume(byte[] bArr, int i, int i2, int i3);

    public static native VEMusicWaveBean nativeGetAudioWaveData(String str, int i, int i2, int i3, int i4, int i5);

    public static native double nativeGetAveCurveSpeed(long j);

    public static native double nativeGetCurveSpeedWithSeqDelta(long j, long j2);

    public static native void nativeGetDstBitmapSize(long j, int i, int i2, int[] iArr);

    public static native int nativeGetFileAudio(String str, String str2, ArrayList<String> arrayList, boolean z);

    public static native Object nativeGetFileInfo(String str, int[] iArr);

    public static native int nativeGetFileType(String str);

    public static native int nativeGetFrameWithHandler(long j, Bitmap bitmap, int i, int i2, int i3, boolean z);

    public static native int nativeGetImageThumb(String str, int i, int i2, boolean z, Object obj);

    public static native String nativeGetInfostickerConvertTotemplate(String str);

    public static native String nativeGetMD5FileName(String str, String str2);

    public static native Object nativeGetMVAlgorithmConfigs(String str, String[] strArr, int i);

    public static native String nativeGetMVAlgorithmConfigsWithMultiImage(String str, String[] strArr, int i);

    public static native int nativeGetMetaData(String str, ArrayList<String> arrayList);

    public static native String nativeGetMimeType(String str);

    public static native int nativeGetMusicDefaultAlgorithm(String str, String str2);

    public static native VEMusicWaveBean nativeGetResampleMusicWaveData(float[] fArr, int i, int i2);

    public static native int nativeGetTargetBitmapSize(String str, int i, int i2, int[] iArr);

    public static native Object nativeGetVEFileInfo(String str);

    public static native int nativeGetVideoFrame(String str, int[] iArr, int i, int i2, boolean z, Object obj, int i3, boolean z2);

    public static native int nativeGetVideoFrame2(String str, int[] iArr, int i, int i2, boolean z, Object obj);

    public static native int nativeGetVideoFrame3(String str, int[] iArr, int i, int i2, boolean z, Object obj);

    public static native int nativeGetVideoFrame4(String str, int[] iArr, int i, int i2, boolean z, boolean z2, Object obj, boolean z3);

    public static native int nativeGetVideoFrameData(String str, int i, int i2, int i3, int i4, int i5, Object obj);

    public static native int nativeGetVideoFrameMore(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, Object obj);

    public static native int nativeGetVideoFrameWithBitmap(String str, Bitmap bitmap, int i, int i2, int i3, boolean z);

    public static native int nativeGetVideoThumb(String str, int i, Object obj, boolean z, int i2, int i3, long j, int i4);

    public static native int nativeInitAREffect();

    public static native long nativeInitResampleContext(int i, int i2, int i3, int i4);

    public static native int nativeIsByteVC110Bit(byte[] bArr);

    public static native int nativeIsCanImport(String str);

    public static native int nativeIsCanImportFd(int i, long j, long j2);

    public static native int nativeIsCanTransCode(String str, int i, int i2);

    public static native int nativeIsCanTransCodeWithResult(String str, int i, int i2, String[] strArr);

    public static native boolean nativeIsFrameCanDrop(ByteBuffer byteBuffer, int i, boolean z);

    public static native boolean nativeIsLivePhotoForJPEGFile(String str, String str2, boolean z);

    public static native boolean nativeIsSamiAutomationValid(double d, String str);

    public static native boolean nativeIsSupportGLES3();

    public static native long nativeLoadModel(int i, String str);

    public static native long nativeMapSeqDeltaToTrimDelta(long j, long j2);

    public static native long nativeMapTrimDeltaToSeqDelta(long j, long j2);

    public static native int nativeMixAudio(ArrayList<String> arrayList, String str, Object obj);

    public static native int nativeMux(String str, String str2, String str3);

    public static native byte[][] nativeObjectScanPicture(Bitmap bitmap, int i, int i2);

    public static native int nativePcmResampleFilter(long j, byte[] bArr, byte[] bArr2, int i, int i2);

    public static native int nativeProcessAudioTuning(String[] strArr, int[] iArr, int[] iArr2, float f, float f2, String str, String str2);

    public static native int nativeRTAudioWaveformFinish(long j);

    public static native int nativeRTAudioWaveformGetPoints(long j, float[] fArr, int i, int i2);

    public static native int nativeRTAudioWaveformProcess(long j, float[][] fArr, int i, int i2);

    public static native int nativeRTAudioWaveformReset(long j);

    public static native int nativeRegisterDecoderForEffect();

    public static native void nativeReleaseGetFrameHandler(long j);

    public static native int nativeReleaseGetFramesReader();

    public static native void nativeReleaseResampleContext(long j);

    public static native void nativeReleaseVEMetadataCheckCallBack();

    public static native void nativeResetModel(long j);

    public static native int nativeResizeImage(String str, String str2, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeResizeRGBAImage(String str, int i, int i2, String str2, int i3, int i4, int i5, int i6);

    public static native int nativeReverseAllIFrameVideoAndMuxAudio(String str, String str2, String str3);

    public static native int nativeReverseAllIFrameVideoAndMuxAudio2(String str, String str2, String str3, TEReverseCallback tEReverseCallback);

    public static native int nativeReverseAllIVideo(String str, String str2);

    public static native int nativeReverseAllIVideo2(String str, String str2, TEReverseCallback tEReverseCallback);

    public static native boolean nativeSaveTexDescToLocal(String str);

    public static native int nativeSaveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, int i3, int i4);

    public static native List<s> nativeScanAny(VEBachAlgorithmParam vEBachAlgorithmParam);

    public static native byte[][] nativeScanPicture(Bitmap bitmap, String str, boolean z, long j, int i, int i2);

    public static native VEBachSceneRecognitionResult nativeSceneRecognitionScanPicture(Bitmap bitmap, int i, String str, String str2, String str3);

    public static native int nativeSetCurveSpeedData(long j, float[] fArr, float[] fArr2);

    public static native void nativeSetFrameCacheDiskDir(String str);

    public static native int nativeSetMetaData(String str, String str2, Map<String, String> map);

    public static native void nativeSetPageMode(int i);

    public static native void nativeSetSeqDuration(long j, long j2);

    public static native void nativeSetVEMetadataReadAllowlistConfig(boolean z, boolean z2, String str, String str2, Object obj);

    public static native void nativeSetVEMetadataWriteAllowlistConfig(boolean z, boolean z2, String str, String str2, Object obj);

    public static native int nativeSplitVideo(String str, String[] strArr, int[] iArr, boolean z);

    public static native int nativeTransCodecAudioFile(String str, int i, int i2, String str2, int i3, int i4, int i5);

    public static native VETransformResult nativeTransformToIFrameAllStrategy(String str, int i, int i2, int i3, float f, float f2, float f3);

    public static native int nativeTrimFile(String str, String str2, int[] iArr, int[] iArr2);

    public static native double nativeVoiceActivityDetection(byte[] bArr, long j, int i, int i2);

    public static native int nativeconvertVideo2Gif(String str, String str2, String str3, int i, float f, int i2, int i3, int i4, int i5, String str4, ExecuteCommandListener executeCommandListener);

    public static native int nativeconvertVideo2Webp(int i, int i2, String str, int i3, int i4, int i5, String str2, ExecuteCommandListener executeCommandListener);

    public static native int nativecropAudio(String str, String str2, long j, long j2);

    public static native int nativecutVideo(String str, String str2, String str3, String str4);

    public static native int nativegeneratePalettegen(String str, int i, int i2, String str2);

    public static native int nativereverseAudio(String str, String str2);

    public static native int nativetransCodeAudio(String str, String str2, int i, int i2, int i3, String str3);

    public static native int remuxVideo(String str, String str2);

    static {
        TENativeLibsLoader.loadLibrary();
        getFrameInterval = 1000L;
    }

    public static int initAREffect() {
        return nativeInitAREffect();
    }

    public static boolean isSupportGLES3() {
        return nativeIsSupportGLES3();
    }

    public static int registerDecoderForEffect() {
        return nativeRegisterDecoderForEffect();
    }

    public static int releaseGetFramesReader() {
        return nativeReleaseGetFramesReader();
    }

    public static int checkAudioFile(String str) {
        return nativeCheckAudioFile(str);
    }

    public static int checkMVResourceIntegrity(String str) {
        return nativeCheckMVResourceIntegrity(str);
    }

    public static int checkMp3File(String str) {
        return nativeCheckMp3File(str);
    }

    public static void clearCacheDiskDir(boolean z) {
        nativeClearCacheDiskDir(z);
    }

    public static long createGetFrameHandler(String str) {
        return nativeCreateGetFrameHandler(str);
    }

    public static int deleteRTAudioWaveformMgr(long j) {
        return nativeDeleteRTAudioWaveformMgr(j);
    }

    public static boolean fileEncrypted(String str) {
        return nativeFileEncrypted(str);
    }

    public static String findBestRemuxSuffix(String str) {
        if (str.length() > 0) {
            String strNativeFindBestRemuxSuffix = nativeFindBestRemuxSuffix(str);
            if (strNativeFindBestRemuxSuffix.length() > 0) {
                return strNativeFindBestRemuxSuffix;
            }
            throw new VEException(-205, "This file does not support re-packaging for the time being!");
        }
        throw new VEException(-100, "Please check the input parameters!");
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0095: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:16777365), block:B:40:0x0095 */
    public static Bitmap getBitmapFromPath(String str) throws Throwable {
        Bitmap bitmapLoadBitmap;
        Bitmap bitmap;
        Bitmap bitmapCopy;
        Bitmap bitmap2 = null;
        try {
            try {
                try {
                    bitmapLoadBitmap = BitmapLoader.loadBitmap(str, 0, 0);
                    if (bitmapLoadBitmap != null) {
                        try {
                            int width = bitmapLoadBitmap.getWidth();
                            int height = bitmapLoadBitmap.getHeight();
                            if (width * height > 4000000) {
                                float fSqrt = (float) (1.0d / Math.sqrt((width * height) / 4000000));
                                Matrix matrix = new Matrix();
                                matrix.postScale(fSqrt, fSqrt);
                                bitmapCopy = Bitmap.createBitmap(bitmapLoadBitmap, 0, 0, width, height, matrix, true);
                            } else {
                                bitmapCopy = bitmapLoadBitmap.copy(Bitmap.Config.ARGB_8888, true);
                            }
                            if (!bitmapLoadBitmap.isRecycled()) {
                                bitmapLoadBitmap.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLoadBitmap);
                            }
                            if (bitmap2 != null && !bitmap2.isRecycled()) {
                                bitmap2.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
                            }
                            return bitmapCopy;
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            C2484209oO.LIZJ("TEVideoUtils", e.getMessage());
                            if (bitmapLoadBitmap != null && !bitmapLoadBitmap.isRecycled()) {
                                bitmapLoadBitmap.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLoadBitmap);
                            }
                            return null;
                        } catch (OutOfMemoryError e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                            C2484209oO.LIZJ("TEVideoUtils", "bitmap OutOfMemoryError");
                            if (bitmapLoadBitmap != null && !bitmapLoadBitmap.isRecycled()) {
                                bitmapLoadBitmap.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLoadBitmap);
                            }
                            return null;
                        }
                    }
                    bitmapCopy = null;
                    bitmap2 = bitmapLoadBitmap;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
                    }
                    return bitmapCopy;
                } catch (Throwable th) {
                    th = th;
                    bitmap2 = bitmap;
                    TryCatchGuardChecker.doCheck(th);
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                bitmapLoadBitmap = null;
            } catch (OutOfMemoryError e4) {
                e = e4;
                bitmapLoadBitmap = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int getFileType(String str) {
        return nativeGetFileType(str);
    }

    public static String getInfostickerConvertTotemplate(String str) {
        return nativeGetInfostickerConvertTotemplate(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HashMap<String, String> getMetaData(String str) {
        ArrayList arrayList = new ArrayList();
        if (nativeGetMetaData(str, arrayList) != 0) {
            C2484209oO.LIZJ("TEVideoUtils", "failed to get MetaData");
            return null;
        }
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < arrayList.size() / 2; i++) {
            int i2 = i * 2;
            map.put(ListProtector.get(arrayList, i2), ListProtector.get(arrayList, i2 + 1));
        }
        return map;
    }

    public static String getMimeType(String str) {
        return nativeGetMimeType(str);
    }

    public static Object getVEVideoFileInfo(String str) {
        return nativeGetVEFileInfo(str);
    }

    public static int isByteVC110Bit(byte[] bArr) {
        return nativeIsByteVC110Bit(bArr);
    }

    public static int isCanImport(String str) {
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeIsCanImport(str);
    }

    public static String md5ByteToString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(b & 255);
        }
        return sb.toString();
    }

    public static void releaseGetFrameHandler(long j) {
        nativeReleaseGetFrameHandler(j);
    }

    public static void releaseResampleContext(long j) {
        nativeReleaseResampleContext(j);
    }

    public static void resetModel(long j) {
        nativeResetModel(j);
    }

    public static int rtAudioWaveformFinish(long j) {
        return nativeRTAudioWaveformFinish(j);
    }

    public static int rtAudioWaveformReset(long j) {
        return nativeRTAudioWaveformReset(j);
    }

    public static boolean saveTexDescToLocal(String str) {
        return nativeSaveTexDescToLocal(str);
    }

    public static VEFaceDetectCropResult scanFaceDetectCrop(C0HLZ c0hlz) {
        Bitmap bitmapLoadBitmapCompat = c0hlz.bitmap;
        if (bitmapLoadBitmapCompat == null) {
            if (VERuntime.getInstance().getContext() == null) {
                C2484209oO.LIZJ("TEVideoUtils", "VEFaceDetectCropResult.scanPicture VERuntime context == null, return result null");
                return null;
            }
            bitmapLoadBitmapCompat = BitmapLoader.loadBitmapCompat(VERuntime.getInstance().getContext().getContentResolver(), c0hlz.picturePath, c0hlz.reqWidth, c0hlz.reqHeight);
        }
        return nativeFaceDetectScanPicture(bitmapLoadBitmapCompat, c0hlz.LIZ, c0hlz.LIZIZ, c0hlz.LIZJ, c0hlz.LIZLLL);
    }

    public static List<s> scanPicture(VEBachAlgorithmParam vEBachAlgorithmParam) {
        ArrayList arrayList = new ArrayList();
        Context context = VERuntime.getInstance().getContext();
        if (context == null) {
            C2484209oO.LIZJ("TEVideoUtils", "scanPicture VERuntime context == null, return result empty list");
            return arrayList;
        }
        Bitmap bitmapLoadBitmapCompat = vEBachAlgorithmParam.bitmap;
        if (bitmapLoadBitmapCompat == null) {
            bitmapLoadBitmapCompat = BitmapLoader.loadBitmapCompat(context.getContentResolver(), vEBachAlgorithmParam.picturePath, vEBachAlgorithmParam.reqWidth, vEBachAlgorithmParam.reqHeight);
        }
        int algorithmType = vEBachAlgorithmParam.getAlgorithmType();
        if (algorithmType == 12) {
            C1DMO c1dmo = (C1DMO) vEBachAlgorithmParam;
            nativeObjectScanPicture(bitmapLoadBitmapCompat, c1dmo.LIZ, c1dmo.LIZLLL);
        } else {
            if (algorithmType == 11) {
                return scanQRCode((C448700Hie) vEBachAlgorithmParam);
            }
            if (algorithmType != 15) {
                if (algorithmType == 14) {
                    arrayList.add(scanFaceDetectCrop((C0HLZ) vEBachAlgorithmParam));
                    return arrayList;
                }
                if (algorithmType == 1 || algorithmType == 0) {
                    vEBachAlgorithmParam.bitmap = bitmapLoadBitmapCompat;
                    return nativeScanAny(vEBachAlgorithmParam);
                }
            } else {
                throw null;
            }
        }
        return arrayList;
    }

    public static List<s> scanQRCode(C448700Hie c448700Hie) throws Throwable {
        if (c448700Hie.getBitmap() != null) {
            return scanPictureFromBitmap(c448700Hie.getBitmap(), c448700Hie.algorithmConfig);
        }
        Bitmap bitmapFromPath = getBitmapFromPath(c448700Hie.picturePath);
        List<s> listScanPictureFromBitmap = scanPictureFromBitmap(bitmapFromPath, c448700Hie.algorithmConfig);
        if (bitmapFromPath != null && !bitmapFromPath.isRecycled()) {
            bitmapFromPath.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapFromPath);
        }
        return listScanPictureFromBitmap;
    }

    public static void setFrameCacheDiskDir(String str) {
        nativeSetFrameCacheDiskDir(str);
    }

    public static int AVInterleaveCheckExecute(long j, int i) {
        if (-1 == j) {
            return -112;
        }
        return nativeAVInterleaveCheckExecute(j, i);
    }

    public static int ConverBitmapToRGBA(Bitmap bitmap, String str) {
        return nativeConverBitmapToRGBA(bitmap, str);
    }

    public static int concat(String[] strArr, String str) {
        return nativeConcat(strArr, str, 0);
    }

    public static long createCurveSpeedUtils(float[] fArr, float[] fArr2) {
        return nativeCreateCurveSpeedUtils(fArr, fArr2);
    }

    public static int executeFFmpegCommand(String str, ExecuteCommandListener executeCommandListener) {
        return nativeExecuteFFmpegCommand(str, executeCommandListener);
    }

    public static int extractVideo(String str, String str2) {
        return nativeExtractVideo(str, str2);
    }

    public static int getAudioFileInfo(String str, int[] iArr) {
        return nativeGetAudioFileInfo(str, iArr);
    }

    public static int getAudioFileInfoForAllTracks(String str, int[][] iArr) {
        return nativeGetAudioFileInfoForAllTracks(str, iArr);
    }

    public static String getMD5FileName(String str, String str2) {
        if (VEConfigCenter.getInstance().getValue("ve_use_java_get_md5_file_name", false).booleanValue()) {
            return getMD5FileNameFromJava(str, str2);
        }
        return nativeGetMD5FileName(str, str2);
    }

    public static String getMD5FileNameFromJava(String str, String str2) {
        String strValueOf;
        String string = "";
        try {
            String strMd5ByteToString = md5ByteToString(MessageDigest.getInstance("MD5").digest(str2.getBytes()));
            if (str.isEmpty() || strMd5ByteToString.isEmpty()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            if (str.charAt(str.length() - 1) == '/') {
                strValueOf = "";
            } else {
                strValueOf = String.valueOf('/');
            }
            sb.append(str);
            sb.append(strValueOf);
            sb.append(strMd5ByteToString);
            string = sb.toString();
            return string;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getMD5FileNameFromJava error:");
            sbLIZ.append(e.toString());
            C2484209oO.LIZJ("TEVideoUtils", C2188811AlT.LIZIZ(sbLIZ));
            return string;
        }
    }

    public static Object getMVAlgorithmConfigs(String str, List<String> list) {
        int size = list.size();
        String[] strArr = new String[size];
        list.toArray(strArr);
        return nativeGetMVAlgorithmConfigs(str, strArr, size);
    }

    public static String getMVAlgorithmConfigsWithMultiImage(String str, List<String> list) {
        int size = list.size();
        String[] strArr = new String[size];
        list.toArray(strArr);
        return nativeGetMVAlgorithmConfigsWithMultiImage(str, strArr, size);
    }

    public static int getMusicDefaultAlgorithm(String str, String str2) {
        return nativeGetMusicDefaultAlgorithm(str, str2);
    }

    public static Object getVideoFileInfo(String str, int[] iArr) {
        return nativeGetFileInfo(str, iArr);
    }

    public static boolean isSamiAutomationValid(double d, String str) {
        return nativeIsSamiAutomationValid(d, str);
    }

    public static long loadModel(int i, String str) {
        return nativeLoadModel(i, str);
    }

    public static int reverseAllIVideo(String str, String str2) {
        return nativeReverseAllIVideo(str, str2);
    }

    public static int reverseAudio(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        return nativereverseAudio(str, str2);
    }

    public static List<s> scanPictureFromBitmap(Bitmap bitmap, String str) {
        ArrayList arrayList = new ArrayList();
        byte[][] bArrNativeScanPicture = nativeScanPicture(bitmap, str, true, 0L, 0, 0);
        if (bArrNativeScanPicture != null) {
            for (byte[] bArr : bArrNativeScanPicture) {
                arrayList.add(VEBachQRCodeResult.fromCameraParcel(bArr));
            }
        }
        return arrayList;
    }

    public static long AVInterleaveCheckInit(String str, long j, AVInterleaveCheckListener aVInterleaveCheckListener) {
        return nativeAVInterleaveCheckInit(str, j, aVInterleaveCheckListener);
    }

    public static int clearWavSeg(String str, int i, int i2) {
        return nativeClearWavSeg(str, i, i2);
    }

    public static int concat(String[] strArr, String str, int i) {
        return nativeConcat(strArr, str, i);
    }

    public static int decryptVideo(String str, String str2, String str3) {
        return nativeDecryptVideo(str, str2, str3);
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00e5: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:50331877), block:B:55:0x00e5 */
    public static VEBachQRCodeResult detectAndScanPicture(C2254461DLw c2254461DLw, C448700Hie c448700Hie, DetectQRCodeListener detectQRCodeListener) throws Throwable {
        Bitmap bitmap;
        Bitmap bitmapLoadBitmap;
        Bitmap bitmapCopy;
        byte[][] bArrNativeDetectScanPicture;
        Bitmap bitmap2 = null;
        if (c2254461DLw.getAlgorithmType() != 13) {
            C2484209oO.LIZ("detectAndScanPicture", "AlgorithmType type error");
            return null;
        }
        try {
            try {
                if (c2254461DLw.getBitmap() != null) {
                    bArrNativeDetectScanPicture = nativeDetectScanPicture(c2254461DLw.getBitmap(), c2254461DLw.algorithmConfig, c448700Hie.algorithmConfig, detectQRCodeListener);
                } else {
                    try {
                        bitmapLoadBitmap = BitmapLoader.loadBitmap(c2254461DLw.getPicturePath(), 0, 0);
                        if (bitmapLoadBitmap != null) {
                            try {
                                int width = bitmapLoadBitmap.getWidth();
                                int height = bitmapLoadBitmap.getHeight();
                                if (width * height > 4000000) {
                                    float fSqrt = (float) (1.0d / Math.sqrt((width * height) / 4000000));
                                    Matrix matrix = new Matrix();
                                    matrix.postScale(fSqrt, fSqrt);
                                    bitmapCopy = Bitmap.createBitmap(bitmapLoadBitmap, 0, 0, width, height, matrix, true);
                                } else {
                                    bitmapCopy = bitmapLoadBitmap.copy(Bitmap.Config.ARGB_8888, true);
                                }
                                if (!bitmapLoadBitmap.isRecycled()) {
                                    bitmapLoadBitmap.recycle();
                                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLoadBitmap);
                                } else if (!bitmapLoadBitmap.isRecycled()) {
                                    bitmapLoadBitmap.recycle();
                                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLoadBitmap);
                                }
                            } catch (Exception e) {
                                e = e;
                                TryCatchGuardChecker.doCheck(e);
                                C2484209oO.LIZJ("TEVideoUtils", e.getMessage());
                                if (bitmapLoadBitmap != null && !bitmapLoadBitmap.isRecycled()) {
                                    bitmapLoadBitmap.recycle();
                                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLoadBitmap);
                                }
                                return null;
                            } catch (OutOfMemoryError e2) {
                                e = e2;
                                TryCatchGuardChecker.doCheck(e);
                                C2484209oO.LIZJ("TEVideoUtils", "bitmap OutOfMemoryError");
                                if (bitmapLoadBitmap != null && !bitmapLoadBitmap.isRecycled()) {
                                    bitmapLoadBitmap.recycle();
                                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLoadBitmap);
                                }
                                return null;
                            }
                        } else {
                            bitmapCopy = null;
                        }
                        bArrNativeDetectScanPicture = nativeDetectScanPicture(bitmapCopy, c2254461DLw.algorithmConfig, c448700Hie.algorithmConfig, detectQRCodeListener);
                        if (bitmapCopy != null && !bitmapCopy.isRecycled()) {
                            bitmapCopy.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCopy);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        bitmapLoadBitmap = null;
                    } catch (OutOfMemoryError e4) {
                        e = e4;
                        bitmapLoadBitmap = null;
                    }
                }
                if (bArrNativeDetectScanPicture != null && bArrNativeDetectScanPicture.length > 0) {
                    return VEBachQRCodeResult.fromCameraParcel(bArrNativeDetectScanPicture[0]);
                }
                C2484209oO.LIZ("detectAndScanPicture", "picture qrcode detect ret is null");
                return null;
            } catch (Throwable th) {
                th = th;
                bitmap2 = bitmap;
                TryCatchGuardChecker.doCheck(th);
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    bitmap2.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            if (bitmap2 != null) {
                bitmap2.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
            }
            throw th;
        }
    }

    public static int executeFFmpegCommandAndDumpInfo(String str, ExecuteCommandListener executeCommandListener, ExecuteCommandAndDumpInfoListener executeCommandAndDumpInfoListener) {
        return nativeExecuteFFmpegCommandAndDumpInfo(str, executeCommandListener, executeCommandAndDumpInfoListener);
    }

    public static VEMusicWaveBean getResampleMusicWaveData(float[] fArr, int i, int i2) {
        return nativeGetResampleMusicWaveData(fArr, i, i2);
    }

    public static int isCanImportFd(int i, long j, long j2) {
        if (i <= 0) {
            return -100;
        }
        return nativeIsCanImportFd(i, j, j2);
    }

    public static int isCanTransCode(String str, int i, int i2) {
        return nativeIsCanTransCode(str, i, i2);
    }

    public static boolean isFrameCanDrop(ByteBuffer byteBuffer, int i, boolean z) {
        return nativeIsFrameCanDrop(byteBuffer, i, z);
    }

    public static boolean isLivePhotoForJPEGFile(String str, String str2, boolean z) {
        return nativeIsLivePhotoForJPEGFile(str, str2, z);
    }

    public static int mixAudio(ArrayList<String> arrayList, String str, Object obj) {
        return nativeMixAudio(arrayList, str, obj);
    }

    public static int mux(String str, String str2, String str3) {
        return nativeMux(str, str2, str3);
    }

    public static int reverseAllIVideo(String str, String str2, TEReverseCallback tEReverseCallback) {
        return nativeReverseAllIVideo2(str, str2, tEReverseCallback);
    }

    public static int reverseAllIVideoAndMuxAudio(String str, String str2, String str3) {
        return nativeReverseAllIFrameVideoAndMuxAudio(str, str2, str3);
    }

    public static int ConverRGBAToIMG(String str, String str2, int i, int i2) {
        return nativeConverRGBAToIMG(str, str2, i, i2);
    }

    public static int convertJpegToMp4(String str, String str2, int i, boolean z) {
        return nativeConvertJpegToMp4(str, str2, i, z);
    }

    public static long createRTAudioWaveformMgr(int i, int i2, float f, int i3) {
        return nativeCreateRTAudioWaveformMgr(i, i2, f, i3);
    }

    public static int cropAudio(String str, String str2, long j, long j2) {
        return nativecropAudio(str, str2, j, j2);
    }

    public static int cutVideo(String str, String str2, String str3, String str4) {
        return nativecutVideo(str, str2, str3, str4);
    }

    public static int detectAudioMetrics(String str, String str2, String str3, Object obj) {
        return nativeDetectAudioMetrics(str, str2, str3, obj);
    }

    public static int generateMuteWav(String str, int i, int i2, int i3) {
        return nativeGenerateMuteWav(str, i, i2, i3);
    }

    public static int generatePalettegen(String str, int i, int i2, String str2) {
        return nativegeneratePalettegen(str, i, i2, str2);
    }

    public static Object getAudioAlgorithmResult(String str, String str2, int i, int i2) {
        return nativeGetAudioAlgorithmResult(str, str2, i, i2);
    }

    public static double getAudioVolume(byte[] bArr, int i, int i2, int i3) {
        return nativeGetAudioVolume(bArr, i, i2, i3);
    }

    public static int getFileAudio(String str, String str2, ArrayList<String> arrayList, boolean z) {
        return nativeGetFileAudio(str, str2, arrayList, z);
    }

    public static long initResampleContext(int i, int i2, int i3, int i4) {
        return nativeInitResampleContext(i, i2, i3, i4);
    }

    public static int isCanTransCodeWithResult(String str, int i, int i2, String[] strArr) {
        return nativeIsCanTransCodeWithResult(str, i, i2, strArr);
    }

    public static int reverseAllIVideoAndMuxAudio(String str, String str2, String str3, TEReverseCallback tEReverseCallback) {
        return nativeReverseAllIFrameVideoAndMuxAudio2(str, str2, str3, tEReverseCallback);
    }

    public static int rtAudioWaveformGetPoints(long j, float[] fArr, int i, int i2) {
        return nativeRTAudioWaveformGetPoints(j, fArr, i, i2);
    }

    public static int rtAudioWaveformProcess(long j, float[][] fArr, int i, int i2) {
        return nativeRTAudioWaveformProcess(j, fArr, i, i2);
    }

    public static int splitVideo(String str, String[] strArr, int[] iArr, boolean z) {
        return nativeSplitVideo(str, strArr, iArr, z);
    }

    public static int trimVideoFile(String str, int[] iArr, String str2, int[] iArr2) {
        return nativeTrimFile(str, str2, iArr, iArr2);
    }

    public static double voiceActivityDetection(byte[] bArr, long j, int i, int i2) {
        return nativeVoiceActivityDetection(bArr, j, i, i2);
    }

    public static int findAudioSegmentStartTimeInOrigin(String str, int i, String str2, int i2, int i3) {
        return nativeFindAudioSegmentStartTimeInOrigin(str, i, str2, i2, i3);
    }

    public static Bitmap getFrameWithHandler(long j, int i, int i2, int i3, boolean z) {
        int[] iArr = new int[2];
        nativeGetDstBitmapSize(j, i2, i3, iArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap == null) {
            return null;
        }
        if (nativeGetFrameWithHandler(j, bitmapCreateBitmap, i, iArr[0], iArr[1], z) != 0) {
            if (!bitmapCreateBitmap.isRecycled()) {
                bitmapCreateBitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
            }
            return null;
        }
        return bitmapCreateBitmap;
    }

    public static int getImageThumb(String str, int i, int i2, boolean z, Object obj) {
        return nativeGetImageThumb(str, i, i2, z, obj);
    }

    public static Bitmap getVideoFrame(String str, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        Bitmap bitmapCreateBitmap;
        int[] iArr = new int[2];
        if (nativeGetTargetBitmapSize(str, i2, i3, iArr) != 0 || (i4 = iArr[0]) <= 0 || (i5 = iArr[1]) <= 0 || (bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888)) == null || nativeGetVideoFrameWithBitmap(str, bitmapCreateBitmap, i, i2, i3, z) != 0) {
            return null;
        }
        return bitmapCreateBitmap;
    }

    public static int pcmResampleFilter(long j, byte[] bArr, byte[] bArr2, int i, int i2) {
        return nativePcmResampleFilter(j, bArr, bArr2, i, i2);
    }

    public static void setVEMetadataReadAllowlistConfig(boolean z, boolean z2, String str, String str2, Object obj) {
        try {
            nativeSetVEMetadataReadAllowlistConfig(z, z2, str, str2, obj);
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZJ("TEVideoUtils", "Load library error");
        }
    }

    public static void setVEMetadataWriteAllowlistConfig(boolean z, boolean z2, String str, String str2, Object obj) {
        try {
            nativeSetVEMetadataWriteAllowlistConfig(z, z2, str, str2, obj);
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZJ("TEVideoUtils", "Load library error");
        }
    }

    public static VEMusicWaveBean getAudioWaveData(String str, int i, int i2, int i3, int i4, int i5) {
        return nativeGetAudioWaveData(str, i, i2, i3, i4, i5);
    }

    public static int getVideoFrames2(String str, int[] iArr, int i, int i2, boolean z, Object obj) {
        return nativeGetVideoFrame2(str, iArr, i, i2, z, obj);
    }

    public static int getVideoFrames3(String str, int[] iArr, int i, int i2, boolean z, Object obj) {
        return nativeGetVideoFrame3(str, iArr, i, i2, z, obj);
    }

    public static int transCodeAudio(String str, String str2, int i, int i2, int i3, String str3) {
        return nativetransCodeAudio(str, str2, i, i2, i3, str3);
    }

    public static byte[] applyLensNightEnhance(int i, int i2, int i3, int i4, String str, String str2, byte[][] bArr) {
        if (i <= 0 || i2 <= 0 || i4 < bArr.length) {
            return null;
        }
        byte[] bArr2 = new byte[((i * i2) * 3) / 2];
        if (!nativeApplyLensNightEnhance(i, i2, i3, i4, str, str2, bArr, bArr2)) {
            return null;
        }
        return bArr2;
    }

    public static int getVideoFrameData(String str, int i, int i2, int i3, int i4, EnumC20137713qp enumC20137713qp, Object obj) {
        return nativeGetVideoFrameData(str, i, i2, i3, i4, enumC20137713qp.getValue(), obj);
    }

    public static int processAudioTuning(String[] strArr, int[] iArr, int[] iArr2, float f, float f2, String str, String str2) {
        return nativeProcessAudioTuning(strArr, iArr, iArr2, f, f2, str, str2);
    }

    public static int resizeImage(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        return nativeResizeImage(str, str2, i, i2, i3, i4, z);
    }

    public static int transCodeAudioFile(String str, int i, int i2, String str2, int i3, int i4, int i5) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        return nativeTransCodecAudioFile(str, i, i2, str2, i3, i4, i5);
    }

    public static int convertVideo2Webp(int i, int i2, String str, int i3, int i4, int i5, String str2, ExecuteCommandListener executeCommandListener) {
        return nativeconvertVideo2Webp(i, i2, str, i3, i4, i5, str2, executeCommandListener);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, Object obj, int i3, boolean z2) {
        return nativeGetVideoFrame(str, iArr, i, i2, z, obj, i3, z2);
    }

    public static int getVideoThumb(String str, int i, Object obj, boolean z, int i2, int i3, long j, int i4) {
        return nativeGetVideoThumb(str, i, obj, z, i2, i3, j, i4);
    }

    public static int resizeRGBAImage(String str, int i, int i2, String str2, int i3, int i4, int i5, int i6) {
        return nativeResizeRGBAImage(str, i, i2, str2, i3, i4, i5, i6);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, int i3, int i4) {
        return nativeSaveVideoFrames(str, iArr, i, i2, z, str2, i3, i4);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, boolean z2, Object obj, boolean z3) {
        return nativeGetVideoFrame4(str, iArr, i, i2, z, z2, obj, z3);
    }

    public static int getVideoFramesMore(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, Object obj) {
        return nativeGetVideoFrameMore(str, iArr, i, i2, z, z2, i3, z3, obj);
    }

    public static int concatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i, String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && strArr.length != 0 && jArr.length == strArr.length && strArr.length == strArr2.length && strArr.length == jArr2.length) {
            C0VSJ c0vsj = new C0VSJ(str3.substring(0, str3.lastIndexOf("/")));
            if (!c0vsj.exists() && !c0vsj.mkdirs()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("create video output dir failed. Output Video Directory: ");
                sbLIZ.append(str3);
                C2484209oO.LIZJ("TEVideoUtils", C2188811AlT.LIZIZ(sbLIZ));
                return -114;
            }
            C0VSJ c0vsj2 = new C0VSJ(str4.substring(0, str4.lastIndexOf("/")));
            if (!c0vsj2.exists() && !c0vsj2.mkdirs()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("create audio output dir failed. Output audio Directory: ");
                sbLIZ2.append(str4);
                C2484209oO.LIZJ("TEVideoUtils", C2188811AlT.LIZIZ(sbLIZ2));
                return -114;
            }
            return nativeConcatRecordFrag(strArr, jArr, strArr2, jArr2, z, i, str, str2, str3, str4);
        }
        C2484209oO.LIZJ("TEVideoUtils", "ConmatRecordFrag parameter error!");
        return -100;
    }

    public static int convertVideo2Gif(String str, String str2, String str3, int i, float f, int i2, int i3, int i4, int i5, String str4, ExecuteCommandListener executeCommandListener) {
        return nativeconvertVideo2Gif(str, str2, str3, i, f, i2, i3, i4, i5, str4, executeCommandListener);
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long j, long j2, float[] fArr, int i, int i2, int i3, int i4) {
        return nativeDetachAudioFromVideos(str, strArr, jArr, jArr2, jArr3, jArr4, j, j2, fArr, i, i2, i3, i4, VEConfigCenter.getInstance().getValue("ve_enable_fix_detach_wav_format", true).booleanValue());
    }

    public static int detachAudioFromVideosCallback(String str, Object obj, String[] strArr, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long j, long j2, float[] fArr, int i, int i2, int i3) {
        return nativeDetachAudioFromVideosCallback(str, obj, strArr, jArr, jArr2, jArr3, jArr4, j, j2, fArr, i, i2, i3);
    }
}
