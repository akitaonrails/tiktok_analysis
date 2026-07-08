package com.bytedance.codecx.video;

import X.C08FF;
import X.C0W9U;
import X.C1283770jVn;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.codecx.CodecXVideoSurfaceController;
import com.bytedance.codecx.base.CodecXDeviceInfoAndroid;
import com.bytedance.codecx.base.CodecXLogging;
import com.bytedance.codecx.base.ThreadUtils;
import com.bytedance.codecx.video.EglBase;
import com.bytedance.codecx.video.EglBase14;
import com.bytedance.codecx.video.VideoEncoder;
import com.bytedance.codecx.video.memory.CodecXVideoFrameInterface;
import com.bytedance.codecx.video.memory.CodecXVideoMemoryInterface;
import com.bytedance.codecx.video.memory.CodecXVideoOpenGLMemoryInterface;
import com.bytedance.codecx.video.memory.NativeCodecXByteMemory;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes21.dex */
public class HardwareVideoEncoder extends MediaCodec.Callback implements VideoEncoder {
    public static boolean isQcomChecked;
    public static boolean isQcomResult;
    public int actualHeight;
    public int actualWidth;
    public int adjustedBitrate;
    public Handler asyncHandler;
    public HandlerThread asyncOutputThread;
    public boolean automaticResizeOn;
    public VideoEncoder.BitrateMode bitrateMode;
    public final Object cacheEncoderFlushLock;
    public VideoEncoder.Callback callback;
    public final Object callbackLock;
    public MediaCodecInfo.CodecCapabilities capabilities;
    public boolean checkSVCLayer;
    public boolean closeBlur;
    public MediaCodecWrapper codec;
    public final CodecXVideoCodecDesc codecDesc;
    public int codecHeightAlign;
    public final String codecName;
    public int codecWidthAlign;
    public ByteBuffer configBuffer;
    public MediaFormat currentMediaFormat;
    public boolean enableGlClear;
    public boolean enableMakeCurrent;
    public boolean enableNativeRender;
    public final ThreadUtils.ThreadChecker encodeThreadChecker;
    public long firstFrameDiffUs;
    public Boolean forceSurfaceInput;
    public final long forcedKeyFrameNs;
    public boolean hasCloseGopVendor;
    public int height;
    public LinkedList<Integer> inputBuffers;
    public boolean isCacheEncoder;
    public boolean isCacheMediaCodecWhenCreate;
    public boolean isError;
    public boolean isNeedSurfaceInputWorkaround;
    public volatile boolean isResetCodec;
    public boolean isStatisticsEnabled;
    public boolean isSupportRoi;
    public Boolean isTextureBuffer;
    public boolean isUsedCacheEncoder;
    public final int keyFrameIntervalSec;
    public long lastKeyFrameNs;
    public final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    public Thread outputThread;
    public final ThreadUtils.ThreadChecker outputThreadChecker;
    public HashMap<String, String> privateParams;
    public int queriedGLESVersion = 2;
    public boolean releaseAsync;
    public final Object resetCodecLock;
    public volatile boolean running;
    public VideoEncoder.ScaleMode scaleMode;
    public VideoEncoder.Settings settings;
    public EglBase14.Context sharedContext;
    public volatile Exception shutdownException;
    public byte[] spsPpsDetectBuffer;
    public final Integer surfaceColorFormat;
    public int svcRealLayerNum;
    public GlRectDrawer textureDrawer;
    public EglBase14 textureEglBase;
    public Surface textureInputSurface;
    public int updateBitrate;
    public long updateBitrateTimestamp;
    public boolean useAsyncMode;
    public boolean useRoiFeature;
    public boolean useSurfaceMode;
    public VideoFrameDrawer videoFrameDrawer;
    public long videoFrameDrawerHandler;
    public HashMap<String, String> vpassPrivateParams;
    public int width;
    public final Integer yuvColorFormat;
    public final YuvFormat yuvFormat;

    private boolean isRoiInfoValid(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return i >= 0 && i <= i2 && i2 < i6 && i3 >= 0 && i3 <= i4 && i4 < i7 && i5 >= -2 && i5 <= 2;
    }

    public static native long nativeCreateDrawer();

    public static native void nativeDestroyDrawer(long j);

    public static native int nativeDrawFrame(long j, long j2, int i, int i2, int i3, int i4);

    private int queryCurerentRunningGlesVersion() {
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetCurrentDisplay(), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        return iArr[0];
    }

    @Override // com.bytedance.codecx.video.VideoEncoder
    public CodecXVideoCodecStatus release() {
        return releaseInternal(true);
    }

    /* JADX INFO: renamed from: com.bytedance.codecx.video.HardwareVideoEncoder$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecProfile;

        static {
            int[] iArr = new int[CodecXVideoCodecProfile.values().length];
            $SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecProfile = iArr;
            try {
                iArr[CodecXVideoCodecProfile.ProfileHigh.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecProfile[CodecXVideoCodecProfile.ProfileConstrainedHigh.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecProfile[CodecXVideoCodecProfile.ProfileBaseline.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecProfile[CodecXVideoCodecProfile.ProfileConstrainedBaseline.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecProfile[CodecXVideoCodecProfile.ProfileMain.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecProfile[CodecXVideoCodecProfile.ByteVC1ProfileMain.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecProfile[CodecXVideoCodecProfile.ByteVC1ProfileMain10.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecProfile[CodecXVideoCodecProfile.ByteVC1ProfileMain10HDR10.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
        }
    }

    private void alignResolutionIfNeeded() {
        if (this.settings.enableAlignment) {
            if (this.codecWidthAlign == 0) {
                MediaCodecInfo.VideoCapabilities videoCapabilities = this.capabilities.getVideoCapabilities();
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                this.codecWidthAlign = widthAlignment > 16 ? widthAlignment : 16;
                this.codecHeightAlign = heightAlignment > 4 ? heightAlignment : 4;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("alignResolutionIfNeeded, capabilities align is: ");
                sbLIZ.append(widthAlignment);
                sbLIZ.append("x");
                sbLIZ.append(heightAlignment);
                sbLIZ.append(", final codec align is: ");
                sbLIZ.append(this.codecWidthAlign);
                sbLIZ.append("x");
                sbLIZ.append(this.codecHeightAlign);
                CodecXLogging.i("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            }
            int i = this.actualWidth;
            this.width = ((i + r0) - 1) & (~(this.codecWidthAlign - 1));
            int i2 = this.actualHeight;
            this.height = ((i2 + r0) - 1) & (~(this.codecHeightAlign - 1));
        } else {
            this.width = this.actualWidth;
            this.height = this.actualHeight;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("alignResolutionIfNeeded, actual: ");
        sbLIZ2.append(this.actualWidth);
        sbLIZ2.append("x");
        sbLIZ2.append(this.actualHeight);
        sbLIZ2.append(", align to: ");
        sbLIZ2.append(this.width);
        sbLIZ2.append("x");
        sbLIZ2.append(this.height);
        CodecXLogging.i("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
    }

    private boolean canUseSurface() {
        return this.surfaceColorFormat != null;
    }

    private Thread createOutputThread() {
        return new BPEAThread("video_encoded_thread") { // from class: com.bytedance.codecx.video.HardwareVideoEncoder.1
            private void bpea_origin_run() {
                com_bytedance_codecx_video_HardwareVideoEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_codecx_video_HardwareVideoEncoder$1__run$___twin___() {
                while (HardwareVideoEncoder.this.running) {
                    if (!HardwareVideoEncoder.this.isResetCodec) {
                        HardwareVideoEncoder.this.deliverEncodedImage();
                    }
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }

            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public void run() {
                C1C7U.LIZ("HardwareVideoEncoder@5757.createOutputThread$4");
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    com_bytedance_codecx_video_HardwareVideoEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("HardwareVideoEncoder@5757.createOutputThread$4");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    throw th;
                }
            }

            public static void com_bytedance_codecx_video_HardwareVideoEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_bytedance_codecx_video_HardwareVideoEncoder$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
    }

    private CodecXVideoCodecStatus initEncodeInternal() {
        MediaFormat outputFormat;
        this.encodeThreadChecker.checkIsOnValidThread();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this:");
        sbLIZ.append(this);
        sbLIZ.append(" initEncodeInternal start");
        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        this.lastKeyFrameNs = -1L;
        this.privateParams.clear();
        this.privateParams.putAll(this.vpassPrivateParams);
        this.isStatisticsEnabled = false;
        synchronized (this.callbackLock) {
            try {
                this.inputBuffers.clear();
                this.isError = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            this.isCacheMediaCodecWhenCreate = false;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createByCodecName, this:");
            sbLIZ2.append(this);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            try {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecDesc.getStandard().mimeType(), this.width, this.height);
                this.currentMediaFormat = mediaFormatCreateVideoFormat;
                initMediaFormat(mediaFormatCreateVideoFormat);
                enableEncodingStatistics(this.currentMediaFormat);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("this:");
                sbLIZ3.append(this);
                sbLIZ3.append(", Format: ");
                sbLIZ3.append(this.currentMediaFormat);
                CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ3));
                if (this.useAsyncMode) {
                    HandlerThread handlerThread = new HandlerThread("asyncOutput");
                    this.asyncOutputThread = handlerThread;
                    handlerThread.start();
                    this.asyncHandler = new BPEAHandler(C786410Ut5.W2(this.asyncOutputThread));
                    this.outputThreadChecker.detachThread();
                    this.running = true;
                    this.codec.setCallback(this, this.asyncHandler);
                }
                this.codec.configure(this.currentMediaFormat, null, null, 1);
                if (isSvcEnabled() && (outputFormat = this.codec.getOutputFormat()) != null) {
                    this.svcRealLayerNum = parseRealLayerNum(outputFormat);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("");
                    sbLIZ4.append(this.svcRealLayerNum);
                    sbLIZ4.append(", output format after configure: ");
                    sbLIZ4.append(outputFormat.toString());
                    CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ4));
                }
                if (CodecXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("[EGLDebug] codecx_enable_egl_reset_release: ");
                    sbLIZ5.append(EglBase.EglLock.enableEglResetRelease);
                    CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ5));
                    Surface surface = this.textureInputSurface;
                    if (surface != null) {
                        surface.release();
                        this.textureInputSurface = null;
                    }
                    this.textureInputSurface = this.codec.createInputSurface();
                    CodecXVideoSurfaceController.getInstance().setSurface(this.textureInputSurface);
                } else if (this.useSurfaceMode) {
                    releaseFrameDrawer();
                    EglBase14 eglBase14 = this.textureEglBase;
                    if (eglBase14 != null) {
                        eglBase14.release();
                        this.textureEglBase = null;
                    }
                    Surface surface2 = this.textureInputSurface;
                    if (surface2 != null) {
                        surface2.release();
                        this.textureInputSurface = null;
                    }
                    if (shouldResetCodecWhenPLI()) {
                        Surface surfaceCreatePersistentInputSurface = this.codec.createPersistentInputSurface();
                        this.textureInputSurface = surfaceCreatePersistentInputSurface;
                        try {
                            this.codec.setInputSurface(surfaceCreatePersistentInputSurface);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            CodecXLogging.e("HardwareVideoEncoder", "setInputSurface failed", e);
                            release();
                        }
                    } else {
                        this.textureInputSurface = this.codec.createInputSurface();
                    }
                    this.textureEglBase = new EglBase14(this.sharedContext, C1283770jVn.LJIIJ(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_RECORDABLE));
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("[EglDebug] initEncodeInternal this: ");
                    sbLIZ6.append(this);
                    sbLIZ6.append(" textureEglBase: ");
                    sbLIZ6.append(this.textureEglBase);
                    sbLIZ6.append(" textureInputSurface: ");
                    sbLIZ6.append(this.textureInputSurface);
                    CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ6));
                    this.textureEglBase.createSurface(this.textureInputSurface);
                    this.textureEglBase.makeCurrent();
                    initFrameDrawer();
                }
                this.codec.start();
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("this:");
                sbLIZ7.append(this);
                sbLIZ7.append(" codec.start() OK");
                CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ7));
                VideoEncoder.Settings settings = this.settings;
                setExtCodecForHisi(settings.maxQp, settings.minQp);
                VideoEncoder.Settings settings2 = this.settings;
                if (settings2.encodeMode == VideoEncoder.EncodeMode.LIVE) {
                    updateBitrate(settings2.targetBps);
                }
                if (!this.useAsyncMode) {
                    this.running = true;
                    try {
                        this.outputThreadChecker.detachThread();
                        Thread threadCreateOutputThread = createOutputThread();
                        this.outputThread = threadCreateOutputThread;
                        threadCreateOutputThread.start();
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        CodecXLogging.e("HardwareVideoEncoder", "output thread err", e2);
                        release();
                        return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
                    }
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("this:");
                sbLIZ8.append(this);
                sbLIZ8.append(" initEncodeInternal done, cost:");
                sbLIZ8.append(jElapsedRealtime2 - jElapsedRealtime);
                CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ8));
                return CodecXVideoCodecStatus.OK;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("this:");
                sbLIZ9.append(this);
                sbLIZ9.append(" initEncodeInternal failed");
                CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ9), e3);
                release();
                return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("Cannot create media encoder ");
            sbLIZ10.append(this.codecName);
            CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ10), e4);
            return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isBFrameEnabled() {
        return Build.VERSION.SDK_INT >= 29 && this.settings.bFrameNum > 0;
    }

    private boolean isEncodingStatisticsSupported() {
        MediaCodecInfo codecInfo;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        if (this.codecDesc.standard == CodecXVideoCodecStandard.VP8 || (codecInfo = this.codec.getCodecInfo()) == null || (capabilitiesForType = codecInfo.getCapabilitiesForType(this.codecDesc.standard.mimeType())) == null || Build.VERSION.SDK_INT < 33) {
            return false;
        }
        return capabilitiesForType.isFeatureSupported("encoding-statistics");
    }

    private boolean isQcom() {
        if (!isQcomChecked) {
            if (this.codecName.toLowerCase().contains("qti") || this.codecName.toLowerCase().contains("qcom")) {
                isQcomResult = true;
            } else {
                isQcomResult = false;
            }
            isQcomChecked = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isQcomResult:");
            sbLIZ.append(isQcomResult);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        }
        return isQcomResult;
    }

    private boolean isSvcEnabled() {
        return this.settings.temporalLayerNum > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseInternal$0() {
        C1C7U.LIZ("HardwareVideoEncoder@5757.releaseInternal$1L");
        releaseCodecOnOutputThread();
        CodecXLogging.e("HardwareVideoEncoder", "is a cache encoder, not quit asyncOutputThread");
        C1C7U.LIZIZ("HardwareVideoEncoder@5757.releaseInternal$1L");
    }

    private void releaseFrameDrawer() {
        long j = this.videoFrameDrawerHandler;
        if (j != 0) {
            nativeDestroyDrawer(j);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("released native frame drawer 0x");
            sbLIZ.append(Long.toHexString(this.videoFrameDrawerHandler));
            CodecXLogging.i("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            this.videoFrameDrawerHandler = 0L;
        }
        GlRectDrawer glRectDrawer = this.textureDrawer;
        if (glRectDrawer != null) {
            glRectDrawer.release();
            this.textureDrawer = null;
        }
        VideoFrameDrawer videoFrameDrawer = this.videoFrameDrawer;
        if (videoFrameDrawer != null) {
            videoFrameDrawer.release();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("released java frame drawer ");
            sbLIZ2.append(this.videoFrameDrawer);
            CodecXLogging.i("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            this.videoFrameDrawer = null;
        }
    }

    private CodecXVideoCodecStatus resetCodecInternal() {
        this.encodeThreadChecker.checkIsOnValidThread();
        MediaCodecWrapper mediaCodecWrapper = this.codec;
        if (mediaCodecWrapper == null) {
            CodecXLogging.e("HardwareVideoEncoder", "resetCodecInternal, codec is null");
            return CodecXVideoCodecStatus.ERROR;
        }
        try {
            mediaCodecWrapper.reset();
            if (this.useAsyncMode) {
                this.codec.setCallback(this, this.asyncHandler);
            }
            this.codec.configure(this.currentMediaFormat, null, null, 1);
            if (CodecXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
                releaseFrameDrawer();
                EglBase14 eglBase14 = this.textureEglBase;
                if (eglBase14 != null) {
                    eglBase14.release();
                    this.textureEglBase = null;
                }
                Surface surface = this.textureInputSurface;
                if (surface != null) {
                    surface.release();
                    this.textureInputSurface = null;
                }
                this.textureInputSurface = this.codec.createInputSurface();
                CodecXVideoSurfaceController.getInstance().setSurface(this.textureInputSurface);
            } else if (this.useSurfaceMode) {
                try {
                    this.codec.setInputSurface(this.textureInputSurface);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    CodecXLogging.e("HardwareVideoEncoder", "setInputSurface failed", e);
                    release();
                }
            }
            this.codec.start();
            VideoEncoder.Settings settings = this.settings;
            setExtCodecForHisi(settings.maxQp, settings.minQp);
            VideoEncoder.Settings settings2 = this.settings;
            if (settings2.encodeMode == VideoEncoder.EncodeMode.LIVE) {
                updateBitrate(settings2.targetBps);
            }
            return CodecXVideoCodecStatus.OK;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resetCodecInternal() failed. Exception: ");
            sbLIZ.append(e2.toString());
            CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ), e2);
            release();
            return CodecXVideoCodecStatus.ERROR;
        }
    }

    private boolean shouldResetCodecWhenPLI() {
        return this.codecName.toLowerCase().contains("mtk") && isBFrameEnabled() && !this.hasCloseGopVendor;
    }

    public void deliverEncodedImage() {
        MediaCodec.BufferInfo bufferInfo;
        int iDequeueOutputBuffer;
        synchronized (this.resetCodecLock) {
            try {
                try {
                    bufferInfo = new MediaCodec.BufferInfo();
                    iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, this.releaseAsync ? 40000L : 100000L);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this);
                    sbLIZ.append(" deliverOutput failed");
                    CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ), e);
                }
                if (iDequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.codec.getOutputFormat();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("output format changed: ");
                    sbLIZ2.append(outputFormat.toString());
                    CodecXLogging.i("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                if (iDequeueOutputBuffer == -1) {
                    return;
                }
                if (iDequeueOutputBuffer == -3 || iDequeueOutputBuffer >= 0) {
                    drainOutputData(iDequeueOutputBuffer, bufferInfo, this.codec.getOutputBuffers()[iDequeueOutputBuffer]);
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("should not be here: index:");
                sbLIZ3.append(iDequeueOutputBuffer);
                CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ3));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.codecx.video.VideoEncoder
    public String getEncoderVendors() {
        if (Build.VERSION.SDK_INT < 31) {
            return "";
        }
        try {
            return this.codec.getSupportedVendorParameters().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getSupportVendorParameters err: ");
            sbLIZ.append(e);
            CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
    }

    public VideoEncoder.ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            CodecXVideoCodecStandard standard = this.codecDesc.getStandard();
            CodecXVideoCodecStandard codecXVideoCodecStandard = CodecXVideoCodecStandard.VP8;
            if (standard == codecXVideoCodecStandard) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (this.codecDesc.getStandard() == codecXVideoCodecStandard) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    public void releaseCodecOnOutputThread() {
        try {
            this.outputThreadChecker.checkIsOnValidThread();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            CodecXLogging.e("HardwareVideoEncoder", "check thread error.");
        }
        CodecXLogging.i("HardwareVideoEncoder", "Releasing MediaCodec on output thread isCacheEncoder:" + this.isCacheEncoder + " running:" + this.running + " releaseAsync:" + this.releaseAsync + " encoder:" + this);
        final MediaCodecWrapper mediaCodecWrapper = this.codec;
        if (this.isCacheEncoder) {
            this.isUsedCacheEncoder = false;
            this.running = false;
        } else {
            this.codec = null;
        }
        if (this.releaseAsync) {
            try {
                new BPEAThread(new Runnable() { // from class: X.0jX1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.LL.lambda$releaseCodecOnOutputThread$2(mediaCodecWrapper);
                    }
                }).start();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                CodecXLogging.e("HardwareVideoEncoder", "thread err when release codec", e2);
            }
        } else if (mediaCodecWrapper != null) {
            if (this.isCacheEncoder) {
                try {
                    synchronized (this.cacheEncoderFlushLock) {
                        try {
                            mediaCodecWrapper.flush();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("mediacodec isCacheEncoder, just flush! this: ");
                            sbLIZ.append(this);
                            CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
                        } finally {
                        }
                    }
                    return;
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    CodecXLogging.e("HardwareVideoEncoder", "Media encoder flush failed", e3);
                }
            } else {
                try {
                    mediaCodecWrapper.stop();
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    CodecXLogging.e("HardwareVideoEncoder", "Media encoder stop failed", e4);
                }
                try {
                    mediaCodecWrapper.release();
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    CodecXLogging.e("HardwareVideoEncoder", "Media encoder release failed", e5);
                    this.shutdownException = e5;
                }
            }
        }
        if (!this.isCacheEncoder) {
            this.configBuffer = null;
        }
        CodecXLogging.i("HardwareVideoEncoder", "Release on output thread done");
    }

    private void initFrameDrawer() {
        this.queriedGLESVersion = queryCurerentRunningGlesVersion();
        if (this.enableNativeRender) {
            this.videoFrameDrawerHandler = nativeCreateDrawer();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("created native frame drawer 0x");
            sbLIZ.append(Long.toHexString(this.videoFrameDrawerHandler));
            CodecXLogging.i("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.textureDrawer = new GlRectDrawer();
        this.videoFrameDrawer = new VideoFrameDrawer();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("created java frame drawer ");
        sbLIZ2.append(this.videoFrameDrawer);
        CodecXLogging.i("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.codecx.video.VideoEncoder
    public CodecXVideoCodecStatus flush() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append("mediacodec encoder flush start");
        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        MediaCodecWrapper mediaCodecWrapper = this.codec;
        if (mediaCodecWrapper == null) {
            CodecXLogging.e("HardwareVideoEncoder", "flush: codec is null,do nothing.");
            return CodecXVideoCodecStatus.OK;
        }
        try {
            mediaCodecWrapper.flush();
            if (this.useAsyncMode) {
                synchronized (this.callbackLock) {
                    try {
                        this.inputBuffers.clear();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this);
            sbLIZ2.append("mediacodec  encoder flush OK, cost:");
            sbLIZ2.append(jElapsedRealtime2 - jElapsedRealtime);
            sbLIZ2.append("ms");
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            return CodecXVideoCodecStatus.OK;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CodecXLogging.e("HardwareVideoEncoder", "flush: err.", e);
            return CodecXVideoCodecStatus.ERROR;
        }
    }

    @Override // com.bytedance.codecx.video.VideoEncoder
    public boolean isCacheEncoderWhenCreate() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isCacheMediaCodecWhenCreate:");
        sbLIZ.append(this.isCacheMediaCodecWhenCreate);
        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        return this.isCacheMediaCodecWhenCreate;
    }

    @Override // com.bytedance.codecx.video.VideoEncoder
    public CodecXVideoCodecStatus requestKeyFrame() {
        requestKeyFrame(System.currentTimeMillis());
        return CodecXVideoCodecStatus.OK;
    }

    public CodecXVideoCodecDesc getCodecDesc() {
        return this.codecDesc;
    }

    public VideoEncoder.Settings getSettings() {
        return this.settings;
    }

    public boolean isCacheEncoder() {
        return this.isCacheEncoder;
    }

    public boolean isRunning() {
        return this.running;
    }

    public boolean isUsedCacheEncoder() {
        return this.isUsedCacheEncoder;
    }

    public enum VendorSupportStatus {
        VENDOR_SUPPORT_NO,
        VENDOR_SUPPORT_YES,
        VENDOR_SUPPORT_UNKNOWN;

        public static VendorSupportStatus valueOf(String str) {
            return (VendorSupportStatus) C08FF.LIZ(VendorSupportStatus.class, str);
        }
    }

    public enum YuvFormat {
        I420 { // from class: com.bytedance.codecx.video.HardwareVideoEncoder.YuvFormat.1
            @Override // com.bytedance.codecx.video.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, CodecXVideoFrameInterface codecXVideoFrameInterface, int i, int i2) {
                CodecXVideoMemoryInterface andRetainVideoFrameMemory;
                if (codecXVideoFrameInterface == null || (andRetainVideoFrameMemory = codecXVideoFrameInterface.getAndRetainVideoFrameMemory()) == null) {
                    return;
                }
                if (andRetainVideoFrameMemory.getPixelFormat() == CodecXPixelFormat.kI420 && (andRetainVideoFrameMemory instanceof NativeCodecXByteMemory)) {
                    NativeCodecXByteMemory nativeCodecXByteMemory = (NativeCodecXByteMemory) andRetainVideoFrameMemory;
                    CodecXYuvHelper.I420Copy(nativeCodecXByteMemory.getPlaneData(0), nativeCodecXByteMemory.getPlaneLineSize(0), nativeCodecXByteMemory.getPlaneData(1), nativeCodecXByteMemory.getPlaneLineSize(1), nativeCodecXByteMemory.getPlaneData(2), nativeCodecXByteMemory.getPlaneLineSize(2), byteBuffer, codecXVideoFrameInterface.getWidth(), codecXVideoFrameInterface.getHeight(), i, i2);
                } else {
                    CodecXVideoFrameInterface i420 = codecXVideoFrameInterface.toI420();
                    if (i420 == null) {
                        andRetainVideoFrameMemory.release();
                        return;
                    }
                    CodecXVideoMemoryInterface andRetainVideoFrameMemory2 = i420.getAndRetainVideoFrameMemory();
                    if (andRetainVideoFrameMemory2 == null) {
                        i420.release();
                        andRetainVideoFrameMemory.release();
                        return;
                    } else if (!(andRetainVideoFrameMemory2 instanceof NativeCodecXByteMemory)) {
                        andRetainVideoFrameMemory2.release();
                        i420.release();
                        andRetainVideoFrameMemory.release();
                        return;
                    } else {
                        NativeCodecXByteMemory nativeCodecXByteMemory2 = (NativeCodecXByteMemory) andRetainVideoFrameMemory2;
                        CodecXYuvHelper.I420Copy(nativeCodecXByteMemory2.getPlaneData(0), nativeCodecXByteMemory2.getPlaneLineSize(0), nativeCodecXByteMemory2.getPlaneData(1), nativeCodecXByteMemory2.getPlaneLineSize(1), nativeCodecXByteMemory2.getPlaneData(2), nativeCodecXByteMemory2.getPlaneLineSize(2), byteBuffer, i420.getWidth(), i420.getHeight(), i, i2);
                        andRetainVideoFrameMemory2.release();
                        i420.release();
                    }
                }
                andRetainVideoFrameMemory.release();
            }
        },
        NV12 { // from class: com.bytedance.codecx.video.HardwareVideoEncoder.YuvFormat.2
            @Override // com.bytedance.codecx.video.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, CodecXVideoFrameInterface codecXVideoFrameInterface, int i, int i2) {
                CodecXVideoMemoryInterface andRetainVideoFrameMemory;
                if (codecXVideoFrameInterface == null || (andRetainVideoFrameMemory = codecXVideoFrameInterface.getAndRetainVideoFrameMemory()) == null) {
                    return;
                }
                if (andRetainVideoFrameMemory.getPixelFormat() == CodecXPixelFormat.kNv12 && (andRetainVideoFrameMemory instanceof NativeCodecXByteMemory)) {
                    NativeCodecXByteMemory nativeCodecXByteMemory = (NativeCodecXByteMemory) andRetainVideoFrameMemory;
                    CodecXYuvHelper.NV12Copy(nativeCodecXByteMemory.getPlaneData(0), nativeCodecXByteMemory.getPlaneLineSize(0), nativeCodecXByteMemory.getPlaneData(1), nativeCodecXByteMemory.getPlaneLineSize(1), byteBuffer, codecXVideoFrameInterface.getWidth(), codecXVideoFrameInterface.getHeight(), i, i2);
                } else {
                    CodecXVideoFrameInterface i420 = codecXVideoFrameInterface.toI420();
                    if (i420 == null) {
                        andRetainVideoFrameMemory.release();
                        return;
                    }
                    CodecXVideoMemoryInterface andRetainVideoFrameMemory2 = i420.getAndRetainVideoFrameMemory();
                    if (andRetainVideoFrameMemory2 == null) {
                        i420.release();
                        andRetainVideoFrameMemory.release();
                        return;
                    } else if (!(andRetainVideoFrameMemory2 instanceof NativeCodecXByteMemory)) {
                        andRetainVideoFrameMemory2.release();
                        i420.release();
                        andRetainVideoFrameMemory.release();
                        return;
                    } else {
                        NativeCodecXByteMemory nativeCodecXByteMemory2 = (NativeCodecXByteMemory) andRetainVideoFrameMemory2;
                        CodecXYuvHelper.I420ToNV12(nativeCodecXByteMemory2.getPlaneData(0), nativeCodecXByteMemory2.getPlaneLineSize(0), nativeCodecXByteMemory2.getPlaneData(1), nativeCodecXByteMemory2.getPlaneLineSize(1), nativeCodecXByteMemory2.getPlaneData(2), nativeCodecXByteMemory2.getPlaneLineSize(2), byteBuffer, i420.getWidth(), i420.getHeight(), i, i2);
                        andRetainVideoFrameMemory2.release();
                        i420.release();
                    }
                }
                andRetainVideoFrameMemory.release();
            }
        };

        public abstract void fillBuffer(ByteBuffer byteBuffer, CodecXVideoFrameInterface codecXVideoFrameInterface, int i, int i2);

        public static YuvFormat valueOf(int i) {
            if (i != 19) {
                if (i != 21 && i != 2141391872 && i != 2141391876) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unsupported colorFormat: ");
                    sbLIZ.append(i);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                return NV12;
            }
            return I420;
        }

        public static YuvFormat valueOf(String str) {
            return (YuvFormat) C08FF.LIZ(YuvFormat.class, str);
        }
    }

    private void enableEncodingStatistics(MediaFormat mediaFormat) {
        if (isEncodingStatisticsSupported() && this.settings.isStatisticsEnabled) {
            mediaFormat.setInteger("video-encoding-statistics-level", 1);
            this.isStatisticsEnabled = true;
        }
    }

    private CodecXVideoCodecStatus encodeByteBuffer(CodecXVideoFrameInterface codecXVideoFrameInterface) {
        int iDequeueInputBuffer;
        ByteBuffer inputBuffer;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.useAsyncMode) {
            synchronized (this.callbackLock) {
                try {
                    if (this.inputBuffers.size() <= 0) {
                        iDequeueInputBuffer = -1;
                    } else {
                        iDequeueInputBuffer = this.inputBuffers.removeFirst().intValue();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (iDequeueInputBuffer == -1) {
                CodecXLogging.i("HardwareVideoEncoder", "Dropped frame, no input buffers available");
                return CodecXVideoCodecStatus.NO_OUTPUT;
            }
            try {
                inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                CodecXLogging.e("HardwareVideoEncoder", "getInputBuffer failed", e);
                return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } else {
            try {
                iDequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
                if (iDequeueInputBuffer == -1) {
                    CodecXLogging.i("HardwareVideoEncoder", "Dropped frame, no input buffers available");
                    return CodecXVideoCodecStatus.NO_OUTPUT;
                }
                try {
                    inputBuffer = this.codec.getInputBuffers()[iDequeueInputBuffer];
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    CodecXLogging.e("HardwareVideoEncoder", "getInputBuffers failed", e2);
                    return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                CodecXLogging.e("HardwareVideoEncoder", "dequeueInputBuffer failed", e3);
                return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
            }
        }
        return drainInputData(iDequeueInputBuffer, inputBuffer, codecXVideoFrameInterface);
    }

    private CodecXVideoCodecStatus encodeTextureBuffer(CodecXVideoFrameInterface codecXVideoFrameInterface) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("got egl err:");
                sbLIZ.append(iGlGetError);
                CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (this.enableGlClear) {
                GLES20.glClear(16384);
            }
            if (this.queriedGLESVersion == 3) {
                CodecXVideoMemoryInterface andRetainVideoFrameMemory = codecXVideoFrameInterface.getAndRetainVideoFrameMemory();
                if (andRetainVideoFrameMemory == null) {
                    CodecXLogging.e("HardwareVideoEncoder", "encodeTexture got empty frame, skip this frame");
                    return CodecXVideoCodecStatus.OK;
                }
                if (andRetainVideoFrameMemory.getMemoryType() == CodecXVideoMemoryType.kOPENGL_TEXTURE) {
                    long gLSync = ((CodecXVideoOpenGLMemoryInterface) andRetainVideoFrameMemory).getGLSync();
                    if (gLSync != 0) {
                        GLES30.glWaitSync(gLSync, 0, -1L);
                    }
                }
                andRetainVideoFrameMemory.release();
            }
            if (this.enableNativeRender) {
                nativeDrawFrame(this.videoFrameDrawerHandler, codecXVideoFrameInterface.getNativeHandle(), this.width, this.height, codecXVideoFrameInterface.getWidth(), codecXVideoFrameInterface.getHeight());
            } else {
                codecXVideoFrameInterface.setRotation(CodecXVideoRotation.VIDEO_ROTATION_0);
                VideoFrameDrawer videoFrameDrawer = this.videoFrameDrawer;
                GlRectDrawer glRectDrawer = this.textureDrawer;
                int i = this.width;
                int i2 = this.height;
                videoFrameDrawer.drawFrame(codecXVideoFrameInterface, glRectDrawer, null, 0, 0, i, i2, i, i2);
            }
            this.textureEglBase.swapBuffers(codecXVideoFrameInterface.getTimestampNs());
            return CodecXVideoCodecStatus.OK;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CodecXLogging.e("HardwareVideoEncoder", "encodeTexture failed", e);
            return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private VendorSupportStatus getVendorSupportedStatus(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                if (this.codec.getSupportedVendorParameters().contains(str)) {
                    return VendorSupportStatus.VENDOR_SUPPORT_YES;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(" is not supported, supported list is: ");
                sbLIZ.append(this.codec.getSupportedVendorParameters().toString());
                CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
                return VendorSupportStatus.VENDOR_SUPPORT_NO;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getSupportVendorParameters err: ");
                sbLIZ2.append(e);
                CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
                return VendorSupportStatus.VENDOR_SUPPORT_UNKNOWN;
            }
        }
        return VendorSupportStatus.VENDOR_SUPPORT_UNKNOWN;
    }

    private void initMediaFormat(MediaFormat mediaFormat) {
        Integer num;
        if (this.useSurfaceMode) {
            num = this.surfaceColorFormat;
        } else {
            num = this.yuvColorFormat;
        }
        int iIntValue = num.intValue();
        CodecXVideoCodecStandard standard = this.codecDesc.getStandard();
        setIntegerParam(mediaFormat, "bitrate", Integer.valueOf(this.settings.targetBps));
        setIntegerParam(mediaFormat, "color-format", Integer.valueOf(iIntValue));
        setIntegerParam(mediaFormat, "frame-rate", Integer.valueOf(this.settings.targetFps));
        int i = this.settings.targetKeyFrameIntervalMs;
        if (i <= 0) {
            setIntegerParam(mediaFormat, "i-frame-interval", Integer.valueOf(this.keyFrameIntervalSec));
        } else {
            int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
            if (i2 <= 1) {
                i2 = 1;
            }
            setIntegerParam(mediaFormat, "i-frame-interval", Integer.valueOf(i2));
        }
        boolean zIsSupportRoiFeature = isSupportRoiFeature(mediaFormat);
        this.isSupportRoi = zIsSupportRoiFeature;
        if (this.settings.enableROI && zIsSupportRoiFeature && (standard == CodecXVideoCodecStandard.ByteVC1 || standard == CodecXVideoCodecStandard.H264)) {
            this.useRoiFeature = true;
            CodecXLogging.w("HardwareVideoEncoder", "using the roi feature, qualcomm devices using hw roi encoding mush adjust the rc algorithm to vbr mode");
            setIntegerParam(mediaFormat, "bitrate-mode", 1);
        } else {
            this.useRoiFeature = false;
            setBitrateMode(mediaFormat);
            CodecXLogging.w("HardwareVideoEncoder", "not using roi feature; settings.enableROI:" + this.settings.enableROI + ", isSupportRoi:" + this.isSupportRoi + ", standard:" + standard);
        }
        if (this.settings.encodeMode == VideoEncoder.EncodeMode.LIVE) {
            setProfileForLive(mediaFormat);
        } else {
            setProfileForRTC(mediaFormat);
        }
        if (this.settings.enableColorSpaceSetting) {
            setColorSpace(mediaFormat);
        }
        setBFrameNumber(mediaFormat);
        setSVCNumber(mediaFormat);
        setBlurInfo(mediaFormat);
        this.hasCloseGopVendor = isSupportSetCloseGop(mediaFormat);
        if (this.codecName.toLowerCase().contains("mtk") && isBFrameEnabled() && this.hasCloseGopVendor) {
            CodecXLogging.w("HardwareVideoEncoder", "enable bframe and support set close gop");
            setIntegerParam(mediaFormat, "vendor.mtk.ext.venc.clean.gop.enable", 1);
        }
        if (standard != CodecXVideoCodecStandard.VP8 && this.settings.enableQpSetting) {
            if (this.codecName.contains("OMX.hisi.")) {
                setIntegerParam(mediaFormat, "vendor.hisi.hisi-ext-codec-vendor-configure", 1);
            }
            setIPFrameMinMaxQP(mediaFormat);
            if (isBFrameEnabled()) {
                setBFrameMinMaxQP(mediaFormat);
            }
        }
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set android hardware encoder private param with Key:");
            sbLIZ.append(entry.getKey());
            sbLIZ.append(" Value:");
            sbLIZ.append(entry.getValue());
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            if (isNumeric(entry.getValue())) {
                mediaFormat.setInteger(entry.getKey(), CastIntegerProtector.parseInt(entry.getValue()));
            } else if (entry.getValue().length() > 0) {
                mediaFormat.setString(entry.getKey(), entry.getValue());
            }
        }
    }

    private boolean isForceUseSurfaceInput(int i) {
        if (isQcom() && isBFrameEnabled()) {
            return true;
        }
        Boolean bool = this.forceSurfaceInput;
        if (bool != null && bool.booleanValue() && !this.isNeedSurfaceInputWorkaround) {
            return true;
        }
        if (this.isNeedSurfaceInputWorkaround && i % 16 != 0) {
            return true;
        }
        return false;
    }

    private boolean isNumeric(String str) {
        if (str != null && str.matches("[0-9]+")) {
            return true;
        }
        return false;
    }

    private boolean isSupportRoiFeature(MediaFormat mediaFormat) {
        if (isQcom()) {
            VendorSupportStatus vendorSupportedStatus = getVendorSupportedStatus("vendor.qti-ext-enc-roiinfo.type");
            VendorSupportStatus vendorSupportStatus = VendorSupportStatus.VENDOR_SUPPORT_NO;
            if (vendorSupportedStatus != vendorSupportStatus && getVendorSupportedStatus("vendor.qti-ext-enc-roiinfo.rect-payload") != vendorSupportStatus && getVendorSupportedStatus("vendor.qti-ext-enc-roiinfo.rect-payload-ext") != vendorSupportStatus && getVendorSupportedStatus("vendor.qti-ext-enc-roiinfo.timestamp") != vendorSupportStatus) {
                CodecXLogging.w("HardwareVideoEncoder", "roi feature is supported");
                return true;
            }
            CodecXLogging.w("HardwareVideoEncoder", "roi feature is not supported");
            return false;
        }
        CodecXLogging.w("HardwareVideoEncoder", "currently only qualcomm devices support roi feature");
        return false;
    }

    private boolean isSupportSetCloseGop(MediaFormat mediaFormat) {
        if (getVendorSupportedStatus("vendor.mtk.ext.venc.clean.gop.enable") == VendorSupportStatus.VENDOR_SUPPORT_YES) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseCodecOnOutputThread$2(MediaCodecWrapper mediaCodecWrapper) {
        C1C7U.LIZ("HardwareVideoEncoder@5757.releaseCodecOnOutputThread$1L");
        if (mediaCodecWrapper == null) {
            C1C7U.LIZIZ("HardwareVideoEncoder@5757.releaseCodecOnOutputThread$1L");
            return;
        }
        CodecXLogging.e("HardwareVideoEncoder", "mediacodec release start!");
        if (this.isCacheEncoder) {
            try {
                synchronized (this.cacheEncoderFlushLock) {
                    try {
                        mediaCodecWrapper.flush();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("releaseAsync, mediacodec isCacheEncoder, just flush! this: ");
                        sbLIZ.append(this);
                        CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                C1C7U.LIZIZ("HardwareVideoEncoder@5757.releaseCodecOnOutputThread$1L");
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                CodecXLogging.e("HardwareVideoEncoder", "Media encoder flush failed", e);
            }
        } else {
            try {
                mediaCodecWrapper.stop();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                CodecXLogging.e("HardwareVideoEncoder", "Media encoder stop failed", e2);
            }
            try {
                mediaCodecWrapper.release();
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                CodecXLogging.e("HardwareVideoEncoder", "Media encoder release failed", e3);
                this.shutdownException = e3;
            }
            CodecXLogging.e("HardwareVideoEncoder", "mediacodec release end!");
        }
        C1C7U.LIZIZ("HardwareVideoEncoder@5757.releaseCodecOnOutputThread$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseInternal$1(HandlerThread handlerThread) {
        C1C7U.LIZ("HardwareVideoEncoder@5757.releaseInternal$2L");
        releaseCodecOnOutputThread();
        if (handlerThread != null) {
            handlerThread.quit();
        }
        C1C7U.LIZIZ("HardwareVideoEncoder@5757.releaseInternal$2L");
    }

    private int parseRealLayerNum(MediaFormat mediaFormat) {
        String string = mediaFormat.getString("ts-schema");
        if (!TextUtils.isEmpty(string) && string.length() >= 17) {
            String strSubstring = string.substring(16, 17);
            if (isNumeric(strSubstring)) {
                try {
                    int i = CastIntegerProtector.parseInt(strSubstring);
                    if (i <= this.settings.temporalLayerNum && i > 0) {
                        return i;
                    }
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    CodecXLogging.e("HardwareVideoEncoder", e.toString());
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("temporal layer invalid: ");
            sbLIZ.append(string);
            CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            return 1;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("output temporal str is: ");
        sbLIZ2.append(string);
        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
        return 1;
    }

    private CodecXVideoCodecStatus releaseInternal(boolean z) {
        boolean z2;
        this.encodeThreadChecker.checkIsOnValidThread();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" hardware video encoder release start.");
        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        CodecXVideoCodecStatus codecXVideoCodecStatus = CodecXVideoCodecStatus.OK;
        synchronized (this.callbackLock) {
            try {
                this.running = false;
                z2 = this.isCacheEncoder;
                if (z2 && z) {
                    this.callback = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (this.useAsyncMode) {
            final HandlerThread handlerThread = this.asyncOutputThread;
            if (handlerThread != null) {
                if (z2) {
                    C786410Ut5.LJJZZIII(this.asyncHandler, new Runnable() { // from class: X.0jX3
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.LL.lambda$releaseInternal$0();
                        }
                    });
                } else {
                    C786410Ut5.LJJZZIII(this.asyncHandler, new Runnable() { // from class: X.0jX0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.LL.lambda$releaseInternal$1(handlerThread);
                        }
                    });
                    if (!ThreadUtils.joinUninterruptibly(this.asyncOutputThread, Mp4ScreenVideoLoadTimeout.CONTROL)) {
                        CodecXLogging.e("HardwareVideoEncoder", "Media encoder release timeout");
                        codecXVideoCodecStatus = CodecXVideoCodecStatus.TIMEOUT;
                    }
                    this.asyncOutputThread = null;
                    this.asyncHandler = null;
                }
            }
        } else {
            Thread thread = this.outputThread;
            if (thread != null) {
                if (!ThreadUtils.joinUninterruptibly(thread, Mp4ScreenVideoLoadTimeout.CONTROL)) {
                    CodecXLogging.e("HardwareVideoEncoder", "Media encoder release timeout");
                    codecXVideoCodecStatus = CodecXVideoCodecStatus.TIMEOUT;
                } else if (this.shutdownException != null) {
                    CodecXLogging.e("HardwareVideoEncoder", "Media encoder release exception", this.shutdownException);
                    codecXVideoCodecStatus = CodecXVideoCodecStatus.ERROR;
                }
            }
        }
        if (!this.isCacheEncoder) {
            CodecXLogging.w("HardwareVideoEncoder", "Media encoder release ok.");
            releaseFrameDrawer();
            EglBase14 eglBase14 = this.textureEglBase;
            if (eglBase14 != null) {
                eglBase14.release();
                this.textureEglBase = null;
            }
            CodecXLogging.w("HardwareVideoEncoder", "textureEglBase release ok.");
            Surface surface = this.textureInputSurface;
            if (surface != null) {
                surface.release();
                this.textureInputSurface = null;
            }
            CodecXLogging.w("HardwareVideoEncoder", "textureInputSurface release ok.");
            this.codec = null;
        }
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this);
        sbLIZ2.append("hardware video encoder release end:");
        sbLIZ2.append(codecXVideoCodecStatus);
        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
        return codecXVideoCodecStatus;
    }

    private void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (shouldResetCodecWhenPLI()) {
            CodecXLogging.w("HardwareVideoEncoder", "reset codec when pli");
            this.isResetCodec = true;
            synchronized (this.resetCodecLock) {
                try {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        resetCodecInternal();
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("resetCodec execution time: ");
                        sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                        sbLIZ.append("ms");
                        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        CodecXLogging.e("HardwareVideoEncoder", "reset() failed", e);
                        release();
                    }
                    this.isResetCodec = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            CodecXLogging.w("HardwareVideoEncoder", "don't reset codec when pli");
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            CodecXLogging.e("HardwareVideoEncoder", "requestKeyFrame failed", e2);
        }
    }

    private CodecXVideoCodecStatus resetCodec(boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetCodec: ");
        sbLIZ.append(this.width);
        sbLIZ.append(" ");
        sbLIZ.append(this.height);
        sbLIZ.append(" ");
        sbLIZ.append(z);
        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        CodecXVideoCodecStatus codecXVideoCodecStatusReleaseInternal = releaseInternal(false);
        if (codecXVideoCodecStatusReleaseInternal != CodecXVideoCodecStatus.OK) {
            return codecXVideoCodecStatusReleaseInternal;
        }
        this.useSurfaceMode = z;
        this.settings.targetBps = this.updateBitrate;
        this.updateBitrateTimestamp = SystemClock.elapsedRealtime();
        synchronized (this.callbackLock) {
            try {
                VideoEncoder.Callback callback = this.callback;
                if (callback != null) {
                    callback.onEncodedEvent(VideoEncoder.EncodeEvent.RESET);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return initEncodeInternal();
    }

    private void setBFrameMinMaxQP(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 31) {
            setIntegerParam(mediaFormat, "video-qp-b-max", Integer.valueOf(this.settings.maxQp));
            setIntegerParam(mediaFormat, "video-qp-b-min", Integer.valueOf(this.settings.minQp));
        }
        if (this.codecName.toLowerCase().contains("qti")) {
            setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-b-min", Integer.valueOf(this.settings.minQp));
            setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-b-max", Integer.valueOf(this.settings.maxQp));
        }
    }

    private void setBFrameNumber(MediaFormat mediaFormat) {
        CodecXVideoCodecProfile profile;
        if (isBFrameEnabled()) {
            if (this.codecDesc.getStandard() == CodecXVideoCodecStandard.H264 && (profile = this.codecDesc.getProfile()) != CodecXVideoCodecProfile.ProfileHigh && profile != CodecXVideoCodecProfile.ProfileConstrainedHigh) {
                CodecXLogging.w("HardwareVideoEncoder", "enabel b frame, set high profile explicitly");
                setIntegerParam(mediaFormat, "profile", 8);
                setIntegerParam(mediaFormat, "level", 256);
            }
            setIntegerParam(mediaFormat, "max-bframes", 1);
            return;
        }
        setIntegerParam(mediaFormat, "max-bframes", 0);
    }

    private void setBitrateMode(MediaFormat mediaFormat) {
        this.codec.getCodecInfo();
        VideoEncoder.BitrateMode bitrateMode = VideoEncoder.BitrateMode.CBR;
        VideoEncoder.BitrateMode bitrateMode2 = this.settings.bitrateMode;
        if (bitrateMode != bitrateMode2 && VideoEncoder.BitrateMode.AUTO != bitrateMode2) {
            setIntegerParam(mediaFormat, "bitrate-mode", 1);
        } else {
            setIntegerParam(mediaFormat, "bitrate-mode", 2);
        }
    }

    private void setBlurInfo(MediaFormat mediaFormat) {
        if (isQcom() && this.closeBlur) {
            setIntegerParam(mediaFormat, "vendor.qti-ext-enc-blurinfo.info", 2);
        }
    }

    private void setIPFrameMinMaxQP(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 31) {
            setIntegerParam(mediaFormat, "video-qp-i-min", Integer.valueOf(this.settings.minIQp));
            setIntegerParam(mediaFormat, "video-qp-i-max", Integer.valueOf(this.settings.maxIQp));
            setIntegerParam(mediaFormat, "video-qp-p-min", Integer.valueOf(this.settings.minQp));
            setIntegerParam(mediaFormat, "video-qp-p-max", Integer.valueOf(this.settings.maxQp));
        }
        setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-i-min", Integer.valueOf(this.settings.minIQp));
        setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-i-max", Integer.valueOf(this.settings.maxIQp));
        setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-p-min", Integer.valueOf(this.settings.minQp));
        setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-p-max", Integer.valueOf(this.settings.maxQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-i-min", Integer.valueOf(this.settings.minIQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-i-max", Integer.valueOf(this.settings.maxIQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-p-min", Integer.valueOf(this.settings.minQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-p-max", Integer.valueOf(this.settings.maxQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-low-latency.enable", 1);
        if (this.codecName.toLowerCase().contains("exynos")) {
            setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.I-minQP", Integer.valueOf(this.settings.minIQp));
            setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.I-maxQP", Integer.valueOf(this.settings.maxIQp));
            setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.P-maxQP", Integer.valueOf(this.settings.maxQp));
            setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.P-minQP", Integer.valueOf(this.settings.minQp));
        }
        if (this.codecName.toLowerCase().contains("mtk")) {
            setIntegerParam(mediaFormat, "vendor.mtk.venc.dynamic.qpbound.min", Integer.valueOf(this.settings.minQp));
            setIntegerParam(mediaFormat, "vendor.mtk.venc.dynamic.qpbound.max", Integer.valueOf(this.settings.maxQp));
        }
    }

    private void setProfileForLive(MediaFormat mediaFormat) {
        CodecXVideoCodecStandard standard = this.codecDesc.getStandard();
        MediaCodecInfo codecInfo = this.codec.getCodecInfo();
        CodecXVideoCodecProfile profile = this.codecDesc.getProfile();
        int systemProfile = 1;
        if (standard == CodecXVideoCodecStandard.H264) {
            try {
                systemProfile = profile.toSystemProfile();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("");
                sbLIZ.append(e);
                CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecInfo.getCapabilitiesForType(standard.mimeType()).profileLevels) {
                if (systemProfile == codecProfileLevel.profile) {
                    mediaFormat.setInteger("profile", codecProfileLevel.profile);
                    mediaFormat.setInteger("level", codecProfileLevel.level);
                    return;
                }
            }
            CodecXLogging.w("HardwareVideoEncoder", "not set profile");
            return;
        }
        if (standard == CodecXVideoCodecStandard.ByteVC1) {
            try {
                systemProfile = profile.toSystemProfile();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("");
                sbLIZ2.append(e2);
                CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            }
            mediaFormat.setInteger("profile", systemProfile);
            mediaFormat.setInteger("level", 256);
        }
    }

    private void setProfileForRTC(MediaFormat mediaFormat) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("close setting profile:");
        sbLIZ.append(this.settings.closeSetProfile);
        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        CodecXVideoCodecStandard standard = this.codecDesc.getStandard();
        if (!this.settings.closeSetProfile) {
            if (standard == CodecXVideoCodecStandard.H264) {
                CodecXVideoCodecProfile profile = this.codecDesc.getProfile();
                int i = AnonymousClass2.$SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecProfile[profile.ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3 && i != 4 && i != 5) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Unknown profile level id: ");
                        sbLIZ2.append(profile);
                        sbLIZ2.append("default to baseline profile");
                        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
                        setIntegerParam(mediaFormat, "profile", 1);
                        setIntegerParam(mediaFormat, "level", 256);
                        return;
                    }
                    CodecXLogging.w("HardwareVideoEncoder", "setting baseline profile ");
                    setIntegerParam(mediaFormat, "profile", 1);
                    setIntegerParam(mediaFormat, "level", 256);
                    return;
                }
                CodecXLogging.w("HardwareVideoEncoder", "setting high profile ");
                setIntegerParam(mediaFormat, "profile", 8);
                setIntegerParam(mediaFormat, "level", 256);
                return;
            }
            if (standard == CodecXVideoCodecStandard.ByteVC1) {
                CodecXVideoCodecProfile profile2 = this.codecDesc.getProfile();
                int i2 = AnonymousClass2.$SwitchMap$com$bytedance$codecx$video$CodecXVideoCodecProfile[profile2.ordinal()];
                if (i2 != 6) {
                    if (i2 != 7) {
                        if (i2 != 8) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Unknown profile level id: ");
                            sbLIZ3.append(profile2);
                            sbLIZ3.append("default to Main profile");
                            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ3));
                            setIntegerParam(mediaFormat, "profile", 1);
                            setIntegerParam(mediaFormat, "level", 8);
                            return;
                        }
                        setIntegerParam(mediaFormat, "profile", Integer.valueOf(SpeechEngineDefines.TTS_WORK_MODE_BOTH));
                        setIntegerParam(mediaFormat, "level", 8);
                        return;
                    }
                    setIntegerParam(mediaFormat, "profile", 2);
                    setIntegerParam(mediaFormat, "level", 8);
                    return;
                }
                setIntegerParam(mediaFormat, "profile", 1);
                setIntegerParam(mediaFormat, "level", 8);
                return;
            }
            if (standard != CodecXVideoCodecStandard.VP8) {
                return;
            }
            setIntegerParam(mediaFormat, "profile", 1);
        }
    }

    private void setSVCNumber(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 25 && isSvcEnabled()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("android.generic.");
            sbLIZ.append(this.settings.temporalLayerNum);
            setStringParam(mediaFormat, "ts-schema", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j2 = this.forcedKeyFrameNs;
        if (j2 > 0 && j > this.lastKeyFrameNs + j2) {
            return true;
        }
        return false;
    }

    private CodecXVideoCodecStatus updateBitrate(int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBitrate ");
        sbLIZ.append(i);
        CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        this.updateBitrate = i;
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i);
            this.codec.setParameters(bundle);
            return CodecXVideoCodecStatus.OK;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CodecXLogging.e("HardwareVideoEncoder", "updateBitrate failed", e);
            return CodecXVideoCodecStatus.ERROR;
        }
    }

    public void setColorSpace(MediaFormat mediaFormat) {
        if (!this.useSurfaceMode && this.codecName.contains("OMX.hisi.") && this.settings.rangeId == 0 && (this.yuvColorFormat.intValue() == 19 || this.yuvColorFormat.intValue() == 21)) {
            CodecXLogging.w("HardwareVideoEncoder", "kirin chips skip setting MediaFormat COLOR_RANGE");
        } else if (this.settings.rangeId == 1) {
            CodecXLogging.w("HardwareVideoEncoder", "setting MediaFormat COLOR_RANGE_FULL");
            setIntegerParam(mediaFormat, "color-range", 1);
        } else {
            CodecXLogging.w("HardwareVideoEncoder", "setting MediaFormat COLOR_RANGE_LIMITED");
            setIntegerParam(mediaFormat, "color-range", 2);
        }
        setIntegerParam(mediaFormat, "color-standard", 4);
        setIntegerParam(mediaFormat, "color-transfer", 3);
    }

    public void setIsUsedCacheEncoder(boolean z) {
        this.isUsedCacheEncoder = z;
    }

    public void updateCacheStatus(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCacheStatus isCacheEncoder:");
        sbLIZ.append(z);
        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        this.isCacheEncoder = z;
    }

    private void setExtCodecForHisi(int i, int i2) {
        MediaCodecWrapper mediaCodecWrapper;
        boolean z;
        if (this.codecName.contains("OMX.hisi.") && (mediaCodecWrapper = this.codec) != null) {
            try {
                MediaFormat outputFormat = mediaCodecWrapper.getOutputFormat();
                if (outputFormat != null) {
                    CodecXLogging.i("HardwareVideoEncoder", "output format before start: " + outputFormat.toString());
                    boolean z2 = false;
                    if (outputFormat.containsKey("vendor.hisi.hisi-ext-codec-qp-regulation-supported") && outputFormat.getInteger("vendor.hisi.hisi-ext-codec-qp-regulation-supported") == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (outputFormat.containsKey("vendor.hisi.hisi-ext-codec-non-ref-p-frames-supported") && outputFormat.getInteger("vendor.hisi.hisi-ext-codec-non-ref-p-frames-supported") == 1) {
                        z2 = true;
                    }
                    Bundle bundle = new Bundle();
                    if (z2 && isSvcEnabled() && this.svcRealLayerNum <= 1) {
                        bundle.putInt("vendor.hisi.hisi-ext-codec-non-ref-p-frames", 1);
                        this.svcRealLayerNum = 2;
                        CodecXLogging.w("HardwareVideoEncoder", "support Non Ref PFrame.");
                    }
                    if (z) {
                        bundle.putInt("vendor.hisi.hisi-ext-codec-max-qp", i);
                        bundle.putInt("vendor.hisi.hisi-ext-codec-min-qp", i2);
                    }
                    if (z2 || z) {
                        try {
                            this.codec.setParameters(bundle);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            CodecXLogging.e("HardwareVideoEncoder", "setExtCodecForHisi failed", e);
                        }
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                CodecXLogging.e("HardwareVideoEncoder", "getOutputFormat failed", e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0260  */
    @Override // com.bytedance.codecx.video.VideoEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.codecx.video.CodecXVideoCodecStatus encode(com.bytedance.codecx.video.memory.CodecXVideoFrameInterface r23, boolean r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.codecx.video.HardwareVideoEncoder.encode(com.bytedance.codecx.video.memory.CodecXVideoFrameInterface, boolean):com.bytedance.codecx.video.CodecXVideoCodecStatus");
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, CodecXVideoFrameInterface codecXVideoFrameInterface) {
        this.yuvFormat.fillBuffer(byteBuffer, codecXVideoFrameInterface, this.width, this.height);
    }

    @Override // com.bytedance.codecx.video.VideoEncoder
    public CodecXVideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        boolean z;
        this.encodeThreadChecker.checkIsOnValidThread();
        boolean z2 = false;
        if (this.codec != null && this.isCacheEncoder && !this.running) {
            VideoEncoder.Settings settings2 = this.settings;
            if (settings2.width == settings.width && settings2.height == settings.height && settings2.scaleMode == settings.scaleMode && settings2.bitrateMode == settings.bitrateMode && settings2.primaryId == settings.primaryId && settings2.transferId == settings.transferId && settings2.matrixId == settings.matrixId && settings2.rangeId == settings.rangeId && settings2.targetKeyFrameIntervalMs == settings.targetKeyFrameIntervalMs && settings2.minQp == settings.minQp && settings2.maxQp == settings.maxQp && settings2.minIQp == settings.minIQp && settings2.maxIQp == settings.maxIQp && settings2.enableAlignment == settings.enableAlignment && settings2.encodeMode == settings.encodeMode && settings2.closeSetProfile == settings.closeSetProfile && settings2.bFrameNum == settings.bFrameNum && settings2.enableAsyncMode == settings.enableAsyncMode && settings2.enableROI == settings.enableROI && settings2.enableColorSpaceSetting == settings.enableColorSpaceSetting && settings2.isStatisticsEnabled == settings.isStatisticsEnabled) {
                CodecXLogging.e("HardwareVideoEncoder", "hit cache encoder");
                synchronized (this.callbackLock) {
                    try {
                        CodecXLogging.w("HardwareVideoEncoder", "register callback for cache encoder");
                        this.callback = callback;
                        this.inputBuffers.clear();
                        this.isError = false;
                    } finally {
                    }
                }
                EglBase14 eglBase14 = this.textureEglBase;
                if (eglBase14 == null) {
                    CodecXLogging.e("HardwareVideoEncoder", "textureEglBase is null");
                } else {
                    eglBase14.makeCurrent();
                    CodecXLogging.e("HardwareVideoEncoder", "makeCurrent textureEglBase success");
                }
                if (this.useAsyncMode) {
                    if (this.asyncOutputThread != null) {
                        try {
                            synchronized (this.cacheEncoderFlushLock) {
                                try {
                                    this.running = true;
                                    this.isUsedCacheEncoder = true;
                                    this.codec.start();
                                } finally {
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            CodecXLogging.e("HardwareVideoEncoder", "asyncOutputThread create err, fallback software:", e);
                            return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
                        }
                    }
                } else if (this.outputThread == null) {
                    try {
                        CodecXLogging.e("HardwareVideoEncoder", "create output thread by CacheEncoder reuse");
                        this.running = true;
                        this.isUsedCacheEncoder = true;
                        this.outputThreadChecker.detachThread();
                        synchronized (this.cacheEncoderFlushLock) {
                            try {
                                Thread threadCreateOutputThread = createOutputThread();
                                this.outputThread = threadCreateOutputThread;
                                threadCreateOutputThread.start();
                            } finally {
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        CodecXLogging.e("HardwareVideoEncoder", "outputThread create err, fallback software:", e2);
                        return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
                    }
                }
                updateBitrate(settings.targetBps);
                this.updateBitrate = settings.targetBps;
                this.updateBitrateTimestamp = SystemClock.elapsedRealtime();
                this.settings = settings;
                requestKeyFrame();
                this.isCacheMediaCodecWhenCreate = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initEncode with same params, skip init, use this cache encoder:");
                sbLIZ.append(this);
                sbLIZ.append(" inputBuffers.size():");
                sbLIZ.append(this.inputBuffers.size());
                CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
                return CodecXVideoCodecStatus.OK;
            }
        }
        CodecXLogging.e("HardwareVideoEncoder", "miss cache encoder");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("this:");
        sbLIZ2.append(this);
        sbLIZ2.append("no select cache encoder,isCacheEncoder:");
        sbLIZ2.append(this.isCacheEncoder);
        sbLIZ2.append(" isUsedCacheEncoder:");
        sbLIZ2.append(this.isUsedCacheEncoder);
        sbLIZ2.append(" codec:");
        sbLIZ2.append(this.codec);
        sbLIZ2.append(" running:");
        sbLIZ2.append(this.running);
        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
        if (this.settings != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(" this.settings.width:");
            sbLIZ3.append(this.settings.width);
            sbLIZ3.append(" settings.width:");
            sbLIZ3.append(settings.width);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(" this.settings.height:");
            sbLIZ4.append(this.settings.height);
            sbLIZ4.append(" settings.height:");
            sbLIZ4.append(settings.height);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(" this.settings.scaleMode:");
            sbLIZ5.append(this.settings.scaleMode);
            sbLIZ5.append(" settings.scaleMode:");
            sbLIZ5.append(settings.scaleMode);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ5));
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(" this.settings.bitrateMode:");
            sbLIZ6.append(this.settings.bitrateMode);
            sbLIZ6.append(" settings.bitrateMode:");
            sbLIZ6.append(settings.bitrateMode);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ6));
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(" this.settings.primaryId:");
            sbLIZ7.append(this.settings.primaryId);
            sbLIZ7.append(" settings.primaryId:");
            sbLIZ7.append(settings.primaryId);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ7));
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append(" this.settings.transferId:");
            sbLIZ8.append(this.settings.transferId);
            sbLIZ8.append(" settings.transferId:");
            sbLIZ8.append(settings.transferId);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ8));
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append(" this.settings.matrixId:");
            sbLIZ9.append(this.settings.matrixId);
            sbLIZ9.append(" settings.matrixId:");
            sbLIZ9.append(settings.matrixId);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ9));
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append(" this.settings.rangeId:");
            sbLIZ10.append(this.settings.rangeId);
            sbLIZ10.append(" settings.rangeId:");
            sbLIZ10.append(settings.rangeId);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ10));
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append(" this.settings.targetKeyFrameIntervalMs:");
            sbLIZ11.append(this.settings.targetKeyFrameIntervalMs);
            sbLIZ11.append(" settings.targetKeyFrameIntervalMs:");
            sbLIZ11.append(settings.targetKeyFrameIntervalMs);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ11));
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append(" this.settings.minQp:");
            sbLIZ12.append(this.settings.minQp);
            sbLIZ12.append(" settings.minQp:");
            sbLIZ12.append(settings.minQp);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ12));
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append(" this.settings.maxQp:");
            sbLIZ13.append(this.settings.maxQp);
            sbLIZ13.append(" settings.maxQp:");
            sbLIZ13.append(settings.maxQp);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ13));
            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
            sbLIZ14.append(" this.settings.minIQp:");
            sbLIZ14.append(this.settings.minIQp);
            sbLIZ14.append(" settings.minIQp:");
            sbLIZ14.append(settings.minIQp);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ14));
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append(" this.settings.maxIQp:");
            sbLIZ15.append(this.settings.maxIQp);
            sbLIZ15.append(" settings.maxIQp:");
            sbLIZ15.append(settings.maxIQp);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ15));
            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
            sbLIZ16.append(" this.settings.enableAlignment:");
            sbLIZ16.append(this.settings.enableAlignment);
            sbLIZ16.append(" settings.enableAlignment:");
            sbLIZ16.append(settings.enableAlignment);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ16));
            StringBuilder sbLIZ17 = C2188811AlT.LIZ();
            sbLIZ17.append(" this.settings.encodeMode:");
            sbLIZ17.append(this.settings.encodeMode);
            sbLIZ17.append(" settings.encodeMode:");
            sbLIZ17.append(settings.encodeMode);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ17));
            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
            sbLIZ18.append(" this.settings.closeSetProfile:");
            sbLIZ18.append(this.settings.closeSetProfile);
            sbLIZ18.append(" settings.closeSetProfile:");
            sbLIZ18.append(settings.closeSetProfile);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ18));
            StringBuilder sbLIZ19 = C2188811AlT.LIZ();
            sbLIZ19.append(" this.settings.bFrameNum:");
            sbLIZ19.append(this.settings.bFrameNum);
            sbLIZ19.append(" settings.bFrameNum:");
            sbLIZ19.append(settings.bFrameNum);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ19));
            StringBuilder sbLIZ20 = C2188811AlT.LIZ();
            sbLIZ20.append(" this.settings.enableAsyncMode:");
            sbLIZ20.append(this.settings.enableAsyncMode);
            sbLIZ20.append(" settings.enableAsyncMode:");
            sbLIZ20.append(settings.enableAsyncMode);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ20));
            StringBuilder sbLIZ21 = C2188811AlT.LIZ();
            sbLIZ21.append(" this.settings.enableROI:");
            sbLIZ21.append(this.settings.enableROI);
            sbLIZ21.append(" settings.enableROI:");
            sbLIZ21.append(settings.enableROI);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ21));
            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
            sbLIZ22.append(" this.settings.enableColorSpaceSetting:");
            sbLIZ22.append(this.settings.enableColorSpaceSetting);
            sbLIZ22.append(" settings.enableColorSpaceSetting:");
            sbLIZ22.append(settings.enableColorSpaceSetting);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ22));
            StringBuilder sbLIZ23 = C2188811AlT.LIZ();
            sbLIZ23.append(" this.settings.isStatisticsEnabled:");
            sbLIZ23.append(this.settings.isStatisticsEnabled);
            sbLIZ23.append(" settings.isStatisticsEnabled:");
            sbLIZ23.append(settings.isStatisticsEnabled);
            CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ23));
        }
        if (this.isCacheEncoder) {
            updateCacheStatus(false);
            release();
            updateCacheStatus(true);
        }
        this.sharedContext = settings.sharedContext;
        synchronized (this.callbackLock) {
            try {
                this.callback = callback;
            } finally {
            }
        }
        this.automaticResizeOn = true;
        this.actualWidth = settings.width;
        this.actualHeight = settings.height;
        this.scaleMode = settings.scaleMode;
        this.bitrateMode = settings.bitrateMode;
        this.updateBitrate = settings.targetBps;
        this.updateBitrateTimestamp = SystemClock.elapsedRealtime();
        this.settings = settings;
        if (settings.enableAsyncMode) {
            z = true;
        } else {
            z = false;
        }
        this.useAsyncMode = z;
        alignResolutionIfNeeded();
        if (CodecXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
            CodecXLogging.e("HardwareVideoEncoder", "using pass surface mode");
            this.useSurfaceMode = true;
        } else {
            if (canUseSurface() && settings.useSurfaceMode && this.sharedContext != null) {
                z2 = true;
            }
            this.useSurfaceMode = z2;
            if (isForceUseSurfaceInput(this.width)) {
                this.useSurfaceMode = true;
            }
        }
        StringBuilder sbLIZ24 = C2188811AlT.LIZ();
        sbLIZ24.append("initEncode, this:");
        sbLIZ24.append(this);
        sbLIZ24.append(" codec name:");
        sbLIZ24.append(this.codecName);
        sbLIZ24.append(", with resolution:");
        sbLIZ24.append(this.width);
        sbLIZ24.append(" x ");
        sbLIZ24.append(this.height);
        sbLIZ24.append(". @ ");
        sbLIZ24.append(settings.targetBps);
        sbLIZ24.append("bps. Fps: ");
        sbLIZ24.append(settings.targetFps);
        sbLIZ24.append(" Use surface mode: ");
        sbLIZ24.append(this.useSurfaceMode);
        sbLIZ24.append(" initUseSurfaceMode: ");
        sbLIZ24.append(settings.useSurfaceMode);
        sbLIZ24.append(" enableAlignment:");
        sbLIZ24.append(settings.enableAlignment);
        sbLIZ24.append(" settings.bitrateMode:");
        sbLIZ24.append(settings.bitrateMode);
        sbLIZ24.append(" qp_min:");
        sbLIZ24.append(settings.minQp);
        sbLIZ24.append(" qp_max:");
        sbLIZ24.append(settings.maxQp);
        sbLIZ24.append(" qp_i_min:");
        sbLIZ24.append(settings.minIQp);
        sbLIZ24.append(" qp_i_max:");
        sbLIZ24.append(settings.maxIQp);
        sbLIZ24.append(" enableColorSpaceSetting:");
        sbLIZ24.append(settings.enableColorSpaceSetting);
        sbLIZ24.append(" useAsyncMode:");
        sbLIZ24.append(this.useAsyncMode);
        sbLIZ24.append(" surfaceColorFormat: ");
        sbLIZ24.append(this.surfaceColorFormat);
        sbLIZ24.append(" yuvColorFormat: ");
        sbLIZ24.append(this.yuvColorFormat);
        sbLIZ24.append(" cpuMode: ");
        sbLIZ24.append(CodecXDeviceInfoAndroid.GetCpuModel());
        sbLIZ24.append(" isCacheEncoder:");
        sbLIZ24.append(this.isCacheEncoder);
        sbLIZ24.append(" settings.enableAsyncMode:");
        sbLIZ24.append(settings.enableAsyncMode);
        sbLIZ24.append(" sharedContext:");
        sbLIZ24.append(this.sharedContext);
        CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ24));
        return initEncodeInternal();
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        MediaCodecWrapper mediaCodecWrapper;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mediacodec error: ");
        sbLIZ.append(codecException.getDiagnosticInfo());
        sbLIZ.append(" ");
        sbLIZ.append(codecException);
        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        if (this.running && (mediaCodecWrapper = this.codec) != null && mediaCodecWrapper.getRealCodec() == mediaCodec) {
            synchronized (this.callbackLock) {
                try {
                    this.isError = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onError not same codec ");
        sbLIZ2.append(codecException);
        CodecXLogging.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        MediaCodecWrapper mediaCodecWrapper;
        if (this.running && (mediaCodecWrapper = this.codec) != null && mediaCodecWrapper.getRealCodec() == mediaCodec) {
            synchronized (this.resetCodecLock) {
                try {
                    synchronized (this.callbackLock) {
                        try {
                            this.inputBuffers.addLast(Integer.valueOf(i));
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        CodecXLogging.e("HardwareVideoEncoder", "onInputBufferAvailable not same codec");
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        MediaCodecWrapper mediaCodecWrapper;
        if (this.running && (mediaCodecWrapper = this.codec) != null && mediaCodecWrapper.getRealCodec() == mediaCodec) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("output format changed: ");
            sbLIZ.append(mediaFormat.toString());
            CodecXLogging.i("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        CodecXLogging.e("HardwareVideoEncoder", "onOutputFormatChanged not same codec");
    }

    @Override // com.bytedance.codecx.video.VideoEncoder
    public CodecXVideoCodecStatus setPrivateParam(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("got android hardware encoder setPrivateParam with key:");
        sbLIZ.append(str);
        sbLIZ.append(" value:");
        sbLIZ.append(str2);
        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        str.getClass();
        switch (str) {
            case "realx.makecurrent":
                this.enableMakeCurrent = "true".equalsIgnoreCase(str2);
                break;
            case "realx.force.surface.input":
                this.forceSurfaceInput = Boolean.valueOf("true".equalsIgnoreCase(str2));
                break;
            case "realx.glclear":
                this.enableGlClear = "true".equalsIgnoreCase(str2);
                break;
            case "realx.close.blur":
                this.closeBlur = "true".equalsIgnoreCase(str2);
                break;
            case "realx.release.async":
                this.releaseAsync = "true".equalsIgnoreCase(str2);
                break;
            case "realx.check.svc.layer":
                this.checkSVCLayer = "true".equalsIgnoreCase(str2);
                break;
            case "realx.native.render":
                this.enableNativeRender = "true".equalsIgnoreCase(str2);
                break;
            default:
                this.vpassPrivateParams.put(str, str2);
                break;
        }
        return CodecXVideoCodecStatus.OK;
    }

    @Override // com.bytedance.codecx.video.VideoEncoder
    public CodecXVideoCodecStatus setRateAllocation(int i, int i2) {
        this.encodeThreadChecker.checkIsOnValidThread();
        updateBitrate(i);
        return CodecXVideoCodecStatus.OK;
    }

    public static boolean containsParameterSetsInBuffer(byte[] bArr, int i, CodecXVideoCodecStandard codecXVideoCodecStandard) {
        int i2;
        int i3 = 0;
        while (i3 < i - 4) {
            if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 0 && bArr[i3 + 3] == 1) {
                if (codecXVideoCodecStandard == CodecXVideoCodecStandard.H264) {
                    int i4 = bArr[i3 + 4] & 31;
                    if (i4 == 7 || i4 == 8) {
                        return true;
                    }
                } else if (codecXVideoCodecStandard == CodecXVideoCodecStandard.ByteVC1 && ((i2 = (bArr[i3 + 4] >> 1) & 63) == 32 || i2 == 33 || i2 == 34)) {
                    return true;
                }
            } else {
                int i5 = i3 + 3;
                if (bArr[i5] > 1) {
                    i3 = i5;
                }
            }
            i3++;
        }
        return false;
    }

    private CodecXVideoCodecStatus drainInputData(int i, ByteBuffer byteBuffer, CodecXVideoFrameInterface codecXVideoFrameInterface) {
        int i2 = ((this.width * this.height) * 3) / 2;
        long timestampNs = codecXVideoFrameInterface.getTimestampNs() / 1000;
        try {
            fillInputBuffer(byteBuffer, codecXVideoFrameInterface);
            try {
                this.codec.queueInputBuffer(i, 0, i2, timestampNs, 0);
                return CodecXVideoCodecStatus.OK;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                CodecXLogging.e("HardwareVideoEncoder", "queueInputBuffer failed", e);
                return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            CodecXLogging.e("HardwareVideoEncoder", "fillInputBuffer failed", e2);
            return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void drainOutputData(int r10, android.media.MediaCodec.BufferInfo r11, java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.codecx.video.HardwareVideoEncoder.drainOutputData(int, android.media.MediaCodec$BufferInfo, java.nio.ByteBuffer):void");
    }

    private void setIntegerParam(MediaFormat mediaFormat, String str, Integer num) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (isNumeric(entry.getValue())) {
                    mediaFormat.setInteger(entry.getKey(), CastIntegerProtector.parseInt(entry.getValue()));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("the encoder params ");
                    sbLIZ.append(entry.getKey());
                    sbLIZ.append(" is coverd by vpaas with value:");
                    sbLIZ.append(entry.getValue());
                    CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
                    this.privateParams.remove(str);
                    return;
                }
                this.privateParams.remove(str);
                if (entry.getValue().length() > 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("the encoder params ");
                    sbLIZ2.append(entry.getKey());
                    sbLIZ2.append(" set by vpaas is invalid with value:");
                    sbLIZ2.append(entry.getValue());
                    sbLIZ2.append(",skip it");
                    CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("the encoder params ");
                    sbLIZ3.append(entry.getKey());
                    sbLIZ3.append(" is disabled by vpaas,skip it");
                    CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("encoder int params has been set with Key:");
        sbLIZ4.append(str);
        sbLIZ4.append(" Value:");
        sbLIZ4.append(num);
        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ4));
        mediaFormat.setInteger(str, num.intValue());
    }

    private void setStringParam(MediaFormat mediaFormat, String str, String str2) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (entry.getValue().length() > 0) {
                    mediaFormat.setString(entry.getKey(), entry.getValue());
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("the encoder params ");
                    sbLIZ.append(entry.getKey());
                    sbLIZ.append(" is coverd by vpaas with value:");
                    sbLIZ.append(entry.getValue());
                    CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("the encoder params ");
                    sbLIZ2.append(entry.getKey());
                    sbLIZ2.append(" is disabled by vpaas,skip it");
                    CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
                }
                this.privateParams.remove(str);
                return;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("encoder string params has been set with Key:");
        sbLIZ3.append(str);
        sbLIZ3.append(" Value:");
        sbLIZ3.append(str2);
        CodecXLogging.w("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ3));
        mediaFormat.setString(str, str2);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        MediaCodecWrapper mediaCodecWrapper;
        if (this.running && (mediaCodecWrapper = this.codec) != null && mediaCodecWrapper.getRealCodec() == mediaCodec) {
            synchronized (this.resetCodecLock) {
                try {
                    try {
                        drainOutputData(i, bufferInfo, mediaCodec.getOutputBuffer(i));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        CodecXLogging.e("HardwareVideoEncoder", "onOutputBufferAvailable failed", e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        CodecXLogging.e("HardwareVideoEncoder", "onOutputBufferAvailable not same codec");
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, CodecXVideoCodecDesc codecXVideoCodecDesc, Integer num, Integer num2, int i, int i2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) throws Throwable {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.privateParams = new HashMap<>();
        this.vpassPrivateParams = new HashMap<>();
        this.forceSurfaceInput = null;
        this.isNeedSurfaceInputWorkaround = false;
        boolean z2 = true;
        this.svcRealLayerNum = 1;
        this.checkSVCLayer = false;
        this.closeBlur = true;
        this.firstFrameDiffUs = 0L;
        this.releaseAsync = true;
        this.enableGlClear = false;
        this.enableMakeCurrent = false;
        this.useAsyncMode = false;
        this.inputBuffers = new LinkedList<>();
        this.isError = false;
        this.callbackLock = new Object();
        this.cacheEncoderFlushLock = new Object();
        this.enableNativeRender = false;
        this.isStatisticsEnabled = false;
        this.isSupportRoi = false;
        this.useRoiFeature = false;
        this.isCacheEncoder = false;
        this.isUsedCacheEncoder = false;
        this.isCacheMediaCodecWhenCreate = false;
        this.isResetCodec = false;
        this.hasCloseGopVendor = false;
        this.resetCodecLock = new Object();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecDesc = codecXVideoCodecDesc;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i2);
        this.isCacheEncoder = z;
        String strGetCpuModel = CodecXDeviceInfoAndroid.GetCpuModel();
        String strGetDeviceModel = CodecXDeviceInfoAndroid.GetDeviceModel();
        if (strGetCpuModel != null) {
            if (!strGetCpuModel.contains("MT6785V/CC") && ((!strGetCpuModel.contains("MT6833V/ZA") || "RMX3610".equalsIgnoreCase(strGetDeviceModel)) && !strGetCpuModel.contains("MT6833V/PNZA") && !strGetCpuModel.contains("MT6853V/ZA") && !strGetCpuModel.contains("MT6893Z_C/CZA"))) {
                z2 = false;
            }
            this.isNeedSurfaceInputWorkaround = z2;
        }
        this.capabilities = codecCapabilities;
        this.codecWidthAlign = 0;
        this.codecHeightAlign = 0;
        isQcomChecked = false;
        this.spsPpsDetectBuffer = new byte[64];
        threadChecker.detachThread();
    }
}
