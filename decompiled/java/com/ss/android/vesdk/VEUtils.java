package com.ss.android.vesdk;

import X.C08FF;
import X.C0HLZ;
import X.C0VSJ;
import X.C0VSV;
import X.C1404320meE;
import X.C1464600oDS;
import X.C1DON;
import X.C1DOO;
import X.C1DP2;
import X.C1DP3;
import X.C1DP4;
import X.C20144413ru;
import X.C2188811AlT;
import X.C2484209oO;
import X.C448700Hie;
import X.C786410Ut5;
import X.EnumC1700000uL8;
import X.EnumC20137713qp;
import X.InterfaceC1286300jZs;
import X.InterfaceC1286330jZv;
import X.InterfaceC1286340jZw;
import X.InterfaceC1407610mjX;
import X.InterfaceC1700010uL9;
import X.InterfaceC1700020uLA;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEMVAudioAlgorithmResult;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.ttve.model.VETransformResult;
import com.ss.android.ttve.nativePort.OnTEAudioStreamVCDataReceivedListener;
import com.ss.android.ttve.nativePort.TEAudioMetricsCallback;
import com.ss.android.ttve.nativePort.TEAudioStreamVCUtils;
import com.ss.android.ttve.nativePort.TEAudioUtilsCallback;
import com.ss.android.ttve.nativePort.TEEffectUtils;
import com.ss.android.ttve.nativePort.TEImageFactory;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.algorithm.VEBachAlgorithmParam;
import com.ss.android.vesdk.algorithm.VEBachQRCodeResult;
import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;
import com.ss.android.vesdk.algorithm.s;
import com.ss.android.vesdk.utils.BitmapLoader;
import com.tts.oecverify.BdTuring;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: loaded from: classes36.dex */
public class VEUtils {
    public static InterfaceC1700010uL9 checkAudioFileStandaloneRouterCallback;
    public static C1DP3 dumpInfoCallback;
    public static InterfaceC1700020uLA standaloneRouterCallback;

    public static boolean clearResizeImageWithEffectCache() {
        return TEEffectUtils.nativeResizeImageWithEffect2(null, null, true);
    }

    public static String getVideoEncodeTypeByID(int i) {
        return i != 2 ? i != 5 ? i != 13 ? i != 28 ? i != 140 ? i != 168 ? i != 174 ? "unknown" : "bytevc1" : "vp9" : "vp8" : "h264" : "mpeg4" : "h263" : "mpeg2";
    }

    public static int initAREffect() {
        return TEVideoUtils.nativeInitAREffect();
    }

    public static boolean isSupportGLES3() {
        return TEVideoUtils.nativeIsSupportGLES3();
    }

    public static boolean isSupportHDRCapability() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("eglGetDisplay() returned error 0x");
            sbLIZ.append(EGL14.eglGetError());
            C2484209oO.LJIIIIZZ("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("eglInitialize() returned error 0x");
            sbLIZ2.append(EGL14.eglGetError());
            C2484209oO.LJIIIIZZ("VEUtils", C2188811AlT.LIZIZ(sbLIZ2));
            throw new RuntimeException("eglInitialize failed");
        }
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
        String[] strArr = {"EGL_KHR_gl_colorspace", "EGL_EXT_gl_colorspace_bt2020_pq", "EGL_EXT_gl_colorspace_bt2020_hlg"};
        int i = 0;
        while (strEglQueryString.contains(strArr[i])) {
            i++;
            if (i >= 3) {
                C2484209oO.LJI("VEUtils", "This device supports the HDR capability");
                return true;
            }
        }
        return false;
    }

    public static int registerDecoderForEffect() {
        return TEVideoUtils.nativeRegisterDecoderForEffect();
    }

    public static int releaseGetFramesReader() {
        return TEVideoUtils.nativeReleaseGetFramesReader();
    }

    public static void setCheckAudioFileStandaloneRouterCallback(InterfaceC1700010uL9 interfaceC1700010uL9) {
    }

    public static void setGetVideoFileInfoStandaloneRouterCallback(InterfaceC1700020uLA interfaceC1700020uLA) {
    }

    public static void setVEExecFFmpegAndDumpInfoCommandCallback(C1DP3 c1dp3) {
    }

    /* JADX INFO: loaded from: classes32.dex */
    public static class VEAudioFileInfo {
        public int bitRate;
        public int channelSize;
        public int duration;
        public int sampleFormat;
        public int sampleRate;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VEAudioFileInfo{sampleRate=");
            sbLIZ.append(this.sampleRate);
            sbLIZ.append(", channelSize=");
            sbLIZ.append(this.channelSize);
            sbLIZ.append(", sampleFormat=");
            sbLIZ.append(this.sampleFormat);
            sbLIZ.append(", duration=");
            sbLIZ.append(this.duration);
            sbLIZ.append(", bitRate=");
            sbLIZ.append(this.bitRate);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static class VEVideoFileInfo {
        public boolean bHDR;
        public int bitDepth;
        public int bitrate;
        public int codec;
        public int duration;
        public float floatFPS;
        public String formatName;
        public int fps;
        public int height;
        public int keyFrameCount;
        public int maxDuration;
        public int rotation;
        public int width;
        public int HDRType = -1;
        public int Color_Space = -1;
        public int Color_Primary = -1;
        public int Color_Range = -1;
        public int isSupportImport = -1;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("width = ");
            sbLIZ.append(this.width);
            sbLIZ.append(", height = ");
            sbLIZ.append(this.height);
            sbLIZ.append(", rotation = ");
            sbLIZ.append(this.rotation);
            sbLIZ.append(", duration = ");
            sbLIZ.append(this.duration);
            sbLIZ.append(", bitrate = ");
            sbLIZ.append(this.bitrate);
            sbLIZ.append(", fps = ");
            sbLIZ.append(this.fps);
            sbLIZ.append(", codec = ");
            sbLIZ.append(this.codec);
            sbLIZ.append(", keyFrameCount = ");
            sbLIZ.append(this.keyFrameCount);
            sbLIZ.append(", maxDuration = ");
            sbLIZ.append(this.maxDuration);
            sbLIZ.append(", formatName = ");
            sbLIZ.append(this.formatName);
            sbLIZ.append(", HDRType = ");
            sbLIZ.append(this.HDRType);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void releaseVEMetadataCheckCallBack() {
        TEVideoUtils.nativeReleaseVEMetadataCheckCallBack();
    }

    /* JADX INFO: loaded from: classes6.dex */
    public enum CompatibleMode {
        Legacy,
        Skip_invalid,
        Fill_silence;

        public static CompatibleMode valueOf(String str) {
            return (CompatibleMode) C08FF.LIZ(CompatibleMode.class, str);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public enum ImgType {
        Img_png,
        Img_jpeg,
        Img_webp;

        public static ImgType valueOf(String str) {
            return (ImgType) C08FF.LIZ(ImgType.class, str);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public enum Resolution {
        RES_RANDOM,
        RES_720P,
        RES_1080P,
        RES_4K;

        public static Resolution valueOf(String str) {
            return (Resolution) C08FF.LIZ(Resolution.class, str);
        }
    }

    public static int cancelStreamVCConnet(long j) {
        if (j == -1) {
            C2484209oO.LIZJ("VEUtils", "cancelStreamVCConnet handle is -1");
            return -1;
        }
        return TEAudioStreamVCUtils.cancelStreamVCConnet(j);
    }

    public static int checkAudioFile(String str) {
        return TEVideoUtils.nativeCheckAudioFile(str);
    }

    public static int checkMVResourceIntegrity(String str) {
        return TEVideoUtils.nativeCheckMVResourceIntegrity(str);
    }

    public static int checkMp3File(String str) {
        return TEVideoUtils.nativeCheckMp3File(str);
    }

    public static void clearCacheDiskDir(boolean z) {
        TEVideoUtils.nativeClearCacheDiskDir(z);
    }

    public static int destroyStreamVCHandle(long j) {
        if (j == -1) {
            C2484209oO.LIZJ("VEUtils", "destroyStreamVCHandle handle is -1");
            return -1;
        }
        return TEAudioStreamVCUtils.destroyStreamVCHandle(j);
    }

    public static boolean fileEncrypted(String str) {
        return TEVideoUtils.nativeFileEncrypted(str);
    }

    public static String findBestRemuxSuffix(String str) {
        return TEVideoUtils.findBestRemuxSuffix(str);
    }

    public static VEAudioFileInfo getAudioFileInfo(String str) {
        int[] iArr = new int[16];
        int iNativeGetAudioFileInfo = TEVideoUtils.nativeGetAudioFileInfo(str, iArr);
        if (iNativeGetAudioFileInfo == 0) {
            VEAudioFileInfo vEAudioFileInfo = new VEAudioFileInfo();
            vEAudioFileInfo.sampleRate = iArr[0];
            vEAudioFileInfo.channelSize = iArr[1];
            vEAudioFileInfo.sampleFormat = iArr[2];
            vEAudioFileInfo.duration = iArr[3];
            vEAudioFileInfo.bitRate = iArr[4];
            return vEAudioFileInfo;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAudioFileInfo error with code=");
        sbLIZ.append(iNativeGetAudioFileInfo);
        C2484209oO.LIZJ("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public static List<VEAudioFileInfo> getAudioFileInfoForAllTracks(String str) {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 32, 4);
        int iNativeGetAudioFileInfoForAllTracks = TEVideoUtils.nativeGetAudioFileInfoForAllTracks(str, iArr);
        if (iNativeGetAudioFileInfoForAllTracks >= 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < iNativeGetAudioFileInfoForAllTracks; i++) {
                VEAudioFileInfo vEAudioFileInfo = new VEAudioFileInfo();
                int[] iArr2 = iArr[i];
                vEAudioFileInfo.sampleRate = iArr2[0];
                vEAudioFileInfo.channelSize = iArr2[1];
                vEAudioFileInfo.sampleFormat = iArr2[2];
                vEAudioFileInfo.duration = iArr2[3];
                arrayList.add(vEAudioFileInfo);
            }
            return arrayList;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAudioFileInfoForAllTracks error with code=");
        sbLIZ.append(iNativeGetAudioFileInfoForAllTracks);
        C2484209oO.LIZJ("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        return new ArrayList(0);
    }

    public static int getFileType(String str) {
        return TEVideoUtils.nativeGetFileType(str);
    }

    public static String getInfostickerConvertTotemplate(String str) {
        return TEVideoUtils.nativeGetInfostickerConvertTotemplate(str);
    }

    public static HashMap<String, String> getMetaData(String str) {
        return TEVideoUtils.getMetaData(str);
    }

    public static String getMimeType(String str) {
        return TEVideoUtils.nativeGetMimeType(str);
    }

    public static String getSafeString(String str) {
        if (Build.VERSION.SDK_INT >= 29 && PatternProtector.compile("%[^n]+n").matcher(str).find()) {
            return str.replace("%", "*");
        }
        return str;
    }

    public static String getScriptSegmentPreload(String str) {
        return TEEffectUtils.nativeGetScriptSegmentPreload(str);
    }

    public static VEVideoFileInfo getVEVideoFileInfo(String str) {
        VEVideoFileInfo vEVideoFileInfo = (VEVideoFileInfo) TEVideoUtils.nativeGetVEFileInfo(str);
        if (vEVideoFileInfo == null) {
            C2484209oO.LIZJ("VEUtils", "getVEVideoFileInfo error!!!");
            return null;
        }
        return vEVideoFileInfo;
    }

    public static VEVideoFileInfo getVideoFileInfo(String str) {
        VEVideoFileInfo vEVideoFileInfo = (VEVideoFileInfo) TEVideoUtils.nativeGetFileInfo(str, null);
        if (vEVideoFileInfo == null) {
            C2484209oO.LIZJ("VEUtils", "getVideoFileInfo error!!!");
            return null;
        }
        return vEVideoFileInfo;
    }

    public static long getVideoReverseSize(String str) {
        VEVideoFileInfo videoFileInfo = getVideoFileInfo(str);
        if (videoFileInfo == null) {
            return -1L;
        }
        return (((long) (videoFileInfo.duration / LSPassThroughRecordSizeConfig.DEFAULT)) * Mp4ScreenVideoLoadTimeout.CONTROL) / 1024;
    }

    public static int isByteVC110Bit(String str) {
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(str);
            for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                if (TextUtils.equals(trackFormat.getString("mime"), "video/hevc") && trackFormat.containsKey("csd-0")) {
                    ByteBuffer byteBuffer = trackFormat.getByteBuffer("csd-0");
                    byte[] bArr = new byte[byteBuffer.capacity()];
                    byteBuffer.get(bArr);
                    mediaExtractor.release();
                    return TEVideoUtils.nativeIsByteVC110Bit(bArr);
                }
            }
            mediaExtractor.release();
            return -200;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -200;
        }
    }

    public static int isCanImport(String str) {
        return TEVideoUtils.isCanImport(str);
    }

    public static long isStreamVCAudioPath(String str) {
        return TEAudioStreamVCUtils.isStreamVCAudioPath(str);
    }

    public static String ms2TimeFormat(int i) {
        Locale locale = Locale.ENGLISH;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = i;
        return C786410Ut5.k4(locale, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(j))), Long.valueOf(timeUnit.toSeconds(j) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j))), Long.valueOf(j - TimeUnit.SECONDS.toMillis(timeUnit.toSeconds(j)))});
    }

    public static int restartStreamVCConnet(long j) {
        if (j == -1) {
            C2484209oO.LIZJ("VEUtils", "restartStreamVCConnet handle is -1");
            return -1;
        }
        return TEAudioStreamVCUtils.restartStreamVCConnet(j);
    }

    public static boolean saveTexDescToLocal(String str) {
        if (str.isEmpty()) {
            return false;
        }
        return TEVideoUtils.nativeSaveTexDescToLocal(str);
    }

    public static VEBachQRCodeResult scanPicture(C448700Hie c448700Hie) {
        List<s> listScanPicture = TEVideoUtils.scanPicture(c448700Hie);
        if (listScanPicture.isEmpty()) {
            return null;
        }
        return (VEBachQRCodeResult) ListProtector.get(listScanPicture, 0);
    }

    public static void setFrameCacheDiskDir(String str) {
        TEVideoUtils.nativeSetFrameCacheDiskDir(str);
    }

    public static int setGlobalAllowedPaths(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            return TEEffectUtils.nativeSetGlobalAllowedPaths(strArr);
        }
        return -1;
    }

    public static VEFaceDetectCropResult scanPicture(C0HLZ c0hlz) {
        List<s> listScanPicture = TEVideoUtils.scanPicture(c0hlz);
        if (listScanPicture.isEmpty()) {
            return null;
        }
        return (VEFaceDetectCropResult) ListProtector.get(listScanPicture, 0);
    }

    public static List<s> scanPicture(VEBachAlgorithmParam vEBachAlgorithmParam) {
        return TEVideoUtils.scanPicture(vEBachAlgorithmParam);
    }

    public static int ConvertBitmapToRGBA(Bitmap bitmap, String str) {
        return TEVideoUtils.nativeConverBitmapToRGBA(bitmap, str);
    }

    public static int concatVideo(String[] strArr, String str) {
        return TEVideoUtils.concat(strArr, str);
    }

    public static int convertVideo2Gif(C1464600oDS c1464600oDS, final C1DP2 c1dp2) {
        int iExecFFmpegCommand;
        int width;
        String strK4;
        if (c1464600oDS.LIZ.contains(" ")) {
            c1464600oDS.LIZ = c1464600oDS.LIZ.replace(" ", "\\ ");
        }
        boolean zBooleanValue = VEConfigCenter.getInstance().getValue("ve_disable_ffmpeg_command", false).booleanValue();
        if (zBooleanValue) {
            iExecFFmpegCommand = TEVideoUtils.nativegeneratePalettegen(c1464600oDS.LIZ, c1464600oDS.LIZJ, c1464600oDS.LIZLLL, null);
        } else {
            iExecFFmpegCommand = execFFmpegCommand(C786410Ut5.k4(Locale.US, "ffmpeg -y -i %s -vf fps=%d,scale=%d:-1:flags=lanczos,palettegen %s", new Object[]{c1464600oDS.LIZ, Integer.valueOf(c1464600oDS.LIZJ), Integer.valueOf(c1464600oDS.LIZLLL), null}), null);
        }
        if (iExecFFmpegCommand != 0) {
            return iExecFFmpegCommand;
        }
        VEVideoFileInfo videoFileInfo = getVideoFileInfo(c1464600oDS.LIZ);
        if (videoFileInfo == null) {
            return -1;
        }
        int i = videoFileInfo.width;
        TEImageFactory.ImageInfo imageInfo = TEImageFactory.getImageInfo(null, null);
        float f = i / 540.0f;
        if (imageInfo != null && imageInfo.getWidth() > 0) {
            width = imageInfo.getWidth();
        } else {
            width = 278;
        }
        int i2 = (int) (width * f);
        if (TextUtils.isEmpty(null)) {
            strK4 = C786410Ut5.k4(Locale.US, "ffmpeg -y -i %s -i %s -filter_complex setpts=%f*PTS,fps=%d,scale=%d:-1:flags=lanczos[x];[x][1:v]paletteuse %s", new Object[]{c1464600oDS.LIZ, null, Float.valueOf(0.4f), Integer.valueOf(c1464600oDS.LIZJ), Integer.valueOf(c1464600oDS.LIZLLL), c1464600oDS.LIZIZ});
        } else {
            strK4 = C786410Ut5.k4(Locale.US, "ffmpeg -y -i %s -i %s -i %s -filter_complex [1:v]scale=%d:-1[o1];[0:v]setpts=%f*PTS,fps=%d[o0];[o0][o1]overlay=x=%d:y=H-h-%d,scale=%d:-1:flags=lanczos[x];[x][2:v]paletteuse %s", new Object[]{c1464600oDS.LIZ, null, null, Integer.valueOf(i2), Float.valueOf(0.4f), Integer.valueOf(c1464600oDS.LIZJ), 0, 0, Integer.valueOf(c1464600oDS.LIZLLL), c1464600oDS.LIZIZ});
        }
        if (zBooleanValue) {
            int iNativeconvertVideo2Gif = TEVideoUtils.nativeconvertVideo2Gif(c1464600oDS.LIZ, null, null, i2, 0.4f, c1464600oDS.LIZJ, 0, 0, c1464600oDS.LIZLLL, c1464600oDS.LIZIZ, new TEVideoUtils.ExecuteCommandListener() { // from class: X.1DOw
                @Override // com.ss.android.ttve.nativePort.TEVideoUtils.ExecuteCommandListener
                public final void onProgressChanged(int i3) {
                    C1DP2 c1dp22 = c1dp2;
                    if (c1dp22 != null) {
                        c1dp22.onProgressChanged(i3);
                    }
                }
            });
            new C0VSJ((String) null).delete();
            return iNativeconvertVideo2Gif;
        }
        int iExecFFmpegCommand2 = execFFmpegCommand(strK4, c1dp2);
        new C0VSJ((String) null).delete();
        return iExecFFmpegCommand2;
    }

    public static int convertVideo2Webp(C1464600oDS c1464600oDS, final C1DP2 c1dp2) {
        StringBuilder sb = new StringBuilder("ffmpeg");
        if (c1464600oDS.LIZ.contains(" ")) {
            c1464600oDS.LIZ = c1464600oDS.LIZ.replace(" ", "\\ ");
        }
        if (VEConfigCenter.getInstance().getValue("ve_disable_ffmpeg_command", false).booleanValue()) {
            return TEVideoUtils.nativeconvertVideo2Webp(c1464600oDS.LJFF, c1464600oDS.LJI, c1464600oDS.LIZ, c1464600oDS.LIZLLL, c1464600oDS.LJ, c1464600oDS.LIZJ, c1464600oDS.LIZIZ, new TEVideoUtils.ExecuteCommandListener() { // from class: X.1DOx
                @Override // com.ss.android.ttve.nativePort.TEVideoUtils.ExecuteCommandListener
                public final void onProgressChanged(int i) {
                    C1DP2 c1dp22 = c1dp2;
                    if (c1dp22 != null) {
                        c1dp22.onProgressChanged(i);
                    }
                }
            });
        }
        if (c1464600oDS.LJFF > 0 || c1464600oDS.LJI > 0) {
            sb.append(" -accurate_seek -ss ");
            sb.append(ms2TimeFormat(c1464600oDS.LJFF));
            sb.append(" -t ");
            sb.append(ms2TimeFormat(c1464600oDS.LJI));
        }
        sb.append(" -y -i ");
        sb.append(c1464600oDS.LIZ);
        sb.append(" -vf scale=");
        sb.append(c1464600oDS.LIZLLL);
        sb.append(":");
        sb.append(c1464600oDS.LJ);
        sb.append(" -r ");
        sb.append(c1464600oDS.LIZJ);
        sb.append(" -loop 0 ");
        sb.append(c1464600oDS.LIZIZ);
        return execFFmpegCommand(sb.toString(), c1dp2);
    }

    public static int execFFmpegCommand(String str, final C1DP2 c1dp2) {
        return TEVideoUtils.nativeExecuteFFmpegCommand(str, new TEVideoUtils.ExecuteCommandListener() { // from class: X.1DOy
            @Override // com.ss.android.ttve.nativePort.TEVideoUtils.ExecuteCommandListener
            public final void onProgressChanged(int i) {
                C1DP2 c1dp22 = c1dp2;
                if (c1dp22 != null) {
                    c1dp22.onProgressChanged(i);
                }
            }
        });
    }

    public static int extractVideo(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("extractVideo... inFile:");
        sbLIZ.append(getSafeString(str));
        sbLIZ.append(", outFile:");
        sbLIZ.append(getSafeString(str2));
        C2484209oO.LIZ("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        int iIsCanImport = TEVideoUtils.isCanImport(str);
        if (iIsCanImport != 0) {
            C2484209oO.LJIIIIZZ("VEUtils", "input file is not supported!");
            return iIsCanImport;
        }
        return TEVideoUtils.nativeExtractVideo(str, str2);
    }

    public static int extractVideoByCommand(String str, String str2) {
        if (VEConfigCenter.getInstance().getValue("ve_disable_ffmpeg_command", false).booleanValue()) {
            return TEVideoUtils.nativeExtractVideo(str, str2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("extractVideoByCommand... inFile:");
        sbLIZ.append(getSafeString(str));
        sbLIZ.append(", outFile:");
        sbLIZ.append(getSafeString(str2));
        C2484209oO.LJI("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        int iIsCanImport = TEVideoUtils.isCanImport(str);
        if (iIsCanImport != 0) {
            C2484209oO.LJIIIIZZ("VEUtils", "input file is not supported!");
            return iIsCanImport;
        }
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ffmpeg -i ");
        sbLIZ2.append(str);
        sbLIZ2.append(" -vcodec copy -an ");
        sbLIZ2.append(str2);
        return execFFmpegCommand(C2188811AlT.LIZIZ(sbLIZ2), null);
    }

    public static int getAudioFileInfo(String str, int[] iArr) {
        int iNativeGetAudioFileInfo = TEVideoUtils.nativeGetAudioFileInfo(str, iArr);
        if (str.endsWith(".aac")) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String strLJ = C20144413ru.LJ(mediaMetadataRetriever);
            if (strLJ != null && strLJ.startsWith("audio/aac")) {
                C2484209oO.LJIIIIZZ("VEUtils", "getAudioFileInfo use Android sys to get aac duration because ffmpeg is not accurate");
                iArr[3] = CastIntegerProtector.parseInt(C20144413ru.LIZJ(mediaMetadataRetriever));
            }
            try {
                mediaMetadataRetriever.release();
                return iNativeGetAudioFileInfo;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return iNativeGetAudioFileInfo;
    }

    public static int getAudioFileInfoForAllTracks(String str, int[][] iArr) {
        return TEVideoUtils.nativeGetAudioFileInfoForAllTracks(str, iArr);
    }

    public static String getFileBestStreamAudio(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int iNativeGetFileAudio = TEVideoUtils.nativeGetFileAudio(str, str2, arrayList, true);
        if (iNativeGetFileAudio != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getFileBestStreamAudio error ");
            sbLIZ.append(iNativeGetFileAudio);
            C2484209oO.LIZJ("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (arrayList.size() > 0) {
            if (arrayList.size() > 1) {
                C2484209oO.LJIIIIZZ("VEUtils", "getFileBestStreamAudio, find more than one stream");
            }
            return (String) ListProtector.get(arrayList, 0);
        }
        C2484209oO.LIZJ("VEUtils", "getFileBestStreamAudio error, outFiles.size == 0 ");
        return null;
    }

    public static String getMD5FileName(String str, String str2) {
        return TEVideoUtils.getMD5FileName(str, str2);
    }

    public static VEMVAlgorithmConfig getMVAlgorithmConfigs(String str, List<String> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
            return (VEMVAlgorithmConfig) TEVideoUtils.getMVAlgorithmConfigs(str, list);
        }
        return null;
    }

    public static String getMVAlgorithmConfigsWithMultiImage(String str, List<String> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
            return TEVideoUtils.getMVAlgorithmConfigsWithMultiImage(str, list);
        }
        return null;
    }

    public static int getMusicDefaultAlgorithm(String str, String str2) {
        if (str != null && str2 != null && !"".equals(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getMusicDefaultAlgorithm musicPath: ");
            sbLIZ.append(str);
            sbLIZ.append(" algorithmPath: ");
            sbLIZ.append(str2);
            C2484209oO.LJI("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
            return TEVideoUtils.nativeGetMusicDefaultAlgorithm(str, str2);
        }
        C2484209oO.LIZJ("VEUtils", "getMusicDefaultAlgorithm failed path is wrong");
        return -100;
    }

    public static int getQREncodedData(String str, C1DOO c1doo) {
        return TEEffectUtils.getQREncodedData(str, null, new TEEffectUtils.ImageListener() { // from class: X.1DP0
            @Override // com.ss.android.ttve.nativePort.TEEffectUtils.ImageListener
            public final void onData(int[] iArr, int i, int i2, int i3) {
            }
        });
    }

    public static int getVideoFileInfo(String str, int[] iArr) {
        VEVideoFileInfo vEVideoFileInfo = (VEVideoFileInfo) TEVideoUtils.nativeGetFileInfo(str, null);
        if (vEVideoFileInfo == null) {
            C2484209oO.LIZJ("VEUtils", "getVideoFileInfo2 error!!!");
            return -1;
        }
        switch (Math.min(iArr.length, 12)) {
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                iArr[11] = vEVideoFileInfo.bitDepth;
            case BdTuring.TYPE_EMAIL /* 11 */:
                iArr[10] = vEVideoFileInfo.maxDuration;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                iArr[9] = vEVideoFileInfo.keyFrameCount;
            case BdTuring.TYPE_ECAF /* 9 */:
                iArr[8] = vEVideoFileInfo.codec;
            case 8:
                iArr[7] = vEVideoFileInfo.fps;
            case 7:
                iArr[6] = vEVideoFileInfo.bitrate;
            case 4:
            case 5:
            case 6:
                iArr[3] = vEVideoFileInfo.duration;
            case 3:
                iArr[2] = vEVideoFileInfo.rotation;
            case 2:
                iArr[1] = vEVideoFileInfo.height;
            case 1:
                iArr[0] = vEVideoFileInfo.width;
                return 0;
            default:
                return 0;
        }
    }

    public static boolean isSamiAutomationValid(double d, String str) {
        return TEVideoUtils.nativeIsSamiAutomationValid(d, str);
    }

    public static int remuxVideo(String str, String str2) {
        return TEVideoUtils.remuxVideo(str, str2);
    }

    public static boolean resizeImageWithEffect(Bitmap bitmap, Bitmap bitmap2) {
        return TEEffectUtils.nativeResizeImageWithEffect2(bitmap, bitmap2, false);
    }

    public static int reverseAudio(String str, String str2) {
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        if (VEConfigCenter.getInstance().getValue("ve_disable_ffmpeg_command", false).booleanValue()) {
            return TEVideoUtils.reverseAudio(str, str2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ffmpeg -i ");
        sbLIZ.append(str);
        sbLIZ.append(" -af areverse ");
        sbLIZ.append(str2);
        return execFFmpegCommand(C2188811AlT.LIZIZ(sbLIZ), null);
    }

    public static int reverseAudioSafe(String str, String str2) {
        String strReplace = str;
        if (strReplace.contains(" ")) {
            strReplace = strReplace.replace(" ", "\\ ");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strReplace);
        sbLIZ.append(".wav");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (VEConfigCenter.getInstance().getValue("ve_disable_ffmpeg_command", false).booleanValue() && TEVideoUtils.nativetransCodeAudio(strReplace, strReplace, -1, -1, -1, "") == 0) {
            return TEVideoUtils.reverseAudio(strReplace, str2);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ffmpeg -i ");
        sbLIZ2.append(strReplace);
        sbLIZ2.append(" ");
        sbLIZ2.append(strLIZIZ);
        int iExecFFmpegCommand = execFFmpegCommand(C2188811AlT.LIZIZ(sbLIZ2), null);
        if (iExecFFmpegCommand == 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ffmpeg -i ");
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" -af areverse ");
            sbLIZ3.append(str2);
            return execFFmpegCommand(C2188811AlT.LIZIZ(sbLIZ3), null);
        }
        return iExecFFmpegCommand;
    }

    public static int startStreamVCConnet(long j, String str) {
        if (j == -1) {
            C2484209oO.LIZJ("VEUtils", "startStreamVCConnet handle is -1");
            return -1;
        }
        return TEAudioStreamVCUtils.startStreamVCConnet(j, str);
    }

    public static int stopStreamVCConnet(long j, boolean z) {
        if (j == -1) {
            C2484209oO.LIZJ("VEUtils", "stopStreamVCConnet handle is -1");
            return -1;
        }
        return TEAudioStreamVCUtils.stopStreamVCConnet(j, z);
    }

    public static int ConvertRGBAToPNG(String str, String str2, Resolution resolution) {
        return ConvertRGBAToIMG(str, str2, resolution, ImgType.Img_png);
    }

    public static int concatRecordData(VERecordData vERecordData, String str, String str2) {
        int size = vERecordData.getSegmentData().size();
        if (size <= 0) {
            C2484209oO.LIZJ("VEUtils", "frag count is 0");
            return -100;
        }
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        int i = 0;
        do {
            strArr[i] = ((VERecordData.VERecordSegmentData) ListProtector.get(vERecordData.getSegmentData(), i)).mVideo;
            jArr2[i] = ((VERecordData.VERecordSegmentData) ListProtector.get(vERecordData.getSegmentData(), i)).mVideoLength;
            strArr2[i] = ((VERecordData.VERecordSegmentData) ListProtector.get(vERecordData.getSegmentData(), i)).mAudio;
            jArr[i] = ((VERecordData.VERecordSegmentData) ListProtector.get(vERecordData.getSegmentData(), i)).mAudioLength;
            i++;
        } while (i < size);
        vERecordData.concatVideo = str;
        vERecordData.concatAudio = str2;
        return TEVideoUtils.concatRecordFrag(strArr, jArr2, strArr2, jArr, vERecordData.isUseMusic(), 0, null, null, vERecordData.concatVideo, vERecordData.concatAudio);
    }

    public static int decryptVideo(String str, String str2, String str3) {
        return TEVideoUtils.nativeDecryptVideo(str, str2, str3);
    }

    public static int execFFmpegCommandAndDumpInfo(String str, final C1DP2 c1dp2, C1DP3 c1dp3) {
        return TEVideoUtils.nativeExecuteFFmpegCommandAndDumpInfo(str, new TEVideoUtils.ExecuteCommandListener() { // from class: X.1DOv
            @Override // com.ss.android.ttve.nativePort.TEVideoUtils.ExecuteCommandListener
            public final void onProgressChanged(int i) {
                C1DP2 c1dp22 = c1dp2;
                if (c1dp22 != null) {
                    c1dp22.onProgressChanged(i);
                }
            }
        }, new TEVideoUtils.ExecuteCommandAndDumpInfoListener() { // from class: X.1DOz
            @Override // com.ss.android.ttve.nativePort.TEVideoUtils.ExecuteCommandAndDumpInfoListener
            public final void updateFFmpegInfo(String str2) {
            }
        });
    }

    public static int getFileAudio(String str, String str2, ArrayList<String> arrayList) {
        return TEVideoUtils.nativeGetFileAudio(str, str2, arrayList, false);
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2) {
        return getMusicWaveData(str, i, i2, 10, 0, 0);
    }

    public static VEMusicWaveBean getResampleMusicWaveData(float[] fArr, int i, int i2) {
        if (fArr.length == 0) {
            return null;
        }
        return TEVideoUtils.nativeGetResampleMusicWaveData(fArr, i, i2);
    }

    public static int getVideoFrames(String str, int[] iArr, InterfaceC1286300jZs interfaceC1286300jZs) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getVideoFrames... ");
        sbLIZ.append(getSafeString(str));
        C2484209oO.LJI("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(interfaceC1286300jZs);
        return TEVideoUtils.nativeGetVideoFrame(str, iArr, 0, 0, false, tEVideoUtilsCallback, ROTATE_DEGREE.ROTATE_NONE.ordinal(), false);
    }

    public static int isCanTransCode(String str, int i, int i2) {
        int iNativeIsCanTransCode = TEVideoUtils.nativeIsCanTransCode(str, i, i2);
        if (iNativeIsCanTransCode != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isCanTransCode not supported!  path=");
            sbLIZ.append(getSafeString(str));
            C2484209oO.LJIIIIZZ("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        }
        return iNativeIsCanTransCode;
    }

    public static boolean isLivePhotoForJPEGFile(String str, String str2, boolean z) {
        if (z) {
            if (str2 == null) {
                return false;
            }
        } else if (str2 == null) {
            str2 = "";
        }
        return TEVideoUtils.nativeIsLivePhotoForJPEGFile(str, str2, z);
    }

    public static int mixAudio(ArrayList<String> arrayList, String str, VEMixAudioListener vEMixAudioListener) {
        TEAudioUtilsCallback tEAudioUtilsCallback = new TEAudioUtilsCallback();
        tEAudioUtilsCallback.setListener(vEMixAudioListener);
        return TEVideoUtils.nativeMixAudio(arrayList, str, tEAudioUtilsCallback);
    }

    public static int mux(String str, String str2, String str3) {
        String str4;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            int iNativeMux = TEVideoUtils.nativeMux(str, str2, str3);
            C1404320meE c1404320meE = new C1404320meE();
            if (iNativeMux == 0) {
                str4 = "succ";
            } else {
                str4 = "fail";
            }
            c1404320meE.LIZJ("iesve_veutils_combine_audio_and_video_finish_result", str4);
            c1404320meE.LIZJ("iesve_veutils_combine_audio_and_video_finish_reason", "");
            return iNativeMux;
        }
        return -100;
    }

    public static void saveBitmapToPath(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) throws Throwable {
        saveBitmapToPath(bitmap, str, compressFormat, 100);
    }

    public static int setMetaData(String str, String str2, Map<String, String> map) {
        if (!str.isEmpty() && !str2.isEmpty() && !map.isEmpty()) {
            return TEVideoUtils.nativeSetMetaData(str, str2, map);
        }
        C2484209oO.LIZJ("VEUtils", "path is null or metadata is null");
        return -1;
    }

    public static int ConvertRGBAToIMG(String str, String str2, Resolution resolution, ImgType imgType) {
        return TEVideoUtils.nativeConverRGBAToIMG(str, str2, resolution.ordinal(), imgType.ordinal());
    }

    public static VESize calcTargetRes(int[] iArr, int[] iArr2, ROTATE_DEGREE[] rotate_degreeArr, int i) {
        int length;
        int iMin;
        int iMin2;
        int i2;
        VESize vESize = new VESize(-1, -1);
        if (iArr2 == null || iArr == null || rotate_degreeArr == null || (length = iArr.length) < 1) {
            return vESize;
        }
        float fMax = 0.0f;
        int i3 = 0;
        int iMax = 0;
        int iMax2 = 0;
        do {
            int i4 = iArr2[i3];
            int i5 = iArr[i3];
            ROTATE_DEGREE rotate_degree = rotate_degreeArr[i3];
            if (rotate_degree == ROTATE_DEGREE.ROTATE_90 || rotate_degree == ROTATE_DEGREE.ROTATE_270) {
                i5 = i4;
                i4 = i5;
            }
            fMax = Math.max(fMax, i4 / i5);
            iMax = Math.max(iMax, i5);
            iMax2 = Math.max(iMax2, i4);
            i3++;
        } while (i3 < length);
        if (length != 1) {
            fMax = Math.min(fMax, 1.7777778f);
        }
        if (fMax >= 1.0f) {
            iMin2 = Math.min(iMax, i);
            iMin = (int) (iMin2 * fMax);
        } else {
            iMin = Math.min(iMax2, i);
            iMin2 = (int) (iMin / fMax);
        }
        if (VEConfigCenter.getInstance().getValue("ve_enable_render_encode_resolution_align4", false).booleanValue()) {
            i2 = 4;
        } else {
            i2 = 16;
        }
        int i6 = -i2;
        vESize.width = ((iMin2 + i2) - 1) & i6;
        vESize.height = ((iMin + i2) - 1) & i6;
        return vESize;
    }

    public static int convertJpegToMp4(String str, String str2, int i, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return TEVideoUtils.nativeConvertJpegToMp4(str, str2, i, z);
        }
        return -100;
    }

    public static long createStreamVCHandle(String str, String str2, String str3, OnTEAudioStreamVCDataReceivedListener onTEAudioStreamVCDataReceivedListener) {
        return TEAudioStreamVCUtils.createStreamVCHandle(str, str2, str3, "", onTEAudioStreamVCDataReceivedListener);
    }

    public static int cropAudio(String str, String str2, long j, long j2) {
        if (VEConfigCenter.getInstance().getValue("ve_disable_ffmpeg_command", false).booleanValue()) {
            return TEVideoUtils.nativecropAudio(str, str2, j, j2);
        }
        StringBuilder sb = new StringBuilder("ffmpeg -i ");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append(str);
        sb.append(" -ss ");
        sb.append(j / 1000);
        sb.append(" -t ");
        sb.append(j2 / 1000);
        sb.append(" -c copy ");
        sb.append(str2);
        C2484209oO.LJI("VEUtils", sb.toString());
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int curVideo(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        if (arrayList.size() == arrayList2.size() && arrayList.size() == arrayList3.size() && arrayList2.size() == arrayList3.size()) {
            boolean zBooleanValue = VEConfigCenter.getInstance().getValue("ve_disable_ffmpeg_command", false).booleanValue();
            StringBuilder sb = new StringBuilder("ffmpeg -i ");
            if (str.contains(" ")) {
                str = str.replace(" ", "\\ ");
            }
            sb.append(str);
            int iNativecutVideo = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                sb.append(" -ss ");
                sb.append((String) ListProtector.get(arrayList2, i));
                sb.append(" -t ");
                sb.append((String) ListProtector.get(arrayList3, i));
                sb.append(" -acodec copy -vcodec copy ");
                sb.append((String) ListProtector.get(arrayList, i));
                if (zBooleanValue) {
                    iNativecutVideo = TEVideoUtils.nativecutVideo(str, (String) ListProtector.get(arrayList, i), (String) ListProtector.get(arrayList2, i), (String) ListProtector.get(arrayList3, i));
                }
            }
            if (zBooleanValue) {
                return iNativecutVideo;
            }
            return execFFmpegCommand(sb.toString(), null);
        }
        return -100;
    }

    public static int cutVideo(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("ffmpeg -i ");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        if (VEConfigCenter.getInstance().getValue("ve_disable_ffmpeg_command", false).booleanValue()) {
            return TEVideoUtils.nativecutVideo(str, str2, str3, str4);
        }
        sb.append(str);
        sb.append(" -ss ");
        sb.append(str3);
        sb.append(" -t ");
        sb.append(str4);
        sb.append(" -acodec copy -vcodec copy ");
        sb.append(str2);
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int detectAudioMetrics(String str, String str2, String str3, InterfaceC1407610mjX interfaceC1407610mjX) {
        TEAudioMetricsCallback tEAudioMetricsCallback = new TEAudioMetricsCallback();
        tEAudioMetricsCallback.setListener(interfaceC1407610mjX);
        return TEVideoUtils.nativeDetectAudioMetrics(str, str2, str3, tEAudioMetricsCallback);
    }

    public static void dumpNV21(String str, int i, int i2, byte[] bArr) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            C0VSV c0vsv = new C0VSV(str);
            c0vsv.write(byteArray);
            c0vsv.flush();
            c0vsv.close();
            byteArrayOutputStream.close();
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static int getQREncodedData(String str, int i, int i2, C1DON c1don) {
        return TEEffectUtils.getQREncodedData(str, i, i2, null, new TEEffectUtils.QrImageListener() { // from class: X.1DP1
            @Override // com.ss.android.ttve.nativePort.TEEffectUtils.QrImageListener
            public final void onData(int[] iArr, int i3, int i4, int i5) {
            }
        });
    }

    public static int isCanTransCodeWithResult(String str, int i, int i2, String[] strArr) {
        int iNativeIsCanTransCodeWithResult = TEVideoUtils.nativeIsCanTransCodeWithResult(str, i, i2, strArr);
        if (iNativeIsCanTransCodeWithResult != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isCanTransCodeWithResult not supported!  path=");
            sbLIZ.append(getSafeString(str));
            C2484209oO.LJIIIIZZ("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        }
        return iNativeIsCanTransCodeWithResult;
    }

    public static void saveBitmapToPath(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i) throws Throwable {
        C0VSV c0vsv;
        BufferedOutputStream bufferedOutputStream;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Bitmap ");
        sbLIZ.append(str);
        sbLIZ.append("saving");
        C2484209oO.LJI("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                c0vsv = new C0VSV(str);
                try {
                    bufferedOutputStream = new BufferedOutputStream(c0vsv);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                bitmap.compress(compressFormat, i, bufferedOutputStream);
                bufferedOutputStream.flush();
                try {
                    bufferedOutputStream.close();
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                try {
                    c0vsv.close();
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                C2484209oO.LJI("VEUtils", "Bitmap " + str + " saved!");
            } catch (IOException e4) {
                e = e4;
                bufferedOutputStream2 = bufferedOutputStream;
                TryCatchGuardChecker.doCheck(e);
                C2484209oO.LIZJ("VEUtils", "Error when saving bitmap...");
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException e5) {
                        TryCatchGuardChecker.doCheck(e5);
                    }
                }
                if (c0vsv != null) {
                    try {
                        c0vsv.close();
                    } catch (IOException e6) {
                        TryCatchGuardChecker.doCheck(e6);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                TryCatchGuardChecker.doCheck(th);
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException e7) {
                        TryCatchGuardChecker.doCheck(e7);
                    }
                }
                if (c0vsv != null) {
                    try {
                        c0vsv.close();
                        throw th;
                    } catch (IOException e8) {
                        TryCatchGuardChecker.doCheck(e8);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e9) {
            e = e9;
            c0vsv = null;
        } catch (Throwable th3) {
            th = th3;
            c0vsv = null;
        }
    }

    public static int splitVideo(String str, String[] strArr, int[] iArr, boolean z) {
        return TEVideoUtils.nativeSplitVideo(str, strArr, iArr, z);
    }

    public static int transCodeAudio(String str, String str2, int i, int i2) {
        return TEVideoUtils.transCodeAudioFile(str, 0, -1, str2, i, i2, -1);
    }

    public static int trimToDraft(String str, int[] iArr, String str2, int[] iArr2) {
        return TEVideoUtils.nativeTrimFile(str, str2, iArr, iArr2);
    }

    public static int concatJpegWithMp4(String str, String str2, String str3, int i, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && i >= 33) {
            int iConvertJpegToMp4 = convertJpegToMp4(str, str3, i, z);
            if (iConvertJpegToMp4 != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("concatJpegWithMp4 error, convert failed ");
                sbLIZ.append(iConvertJpegToMp4);
                C2484209oO.LIZJ("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
                return iConvertJpegToMp4;
            }
            int iConcat = TEVideoUtils.concat(new String[]{str3, str2}, str3);
            if (iConcat != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("concatJpegWithMp4 error, concatVideo failed ");
                sbLIZ2.append(iConcat);
                C2484209oO.LIZJ("VEUtils", C2188811AlT.LIZIZ(sbLIZ2));
            }
            return iConcat;
        }
        return -100;
    }

    public static VERTAudioWaveformMgr createRTAudioWaveformMgr(int i, int i2, int i3, float f, int i4) {
        return new VERTAudioWaveformMgr(i, i2, i3, f, i4);
    }

    public static long createStreamVCHandle(String str, String str2, String str3, String str4, OnTEAudioStreamVCDataReceivedListener onTEAudioStreamVCDataReceivedListener) {
        return TEAudioStreamVCUtils.createStreamVCHandle(str, str2, str3, str4, onTEAudioStreamVCDataReceivedListener);
    }

    public static int findAudioSegmentStartTimeInOrigin(String str, int i, String str2, int i2, int i3) {
        return TEVideoUtils.nativeFindAudioSegmentStartTimeInOrigin(str, i, str2, i2, i3);
    }

    public static VEMVAudioAlgorithmResult getAudioBeatAlgorithmResult(String str, String str2, int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAudioBeatAlgorithmResult trimIn ");
        sbLIZ.append(i);
        sbLIZ.append(", trimOut ");
        sbLIZ.append(i2);
        sbLIZ.append(", mvTime ");
        sbLIZ.append(i3);
        C2484209oO.LIZJ("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult = (VEMVAudioAlgorithmResult) TEVideoUtils.nativeGetAudioAlgorithmResult(str, str2, i, i2);
        vEMVAudioAlgorithmResult.resizeBeatTrackingNum(i2 - i, i3);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getAudioBeatAlgorithmResult time = ");
        sbLIZ2.append(Arrays.toString(vEMVAudioAlgorithmResult.bitsTime));
        C2484209oO.LIZ("VEUtils", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getAudioBeatAlgorithmResult value = ");
        sbLIZ3.append(Arrays.toString(vEMVAudioAlgorithmResult.bitsValue));
        C2484209oO.LIZ("VEUtils", C2188811AlT.LIZIZ(sbLIZ3));
        return vEMVAudioAlgorithmResult;
    }

    public static int getAudioFromRecordData(String str, VERecordData vERecordData, int i, int i2, int i3) {
        return getAudioFromRecordData(str, vERecordData, i, i2, i3, CompatibleMode.Legacy);
    }

    public static int getImageThumb(String str, int i, int i2, boolean z, InterfaceC1286300jZs interfaceC1286300jZs) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(interfaceC1286300jZs);
        return TEVideoUtils.nativeGetImageThumb(str, i, i2, z, tEVideoUtilsCallback);
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2, int i3, int i4) {
        return getMusicWaveData(str, i, i2, 10, i3, i4);
    }

    public static Bitmap getVideoFrame(String str, int i, int i2, int i3, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getVideoFrameWithBitmap...");
        sbLIZ.append(str);
        C2484209oO.LJI("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        return TEVideoUtils.getVideoFrame(str, i, i2, i3, z);
    }

    public static int saveCompressedImage(String str, String str2, int i, int i2, int i3) throws Throwable {
        boolean z;
        String strLIZIZ;
        Bitmap.CompressFormat compressFormat;
        if (i > 0 && i2 > 0) {
            z = false;
        } else {
            z = true;
        }
        Bitmap bitmapLoadBitmap = BitmapLoader.loadBitmap(str, i, i2, BitmapLoader.ImageRotation.INVALID, true, true, z);
        if (bitmapLoadBitmap != null) {
            if (i3 == 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append("0.png");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                compressFormat = Bitmap.CompressFormat.PNG;
            } else if (i3 == 1) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append("0.jpeg");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                compressFormat = Bitmap.CompressFormat.JPEG;
            } else {
                C2484209oO.LIZJ("VEUtils", "Target format is wrongly configured, generate compressed image failed!");
                return 1;
            }
            saveBitmapToPath(bitmapLoadBitmap, strLIZIZ, compressFormat);
            return 0;
        }
        C2484209oO.LIZJ("VEUtils", "Bitmap is empty, generate compressed image failed!");
        return 1;
    }

    public static void setVEMetadataReadAllowlistConfig(boolean z, boolean z2, String str, String str2, VEMetadataCheckCallBack vEMetadataCheckCallBack) {
        if (vEMetadataCheckCallBack == null) {
            return;
        }
        TEVideoUtils.setVEMetadataReadAllowlistConfig(z, z2, str, str2, vEMetadataCheckCallBack);
    }

    public static void setVEMetadataWriteAllowlistConfig(boolean z, boolean z2, String str, String str2, VEMetadataCheckCallBack vEMetadataCheckCallBack) {
        if (vEMetadataCheckCallBack == null) {
            return;
        }
        TEVideoUtils.setVEMetadataWriteAllowlistConfig(z, z2, str, str2, vEMetadataCheckCallBack);
    }

    public static int startStreamVCProcess(long j, String str, String str2, long j2, long j3) {
        if (j == -1) {
            C2484209oO.LIZJ("VEUtils", "startStreamVCProcess handle is -1");
            return -1;
        }
        return TEAudioStreamVCUtils.startStreamVCProcess(j, str, str2, j2, j3);
    }

    public static int transCodeAudio(String str, String str2, int i, int i2, int i3) {
        String strReplace = str;
        if (VEConfigCenter.getInstance().getValue("ve_disable_ffmpeg_command", false).booleanValue()) {
            return TEVideoUtils.nativetransCodeAudio(strReplace, str2, i, i2, i3, "");
        }
        StringBuilder sb = new StringBuilder("ffmpeg -i ");
        if (strReplace.contains(" ")) {
            strReplace = strReplace.replace(" ", "\\ ");
        }
        sb.append(strReplace);
        if (i != -1) {
            sb.append(" -ac ");
            sb.append(i);
        }
        if (i2 != -1) {
            sb.append(" -ab ");
            sb.append(i2);
        }
        if (i3 != -1) {
            sb.append(" -ar ");
            sb.append(i3);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ");
        sbLIZ.append(str2);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        C2484209oO.LJI("VEUtils", sb.toString());
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int getAudioFromRecordData(String str, VERecordData vERecordData, int i, int i2, int i3, CompatibleMode compatibleMode) {
        if (vERecordData != null && vERecordData.getSegmentData().size() > 0) {
            int size = vERecordData.getSegmentData().size();
            String[] strArr = new String[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            long[] jArr4 = new long[size];
            float[] fArr = new float[size];
            int i4 = 0;
            long j = 0;
            for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.getSegmentData()) {
                if (vERecordSegmentData.mEnable) {
                    strArr[i4] = vERecordSegmentData.mAudio;
                    jArr[i4] = (int) (vERecordSegmentData.getCutTrimIn() / 1000);
                    jArr2[i4] = (int) (vERecordSegmentData.getCutTrimOut() / 1000);
                    float f = vERecordSegmentData.mSpeed;
                    fArr[i4] = f;
                    jArr3[i4] = (int) (jArr[i4] * f);
                    long j2 = (int) (jArr2[i4] * f);
                    jArr4[i4] = j2;
                    j += j2 - jArr3[i4];
                    i4++;
                }
            }
            if (i4 == 0) {
                C2484209oO.LIZJ("VEUtils", "getAudioFromRecordData There are no valid clips!");
                return -100;
            }
            return detachAudioFromVideos(str, (String[]) Arrays.copyOf(strArr, i4), Arrays.copyOf(jArr3, i4), Arrays.copyOf(jArr4, i4), 0L, j, Arrays.copyOf(fArr, i4), i, i2, i3, compatibleMode);
        }
        C2484209oO.LIZJ("VEUtils", "Get AudioFromRecordData parameter error!");
        return -100;
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2, int i3, int i4, int i5) {
        if (i == 0) {
            i = C1DP4.LIZ;
        }
        VEMusicWaveBean vEMusicWaveBeanNativeGetAudioWaveData = TEVideoUtils.nativeGetAudioWaveData(str, i, i2, i3, i4, i5);
        if (vEMusicWaveBeanNativeGetAudioWaveData == null || vEMusicWaveBeanNativeGetAudioWaveData.getWaveBean().length == 0) {
            return null;
        }
        return vEMusicWaveBeanNativeGetAudioWaveData;
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, InterfaceC1286300jZs interfaceC1286300jZs) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getVideoFrames... ");
        sbLIZ.append(getSafeString(str));
        C2484209oO.LJI("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        return getVideoFrames(str, iArr, i, i2, z, interfaceC1286300jZs, ROTATE_DEGREE.ROTATE_NONE);
    }

    public static int getVideoFrames2(String str, int[] iArr, int i, int i2, boolean z, InterfaceC1286300jZs interfaceC1286300jZs) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getVideoFrames2...");
        sbLIZ.append(getSafeString(str));
        sbLIZ.append(", widht: ");
        sbLIZ.append(i);
        sbLIZ.append(", height: ");
        sbLIZ.append(i2);
        sbLIZ.append(", isRough: ");
        sbLIZ.append(z);
        C2484209oO.LJI("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(interfaceC1286300jZs);
        return TEVideoUtils.nativeGetVideoFrame2(str, iArr, i, i2, z, tEVideoUtilsCallback);
    }

    public static int getVideoFrames3(String str, int[] iArr, int i, int i2, boolean z, InterfaceC1286300jZs interfaceC1286300jZs) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getVideoFrames3... ");
        sbLIZ.append(getSafeString(str));
        C2484209oO.LJI("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(interfaceC1286300jZs);
        return TEVideoUtils.nativeGetVideoFrame3(str, iArr, i, i2, z, tEVideoUtilsCallback);
    }

    public static int getVideoFramesByHWCodec(String str, int[] iArr, int i, int i2, boolean z, InterfaceC1286300jZs interfaceC1286300jZs) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getVideoFramesByHWCodec... ");
        sbLIZ.append(getSafeString(str));
        C2484209oO.LJI("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(interfaceC1286300jZs);
        return TEVideoUtils.nativeGetVideoFrame(str, iArr, i, i2, z, tEVideoUtilsCallback, 0, true);
    }

    public static int getVideoThumb(VERecordData vERecordData, int i, int i2, int i3, boolean z, InterfaceC1286300jZs interfaceC1286300jZs) {
        ROTATE_DEGREE rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
        String str = "";
        int i4 = 0;
        int iMin = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.getSegmentData()) {
            if (vERecordSegmentData.mEnable) {
                str = vERecordSegmentData.mVideo;
                rotate_degree = vERecordSegmentData.mRotate;
                int cutTrimOut = (int) ((vERecordSegmentData.getCutTrimOut() - vERecordSegmentData.getCutTrimIn()) / 1000);
                iMin = Math.min(cutTrimOut, ((int) (vERecordSegmentData.getCutTrimIn() / 1000)) + (i - i4));
                if (i >= i4 && i <= i4 + cutTrimOut) {
                    break;
                }
                i4 += cutTrimOut;
            }
        }
        if (!TextUtils.isEmpty(str) && iMin >= 0) {
            return getVideoFrames(str, new int[]{iMin}, i2, i3, z, interfaceC1286300jZs, rotate_degree);
        }
        C2484209oO.LIZJ("VEUtils", "Timestamp is not in the valid time range!");
        return -100;
    }

    public static int transCodeAudio(String str, String str2, int i, int i2, int i3, String str3) {
        if (VEConfigCenter.getInstance().getValue("ve_disable_ffmpeg_command", false).booleanValue()) {
            return TEVideoUtils.nativetransCodeAudio(str, str2, i, i2, i3, str3);
        }
        StringBuilder sb = new StringBuilder("ffmpeg -i ");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append(str);
        if (i != -1) {
            sb.append(" -ac ");
            sb.append(i);
        }
        if (i2 != -1) {
            sb.append(" -ab ");
            sb.append(i2);
        }
        if (i3 != -1) {
            sb.append(" -ar ");
            sb.append(i3);
        }
        sb.append(" -acodec ");
        sb.append(str3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ");
        sbLIZ.append(str2);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        C2484209oO.LJI("VEUtils", sb.toString());
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int transCodeAudio(String str, String str2, float f, int i, int i2, int i3) {
        return detachAudioFromVideos(str, new String[]{str2}, new long[]{-1}, new long[]{-1}, new long[]{-1}, new long[]{-1}, -1L, -1L, new float[]{f}, i, i2, i3, CompatibleMode.Legacy);
    }

    public static int transCodeAudio(String str, int i, int i2, String str2, int i3, int i4) {
        int iTransCodeAudioFile = TEVideoUtils.transCodeAudioFile(str, i, i2, str2, i3, i4, -1);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", iTransCodeAudioFile);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        b.LIZ("vesdk_editor_get_audio_frame", "performance", jSONObject);
        return iTransCodeAudioFile;
    }

    public static int getVideoFrameData(String str, int i, int i2, int i3, int i4, EnumC20137713qp enumC20137713qp, InterfaceC1286330jZv interfaceC1286330jZv) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setFrameDataListener(interfaceC1286330jZv);
        return TEVideoUtils.getVideoFrameData(str, i, i2, i3, i4, enumC20137713qp, tEVideoUtilsCallback);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, InterfaceC1286300jZs interfaceC1286300jZs, ROTATE_DEGREE rotate_degree) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getVideoFrames... ");
        sbLIZ.append(getSafeString(str));
        C2484209oO.LJI("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(interfaceC1286300jZs);
        return TEVideoUtils.nativeGetVideoFrame(str, iArr, i, i2, z, tEVideoUtilsCallback, rotate_degree.ordinal(), false);
    }

    public static VETransformResult nativeTransformToIFrameAllStrategy(String str, int i, int i2, int i3, float f, float f2, float f3) {
        return TEVideoUtils.nativeTransformToIFrameAllStrategy(str, i, i2, i3, f, f2, f3);
    }

    public static int processAudioTuning(String[] strArr, int[] iArr, int[] iArr2, float f, float f2, String str, String str2) {
        return TEVideoUtils.nativeProcessAudioTuning(strArr, iArr, iArr2, f, f2, str, str2);
    }

    public static int resizeImage(String str, String str2, int i, int i2, ImgType imgType, int i3, boolean z) {
        return TEVideoUtils.nativeResizeImage(str, str2, i, i2, imgType.ordinal(), i3, z);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, boolean z2, InterfaceC1286300jZs interfaceC1286300jZs) {
        return getVideoFrames(str, iArr, i, i2, z, z2, interfaceC1286300jZs, true);
    }

    public static int concatRecordFrag(String[] strArr, String[] strArr2, boolean z, int i, String str, String str2, String str3, String str4) {
        long[] jArr = new long[strArr.length];
        Arrays.fill(jArr, -1L);
        long[] jArr2 = new long[strArr2.length];
        Arrays.fill(jArr2, -1L);
        return concatRecordFrag(strArr, jArr, strArr2, jArr2, z, i, str, str2, str3, str4);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, ROTATE_DEGREE rotate_degree, InterfaceC1286300jZs interfaceC1286300jZs, InterfaceC1286340jZw interfaceC1286340jZw) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getVideoFrames... ");
        sbLIZ.append(getSafeString(str));
        C2484209oO.LJI("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(interfaceC1286300jZs);
        tEVideoUtilsCallback.setOnFisishedListener(interfaceC1286340jZw);
        return TEVideoUtils.nativeGetVideoFrame(str, iArr, i, i2, z, tEVideoUtilsCallback, rotate_degree.ordinal(), false);
    }

    public static int getVideoThumb(String str, int i, InterfaceC1286300jZs interfaceC1286300jZs, boolean z, int i2, int i3, long j, int i4) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(interfaceC1286300jZs);
        return TEVideoUtils.nativeGetVideoThumb(str, i, tEVideoUtilsCallback, z, i2, i3, j, i4);
    }

    public static int resizeRGBAImage(String str, int i, int i2, String str2, int i3, int i4, ImgType imgType, int i5) {
        return TEVideoUtils.nativeResizeRGBAImage(str, i, i2, str2, i3, i4, imgType.ordinal(), i5);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, String str3, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(str3);
        int iNativeSaveVideoFrames = TEVideoUtils.nativeSaveVideoFrames(str, iArr, i, i2, z, C2188811AlT.LIZIZ(sbLIZ), i3, 70);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", iNativeSaveVideoFrames);
            jSONObject.put("has_effect", 0);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        b.LIZ("vesdk_editor_get_frame", "performance", jSONObject);
        return iNativeSaveVideoFrames;
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, boolean z2, InterfaceC1286300jZs interfaceC1286300jZs, boolean z3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getVideoFrames... ");
        sbLIZ.append(getSafeString(str));
        C2484209oO.LJI("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(interfaceC1286300jZs);
        return TEVideoUtils.nativeGetVideoFrame4(str, iArr, i, i2, z, z2, tEVideoUtilsCallback, z3);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, InterfaceC1286300jZs interfaceC1286300jZs) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getVideoFrames... ");
        sbLIZ.append(getSafeString(str));
        C2484209oO.LJI("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
        return TEVideoUtils.nativeGetVideoFrameMore(str, iArr, i, i2, z, z2, i3, z3, interfaceC1286300jZs);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, String str3, int i3, int i4) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(str3);
        int iNativeSaveVideoFrames = TEVideoUtils.nativeSaveVideoFrames(str, iArr, i, i2, z, C2188811AlT.LIZIZ(sbLIZ), i3, i4);
        if (iNativeSaveVideoFrames != 0 && TEVideoUtils.nativeGetFileType(str) == EnumC1700000uL8.type_Image.getValue()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append(str3);
            iNativeSaveVideoFrames = saveCompressedImage(str, C2188811AlT.LIZIZ(sbLIZ2), i, i2, i3);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", iNativeSaveVideoFrames);
            jSONObject.put("has_effect", 0);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        b.LIZ("vesdk_editor_get_frame", "performance", jSONObject);
        return iNativeSaveVideoFrames;
    }

    public static int concatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i, String str, String str2, String str3, String str4) {
        for (String str5 : strArr) {
            if (!new C0VSJ(str5).exists()) {
                return -114;
            }
        }
        for (String str6 : strArr2) {
            if (!new C0VSJ(str6).exists()) {
                return -114;
            }
        }
        return TEVideoUtils.concatRecordFrag(strArr, jArr, strArr2, jArr2, z, i, str, str2, str3, str4);
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3) {
        return detachAudioFromVideos(str, strArr, jArr, jArr2, j, j2, fArr, i, i2, i3, CompatibleMode.Legacy);
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3, CompatibleMode compatibleMode) {
        long[] jArr3 = new long[jArr.length];
        long[] jArr4 = new long[jArr.length];
        Arrays.fill(jArr3, -1L);
        Arrays.fill(jArr4, -1L);
        return detachAudioFromVideos(str, strArr, jArr, jArr2, jArr3, jArr4, j, j2, fArr, i, i2, i3, compatibleMode);
    }

    public static int detachAudioFromVideosCallback(String str, VEDetachAudioStreamListener vEDetachAudioStreamListener, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3) {
        long[] jArr3 = new long[jArr.length];
        long[] jArr4 = new long[jArr.length];
        Arrays.fill(jArr3, -1L);
        Arrays.fill(jArr4, -1L);
        return detachAudioFromVideosCallback(str, vEDetachAudioStreamListener, strArr, jArr, jArr2, jArr3, jArr4, j, j2, fArr, i, i2, i3);
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long j, long j2, float[] fArr, int i, int i2, int i3, CompatibleMode compatibleMode) {
        int iDetachAudioFromVideos = TEVideoUtils.detachAudioFromVideos(str, strArr, jArr, jArr2, jArr3, jArr4, j, j2, fArr, i, i2, i3, compatibleMode.ordinal());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", iDetachAudioFromVideos);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        b.LIZ("vesdk_editor_get_audio_frame", "performance", jSONObject);
        return iDetachAudioFromVideos;
    }

    public static int detachAudioFromVideosCallback(String str, VEDetachAudioStreamListener vEDetachAudioStreamListener, String[] strArr, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long j, long j2, float[] fArr, int i, int i2, int i3) {
        int iNativeDetachAudioFromVideosCallback = TEVideoUtils.nativeDetachAudioFromVideosCallback(str, vEDetachAudioStreamListener, strArr, jArr, jArr2, jArr3, jArr4, j, j2, fArr, i, i2, i3);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", iNativeDetachAudioFromVideosCallback);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        b.LIZ("vesdk_editor_get_audio_frame", "performance", jSONObject);
        return iNativeDetachAudioFromVideosCallback;
    }
}
