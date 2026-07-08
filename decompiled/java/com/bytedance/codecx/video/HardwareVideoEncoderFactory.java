package com.bytedance.codecx.video;

import X.C2188811AlT;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.bytedance.codecx.base.CodecXDeviceInfoAndroid;
import com.bytedance.codecx.base.CodecXLogging;
import com.bytedance.codecx.video.VideoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Vector;

/* JADX INFO: loaded from: classes21.dex */
public class HardwareVideoEncoderFactory {
    public Vector<HardwareVideoEncoder> cacheEncoders = new Vector<>();
    public final Object cacheEncodersLock = new Object();
    public boolean enableCacheEncoder;
    public int maxCacheSize;

    /* JADX INFO: renamed from: com.bytedance.codecx.video.HardwareVideoEncoderFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecStandard;

        static {
            int[] iArr = new int[CodecXVideoCodecStandard.values().length];
            $SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecStandard = iArr;
            try {
                iArr[CodecXVideoCodecStandard.H264.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecStandard[CodecXVideoCodecStandard.ByteVC1.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecStandard[CodecXVideoCodecStandard.VP8.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecStandard[CodecXVideoCodecStandard.VP9.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    public static HardwareVideoEncoderFactory createFactory() {
        return new HardwareVideoEncoderFactory();
    }

    public static CodecXVideoCodecDesc[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        CodecXVideoCodecStandard[] codecXVideoCodecStandardArr = {CodecXVideoCodecStandard.ByteVC1, CodecXVideoCodecStandard.H264, CodecXVideoCodecStandard.VP8};
        do {
            CodecXVideoCodecStandard codecXVideoCodecStandard = codecXVideoCodecStandardArr[i];
            MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(codecXVideoCodecStandard);
            if (mediaCodecInfoFindCodecForType != null) {
                if (codecXVideoCodecStandard == CodecXVideoCodecStandard.ByteVC1 && isSupportedCodec(mediaCodecInfoFindCodecForType, codecXVideoCodecStandard)) {
                    arrayList.add(new CodecXVideoCodecDesc(codecXVideoCodecStandard, CodecXVideoCodecProfile.ByteVC1ProfileMain));
                }
                if (codecXVideoCodecStandard == CodecXVideoCodecStandard.H264) {
                    if (isH264HighProfileSupported(mediaCodecInfoFindCodecForType)) {
                        arrayList.add(new CodecXVideoCodecDesc(codecXVideoCodecStandard, CodecXVideoCodecProfile.ProfileHigh));
                    }
                    arrayList.add(new CodecXVideoCodecDesc(codecXVideoCodecStandard, CodecXVideoCodecProfile.ProfileBaseline));
                }
                if (codecXVideoCodecStandard == CodecXVideoCodecStandard.VP8) {
                    arrayList.add(new CodecXVideoCodecDesc(codecXVideoCodecStandard, CodecXVideoCodecProfile.VP8ProfileMain));
                }
            }
            i++;
        } while (i < 3);
        return (CodecXVideoCodecDesc[]) arrayList.toArray(new CodecXVideoCodecDesc[arrayList.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0090, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append(r6);
        r1.append("cache encoder size is :");
        r1.append(r6.cacheEncoders.size());
        r1.append(" maxCacheSize:");
        r1.append(r6.maxCacheSize);
        com.bytedance.codecx.base.CodecXLogging.w("HwVideoEncoderFactory", X.C2188811AlT.LIZIZ(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void adjustCacheEncoderCount() {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.codecx.video.HardwareVideoEncoderFactory.adjustCacheEncoderCount():void");
    }

    public boolean clearCacheEncoder() {
        if (this.cacheEncoders.size() <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearCacheEncoder size:");
            sbLIZ.append(this.cacheEncoders.size());
            sbLIZ.append(" no need clear!");
            CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        try {
            synchronized (this.cacheEncodersLock) {
                try {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this);
                    sbLIZ2.append(" clearCacheDecoder size:");
                    sbLIZ2.append(this.cacheEncoders.size());
                    CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ2));
                    for (HardwareVideoEncoder hardwareVideoEncoder : this.cacheEncoders) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("release cache encoder:");
                        sbLIZ3.append(hardwareVideoEncoder);
                        sbLIZ3.append(" running:");
                        sbLIZ3.append(hardwareVideoEncoder.isRunning());
                        CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ3));
                        hardwareVideoEncoder.updateCacheStatus(false);
                        hardwareVideoEncoder.release();
                        hardwareVideoEncoder.setIsUsedCacheEncoder(false);
                    }
                    this.cacheEncoders.clear();
                } finally {
                }
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("release cache encoder failed:");
            sbLIZ4.append(e);
            CodecXLogging.e("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ4));
            return true;
        }
    }

    public static MediaCodecInfo findCodecForType(CodecXVideoCodecStandard codecXVideoCodecStandard) {
        return findCodecForType(codecXVideoCodecStandard, 0);
    }

    public static int getKeyFrameIntervalSec(CodecXVideoCodecStandard codecXVideoCodecStandard) {
        int i = AnonymousClass1.$SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecStandard[codecXVideoCodecStandard.ordinal()];
        if (i == 1 || i == 2) {
            return 720;
        }
        if (i != 3 && i != 4) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unsupported VideoCodecType ");
            sbLIZ.append(codecXVideoCodecStandard);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return 100;
    }

    public static boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        String strGetDeviceModel = CodecXDeviceInfoAndroid.GetDeviceModel();
        String strGetDeviceBrand = CodecXDeviceInfoAndroid.GetDeviceBrand();
        if (CodecXDeviceInfoAndroid.GetCpuModel().contains("Amlogic") || ((strGetDeviceModel.equalsIgnoreCase("T730") && strGetDeviceBrand.equalsIgnoreCase("VHD")) || Build.VERSION.SDK_INT <= 23)) {
            return false;
        }
        return true;
    }

    public static boolean isHardwareSupportedInCurrentSdkByteVC1(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.")) {
            return true;
        }
        name.startsWith("OMX.Exynos.");
        return true;
    }

    public static boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.") || name.startsWith("OMX.sprd.")) {
            return true;
        }
        name.startsWith("OMX.Exynos.");
        return true;
    }

    public static boolean isHardwareSupportedInCurrentSdkVP8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.")) {
            return true;
        }
        name.startsWith("OMX.Intel.");
        return true;
    }

    public static boolean isInBlackList(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (!name.startsWith("OMX.Nvidia") && !name.startsWith("OMX.Intel") && !name.startsWith("OMX.TI.DUCATI1.VIDEO.H264E")) {
            return false;
        }
        return true;
    }

    public static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return mediaCodecInfo.isSoftwareOnly();
            }
            String name = mediaCodecInfo.getName();
            if (name == null) {
                return false;
            }
            String lowerCase = name.toLowerCase();
            if (lowerCase.startsWith("arc.")) {
                return false;
            }
            if (!lowerCase.startsWith("omx.google.") && !lowerCase.startsWith("omx.ffmpeg.") && ((!lowerCase.startsWith("omx.sec.") || !lowerCase.contains(".sw.")) && !lowerCase.startsWith("c2.android.") && !lowerCase.startsWith("c2.google.") && (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")))) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CodecXLogging.e("HwVideoEncoderFactory", "check encoder softonly error.", e);
            return false;
        }
    }

    public static MediaCodecInfo findCodecForType(CodecXVideoCodecStandard codecXVideoCodecStandard, int i) {
        MediaCodecInfo codecInfoAt;
        MediaCodecInfo mediaCodecInfo = null;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < codecCount; i2++) {
                try {
                    codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    codecInfoAt = null;
                }
                if (codecInfoAt != null && codecInfoAt.isEncoder() && !isSoftwareOnly(codecInfoAt) && !isInBlackList(codecInfoAt) && isSupportedCodec(codecInfoAt, codecXVideoCodecStandard)) {
                    arrayList.add(codecInfoAt);
                    String lowerCase = codecInfoAt.getName().toLowerCase();
                    if (lowerCase.startsWith("omx.")) {
                        arrayList2.add(codecInfoAt);
                    } else if (lowerCase.startsWith("c2.")) {
                        arrayList3.add(codecInfoAt);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("No supported hardware encoder found for standard: ");
                sbLIZ.append(codecXVideoCodecStandard);
                CodecXLogging.e("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("supportedCodecs size: ");
            sbLIZ2.append(arrayList.size());
            sbLIZ2.append(" omxCodecs size: ");
            sbLIZ2.append(arrayList2.size());
            sbLIZ2.append(" c2Codecs size: ");
            sbLIZ2.append(arrayList3.size());
            sbLIZ2.append(" preferCodecType: ");
            sbLIZ2.append(i);
            CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ2));
            if (i != 1) {
                if (i != 2) {
                    mediaCodecInfo = (MediaCodecInfo) ListProtector.get(arrayList, 0);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Default encoder, selected: ");
                    sbLIZ3.append(mediaCodecInfo.getName());
                    CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ3));
                } else if (!arrayList3.isEmpty()) {
                    mediaCodecInfo = (MediaCodecInfo) ListProtector.get(arrayList3, 0);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Prefer c2 encoder, selected: ");
                    sbLIZ4.append(mediaCodecInfo.getName());
                    CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ4));
                }
            } else if (!arrayList2.isEmpty()) {
                mediaCodecInfo = (MediaCodecInfo) ListProtector.get(arrayList2, 0);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Prefer omx encoder, selected: ");
                sbLIZ5.append(mediaCodecInfo.getName());
                CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ5));
            }
            if (mediaCodecInfo == null) {
                return (MediaCodecInfo) ListProtector.get(arrayList, 0);
            }
            return mediaCodecInfo;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static int getForcedKeyFrameIntervalMs(CodecXVideoCodecStandard codecXVideoCodecStandard, String str) {
        if (codecXVideoCodecStandard == CodecXVideoCodecStandard.VP8 && str.startsWith("OMX.qcom.")) {
            int i = Build.VERSION.SDK_INT;
            if (i == 23) {
                return 20000;
            }
            if (i > 23) {
                return 15000;
            }
            return 0;
        }
        return 0;
    }

    public static boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, CodecXVideoCodecStandard codecXVideoCodecStandard) {
        int i = AnonymousClass1.$SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecStandard[codecXVideoCodecStandard.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                return isHardwareSupportedInCurrentSdkVP8(mediaCodecInfo);
            }
            return isHardwareSupportedInCurrentSdkByteVC1(mediaCodecInfo);
        }
        return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
    }

    public static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, CodecXVideoCodecStandard codecXVideoCodecStandard) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, codecXVideoCodecStandard)) {
            return false;
        }
        try {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(codecXVideoCodecStandard.mimeType())) == null) {
                return false;
            }
            return isHardwareSupportedInCurrentSdk(mediaCodecInfo, codecXVideoCodecStandard);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public VideoEncoder createEncoder(CodecXVideoCodecDesc codecXVideoCodecDesc, int i) {
        int[] iArr;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" createEncoder:");
        sbLIZ.append(codecXVideoCodecDesc);
        CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ));
        CodecXVideoCodecStandard standard = codecXVideoCodecDesc.getStandard();
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(standard, i);
        if (mediaCodecInfoFindCodecForType == null) {
            return null;
        }
        String name = mediaCodecInfoFindCodecForType.getName();
        String strMimeType = standard.mimeType();
        Integer numSelectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType));
        if (numSelectColorFormat == null) {
            return null;
        }
        if (name.contains("OMX.hisi.")) {
            iArr = MediaCodecUtils.ENCODER_COLOR_FORMATS_FOR_HISI;
        } else {
            iArr = MediaCodecUtils.ENCODER_COLOR_FORMATS;
        }
        Integer numSelectColorFormat2 = MediaCodecUtils.selectColorFormat(iArr, mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType));
        if (numSelectColorFormat2 == null) {
            return null;
        }
        synchronized (this.cacheEncodersLock) {
            try {
                if (this.cacheEncoders.size() > 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("want a cache mediacodec video encoder which getStandard is:");
                    sbLIZ2.append(codecXVideoCodecDesc.getStandard().toInt());
                    sbLIZ2.append(" getProfile:");
                    sbLIZ2.append(codecXVideoCodecDesc.getProfile().toInt());
                    CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ2));
                    for (HardwareVideoEncoder hardwareVideoEncoder : this.cacheEncoders) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("cache encoder:");
                        sbLIZ3.append(hardwareVideoEncoder);
                        sbLIZ3.append(" is running:");
                        sbLIZ3.append(hardwareVideoEncoder.isRunning());
                        sbLIZ3.append(" isUsedCacheEncoder:");
                        sbLIZ3.append(hardwareVideoEncoder.isUsedCacheEncoder());
                        sbLIZ3.append(" Standard is:");
                        sbLIZ3.append(hardwareVideoEncoder.getCodecDesc().getStandard());
                        sbLIZ3.append(" Profile is:");
                        sbLIZ3.append(hardwareVideoEncoder.getCodecDesc().getProfile());
                        CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    for (HardwareVideoEncoder hardwareVideoEncoder2 : this.cacheEncoders) {
                        if (!hardwareVideoEncoder2.isRunning() && !hardwareVideoEncoder2.isUsedCacheEncoder() && hardwareVideoEncoder2.getCodecDesc().getStandard().toInt() == codecXVideoCodecDesc.getStandard().toInt() && hardwareVideoEncoder2.getCodecDesc().getProfile().toInt() == codecXVideoCodecDesc.getProfile().toInt()) {
                            hardwareVideoEncoder2.updateCacheStatus(this.enableCacheEncoder);
                            hardwareVideoEncoder2.setIsUsedCacheEncoder(true);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("return a cache mediacodec video encoder:");
                            sbLIZ4.append(hardwareVideoEncoder2);
                            sbLIZ4.append(" now cacheDecoders size:");
                            sbLIZ4.append(this.cacheEncoders.size());
                            CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ4));
                            return hardwareVideoEncoder2;
                        }
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("this cache mediacodec video encoder can not use:");
                        sbLIZ5.append(hardwareVideoEncoder2);
                        sbLIZ5.append(" encoder.isCacheEncoder():");
                        sbLIZ5.append(hardwareVideoEncoder2.isCacheEncoder());
                        sbLIZ5.append(" encoder.isRunning():");
                        sbLIZ5.append(hardwareVideoEncoder2.isRunning());
                        sbLIZ5.append(" isUsedCacheEncoder:");
                        sbLIZ5.append(hardwareVideoEncoder2.isUsedCacheEncoder());
                        sbLIZ5.append(" standard:");
                        sbLIZ5.append(hardwareVideoEncoder2.getCodecDesc().getStandard().toInt());
                        sbLIZ5.append(" profile:");
                        sbLIZ5.append(hardwareVideoEncoder2.getCodecDesc().getProfile().toInt());
                        CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ5));
                    }
                } else {
                    CodecXLogging.w("HwVideoEncoderFactory", "no cache video encoder, will create a new one");
                }
                HardwareVideoEncoder hardwareVideoEncoder3 = new HardwareVideoEncoder(new MediaCodecWrapperFactoryImpl(), name, codecXVideoCodecDesc, numSelectColorFormat, numSelectColorFormat2, getKeyFrameIntervalSec(standard), getForcedKeyFrameIntervalMs(standard, name), mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType), this.enableCacheEncoder);
                adjustCacheEncoderCount();
                synchronized (this.cacheEncodersLock) {
                    try {
                        if (this.cacheEncoders.size() < this.maxCacheSize) {
                            hardwareVideoEncoder3.updateCacheStatus(this.enableCacheEncoder);
                            hardwareVideoEncoder3.setIsUsedCacheEncoder(true);
                            this.cacheEncoders.add(hardwareVideoEncoder3);
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append(this);
                            sbLIZ6.append(" save a cache mediacodec video encoder:");
                            sbLIZ6.append(hardwareVideoEncoder3);
                            sbLIZ6.append(" now cacheDecoders size:");
                            sbLIZ6.append(this.cacheEncoders.size());
                            CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ6));
                        }
                    } finally {
                    }
                }
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("return a new mediacodec video encoder:");
                sbLIZ7.append(hardwareVideoEncoder3);
                CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ7));
                return hardwareVideoEncoder3;
            } finally {
            }
        }
    }

    public boolean setCacheVideoEncoderInfo(boolean z, int i) {
        if (i > 8) {
            CodecXLogging.w("HwVideoEncoderFactory", "setCacheVideoEncoderInfo cacheSize is too big, set to 8.");
            i = 8;
        }
        this.enableCacheEncoder = z;
        this.maxCacheSize = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" setCacheVideoEncoderInfo:");
        sbLIZ.append(z);
        sbLIZ.append(" maxCacheSize:");
        sbLIZ.append(this.maxCacheSize);
        CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ));
        adjustCacheEncoderCount();
        return true;
    }

    public static boolean isBitrateModeSupported(MediaCodecInfo mediaCodecInfo, CodecXVideoCodecStandard codecXVideoCodecStandard, int i) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(codecXVideoCodecStandard.mimeType());
        if (capabilitiesForType == null) {
            CodecXLogging.e("HwVideoEncoderFactory", "get capability return null.");
            return false;
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        if (encoderCapabilities == null) {
            CodecXLogging.e("HwVideoEncoderFactory", "get EncoderCapabilities return null.");
            return false;
        }
        return encoderCapabilities.isBitrateModeSupported(i);
    }

    public VideoEncoder createEncoderWithSettings(CodecXVideoCodecDesc codecXVideoCodecDesc, StaticSettings staticSettings, int i) {
        int[] iArr;
        boolean z;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append("createEncoderWithSettings:");
        sbLIZ.append(staticSettings);
        CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ));
        CodecXVideoCodecStandard standard = codecXVideoCodecDesc.getStandard();
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(standard, i);
        if (mediaCodecInfoFindCodecForType == null) {
            return null;
        }
        String name = mediaCodecInfoFindCodecForType.getName();
        String strMimeType = standard.mimeType();
        Integer numSelectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType));
        if (numSelectColorFormat == null) {
            return null;
        }
        if (name.contains("OMX.hisi.")) {
            iArr = MediaCodecUtils.ENCODER_COLOR_FORMATS_FOR_HISI;
        } else {
            iArr = MediaCodecUtils.ENCODER_COLOR_FORMATS;
        }
        Integer numSelectColorFormat2 = MediaCodecUtils.selectColorFormat(iArr, mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType));
        if (numSelectColorFormat2 == null) {
            return null;
        }
        synchronized (this.cacheEncodersLock) {
            try {
                boolean z3 = true;
                if (this.cacheEncoders.size() > 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("want a cache mediacodec video encoder which getStandard is:");
                    sbLIZ2.append(codecXVideoCodecDesc.getStandard());
                    sbLIZ2.append(" getProfile:");
                    sbLIZ2.append(codecXVideoCodecDesc.getProfile());
                    CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ2));
                    for (HardwareVideoEncoder hardwareVideoEncoder : this.cacheEncoders) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("cache encoder:");
                        sbLIZ3.append(hardwareVideoEncoder);
                        sbLIZ3.append(" is running:");
                        sbLIZ3.append(hardwareVideoEncoder.isRunning());
                        sbLIZ3.append(" isUsedCacheEncoder:");
                        sbLIZ3.append(hardwareVideoEncoder.isUsedCacheEncoder());
                        sbLIZ3.append(" Standard is:");
                        sbLIZ3.append(hardwareVideoEncoder.getCodecDesc().getStandard());
                        sbLIZ3.append(" Profile is:");
                        sbLIZ3.append(hardwareVideoEncoder.getCodecDesc().getProfile());
                        CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    for (HardwareVideoEncoder hardwareVideoEncoder2 : this.cacheEncoders) {
                        VideoEncoder.Settings settings = hardwareVideoEncoder2.getSettings();
                        if (settings == null) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("cache encoder:");
                            sbLIZ4.append(hardwareVideoEncoder2);
                            sbLIZ4.append(", getSettings is null");
                            CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ4));
                        } else {
                            if (!hardwareVideoEncoder2.isRunning() && !hardwareVideoEncoder2.isUsedCacheEncoder() && hardwareVideoEncoder2.getCodecDesc().standard == codecXVideoCodecDesc.standard && hardwareVideoEncoder2.getCodecDesc().profile == codecXVideoCodecDesc.profile && settings.width == staticSettings.width && settings.height == staticSettings.height && settings.scaleMode == staticSettings.scaleMode && settings.bitrateMode == staticSettings.bitrateMode && settings.primaryId == staticSettings.primaryId && settings.transferId == staticSettings.transferId && settings.matrixId == staticSettings.matrixId && settings.rangeId == staticSettings.rangeId && settings.targetKeyFrameIntervalMs == staticSettings.targetKeyFrameIntervalMs && settings.minQp == staticSettings.minQp && settings.maxQp == staticSettings.maxQp && settings.minIQp == staticSettings.minIQp && settings.maxIQp == staticSettings.maxIQp && settings.enableAlignment == staticSettings.enableAlignment && settings.encodeMode == staticSettings.encodeMode && (z = settings.closeSetProfile) == (z2 = staticSettings.closeSetProfile) && z == z2 && settings.bFrameNum == staticSettings.bFrameNum && settings.enableAsyncMode == staticSettings.enableAsyncMode && settings.enableROI == staticSettings.enableROI && settings.enableColorSpaceSetting == staticSettings.enableColorSpaceSetting && settings.isStatisticsEnabled == staticSettings.isStatisticsEnabled) {
                                hardwareVideoEncoder2.updateCacheStatus(this.enableCacheEncoder);
                                hardwareVideoEncoder2.setIsUsedCacheEncoder(z3);
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("return a cache mediacodec video encoder:");
                                sbLIZ5.append(hardwareVideoEncoder2);
                                sbLIZ5.append(" now cacheDecoders size:");
                                sbLIZ5.append(this.cacheEncoders.size());
                                CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ5));
                                return hardwareVideoEncoder2;
                            }
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("createEncoderWithSettings:this cache mediacodec video encoder can not use:");
                            sbLIZ6.append(hardwareVideoEncoder2);
                            sbLIZ6.append(" encoder.isCacheEncoder():");
                            sbLIZ6.append(hardwareVideoEncoder2.isCacheEncoder());
                            sbLIZ6.append(" encoder.isRunning():");
                            sbLIZ6.append(hardwareVideoEncoder2.isRunning());
                            sbLIZ6.append(" standard:");
                            sbLIZ6.append(hardwareVideoEncoder2.getCodecDesc().getStandard());
                            sbLIZ6.append(" profile:");
                            sbLIZ6.append(hardwareVideoEncoder2.getCodecDesc().getProfile());
                            sbLIZ6.append(" \nencoderSettings.width:");
                            sbLIZ6.append(settings.width);
                            sbLIZ6.append(" settings.width:");
                            sbLIZ6.append(staticSettings.width);
                            sbLIZ6.append(" \nencoderSettings.height:");
                            sbLIZ6.append(settings.height);
                            sbLIZ6.append(" settings.height:");
                            sbLIZ6.append(staticSettings.height);
                            sbLIZ6.append(" \nencoderSettings.scaleMode:");
                            sbLIZ6.append(settings.scaleMode);
                            sbLIZ6.append(" settings.scaleMode:");
                            sbLIZ6.append(staticSettings.scaleMode);
                            sbLIZ6.append(" \nencoderSettings.bitrateMode:");
                            sbLIZ6.append(settings.bitrateMode);
                            sbLIZ6.append(" settings.bitrateMode:");
                            sbLIZ6.append(staticSettings.bitrateMode);
                            sbLIZ6.append(" \nencoderSettings.primaryId:");
                            sbLIZ6.append(settings.primaryId);
                            sbLIZ6.append(" settings.primaryId:");
                            sbLIZ6.append(staticSettings.primaryId);
                            sbLIZ6.append(" \nencoderSettings.transferId:");
                            sbLIZ6.append(settings.transferId);
                            sbLIZ6.append(" settings.transferId:");
                            sbLIZ6.append(staticSettings.transferId);
                            sbLIZ6.append(" \nencoderSettings.matrixId:");
                            sbLIZ6.append(settings.matrixId);
                            sbLIZ6.append(" settings.matrixId:");
                            sbLIZ6.append(staticSettings.matrixId);
                            sbLIZ6.append(" \nencoderSettings.rangeId:");
                            sbLIZ6.append(settings.rangeId);
                            sbLIZ6.append(" settings.rangeId:");
                            sbLIZ6.append(staticSettings.rangeId);
                            sbLIZ6.append(" \nencoderSettings.targetKeyFrameIntervalMs:");
                            sbLIZ6.append(settings.targetKeyFrameIntervalMs);
                            sbLIZ6.append(" settings.targetKeyFrameIntervalMs:");
                            sbLIZ6.append(staticSettings.targetKeyFrameIntervalMs);
                            sbLIZ6.append(" \nencoderSettings.minQp:");
                            sbLIZ6.append(settings.minQp);
                            sbLIZ6.append(" settings.minQp:");
                            sbLIZ6.append(staticSettings.minQp);
                            sbLIZ6.append(" \nencoderSettings.maxQp:");
                            sbLIZ6.append(settings.maxQp);
                            sbLIZ6.append(" settings.maxQp:");
                            sbLIZ6.append(staticSettings.maxQp);
                            sbLIZ6.append(" \nencoderSettings.minIQp:");
                            sbLIZ6.append(settings.minIQp);
                            sbLIZ6.append(" settings.minIQp:");
                            sbLIZ6.append(staticSettings.minIQp);
                            sbLIZ6.append(" \nencoderSettings.maxIQp:");
                            sbLIZ6.append(settings.maxIQp);
                            sbLIZ6.append(" settings.maxIQp:");
                            sbLIZ6.append(staticSettings.maxIQp);
                            sbLIZ6.append(" \nencoderSettings.enableAlignment:");
                            sbLIZ6.append(settings.enableAlignment);
                            sbLIZ6.append(" settings.enableAlignment:");
                            sbLIZ6.append(staticSettings.enableAlignment);
                            sbLIZ6.append(" \nencoderSettings.encodeMode:");
                            sbLIZ6.append(settings.encodeMode);
                            sbLIZ6.append(" settings.encodeMode:");
                            sbLIZ6.append(staticSettings.encodeMode);
                            sbLIZ6.append(" \nencoderSettings.closeSetProfile:");
                            sbLIZ6.append(settings.closeSetProfile);
                            sbLIZ6.append(" settings.closeSetProfile:");
                            sbLIZ6.append(staticSettings.closeSetProfile);
                            sbLIZ6.append(" \nencoderSettings.bFrameNum:");
                            sbLIZ6.append(settings.bFrameNum);
                            sbLIZ6.append(" settings.bFrameNum:");
                            sbLIZ6.append(staticSettings.bFrameNum);
                            sbLIZ6.append(" \nencoderSettings.enableAsyncMode:");
                            sbLIZ6.append(settings.enableAsyncMode);
                            sbLIZ6.append(" settings.enableAsyncMode:");
                            sbLIZ6.append(staticSettings.enableAsyncMode);
                            sbLIZ6.append(" \nencoderSettings.enableROI:");
                            sbLIZ6.append(settings.enableROI);
                            sbLIZ6.append(" settings.enableROI:");
                            sbLIZ6.append(staticSettings.enableROI);
                            sbLIZ6.append(" \nencoderSettings.enableColorSpaceSetting:");
                            sbLIZ6.append(settings.enableColorSpaceSetting);
                            sbLIZ6.append(" settings.enableColorSpaceSetting:");
                            sbLIZ6.append(staticSettings.enableColorSpaceSetting);
                            sbLIZ6.append(" \nencoderSettings.isStatisticsEnabled:");
                            sbLIZ6.append(settings.isStatisticsEnabled);
                            sbLIZ6.append(" settings.isStatisticsEnabled:");
                            sbLIZ6.append(staticSettings.isStatisticsEnabled);
                            CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ6));
                            z3 = true;
                        }
                    }
                } else {
                    CodecXLogging.w("HwVideoEncoderFactory", "no cache video encoder, will create a new one");
                }
                HardwareVideoEncoder hardwareVideoEncoder3 = new HardwareVideoEncoder(new MediaCodecWrapperFactoryImpl(), name, codecXVideoCodecDesc, numSelectColorFormat, numSelectColorFormat2, getKeyFrameIntervalSec(standard), getForcedKeyFrameIntervalMs(standard, name), mediaCodecInfoFindCodecForType.getCapabilitiesForType(strMimeType), this.enableCacheEncoder);
                adjustCacheEncoderCount();
                synchronized (this.cacheEncodersLock) {
                    try {
                        if (this.cacheEncoders.size() < this.maxCacheSize) {
                            hardwareVideoEncoder3.updateCacheStatus(this.enableCacheEncoder);
                            hardwareVideoEncoder3.setIsUsedCacheEncoder(true);
                            this.cacheEncoders.add(hardwareVideoEncoder3);
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("save a cache mediacodec video encoder:");
                            sbLIZ7.append(hardwareVideoEncoder3);
                            sbLIZ7.append(" now cacheDecoders size:");
                            sbLIZ7.append(this.cacheEncoders.size());
                            CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ7));
                        }
                    } finally {
                    }
                }
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("return a new mediacodec video encoder:");
                sbLIZ8.append(hardwareVideoEncoder3);
                CodecXLogging.w("HwVideoEncoderFactory", C2188811AlT.LIZIZ(sbLIZ8));
                return hardwareVideoEncoder3;
            } finally {
            }
        }
    }
}
