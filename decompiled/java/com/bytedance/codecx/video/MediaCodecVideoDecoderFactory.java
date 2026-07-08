package com.bytedance.codecx.video;

import X.C2188811AlT;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.bytedance.codecx.base.CodecXLogging;
import com.bytedance.codecx.video.EglBase;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Vector;

/* JADX INFO: loaded from: classes21.dex */
public class MediaCodecVideoDecoderFactory {
    public Vector<AndroidVideoDecoder> cacheDecoders = new Vector<>();
    public final Object cacheDecodersLock = new Object();
    public boolean enableAgfxSurfaceTextureHelper;
    public boolean enableCacheDecoder;
    public int maxCacheSize;

    public static MediaCodecVideoDecoderFactory createFactory() {
        return new MediaCodecVideoDecoderFactory();
    }

    public static CodecXVideoCodecDesc[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        CodecXVideoCodecStandard codecXVideoCodecStandard = CodecXVideoCodecStandard.H264;
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(codecXVideoCodecStandard);
        if (mediaCodecInfoFindCodecForType != null) {
            if (isH264HighProfileSupported(mediaCodecInfoFindCodecForType, codecXVideoCodecStandard)) {
                arrayList.add(new CodecXVideoCodecDesc(codecXVideoCodecStandard, CodecXVideoCodecProfile.ProfileHigh));
            }
            arrayList.add(new CodecXVideoCodecDesc(codecXVideoCodecStandard, CodecXVideoCodecProfile.ProfileBaseline));
        }
        return (CodecXVideoCodecDesc[]) arrayList.toArray(new CodecXVideoCodecDesc[arrayList.size()]);
    }

    public static boolean isAv1Supported() {
        if (findCodecForType(CodecXVideoCodecStandard.AV1) != null) {
            return true;
        }
        CodecXLogging.e("MediaCodecVideoDecoderFactory", "this device can not supported av1 hw decoder");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("cache decoder size is ok:");
        r1.append(r6.cacheDecoders.size());
        r1.append(" maxCacheSize:");
        r1.append(r6.maxCacheSize);
        com.bytedance.codecx.base.CodecXLogging.w("MediaCodecVideoDecoderFactory", X.C2188811AlT.LIZIZ(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void adjustCacheDecoderCount() {
        /*
            r6 = this;
            java.lang.Object r3 = r6.cacheDecodersLock
            monitor-enter(r3)
            java.util.Vector<com.bytedance.codecx.video.AndroidVideoDecoder> r0 = r6.cacheDecoders     // Catch: java.lang.Throwable -> Lbd
            int r1 = r0.size()     // Catch: java.lang.Throwable -> Lbd
            int r0 = r6.maxCacheSize     // Catch: java.lang.Throwable -> Lbd
            if (r1 <= r0) goto Lbb
            java.lang.String r2 = "MediaCodecVideoDecoderFactory"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.lang.String r0 = "cache decoder size is too big:"
            r1.append(r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.util.Vector<com.bytedance.codecx.video.AndroidVideoDecoder> r0 = r6.cacheDecoders     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            int r0 = r0.size()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            r1.append(r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.lang.String r0 = " maxCacheSize:"
            r1.append(r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            int r0 = r6.maxCacheSize     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            r1.append(r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.lang.String r0 = " will release some decoder"
            r1.append(r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            com.bytedance.codecx.base.CodecXLogging.w(r2, r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.util.Vector<com.bytedance.codecx.video.AndroidVideoDecoder> r0 = r6.cacheDecoders     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
        L3d:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lbb
            java.lang.Object r4 = r5.next()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            com.bytedance.codecx.video.AndroidVideoDecoder r4 = (com.bytedance.codecx.video.AndroidVideoDecoder) r4     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            boolean r0 = r4.isRunning()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            if (r0 != 0) goto L3d
            java.util.Vector<com.bytedance.codecx.video.AndroidVideoDecoder> r0 = r6.cacheDecoders     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            int r1 = r0.size()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            int r0 = r6.maxCacheSize     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            if (r1 <= r0) goto L8a
            r5.remove()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.lang.String r2 = "MediaCodecVideoDecoderFactory"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.lang.String r0 = "remove a cache mediacodec video decoder:"
            r1.append(r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            r1.append(r4)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.lang.String r0 = " cacheDecoders size:"
            r1.append(r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.util.Vector<com.bytedance.codecx.video.AndroidVideoDecoder> r0 = r6.cacheDecoders     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            int r0 = r0.size()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            r1.append(r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            com.bytedance.codecx.base.CodecXLogging.w(r2, r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            r0 = 0
            r4.updateCacheStatus(r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            r4.release()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            r4.setIsUsedCacheDecoder(r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            goto L3d
        L8a:
            java.lang.String r2 = "MediaCodecVideoDecoderFactory"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.lang.String r0 = "cache decoder size is ok:"
            r1.append(r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.util.Vector<com.bytedance.codecx.video.AndroidVideoDecoder> r0 = r6.cacheDecoders     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            int r0 = r0.size()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            r1.append(r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.lang.String r0 = " maxCacheSize:"
            r1.append(r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            int r0 = r6.maxCacheSize     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            r1.append(r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            com.bytedance.codecx.base.CodecXLogging.w(r2, r0)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lbd
            goto Lbb
        Lb0:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r1 = "MediaCodecVideoDecoderFactory"
            java.lang.String r0 = "remove cache decoder err:"
            com.bytedance.codecx.base.CodecXLogging.w(r1, r0, r2)     // Catch: java.lang.Throwable -> Lbd
        Lbb:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lbd
            return
        Lbd:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lbd
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lbd
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.codecx.video.MediaCodecVideoDecoderFactory.adjustCacheDecoderCount():void");
    }

    public boolean clearCacheDecoder() {
        if (this.cacheDecoders.size() <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearCacheDecoder size:");
            sbLIZ.append(this.cacheDecoders.size());
            sbLIZ.append(" no need clear!");
            CodecXLogging.w("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        try {
            synchronized (this.cacheDecodersLock) {
                try {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("clearCacheDecoder size:");
                    sbLIZ2.append(this.cacheDecoders.size());
                    CodecXLogging.w("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ2));
                    for (AndroidVideoDecoder androidVideoDecoder : this.cacheDecoders) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("release cache decoder:");
                        sbLIZ3.append(androidVideoDecoder);
                        sbLIZ3.append(" isrunning:");
                        sbLIZ3.append(androidVideoDecoder.isRunning());
                        CodecXLogging.w("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ3));
                        androidVideoDecoder.updateCacheStatus(false);
                        androidVideoDecoder.release();
                        androidVideoDecoder.setIsUsedCacheDecoder(false);
                    }
                    this.cacheDecoders.clear();
                } finally {
                }
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("release cache decoder failed:");
            sbLIZ4.append(e);
            CodecXLogging.e("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ4));
            return true;
        }
    }

    public static void enableEglLock(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaCodecVideoDecoderFactory enableEglLock:");
        sbLIZ.append(z);
        CodecXLogging.e("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ));
        EglBase.EglLock.enableEglLock = z;
    }

    public static void enableEglResetRelease(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaCodecVideoDecoderFactory enableEglResetRelease:");
        sbLIZ.append(z);
        CodecXLogging.e("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ));
        EglBase.EglLock.enableEglResetRelease = z;
    }

    public static MediaCodecInfo findCodecForType(CodecXVideoCodecStandard codecXVideoCodecStandard) {
        return findCodecForType(codecXVideoCodecStandard, 0);
    }

    public static boolean isSoftwareDecoder(MediaCodecInfo mediaCodecInfo) {
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
            if (!lowerCase.startsWith("omx.google.") && !lowerCase.startsWith("omx.ffmpeg.") && ((!lowerCase.startsWith("omx.sec.") || !lowerCase.contains(".sw.")) && !lowerCase.startsWith("c2.android.") && !lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") && !lowerCase.startsWith("c2.google.") && (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")))) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CodecXLogging.e("MediaCodecVideoDecoderFactory", "check decoder softonly error.", e);
            return false;
        }
    }

    public static MediaCodecInfo findCodecForType(CodecXVideoCodecStandard codecXVideoCodecStandard, int i) {
        MediaCodecInfo mediaCodecInfo;
        MediaCodecInfo codecInfoAt;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        while (true) {
            mediaCodecInfo = null;
            try {
                if (i2 >= MediaCodecList.getCodecCount()) {
                    break;
                }
                try {
                    codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    CodecXLogging.e("MediaCodecVideoDecoderFactory", "Cannot retrieve decoder codec info", e);
                    codecInfoAt = null;
                }
                if (codecInfoAt != null && !codecInfoAt.isEncoder() && !isSoftwareDecoder(codecInfoAt) && isSupportedCodec(codecInfoAt, codecXVideoCodecStandard)) {
                    arrayList.add(codecInfoAt);
                    String lowerCase = codecInfoAt.getName().toLowerCase();
                    if (lowerCase.startsWith("omx.")) {
                        arrayList2.add(codecInfoAt);
                    } else if (lowerCase.startsWith("c2.")) {
                        arrayList3.add(codecInfoAt);
                    }
                }
                i2++;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                CodecXLogging.e("MediaCodecVideoDecoderFactory", "findCodecForType got system error:", e2);
            }
        }
        if (arrayList.isEmpty()) {
            CodecXLogging.e("MediaCodecVideoDecoderFactory", "No supported hardware decoder found for standard: " + codecXVideoCodecStandard);
            return null;
        }
        CodecXLogging.w("MediaCodecVideoDecoderFactory", "supportedCodecs size: " + arrayList.size() + " omxCodecs size: " + arrayList2.size() + " c2Codecs size: " + arrayList3.size() + " preferCodecType: " + i);
        if (i != 1) {
            if (i != 2) {
                mediaCodecInfo = (MediaCodecInfo) ListProtector.get(arrayList, 0);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Default decoder, selected: ");
                sbLIZ.append(mediaCodecInfo.getName());
                CodecXLogging.w("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ));
            } else if (!arrayList3.isEmpty()) {
                mediaCodecInfo = (MediaCodecInfo) ListProtector.get(arrayList3, 0);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Prefer c2 decoder, selected: ");
                sbLIZ2.append(mediaCodecInfo.getName());
                CodecXLogging.w("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else if (!arrayList2.isEmpty()) {
            mediaCodecInfo = (MediaCodecInfo) ListProtector.get(arrayList2, 0);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Prefer omx decoder, selected: ");
            sbLIZ3.append(mediaCodecInfo.getName());
            CodecXLogging.w("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (mediaCodecInfo == null) {
            return (MediaCodecInfo) ListProtector.get(arrayList, 0);
        }
        return mediaCodecInfo;
    }

    public static boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo, CodecXVideoCodecStandard codecXVideoCodecStandard) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.")) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(codecXVideoCodecStandard.mimeType());
        int i = 0;
        while (true) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
            if (i >= codecProfileLevelArr.length) {
                return false;
            }
            if (8 == codecProfileLevelArr[i].profile) {
                return true;
            }
            i++;
        }
    }

    public static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, CodecXVideoCodecStandard codecXVideoCodecStandard) {
        mediaCodecInfo.getName();
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, codecXVideoCodecStandard) || MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(codecXVideoCodecStandard.mimeType())) == null) {
            return false;
        }
        return true;
    }

    public VideoDecoder createDecoder(CodecXVideoCodecDesc codecXVideoCodecDesc, int i) {
        CodecXVideoCodecStandard standard = codecXVideoCodecDesc.getStandard();
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(standard, i);
        if (mediaCodecInfoFindCodecForType == null) {
            return null;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoFindCodecForType.getCapabilitiesForType(standard.mimeType());
        for (int i2 : capabilitiesForType.colorFormats) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("support codecColorFormat is:");
            sbLIZ.append(i2);
            CodecXLogging.w("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ));
        }
        Integer numSelectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, capabilitiesForType);
        if (numSelectColorFormat == null) {
            return null;
        }
        synchronized (this.cacheDecodersLock) {
            try {
                if (this.cacheDecoders.size() > 0) {
                    for (AndroidVideoDecoder androidVideoDecoder : this.cacheDecoders) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("cache decoder:");
                        sbLIZ2.append(androidVideoDecoder);
                        sbLIZ2.append(" decoder.getCodecType():");
                        sbLIZ2.append(androidVideoDecoder.getCodecType());
                        sbLIZ2.append(" is running:");
                        sbLIZ2.append(androidVideoDecoder.isRunning());
                        sbLIZ2.append(" isUsedCacheDecoder:");
                        sbLIZ2.append(androidVideoDecoder.isUsedCacheDecoder());
                        CodecXLogging.w("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    for (AndroidVideoDecoder androidVideoDecoder2 : this.cacheDecoders) {
                        if (androidVideoDecoder2.getCodecType() == standard && androidVideoDecoder2.getColorFormat() == numSelectColorFormat.intValue() && !androidVideoDecoder2.isRunning() && !androidVideoDecoder2.isUsedCacheDecoder()) {
                            androidVideoDecoder2.updateCacheStatus(this.enableCacheDecoder);
                            androidVideoDecoder2.setIsUsedCacheDecoder(true);
                            androidVideoDecoder2.SetIsCacheDecoderWhenCreate(true);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("return a cache mediacodec video decoder:");
                            sbLIZ3.append(androidVideoDecoder2);
                            sbLIZ3.append(" now cacheDecoders size:");
                            sbLIZ3.append(this.cacheDecoders.size());
                            CodecXLogging.w("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ3));
                            return androidVideoDecoder2;
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("this cache mediacodec video decoder can not use:");
                        sbLIZ4.append(androidVideoDecoder2);
                        sbLIZ4.append(" decoder.getCodecType():");
                        sbLIZ4.append(androidVideoDecoder2.getCodecType());
                        sbLIZ4.append(" decoder.getColorFormat():");
                        sbLIZ4.append(androidVideoDecoder2.getColorFormat());
                        sbLIZ4.append(" decoder.isCacheDecoder():");
                        sbLIZ4.append(androidVideoDecoder2.isCacheDecoder());
                        sbLIZ4.append(" decoder.isRunning():");
                        sbLIZ4.append(androidVideoDecoder2.isRunning());
                        sbLIZ4.append(" standard:");
                        sbLIZ4.append(standard);
                        sbLIZ4.append(" colorFormat:");
                        sbLIZ4.append(numSelectColorFormat);
                        CodecXLogging.w("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
                AndroidVideoDecoder androidVideoDecoder3 = new AndroidVideoDecoder(new MediaCodecWrapperFactoryImpl(), mediaCodecInfoFindCodecForType.getName(), standard, numSelectColorFormat.intValue(), this.enableCacheDecoder);
                CodecXLogging.w("MediaCodecVideoDecoderFactory", "return a new mediacodec video decoder:" + androidVideoDecoder3);
                adjustCacheDecoderCount();
                synchronized (this.cacheDecodersLock) {
                    try {
                        if (this.cacheDecoders.size() < this.maxCacheSize) {
                            androidVideoDecoder3.updateCacheStatus(this.enableCacheDecoder);
                            androidVideoDecoder3.setIsUsedCacheDecoder(true);
                            androidVideoDecoder3.SetIsCacheDecoderWhenCreate(false);
                            this.cacheDecoders.add(androidVideoDecoder3);
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("save a cache mediacodec video decoder:");
                            sbLIZ5.append(androidVideoDecoder3);
                            sbLIZ5.append("now cacheDecoders size:");
                            sbLIZ5.append(this.cacheDecoders.size());
                            CodecXLogging.w("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ5));
                        }
                    } finally {
                    }
                }
                return androidVideoDecoder3;
            } finally {
            }
        }
    }

    public boolean setCacheVideoDecoderInfo(boolean z, int i) {
        if (i > 16) {
            CodecXLogging.w("MediaCodecVideoDecoderFactory", "setCacheVideoDecoderInfo cacheSize is too big, set to 16.");
            i = 16;
        }
        this.enableCacheDecoder = z;
        this.maxCacheSize = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaCodecVideoDecoderFactory setCacheVideoDecoderInfo:");
        sbLIZ.append(z);
        sbLIZ.append(" maxCacheSize:");
        sbLIZ.append(this.maxCacheSize);
        CodecXLogging.w("MediaCodecVideoDecoderFactory", C2188811AlT.LIZIZ(sbLIZ));
        adjustCacheDecoderCount();
        return true;
    }
}
