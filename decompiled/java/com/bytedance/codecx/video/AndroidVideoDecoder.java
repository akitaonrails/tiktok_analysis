package com.bytedance.codecx.video;

import X.C08FF;
import X.C0W9U;
import X.C1284560jX4;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.codecx.base.CodecXLogging;
import com.bytedance.codecx.base.ThreadUtils;
import com.bytedance.codecx.video.CodecXMediaCodecTextureBufferHelper;
import com.bytedance.codecx.video.EglBase;
import com.bytedance.codecx.video.EncodedImage;
import com.bytedance.codecx.video.VideoDecoder;
import com.bytedance.codecx.video.memory.CodecXVideoFrameInterface;
import com.bytedance.codecx.video.memory.NativeCodecXByteMemory;
import com.bytedance.codecx.video.memory.NativeCodecXVideoFrame;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    public static int curEglContextNum = 0;
    public static boolean enableSuperResolution = false;
    public static boolean isDecoderConfigSR = false;
    public static boolean isQtiHwDecoder = false;
    public static int maxDirectRenderCacheSize = 5;
    public static int maxEglContextNum = 16;
    public static int superResolutionHeight;
    public static int superResolutionWidth;
    public Handler asyncHandler;
    public HandlerThread asyncOutputThread;
    public VideoDecoder.Callback callback;
    public MediaCodecWrapper codec;
    public final String codecName;
    public final CodecXVideoCodecStandard codecType;
    public int colorFormat;
    public Thread directRenderThread;
    public boolean enableCheckSysResolutionSupport;
    public boolean enableScaleToSrDstSize;
    public boolean enableTextureMemoryReuse;
    public Surface exSurface;
    public boolean hasDecodedFirstFrame;
    public int height;
    public boolean isCacheDecoder;
    public boolean isCacheDecoderWhenCreate;
    public boolean isUsedCacheDecoder;
    public boolean keyFrameRequired;
    public int maxExSurfaceRecreateDecoderCount;
    public final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    public boolean openFrameLevelLog;
    public SurfaceTextureHelper outSideSurfaceTextureHelper;
    public Thread outputThread;
    public boolean privateSrParamSet;
    public DecodedTextureMetadata renderedTextureMetadata;
    public volatile boolean running;
    public VideoDecoder.Settings settings;
    public EglBase.Context sharedContext;
    public volatile Exception shutdownException;
    public int sliceHeight;
    public int stride;
    public Surface surface;
    public SurfaceTextureHelper surfaceTextureHelper;
    public int width;
    public boolean enableHisiEndCode = true;
    public boolean enableTextureSizeCheck = true;
    public final Object outputBufferQueueLock = new Object();
    public LinkedBlockingQueue<OutputBufferInfo> outputBufferQueue = new LinkedBlockingQueue<>();
    public ThreadUtils.ThreadChecker outputThreadChecker = new ThreadUtils.ThreadChecker();
    public final Object dimensionLock = new Object();
    public int encoded_width = 0;
    public int encoded_height = 0;
    public boolean hasCreateMediaCodecDecoder = false;
    public final Object surfaceTextureHelperLock = new Object();
    public long lastOutputTime = 0;
    public long currentOutputTime = 0;
    public long lastInputTime = 0;
    public long currentInputTimeDelta = 0;
    public long packetCount2s = 0;
    public long timeForAvg = 0;
    public long avgInputTimeDelta = 0;
    public long inputFrameCount = 0;
    public long outputFrameCount = 0;
    public long dropDecodedFrameCount = 0;
    public long callbackDecodedFrameCount = 0;
    public long minFrameCache = -1;
    public long currentFrameCache = -1;
    public long firstFrameComingTime = 0;
    public long firstFrameDecodedTime = 0;
    public final Object smoothOutputLock = new Object();
    public final Object releaseLock = new Object();
    public boolean usingInternalSurfaceLast = true;
    public HashMap<String, String> privateParams = new HashMap<>();
    public HashMap<String, String> vpassPrivateParams = new HashMap<>();
    public boolean mustUseYUVoutput = false;
    public boolean useNewInputBufferAPI = true;
    public boolean useNewOutputBufferAPI = true;
    public boolean enable_adaptive_playback = false;
    public int adaptive_playback_max_width = 0;
    public int adaptive_playback_max_height = 0;
    public boolean enableRetryDeliver = false;
    public int maxTryCount = 16;
    public float minAccelerateRatio = 0.0f;
    public float maxDeaccelerateRatio = 1.0f;
    public int frameCacheThreshold = 2;
    public int directRenderMode = 2;
    public int texturePlayoutMode = 0;
    public final Object renderedTextureMetadataLock = new Object();
    public boolean useAsyncMode = false;
    public LinkedList<Integer> inputBuffers = new LinkedList<>();
    public final Object callbackLock = new Object();
    public AtomicBoolean isError = new AtomicBoolean(false);

    @Override // com.bytedance.codecx.video.VideoDecoder
    public final /* synthetic */ long createNativeVideoDecoder() {
        return C1284560jX4.LIZ(this);
    }

    @Override // com.bytedance.codecx.video.VideoDecoder
    public boolean getPrefersLateDecoding() {
        return true;
    }

    private void checkSrParam() {
        int i;
        VideoDecoder.Settings settings = this.settings;
        int i2 = settings.superResolutionMode;
        if (i2 <= 0 || i2 > 3) {
            enableSuperResolution = false;
            return;
        }
        enableSuperResolution = true;
        if (i2 == 1) {
            float f = settings.superResolutionRatio;
            if (f <= 1.0f) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("superResolutionRatio is err:");
                sbLIZ.append(this.settings.superResolutionRatio);
                CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
                enableSuperResolution = false;
            } else {
                if (!this.privateSrParamSet) {
                    this.enableScaleToSrDstSize = true;
                }
                superResolutionWidth = (int) (this.width * f);
                superResolutionHeight = (int) (this.height * f);
            }
        }
        VideoDecoder.Settings settings2 = this.settings;
        if (settings2.superResolutionMode == 2) {
            int i3 = settings2.superResolutionWidth;
            if (i3 < this.width || (i = settings2.superResolutionHeight) < this.height) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("superResolution is err:");
                sbLIZ2.append(this.settings.superResolutionWidth);
                sbLIZ2.append("x");
                sbLIZ2.append(this.settings.superResolutionHeight);
                CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
                enableSuperResolution = false;
            } else {
                if (!this.privateSrParamSet) {
                    this.enableScaleToSrDstSize = true;
                }
                superResolutionWidth = i3;
                superResolutionHeight = i;
            }
        }
        if (this.settings.superResolutionMode != 3 || this.privateSrParamSet) {
            return;
        }
        this.enableScaleToSrDstSize = false;
    }

    private void createDirectRenderVSyncThread() {
        BPEAThread bPEAThread = new BPEAThread(new Runnable() { // from class: com.bytedance.codecx.video.AndroidVideoDecoder.2
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("AndroidVideoDecoder@ca05.createDirectRenderVSyncThread$1");
                com_bytedance_codecx_video_AndroidVideoDecoder$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("AndroidVideoDecoder@ca05.createDirectRenderVSyncThread$1");
            }

            public void com_bytedance_codecx_video_AndroidVideoDecoder$2__run$___twin___() {
                AndroidVideoDecoder.this.directRenderByVSync();
            }

            public static void com_bytedance_codecx_video_AndroidVideoDecoder$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                try {
                    anonymousClass2.com_bytedance_codecx_video_AndroidVideoDecoder$2__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
        this.directRenderThread = bPEAThread;
        bPEAThread.start();
    }

    private Thread createOutputThread() {
        return new BPEAThread("AndroidVideoDecoder.outputThread") { // from class: com.bytedance.codecx.video.AndroidVideoDecoder.4
            private void bpea_origin_run() {
                com_bytedance_codecx_video_AndroidVideoDecoder$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_codecx_video_AndroidVideoDecoder$4__run$___twin___() {
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }

            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public void run() {
                C1C7U.LIZ("AndroidVideoDecoder@ca05.createOutputThread$1");
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    com_bytedance_codecx_video_AndroidVideoDecoder$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("AndroidVideoDecoder@ca05.createOutputThread$1");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    throw th;
                }
            }

            public static void com_bytedance_codecx_video_AndroidVideoDecoder$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                try {
                    anonymousClass4.com_bytedance_codecx_video_AndroidVideoDecoder$4__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
    }

    private CodecXVideoCodecStatus initSurfaceTextureHelper() {
        try {
            if ((this.sharedContext != null || this.settings.enableAGFXSurfaceTextureHelper) && this.exSurface == null) {
                VideoDecoder.Settings settings = this.settings;
                if (!settings.enableYUVOutput && curEglContextNum < maxEglContextNum && (this.surfaceTextureHelper == null || !settings.enableSurfaceTextureReuse)) {
                    SurfaceTextureHelper surfaceTextureHelperCreateSurfaceTextureHelper = createSurfaceTextureHelper();
                    this.surfaceTextureHelper = surfaceTextureHelperCreateSurfaceTextureHelper;
                    initSurfaceTextureHelper(surfaceTextureHelperCreateSurfaceTextureHelper, false);
                }
            }
            return CodecXVideoCodecStatus.OK;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("err when create surface:");
            sbLIZ.append(e);
            CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
            return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private CodecXVideoCodecStatus releaseInternal() {
        synchronized (this.releaseLock) {
            try {
                if (!this.running) {
                    CodecXLogging.d("AndroidVideoDecoder", "release: Decoder is not running.");
                    return CodecXVideoCodecStatus.OK;
                }
                try {
                    Thread thread = this.directRenderThread;
                    if (thread != null) {
                        ThreadMethodProxy.join(thread, 6000L);
                        this.directRenderThread = null;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    CodecXLogging.e("AndroidVideoDecoder", "directRenderThread join error", e);
                }
                if (this.useAsyncMode) {
                    CodecXVideoCodecStatus codecXVideoCodecStatus = CodecXVideoCodecStatus.OK;
                    if (!this.isCacheDecoder) {
                        this.running = false;
                    }
                    final HandlerThread handlerThread = this.asyncOutputThread;
                    if (handlerThread != null) {
                        C786410Ut5.LJJZZIII(this.asyncHandler, new Runnable() { // from class: X.0jWz
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.LL.lambda$releaseInternal$0(handlerThread);
                            }
                        });
                        if (!this.isCacheDecoder) {
                            if (!ThreadUtils.joinUninterruptibly(this.asyncOutputThread, 6000L)) {
                                CodecXLogging.e("AndroidVideoDecoder", "Media decoder release timeout", new RuntimeException());
                                codecXVideoCodecStatus = CodecXVideoCodecStatus.TIMEOUT;
                            }
                            this.asyncOutputThread = null;
                            this.asyncHandler = null;
                        }
                    }
                    return codecXVideoCodecStatus;
                }
                try {
                    this.running = false;
                    if (!ThreadUtils.joinUninterruptibly(this.outputThread, 6000L)) {
                        CodecXLogging.e("AndroidVideoDecoder", "Media decoder release timeout", new RuntimeException());
                        CodecXVideoCodecStatus codecXVideoCodecStatus2 = CodecXVideoCodecStatus.TIMEOUT;
                        if (!this.isCacheDecoder) {
                            this.codec = null;
                        }
                        this.outputThread = null;
                        return codecXVideoCodecStatus2;
                    }
                    if (!this.isCacheDecoder) {
                        this.codec = null;
                    }
                    this.outputThread = null;
                    if (this.shutdownException == null) {
                        return CodecXVideoCodecStatus.OK;
                    }
                    CodecXLogging.e("AndroidVideoDecoder", "Media decoder release error", new RuntimeException(this.shutdownException));
                    this.shutdownException = null;
                    return CodecXVideoCodecStatus.ERROR;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!this.isCacheDecoder) {
                        this.codec = null;
                    }
                    this.outputThread = null;
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    private void updateCheckSysResolutionStatus() {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals("bytertc.check.sys.resolution.support.enable")) {
                if (entry.getValue() == CardStruct.IStatusCode.DEFAULT) {
                    this.enableCheckSysResolutionSupport = false;
                    CodecXLogging.w("AndroidVideoDecoder", "set android hardware decoder close check sys resolution support");
                } else if (entry.getValue() == "1") {
                    this.enableCheckSysResolutionSupport = true;
                    CodecXLogging.w("AndroidVideoDecoder", "set android hardware decoder open check sys resolution support");
                }
            }
        }
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return this.settings.enableAGFXSurfaceTextureHelper ? SurfaceTextureHelper.createWithAGFX("decoder-texture-thread") : SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    public void deliverDecodedFrame() {
        try {
            this.outputThreadChecker.checkIsOnValidThread();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this);
            sbLIZ.append("deliverDecodedFrame failed:");
            CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ), e);
        }
        if (this.codec == null) {
            CodecXLogging.w("AndroidVideoDecoder", "codec is null when call deliverDecodedFrame");
            return;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, this.settings.latencyInsensitiveMode ? 25000L : 100000L);
        if (iDequeueOutputBuffer == -2) {
            reformat(this.codec.getOutputFormat());
            if (isDecoderConfigSR) {
                updateSuperResolutionConfig();
                return;
            }
            return;
        }
        if (iDequeueOutputBuffer < 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dequeueOutputBuffer err, returned ");
            sbLIZ2.append(iDequeueOutputBuffer);
            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        drainOutputFrame(bufferInfo, iDequeueOutputBuffer);
        if (this.openFrameLevelLog) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this);
            sbLIZ3.append("dequeueOutputBuffer OK, width:");
            sbLIZ3.append(this.width);
            sbLIZ3.append(" height:");
            sbLIZ3.append(this.height);
            sbLIZ3.append(" inputFrameCount:");
            sbLIZ3.append(this.inputFrameCount);
            sbLIZ3.append(" outputFrameCount:");
            sbLIZ3.append(this.outputFrameCount);
            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    @Override // com.bytedance.codecx.video.VideoDecoder
    public void disableExternalSurface() {
        CodecXLogging.w("AndroidVideoDecoder", "disable external surface.");
        this.exSurface = null;
    }

    @Override // com.bytedance.codecx.video.VideoDecoder
    public CodecXVideoCodecStatus release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append("mediacodec release start, isCacheDecoder:");
        sbLIZ.append(this.isCacheDecoder);
        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
        CodecXVideoCodecStatus codecXVideoCodecStatusReleaseInternal = releaseInternal();
        if (!this.isCacheDecoder) {
            releaseSurface();
            releaseSurfaceTextureHelper();
            synchronized (this.renderedTextureMetadataLock) {
                try {
                    this.renderedTextureMetadata = null;
                } finally {
                }
            }
            this.encoded_width = 0;
            this.encoded_height = 0;
        }
        synchronized (this.callbackLock) {
            try {
                this.callback = null;
            } finally {
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this);
        sbLIZ2.append("mediacodec release end");
        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
        return codecXVideoCodecStatusReleaseInternal;
    }

    public void releaseCodecOnOutputThread() {
        try {
            this.outputThreadChecker.checkIsOnValidThread();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            CodecXLogging.e("AndroidVideoDecoder", "thread check err");
        }
        CodecXLogging.i("AndroidVideoDecoder", "Releasing MediaCodec on output thread,isCacheDecoder:" + this.isCacheDecoder);
        if (this.isCacheDecoder) {
            this.hasDecodedFirstFrame = false;
            this.inputFrameCount = 0L;
            this.outputFrameCount = 0L;
            this.dropDecodedFrameCount = 0L;
            this.callbackDecodedFrameCount = 0L;
            this.minFrameCache = -1L;
            this.currentFrameCache = -1L;
            this.isUsedCacheDecoder = false;
            synchronized (this.callbackLock) {
                try {
                    this.inputBuffers.clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            flush();
        } else {
            try {
                this.codec.stop();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                CodecXLogging.e("AndroidVideoDecoder", "Media decoder stop failed", e2);
            }
            try {
                CodecXLogging.w("AndroidVideoDecoder", "mediacodec call sys api:release start");
                this.codec.release();
                this.hasCreateMediaCodecDecoder = false;
                CodecXLogging.w("AndroidVideoDecoder", "mediacodec call sys api:release done");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                CodecXLogging.e("AndroidVideoDecoder", "Media decoder release failed", e3);
                this.shutdownException = e3;
            }
            if (!this.settings.enableSurfaceTextureReuse) {
                releaseSurface();
            }
        }
        CodecXLogging.i("AndroidVideoDecoder", this + "Release on output thread done ,isCacheDecoder:" + this.isCacheDecoder);
    }

    public void releaseSurface() {
        CodecXLogging.w("AndroidVideoDecoder", "releaseSurface start");
        try {
            if (this.surface != null) {
                CodecXLogging.w("AndroidVideoDecoder", "release surface");
                this.surface.release();
                this.surface = null;
            }
            synchronized (this.surfaceTextureHelperLock) {
                try {
                    if (this.surfaceTextureHelper != null) {
                        CodecXLogging.w("AndroidVideoDecoder", "surfaceTextureHelper.stopListening()");
                        this.surfaceTextureHelper.stopListening();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (!this.settings.enableSurfaceTextureReuse) {
                releaseSurfaceTextureHelper();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("releaseSurface:");
            sbLIZ.append(e);
            CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
        }
        CodecXLogging.w("AndroidVideoDecoder", "releaseSurface end");
    }

    public void releaseSurfaceTextureHelper() {
        synchronized (this.surfaceTextureHelperLock) {
            try {
                if (this.surfaceTextureHelper != null) {
                    CodecXLogging.w("AndroidVideoDecoder", "release surfaceTextureHelper");
                    this.surfaceTextureHelper.dispose();
                    this.surfaceTextureHelper = null;
                    curEglContextNum--;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("release surfaceTextureHelper done, curEglContextNum:");
                    sbLIZ.append(curEglContextNum);
                    CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void updateSuperResolutionConfig() {
        if (this.codec == null) {
            CodecXLogging.w("AndroidVideoDecoder", "codec is null when call updateSuperResolutionConfig");
        } else if (isDecoderConfigSR && isQtiHwDecoder) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("vendor.qti-ext-vpp-ais.mode", "AIS_AUTO", bundle);
            this.codec.setParameters(bundle);
        }
    }

    private void smoothOutputFrame() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.currentOutputTime = jElapsedRealtime;
        long j = this.outputFrameCount;
        long j2 = this.inputFrameCount;
        if (j > j2) {
            this.outputFrameCount = j2;
        }
        long j3 = this.minFrameCache;
        if (j3 < 0) {
            this.minFrameCache = this.currentFrameCache;
        } else {
            long j4 = this.currentFrameCache;
            if (j3 > j4 && j4 >= 0) {
                j3 = j4;
            }
            this.minFrameCache = j3;
        }
        long j5 = this.lastOutputTime;
        long j6 = jElapsedRealtime - j5;
        long j7 = this.avgInputTimeDelta;
        if (j7 <= 0) {
            j7 = this.currentInputTimeDelta;
            if (j7 <= 0) {
                j7 = 16;
            }
        } else {
            long j8 = this.currentInputTimeDelta;
            if (j8 < j7) {
                j7 = 10;
                if (j8 > 10) {
                    j7 = j8;
                }
            }
        }
        if (j5 > 0 && j6 < j7) {
            long j9 = j7 - j6;
            if (this.currentFrameCache > this.minFrameCache) {
                j9 /= 2;
            }
            if (j9 > 1300) {
                j9 = 1300;
            } else if (j9 > 0) {
            }
            try {
                synchronized (this.smoothOutputLock) {
                    try {
                        this.smoothOutputLock.wait(j9);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Exception th) {
            }
        }
        this.lastOutputTime = SystemClock.elapsedRealtime();
    }

    public void directRenderByVSync() {
        try {
            Looper.prepare();
            C786410Ut5.v2().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.bytedance.codecx.video.AndroidVideoDecoder.3
                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j) {
                    OutputBufferInfo outputBufferInfoPoll;
                    synchronized (AndroidVideoDecoder.this.outputBufferQueueLock) {
                        try {
                            if (AndroidVideoDecoder.this.outputBufferQueue.size() > 0) {
                                outputBufferInfoPoll = AndroidVideoDecoder.this.outputBufferQueue.poll();
                            } else {
                                outputBufferInfoPoll = null;
                            }
                        } finally {
                        }
                    }
                    if (outputBufferInfoPoll != null) {
                        try {
                            AndroidVideoDecoder.this.codec.releaseOutputBuffer(outputBufferInfoPoll.bufferIndex, outputBufferInfoPoll.presentationTimestampUs * 1000);
                            AndroidVideoDecoder.this.callbackDirectRenderFrame(outputBufferInfoPoll.presentationTimestampUs);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            CodecXLogging.e("AndroidVideoDecoder", "releaseOutputBuffer err:", e);
                            synchronized (AndroidVideoDecoder.this.callbackLock) {
                                try {
                                    VideoDecoder.Callback callback = AndroidVideoDecoder.this.callback;
                                    if (callback != null) {
                                        callback.onMediaCodecStatus(CodecXVideoCodecStatus.MEDIACODEC_EXCEPTION, "releaseOutputBuffer err");
                                        AndroidVideoDecoder.this.callback.onMediaCodecStatus(CodecXVideoCodecStatus.DROP_DECODED_FRAME, "releaseOutputBuffer err");
                                    }
                                    AndroidVideoDecoder.this.dropDecodedFrameCount++;
                                } finally {
                                }
                            }
                        }
                    }
                    if (AndroidVideoDecoder.this.running) {
                        C786410Ut5.v2().postFrameCallback(this);
                    }
                }
            });
            Looper.loop();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CodecXLogging.e("AndroidVideoDecoder", "direct render by vsync is error", e);
        }
    }

    @Override // com.bytedance.codecx.video.VideoDecoder
    public CodecXVideoCodecStatus flush() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append("mediacodec flush start");
        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
        MediaCodecWrapper mediaCodecWrapper = this.codec;
        if (mediaCodecWrapper == null) {
            CodecXLogging.e("AndroidVideoDecoder", "flush: codec is null,do nothing.");
            return CodecXVideoCodecStatus.OK;
        }
        try {
            mediaCodecWrapper.flush();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this);
            sbLIZ2.append("mediacodec flush OK, cost:");
            sbLIZ2.append(jElapsedRealtime2 - jElapsedRealtime);
            sbLIZ2.append("ms");
            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
            return CodecXVideoCodecStatus.OK;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CodecXLogging.e("AndroidVideoDecoder", "flush: err.", e);
            return CodecXVideoCodecStatus.ERROR;
        }
    }

    public CodecXVideoCodecStandard getCodecType() {
        return this.codecType;
    }

    public int getColorFormat() {
        return this.colorFormat;
    }

    @Override // com.bytedance.codecx.video.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    public boolean isCacheDecoder() {
        return this.isCacheDecoder;
    }

    @Override // com.bytedance.codecx.video.VideoDecoder
    public boolean isCacheDecoderWhenCreate() {
        return this.isCacheDecoderWhenCreate;
    }

    public boolean isRunning() {
        return this.running;
    }

    public boolean isUsedCacheDecoder() {
        return this.isUsedCacheDecoder;
    }

    public static class DecodedTextureMetadata {
        public final long presentationTimestampUs;

        public DecodedTextureMetadata(long j) {
            this.presentationTimestampUs = j;
        }
    }

    public enum VendorSupportStatus {
        VENDOR_SUPPORT_NO,
        VENDOR_SUPPORT_YES,
        VENDOR_SUPPORT_UNKNOWN;

        public static VendorSupportStatus valueOf(String str) {
            return (VendorSupportStatus) C08FF.LIZ(VendorSupportStatus.class, str);
        }
    }

    private void checkCodecName(String str) {
        isQtiHwDecoder = false;
        if (str.contains("qti")) {
            isQtiHwDecoder = true;
        }
    }

    private CodecXVideoCodecStatus feedInputBufferAsync(EncodedImage encodedImage) {
        int i;
        int iIntValue;
        int iRemaining = encodedImage.buffer.remaining();
        if (this.settings.latencyInsensitiveMode) {
            i = 5000000;
        } else {
            i = 500000;
        }
        int i2 = i / 5000;
        while (true) {
            synchronized (this.callbackLock) {
                try {
                    if (this.inputBuffers.size() <= 0) {
                        iIntValue = -1;
                    } else {
                        iIntValue = this.inputBuffers.removeFirst().intValue();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (iIntValue == -1) {
                i2--;
                try {
                    Thread.sleep(5L);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("");
                    sbLIZ.append(e);
                    CodecXLogging.i("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
                }
            } else if (iIntValue != -1) {
                if (iIntValue != -1) {
                    try {
                        ByteBuffer inputBuffer = this.codec.getInputBuffer(iIntValue);
                        if (inputBuffer.capacity() < iRemaining) {
                            CodecXLogging.e("AndroidVideoDecoder", "decode() - HW buffer too small");
                            return CodecXVideoCodecStatus.OVERLOAD;
                        }
                        inputBuffer.put(encodedImage.buffer);
                        try {
                            this.codec.queueInputBuffer(iIntValue, 0, appendHisiEndCode(inputBuffer, iRemaining), TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                            return CodecXVideoCodecStatus.OK;
                        } catch (IllegalStateException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            CodecXLogging.e("AndroidVideoDecoder", "queueInputBuffer failed", e2);
                            return CodecXVideoCodecStatus.ERROR;
                        }
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        CodecXLogging.e("AndroidVideoDecoder", "getInputBuffer failed", e3);
                        return CodecXVideoCodecStatus.ERROR;
                    }
                }
            }
            if (i2 <= 0) {
                break;
            }
        }
        CodecXLogging.w("AndroidVideoDecoder", "decode() - no HW buffers available; decoder falling behind");
        return CodecXVideoCodecStatus.OVERLOAD;
    }

    private CodecXVideoCodecStatus feedInputBufferSync(EncodedImage encodedImage) {
        long j;
        ByteBuffer inputBuffer;
        int iRemaining = encodedImage.buffer.remaining();
        try {
            MediaCodecWrapper mediaCodecWrapper = this.codec;
            if (this.settings.latencyInsensitiveMode) {
                j = 5000000;
            } else {
                j = 500000;
            }
            int iDequeueInputBuffer = mediaCodecWrapper.dequeueInputBuffer(j);
            if (iDequeueInputBuffer < 0) {
                CodecXLogging.e("AndroidVideoDecoder", "decode() - no HW buffers available; decoder falling behind");
                return CodecXVideoCodecStatus.OVERLOAD;
            }
            try {
                if (this.useNewInputBufferAPI) {
                    inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer);
                } else {
                    inputBuffer = this.codec.getInputBuffers()[iDequeueInputBuffer];
                }
                if (inputBuffer == null) {
                    CodecXLogging.e("AndroidVideoDecoder", "decode() - HW buffer is null");
                    return CodecXVideoCodecStatus.OVERLOAD;
                }
                if (inputBuffer.remaining() < iRemaining) {
                    CodecXLogging.e("AndroidVideoDecoder", "decode() - HW buffer too small");
                    return CodecXVideoCodecStatus.OVERLOAD;
                }
                inputBuffer.put(encodedImage.buffer);
                try {
                    this.codec.queueInputBuffer(iDequeueInputBuffer, 0, appendHisiEndCode(inputBuffer, iRemaining), TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                    return CodecXVideoCodecStatus.OK;
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                    CodecXLogging.e("AndroidVideoDecoder", "queueInputBuffer failed", e);
                    return CodecXVideoCodecStatus.ERROR;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getInputBuffers failed,useNewInputBufferAPI");
                sbLIZ.append(this.useNewInputBufferAPI);
                sbLIZ.append("exception:");
                sbLIZ.append(e2);
                CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
                return CodecXVideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this);
            sbLIZ2.append(" dequeueInputBuffer failed");
            CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2), e3);
            return CodecXVideoCodecStatus.ERROR;
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
                sbLIZ.append(" is not supported, supported is:");
                sbLIZ.append(this.codec.getSupportedVendorParameters().toString());
                CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
                return VendorSupportStatus.VENDOR_SUPPORT_NO;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getSupportedVendorParameters err:");
                sbLIZ2.append(e);
                CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
                return VendorSupportStatus.VENDOR_SUPPORT_UNKNOWN;
            }
        }
        return VendorSupportStatus.VENDOR_SUPPORT_UNKNOWN;
    }

    private void initMediaFormat(MediaFormat mediaFormat) {
        boolean z;
        int i;
        int i2;
        if ((this.sharedContext == null || this.settings.enableYUVOutput || this.mustUseYUVoutput) && this.exSurface == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init colorFormat is(I420:19):");
            sbLIZ.append(this.colorFormat);
            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
            setIntegerParam(mediaFormat, "color-format", Integer.valueOf(this.colorFormat));
        }
        MediaCodecWrapper mediaCodecWrapper = this.codec;
        if (mediaCodecWrapper != null && mediaCodecWrapper.getCodecInfo().getCapabilitiesForType(this.codecType.mimeType()).isFeatureSupported("adaptive-playback")) {
            if (setAdaptivePlaybackParam(mediaFormat, "max-width", Integer.valueOf(mediaFormat.getInteger("width"))) && setAdaptivePlaybackParam(mediaFormat, "max-height", Integer.valueOf(mediaFormat.getInteger("height")))) {
                z = true;
            } else {
                z = false;
            }
            this.enable_adaptive_playback = z;
            if (z) {
                CodecXLogging.w("AndroidVideoDecoder", "adaptive playback is open by private params");
            }
            VideoDecoder.Settings settings = this.settings;
            if (settings.enableAdaptivePlayback && (i = settings.adaptivePlaybackMaxWidth) <= 9000 && i > 0 && (i2 = settings.adaptivePlaybackMaxHeight) <= 9000 && i2 > 0) {
                mediaFormat.setInteger("max-width", i);
                mediaFormat.setInteger("max-height", this.settings.adaptivePlaybackMaxHeight);
                this.enable_adaptive_playback = true;
                CodecXLogging.w("AndroidVideoDecoder", "adaptive playback is reset by normal params");
            }
            if (this.enable_adaptive_playback) {
                this.adaptive_playback_max_width = mediaFormat.getInteger("max-width");
                this.adaptive_playback_max_height = mediaFormat.getInteger("max-height");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("enable adaptive playback max_width: ");
                sbLIZ2.append(this.adaptive_playback_max_width);
                sbLIZ2.append(", max_height: ");
                sbLIZ2.append(this.adaptive_playback_max_height);
                CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        isDecoderConfigSR = false;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("initMediaFormat enableSuperResolution:");
        sbLIZ3.append(enableSuperResolution);
        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ3));
        if (this.codec != null && enableSuperResolution && isQtiHwDecoder && getVendorSupportedStatus("vendor.qti-ext-vpp-ais.mode") != VendorSupportStatus.VENDOR_SUPPORT_NO) {
            setStringParam(mediaFormat, "vendor.qti-ext-vpp.mode", "HQV_MODE_MANUAL");
            setStringParam(mediaFormat, "vendor.qti-ext-vpp-ais.mode", "AIS_AUTO");
            setIntegerParam(mediaFormat, "vendor.qti-ext-vpp-ais.bypass", 0);
            setIntegerParam(mediaFormat, "vendor.qti-ext-vpp-ais.width", Integer.valueOf(superResolutionWidth));
            setIntegerParam(mediaFormat, "vendor.qti-ext-vpp-ais.height", Integer.valueOf(superResolutionHeight));
            isDecoderConfigSR = true;
            CodecXLogging.w("AndroidVideoDecoder", "qti hw decoder super resolution is opened!");
        }
        VideoDecoder.Settings settings2 = this.settings;
        if (settings2.outputByDts && !settings2.latencyInsensitiveMode) {
            setIntegerParam(mediaFormat, "low-latency", 1);
            setIntegerParam(mediaFormat, "vendor.qti-ext-dec-picture-order.enable", 1);
            setIntegerParam(mediaFormat, "vendor.qti-ext-dec-low-latency.enable", 1);
            setIntegerParam(mediaFormat, "vendor.rtc-ext-dec-low-latency.enable", 1);
            if (this.width < this.height) {
                setIntegerParam(mediaFormat, "vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
            }
            setIntegerParam(mediaFormat, "vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", -1);
            setIntegerParam(mediaFormat, "fast-output-mode", 1);
            setStringParam(mediaFormat, "vendor.vdec.example-ext-dec-low-latency.enable", "true");
        }
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (!entry.getKey().equals("max-width") && !entry.getKey().equals("max-height")) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("set android hardware decoder private param with Key:");
                sbLIZ4.append(entry.getKey());
                sbLIZ4.append(" Value:");
                sbLIZ4.append(entry.getValue());
                CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ4));
                if (entry.getKey().equals("bytertc.hisi.decoder.endcode.enable") && CardStruct.IStatusCode.DEFAULT.equals(entry.getValue())) {
                    this.enableHisiEndCode = false;
                    CodecXLogging.w("AndroidVideoDecoder", "set android hardware decoder close hisi hw decoder endcode");
                } else {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("set android hardware decoder private param with Key:");
                    sbLIZ5.append(entry.getKey());
                    sbLIZ5.append(" Value:");
                    sbLIZ5.append(entry.getValue());
                    CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ5));
                    if (isNumeric(entry.getValue())) {
                        mediaFormat.setInteger(entry.getKey(), CastIntegerProtector.parseInt(entry.getValue()));
                    } else if (entry.getValue().length() > 0) {
                        mediaFormat.setString(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
    }

    private boolean isNumeric(String str) {
        if (str != null && str.matches("[0-9]+")) {
            return true;
        }
        return false;
    }

    private boolean isSupportedColorFormat(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseInternal$0(HandlerThread handlerThread) {
        C1C7U.LIZ("AndroidVideoDecoder@ca05.releaseInternal$1L");
        releaseCodecOnOutputThread();
        if (!this.isCacheDecoder && handlerThread != null) {
            handlerThread.quit();
        }
        C1C7U.LIZIZ("AndroidVideoDecoder@ca05.releaseInternal$1L");
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        if (this.useAsyncMode) {
            this.isError.set(true);
        } else {
            this.running = false;
            this.shutdownException = exc;
        }
    }

    public void SetIsCacheDecoderWhenCreate(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isCacheDecoderWhenCreate value:");
        sbLIZ.append(z);
        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
        this.isCacheDecoderWhenCreate = z;
    }

    public void callbackDirectRenderFrame(long j) {
        if (!this.hasDecodedFirstFrame) {
            this.hasDecodedFirstFrame = true;
        }
        NativeCodecXByteMemory nativeCodecXByteMemory = new NativeCodecXByteMemory(this.width, this.height, 0L, null, null, CodecXPixelFormat.kUnknown);
        NativeCodecXVideoFrame nativeCodecXVideoFrameCreateCodecXVideoFrame = NativeCodecXVideoFrame.createCodecXVideoFrame(nativeCodecXByteMemory, j * 1000, (ByteBuffer) null, CodecXColorSpace.kUnknown, CodecXVideoRotation.VIDEO_ROTATION_0);
        synchronized (this.callbackLock) {
            try {
                VideoDecoder.Callback callback = this.callback;
                if (callback != null) {
                    callback.onDecodedFrame(nativeCodecXVideoFrameCreateCodecXVideoFrame);
                    this.callbackDecodedFrameCount++;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        nativeCodecXByteMemory.release();
        nativeCodecXVideoFrameCreateCodecXVideoFrame.release();
    }

    @Override // com.bytedance.codecx.video.VideoDecoder
    public CodecXVideoCodecStatus decode(EncodedImage encodedImage) {
        boolean z;
        CodecXVideoCodecStatus codecXVideoCodecStatusReinitDecode;
        CodecXVideoCodecStatus codecXVideoCodecStatusFeedInputBufferSync;
        if (this.openFrameLevelLog) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this);
            sbLIZ.append("decode input one frame, inputFrameCount:");
            sbLIZ.append(this.inputFrameCount);
            sbLIZ.append(" outputFrameCount:");
            sbLIZ.append(this.outputFrameCount);
            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (0 == this.inputFrameCount) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this);
            sbLIZ2.append("first frame to be decdode is coming");
            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
            this.firstFrameComingTime = SystemClock.elapsedRealtime();
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.lastInputTime;
        if (j > 0) {
            this.currentInputTimeDelta = jElapsedRealtime - j;
        }
        this.lastInputTime = jElapsedRealtime;
        long j2 = this.packetCount2s + 1;
        this.packetCount2s = j2;
        if (0 == this.timeForAvg) {
            this.timeForAvg = jElapsedRealtime;
        }
        long j3 = this.timeForAvg;
        if (jElapsedRealtime - j3 >= 2000 && j2 > 0) {
            this.avgInputTimeDelta = (jElapsedRealtime - j3) / j2;
            this.packetCount2s = 0L;
            this.timeForAvg = jElapsedRealtime;
        }
        if (this.isError.get()) {
            CodecXLogging.e("AndroidVideoDecoder", "mediacodec error.");
            return CodecXVideoCodecStatus.ERROR;
        }
        try {
            int i = encodedImage.encodedWidth;
            boolean z2 = true;
            if (i != this.encoded_width || encodedImage.encodedHeight != this.encoded_height) {
                if (this.codec != null && this.enable_adaptive_playback && (i > this.adaptive_playback_max_width || encodedImage.encodedHeight > this.adaptive_playback_max_height)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("frame resolution(");
                    sbLIZ3.append(encodedImage.encodedWidth);
                    sbLIZ3.append("*");
                    sbLIZ3.append(encodedImage.encodedHeight);
                    sbLIZ3.append(" exceeded maximum limit of adaptive playback max_width: ");
                    sbLIZ3.append(this.adaptive_playback_max_width);
                    sbLIZ3.append(", max_height: ");
                    sbLIZ3.append(this.adaptive_playback_max_height);
                    CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ3));
                    this.enable_adaptive_playback = false;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("resolution changed, try to reinit decoder. enable_adaptive_playback: ");
                sbLIZ4.append(this.enable_adaptive_playback);
                sbLIZ4.append(", is first init: ");
                if (this.encoded_width == 0) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ4.append(z);
                sbLIZ4.append(", new width: ");
                sbLIZ4.append(encodedImage.encodedWidth);
                sbLIZ4.append(", new height: ");
                sbLIZ4.append(encodedImage.encodedHeight);
                CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ4));
                if ((this.encoded_width == 0 || !this.enable_adaptive_playback) && (codecXVideoCodecStatusReinitDecode = reinitDecode(encodedImage.encodedWidth, encodedImage.encodedHeight)) != CodecXVideoCodecStatus.OK) {
                    CodecXLogging.w("AndroidVideoDecoder", "reinitDecode err!");
                    return codecXVideoCodecStatusReinitDecode;
                }
                synchronized (this.dimensionLock) {
                    try {
                        int i2 = encodedImage.encodedWidth;
                        this.encoded_width = i2;
                        int i3 = encodedImage.encodedHeight;
                        this.encoded_height = i3;
                        this.width = i2;
                        this.height = i3;
                    } finally {
                    }
                }
            }
            if (this.codec != null && this.callback != null) {
                ByteBuffer byteBuffer = encodedImage.buffer;
                if (byteBuffer == null) {
                    CodecXLogging.e("AndroidVideoDecoder", "decode() - no input data");
                    return CodecXVideoCodecStatus.ERR_PARAMETER;
                }
                if (byteBuffer.remaining() == 0) {
                    CodecXLogging.e("AndroidVideoDecoder", "decode() - input buffer empty");
                    return CodecXVideoCodecStatus.ERR_PARAMETER;
                }
                if (this.keyFrameRequired) {
                    if (encodedImage.frameType != EncodedImage.FrameType.kIntra) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("decode() - key frame required first, current frameType:");
                        sbLIZ5.append(encodedImage.frameType);
                        CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ5));
                        return CodecXVideoCodecStatus.NO_OUTPUT;
                    }
                    if (!encodedImage.completeFrame) {
                        CodecXLogging.e("AndroidVideoDecoder", "decode() - complete frame required first");
                        return CodecXVideoCodecStatus.NO_OUTPUT;
                    }
                }
                if (this.isCacheDecoder) {
                    try {
                        if (!this.useAsyncMode && this.outputThread == null) {
                            CodecXLogging.w("AndroidVideoDecoder", "create output thread by CacheDecoder reuse");
                            this.running = true;
                            this.outputThreadChecker.detachThread();
                            Thread threadCreateOutputThread = createOutputThread();
                            this.outputThread = threadCreateOutputThread;
                            threadCreateOutputThread.start();
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.codec.release();
                        this.hasCreateMediaCodecDecoder = false;
                        releaseSurface();
                        CodecXLogging.e("AndroidVideoDecoder", "restart codec err, fallback software:", e);
                        return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
                    }
                }
                CodecXVideoCodecStatus codecXVideoCodecStatus = CodecXVideoCodecStatus.OK;
                if (this.useAsyncMode) {
                    codecXVideoCodecStatusFeedInputBufferSync = feedInputBufferAsync(encodedImage);
                } else {
                    synchronized (this.releaseLock) {
                        try {
                            if (this.codec != null) {
                                codecXVideoCodecStatusFeedInputBufferSync = feedInputBufferSync(encodedImage);
                            } else {
                                codecXVideoCodecStatusFeedInputBufferSync = codecXVideoCodecStatus;
                            }
                        } finally {
                        }
                    }
                }
                if (codecXVideoCodecStatusFeedInputBufferSync != codecXVideoCodecStatus) {
                    return codecXVideoCodecStatusFeedInputBufferSync;
                }
                if (this.keyFrameRequired) {
                    this.keyFrameRequired = false;
                }
                VideoDecoder.Settings settings = this.settings;
                if (settings.enableSmoothOutput && !settings.latencyInsensitiveMode && !settings.enableBFrameDecode) {
                    long j4 = this.inputFrameCount - this.outputFrameCount;
                    if (j4 <= 0) {
                        j4 = this.currentFrameCache;
                    }
                    this.currentFrameCache = j4;
                    long j5 = this.minFrameCache;
                    if (j5 >= 0 && j4 > j5) {
                        try {
                            synchronized (this.smoothOutputLock) {
                                try {
                                    this.smoothOutputLock.notify();
                                } finally {
                                }
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("currentFrameCache:");
                            sbLIZ6.append(this.currentFrameCache);
                            sbLIZ6.append(" minFrameCache:");
                            sbLIZ6.append(this.minFrameCache);
                            CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ6));
                        }
                    }
                }
                this.inputFrameCount++;
                return CodecXVideoCodecStatus.OK;
            }
            StringBuilder sb = new StringBuilder("decode uninitalized, codec: ");
            if (this.codec == null) {
                z2 = false;
            }
            sb.append(z2);
            sb.append(", callback: ");
            sb.append(this.callback);
            CodecXLogging.e("AndroidVideoDecoder", sb.toString());
            return CodecXVideoCodecStatus.UNINITIALIZED;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            CodecXLogging.e("AndroidVideoDecoder", "android decode err", e3);
            return CodecXVideoCodecStatus.ERROR;
        }
    }

    @Override // com.bytedance.codecx.video.VideoDecoder, com.bytedance.codecx.video.VideoSink
    public void onFrame(CodecXVideoFrameInterface codecXVideoFrameInterface) {
        if (this.callback == null) {
            this.dropDecodedFrameCount++;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("callback is null, dropDecodedFrameCount:");
            sbLIZ.append(this.dropDecodedFrameCount);
            CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
                if (decodedTextureMetadata == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("renderedTextureMetadata is null drop current decoded frame,running:");
                    sbLIZ2.append(this.running);
                    CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
                    synchronized (this.callbackLock) {
                        VideoDecoder.Callback callback = this.callback;
                        if (callback != null) {
                            callback.onMediaCodecStatus(CodecXVideoCodecStatus.DROP_DECODED_FRAME, "renderedTextureMetadata is null");
                        }
                    }
                    this.dropDecodedFrameCount++;
                    return;
                }
                long j = decodedTextureMetadata.presentationTimestampUs * 1000;
                this.renderedTextureMetadata = null;
                codecXVideoFrameInterface.setTimestampNs(j);
                if (codecXVideoFrameInterface.getNativeHandle() != 0) {
                    synchronized (this.callbackLock) {
                        try {
                            VideoDecoder.Callback callback2 = this.callback;
                            if (callback2 != null) {
                                callback2.onDecodedFrame(codecXVideoFrameInterface);
                                this.callbackDecodedFrameCount++;
                            }
                        } finally {
                        }
                    }
                    return;
                }
                CodecXLogging.e("AndroidVideoDecoder", "getNativeHandle is null , drop current decoded frame");
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
    }

    public void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        if (mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            integer = (mediaFormat.getInteger("crop-right") + 1) - mediaFormat.getInteger("crop-left");
            integer2 = (mediaFormat.getInteger("crop-bottom") + 1) - mediaFormat.getInteger("crop-top");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stream have crop info newWidth:");
            sbLIZ.append(integer);
            sbLIZ.append(" newHeight:");
            sbLIZ.append(integer2);
            CodecXLogging.i("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        if (isDecoderConfigSR) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("stream resolution:");
            sbLIZ2.append(this.encoded_width);
            sbLIZ2.append("*");
            sbLIZ2.append(this.encoded_height);
            sbLIZ2.append(" decoder output resolution:");
            sbLIZ2.append(integer);
            sbLIZ2.append("*");
            sbLIZ2.append(integer2);
            CodecXLogging.i("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
        }
        synchronized (this.dimensionLock) {
            try {
                if (!isDecoderConfigSR && this.hasDecodedFirstFrame && (this.width != integer || this.height != integer2)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Unexpected size change. Configured ");
                    sbLIZ3.append(this.width);
                    sbLIZ3.append("*");
                    sbLIZ3.append(this.height);
                    sbLIZ3.append(". New ");
                    sbLIZ3.append(integer);
                    sbLIZ3.append("*");
                    sbLIZ3.append(integer2);
                    stopOnOutputThread(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3)));
                    return;
                }
                this.width = integer;
                this.height = integer2;
                if (((this.surfaceTextureHelper == null && this.outSideSurfaceTextureHelper == null && this.exSurface == null) || this.settings.enableYUVOutput) && mediaFormat.containsKey("color-format")) {
                    this.colorFormat = mediaFormat.getInteger("color-format");
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Color: 0x");
                    sbLIZ4.append(Integer.toHexString(this.colorFormat));
                    CodecXLogging.i("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ4));
                    if (!isSupportedColorFormat(this.colorFormat)) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("Unsupported color format: ");
                        sbLIZ5.append(this.colorFormat);
                        stopOnOutputThread(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ5)));
                        return;
                    }
                }
                if (!this.hasDecodedFirstFrame && this.isCacheDecoder) {
                    this.stride = this.width;
                    this.sliceHeight = this.height;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("isCacheDecoder,set stride:");
                    sbLIZ6.append(this.stride);
                    sbLIZ6.append(" sliceHeight:");
                    sbLIZ6.append(this.sliceHeight);
                    CodecXLogging.i("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ6));
                }
                synchronized (this.dimensionLock) {
                    try {
                        if (mediaFormat.containsKey("stride")) {
                            this.stride = mediaFormat.getInteger("stride");
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("update stride from MEDIA_FORMAT_KEY_STRIDE:");
                            sbLIZ7.append(this.stride);
                            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ7));
                        }
                        if (mediaFormat.containsKey("slice-height")) {
                            this.sliceHeight = mediaFormat.getInteger("slice-height");
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append("update sliceHeight from MEDIA_FORMAT_KEY_SLICE_HEIGHT:");
                            sbLIZ8.append(this.sliceHeight);
                            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ8));
                        }
                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                        sbLIZ9.append("Frame stride and slice height: ");
                        sbLIZ9.append(this.stride);
                        sbLIZ9.append(" x ");
                        sbLIZ9.append(this.sliceHeight);
                        sbLIZ9.append("width:");
                        sbLIZ9.append(this.width);
                        sbLIZ9.append(" height:");
                        sbLIZ9.append(this.height);
                        sbLIZ9.append(" hasDecodedFirstFrame:");
                        sbLIZ9.append(this.hasDecodedFirstFrame);
                        CodecXLogging.i("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ9));
                        this.stride = Math.max(this.width, this.stride);
                        this.sliceHeight = Math.max(this.height, this.sliceHeight);
                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                        sbLIZ10.append("finally Frame stride and slice height: ");
                        sbLIZ10.append(this.stride);
                        sbLIZ10.append(" x ");
                        sbLIZ10.append(this.sliceHeight);
                        CodecXLogging.i("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ10));
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.bytedance.codecx.video.VideoDecoder
    public void setExternalSurface(Surface surface) {
        MediaCodecWrapper mediaCodecWrapper;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set external surface:");
        sbLIZ.append(surface);
        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
        if (surface != this.exSurface && (mediaCodecWrapper = this.codec) != null) {
            try {
                mediaCodecWrapper.setOutputSurface(surface);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setOutputSurface error:");
                sbLIZ2.append(e);
                CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        this.exSurface = surface;
        this.surface = null;
    }

    public void setIsUsedCacheDecoder(boolean z) {
        this.isUsedCacheDecoder = z;
    }

    public void updateCacheStatus(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCacheStatus isCacheDecoder:");
        sbLIZ.append(z);
        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
        this.isCacheDecoder = z;
    }

    @Override // com.bytedance.codecx.video.VideoDecoder
    public CodecXVideoCodecStatus updateSettings(VideoDecoder.Settings settings) {
        this.settings = settings;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSettings outputByDts:");
        sbLIZ.append(this.settings.outputByDts);
        sbLIZ.append(", smoothOutput:");
        sbLIZ.append(this.settings.enableSmoothOutput);
        sbLIZ.append(", yuv mode:");
        sbLIZ.append(this.settings.enableYUVOutput);
        sbLIZ.append(", latencyInsensitiveMode:");
        sbLIZ.append(this.settings.latencyInsensitiveMode);
        sbLIZ.append(", enableRecreateByResolution:");
        sbLIZ.append(this.settings.enableRecreateByResolution);
        sbLIZ.append(", enableBFrameDecode:");
        sbLIZ.append(this.settings.enableBFrameDecode);
        sbLIZ.append(", context: ");
        sbLIZ.append(this.settings.sharedContext);
        sbLIZ.append(", enableAsyncMode:");
        sbLIZ.append(settings.enableAsyncMode);
        sbLIZ.append(", directRenderMode:");
        sbLIZ.append(settings.directRenderMode);
        sbLIZ.append(", texturePlayoutMode:");
        sbLIZ.append(settings.texturePlayoutMode);
        sbLIZ.append(", superResolutionMode:");
        sbLIZ.append(settings.superResolutionMode);
        sbLIZ.append(", superResolutionRatio:");
        sbLIZ.append(settings.superResolutionRatio);
        sbLIZ.append(", superResolutionWidth:");
        sbLIZ.append(settings.superResolutionWidth);
        sbLIZ.append(", superResolutionHeight:");
        sbLIZ.append(settings.superResolutionHeight);
        sbLIZ.append(", enableAdaptivePlayback:");
        sbLIZ.append(this.settings.enableAdaptivePlayback);
        sbLIZ.append(", adaptivePlaybackMaxWidth:");
        sbLIZ.append(this.settings.adaptivePlaybackMaxWidth);
        sbLIZ.append(", adaptivePlaybackMaxHeight:");
        sbLIZ.append(this.settings.adaptivePlaybackMaxHeight);
        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
        return CodecXVideoCodecStatus.OK;
    }

    public static class OutputBufferInfo {
        public final int bufferIndex;
        public final long presentationTimestampUs;

        public OutputBufferInfo(long j, int i) {
            this.presentationTimestampUs = j;
            this.bufferIndex = i;
        }
    }

    private int appendHisiEndCode(ByteBuffer byteBuffer, int i) {
        if (this.enableHisiEndCode && this.codecName.startsWith("OMX.hisi")) {
            byte[] bArr = {0, 0, 0, 1, 30, 72, 83, 80, 73, 67, 69, 78, 68, 0, 0, 0, 1, 0};
            int i2 = i + 18;
            if (byteBuffer.capacity() >= i2) {
                byteBuffer.put(bArr);
                return i2;
            }
        }
        return i;
    }

    private void deliverByteFrame(int i, MediaCodec.BufferInfo bufferInfo) {
        int i2;
        int i3;
        int i4;
        int i5;
        ByteBuffer outputBuffer;
        NativeCodecXByteMemory nativeCodecXByteMemoryCopyNV12Buffer;
        synchronized (this.dimensionLock) {
            try {
                i2 = this.width;
                i3 = this.height;
                i4 = this.stride;
                i5 = this.sliceHeight;
            } finally {
            }
        }
        int i6 = bufferInfo.size;
        if (i6 < ((i2 * i3) * 3) / 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Insufficient output buffer size: ");
            sbLIZ.append(bufferInfo.size);
            CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (i6 < ((i4 * i3) * 3) / 2 && i5 == i3 && i4 > i2) {
            i4 = (i6 * 2) / (i3 * 3);
        }
        try {
            if (this.useAsyncMode || this.useNewOutputBufferAPI) {
                outputBuffer = this.codec.getOutputBuffer(i);
            } else {
                outputBuffer = this.codec.getOutputBuffers()[i];
            }
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            ByteBuffer byteBufferSlice = outputBuffer.slice();
            try {
                if (this.colorFormat == 19) {
                    nativeCodecXByteMemoryCopyNV12Buffer = copyI420Buffer(byteBufferSlice, i4, i5, i2, i3);
                } else {
                    nativeCodecXByteMemoryCopyNV12Buffer = copyNV12Buffer(byteBufferSlice, i4, i5, i2, i3);
                }
                if (nativeCodecXByteMemoryCopyNV12Buffer == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("byteMemory is null, colorFormat:");
                    sbLIZ2.append(this.colorFormat);
                    CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
                    this.dropDecodedFrameCount++;
                    return;
                }
                try {
                    this.codec.releaseOutputBuffer(i, false);
                    NativeCodecXVideoFrame nativeCodecXVideoFrameCreateCodecXVideoFrame = NativeCodecXVideoFrame.createCodecXVideoFrame(nativeCodecXByteMemoryCopyNV12Buffer, bufferInfo.presentationTimeUs * 1000, (ByteBuffer) null, CodecXColorSpace.kUnknown, CodecXVideoRotation.VIDEO_ROTATION_0);
                    synchronized (this.callbackLock) {
                        try {
                            VideoDecoder.Callback callback = this.callback;
                            if (callback != null) {
                                callback.onDecodedFrame(nativeCodecXVideoFrameCreateCodecXVideoFrame);
                                this.callbackDecodedFrameCount++;
                            } else {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("callback is null, dropDecodedFrameCount:");
                                sbLIZ3.append(this.dropDecodedFrameCount);
                                CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ3));
                                this.dropDecodedFrameCount++;
                            }
                        } finally {
                        }
                    }
                    nativeCodecXByteMemoryCopyNV12Buffer.release();
                    nativeCodecXVideoFrameCreateCodecXVideoFrame.release();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    CodecXLogging.e("AndroidVideoDecoder", "releaseOutputBuffer failed!", e);
                    nativeCodecXByteMemoryCopyNV12Buffer.release();
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                CodecXLogging.e("AndroidVideoDecoder", "buffer err!", e2);
                this.dropDecodedFrameCount++;
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            CodecXLogging.e("AndroidVideoDecoder", "getOutputBuffer failed!", e3);
        }
    }

    private void deliverTextureFrame(int i, MediaCodec.BufferInfo bufferInfo) {
        int i2;
        int i3;
        int i4;
        int i5;
        MediaCodecWrapper mediaCodecWrapper;
        float f;
        float f2;
        boolean z;
        boolean z2;
        synchronized (this.dimensionLock) {
            try {
                i2 = this.width;
                i3 = this.height;
            } finally {
            }
        }
        VideoDecoder.Settings settings = this.settings;
        if (settings.enableSmoothOutput && !settings.latencyInsensitiveMode) {
            smoothOutputFrame();
        }
        if (this.settings.latencyInsensitiveMode && this.running) {
            int i6 = 0;
            do {
                i6++;
                synchronized (this.renderedTextureMetadataLock) {
                    try {
                        if (this.renderedTextureMetadata == null) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } finally {
                    }
                }
                if (!z2) {
                    break;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                }
            } while (i6 < 200);
        }
        if (this.enableRetryDeliver && this.running) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.inputFrameCount - this.outputFrameCount;
            if (j < 0) {
                j = this.frameCacheThreshold + 1;
            }
            this.currentFrameCache = j;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("currentFrameCache:");
            sbLIZ.append(this.currentFrameCache);
            CodecXLogging.i("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
            if (this.currentFrameCache <= this.frameCacheThreshold) {
                f = this.maxTryCount;
                f2 = this.maxDeaccelerateRatio;
            } else {
                f = this.maxTryCount;
                f2 = this.minAccelerateRatio;
            }
            int i7 = (int) (f * f2);
            while (SystemClock.elapsedRealtime() - jElapsedRealtime < i7) {
                synchronized (this.renderedTextureMetadataLock) {
                    try {
                        if (this.renderedTextureMetadata == null) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } finally {
                    }
                }
                if (!z) {
                    break;
                }
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e2) {
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("retry delivering frame take ms: ");
            sbLIZ2.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
            CodecXLogging.i("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                if (this.renderedTextureMetadata != null && (mediaCodecWrapper = this.codec) != null) {
                    try {
                        mediaCodecWrapper.releaseOutputBuffer(i, false);
                    } catch (IllegalStateException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        CodecXLogging.e("AndroidVideoDecoder", "releaseOutputBuffer failed", e3);
                    }
                    this.dropDecodedFrameCount++;
                    synchronized (this.callbackLock) {
                        try {
                            VideoDecoder.Callback callback = this.callback;
                            if (callback != null) {
                                callback.onMediaCodecStatus(CodecXVideoCodecStatus.DROP_DECODED_FRAME, "waiting for texture for the previous frame");
                            }
                        } finally {
                        }
                    }
                    return;
                }
                synchronized (this.surfaceTextureHelperLock) {
                    try {
                        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
                        if (surfaceTextureHelper != null) {
                            surfaceTextureHelper.setTextureSize(i2, i3, this.enableTextureSizeCheck);
                            if (isDecoderConfigSR && (i4 = superResolutionWidth) != i2 && (i5 = superResolutionHeight) != i3 && this.enableScaleToSrDstSize) {
                                this.surfaceTextureHelper.setScaleTextureSize(true, i4, i5);
                            }
                            this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs);
                            MediaCodecWrapper mediaCodecWrapper2 = this.codec;
                            if (mediaCodecWrapper2 != null) {
                                try {
                                    mediaCodecWrapper2.releaseOutputBuffer(i, true);
                                } catch (IllegalStateException e4) {
                                    TryCatchGuardChecker.doCheck(e4);
                                    CodecXLogging.e("AndroidVideoDecoder", "releaseOutputBuffer failed!", e4);
                                }
                            }
                            return;
                        }
                        this.dropDecodedFrameCount++;
                        synchronized (this.callbackLock) {
                            try {
                                VideoDecoder.Callback callback2 = this.callback;
                                if (callback2 != null) {
                                    callback2.onMediaCodecStatus(CodecXVideoCodecStatus.DROP_DECODED_FRAME, "surfaceTextureHelper is null");
                                }
                            } finally {
                            }
                        }
                        CodecXLogging.e("AndroidVideoDecoder", "surfaceTextureHelper is null, drop current decoded frame.");
                        MediaCodecWrapper mediaCodecWrapper3 = this.codec;
                        if (mediaCodecWrapper3 != null) {
                            try {
                                mediaCodecWrapper3.releaseOutputBuffer(i, false);
                            } catch (IllegalStateException e5) {
                                TryCatchGuardChecker.doCheck(e5);
                                CodecXLogging.e("AndroidVideoDecoder", "releaseOutputBuffer failed", e5);
                            }
                        }
                        return;
                    } catch (Throwable e22) {
                        throw e22;
                    }
                }
            } catch (Throwable e222) {
                throw e222;
            }
            throw e222;
        }
    }

    private void deliverTextureFrameOutSide(final int i, final MediaCodec.BufferInfo bufferInfo) {
        int i2;
        int i3;
        this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs);
        synchronized (this.surfaceTextureHelperLock) {
            try {
                SurfaceTextureHelper surfaceTextureHelper = this.outSideSurfaceTextureHelper;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.setTextureSize(this.width, this.height);
                    if (isDecoderConfigSR && (i2 = superResolutionWidth) != this.width && (i3 = superResolutionHeight) != this.height && this.enableScaleToSrDstSize) {
                        this.outSideSurfaceTextureHelper.setScaleTextureSize(true, i2, i3);
                    }
                    this.outSideSurfaceTextureHelper.onFrame(new CodecXMediaCodecTextureBufferHelper(new CodecXMediaCodecTextureBufferHelper.ReleaseOutPutBuffer() { // from class: X.0jX2
                        @Override // com.bytedance.codecx.video.CodecXMediaCodecTextureBufferHelper.ReleaseOutPutBuffer
                        public final int release(boolean z) {
                            return this.LIZ.lambda$deliverTextureFrameOutSide$1(i, bufferInfo, z);
                        }
                    }));
                    return;
                }
                this.dropDecodedFrameCount++;
                synchronized (this.callbackLock) {
                    try {
                        VideoDecoder.Callback callback = this.callback;
                        if (callback != null) {
                            callback.onMediaCodecStatus(CodecXVideoCodecStatus.DROP_DECODED_FRAME, "outSideSurfaceTextureHelper is null");
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                CodecXLogging.e("AndroidVideoDecoder", "outSideSurfaceTextureHelper is null, drop current decoded frame.");
                MediaCodecWrapper mediaCodecWrapper = this.codec;
                if (mediaCodecWrapper != null) {
                    try {
                        mediaCodecWrapper.releaseOutputBuffer(i, false);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        CodecXLogging.e("AndroidVideoDecoder", "releaseOutputBuffer failed", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private CodecXVideoCodecStatus initDecodeInternal(int i, int i2) {
        CodecXVideoCodecStatus codecXVideoCodecStatusInitSurfaceTextureHelper;
        Surface surface;
        if (this.callback == null) {
            CodecXLogging.d("AndroidVideoDecoder", "callback uninitalized");
            return CodecXVideoCodecStatus.UNINITIALIZED;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (1 == this.texturePlayoutMode) {
            codecXVideoCodecStatusInitSurfaceTextureHelper = initOutSideSurfaceTextureHelper(i, i2);
        } else {
            codecXVideoCodecStatusInitSurfaceTextureHelper = initSurfaceTextureHelper();
        }
        if (codecXVideoCodecStatusInitSurfaceTextureHelper != CodecXVideoCodecStatus.OK) {
            return codecXVideoCodecStatusInitSurfaceTextureHelper;
        }
        checkCodecName(this.codecName);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" initDecodeInternal name: ");
        sbLIZ.append(this.codecName);
        sbLIZ.append(" type: ");
        sbLIZ.append(this.codecType);
        sbLIZ.append(" width: ");
        sbLIZ.append(i);
        sbLIZ.append(" height: ");
        sbLIZ.append(i2);
        sbLIZ.append(" sharedContext:");
        sbLIZ.append(this.sharedContext);
        sbLIZ.append(" outputByDts:");
        sbLIZ.append(this.settings.outputByDts);
        sbLIZ.append(", external surface:");
        sbLIZ.append(this.exSurface);
        sbLIZ.append(", internal surface:");
        sbLIZ.append(this.surface);
        sbLIZ.append(" smoothOutput:");
        sbLIZ.append(this.settings.enableSmoothOutput);
        sbLIZ.append(" yuv mode:");
        sbLIZ.append(this.settings.enableYUVOutput);
        sbLIZ.append(" mustUseYUVoutput:");
        sbLIZ.append(this.mustUseYUVoutput);
        sbLIZ.append(", latencyInsensitiveMode:");
        sbLIZ.append(this.settings.latencyInsensitiveMode);
        sbLIZ.append(", enableRecreateByResolution:");
        sbLIZ.append(this.settings.enableRecreateByResolution);
        sbLIZ.append(", enableBFrameDecode:");
        sbLIZ.append(this.settings.enableBFrameDecode);
        sbLIZ.append(", useAsyncMode:");
        sbLIZ.append(this.useAsyncMode);
        sbLIZ.append(", texturePlayoutMode:");
        sbLIZ.append(this.texturePlayoutMode);
        sbLIZ.append(", directRenderMode:");
        sbLIZ.append(this.directRenderMode);
        sbLIZ.append(", enableSuperResolution:");
        sbLIZ.append(enableSuperResolution);
        sbLIZ.append(", superResolutionWidth:");
        sbLIZ.append(superResolutionWidth);
        sbLIZ.append(", superResolutionHeight:");
        sbLIZ.append(superResolutionHeight);
        sbLIZ.append(", enableAdaptivePlayback:");
        sbLIZ.append(this.settings.enableAdaptivePlayback);
        sbLIZ.append(", adaptivePlaybackMaxWidth:");
        sbLIZ.append(this.settings.adaptivePlaybackMaxWidth);
        sbLIZ.append(", adaptivePlaybackMaxHeight:");
        sbLIZ.append(this.settings.adaptivePlaybackMaxHeight);
        sbLIZ.append(", curEglContextNum:");
        sbLIZ.append(curEglContextNum);
        sbLIZ.append(", isCacheDecoder:");
        sbLIZ.append(this.isCacheDecoder);
        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
        if (this.outputThread != null) {
            CodecXLogging.e("AndroidVideoDecoder", "initDecodeInternal called while the codec is already running");
            releaseSurface();
            return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i;
        this.height = i2;
        this.stride = i;
        this.sliceHeight = i2;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        this.inputFrameCount = 0L;
        this.outputFrameCount = 0L;
        this.dropDecodedFrameCount = 0L;
        this.callbackDecodedFrameCount = 0L;
        this.minFrameCache = -1L;
        this.currentFrameCache = -1L;
        checkSrParam();
        this.privateParams.clear();
        this.privateParams.putAll(this.vpassPrivateParams);
        this.isError.set(false);
        synchronized (this.callbackLock) {
            try {
                this.inputBuffers.clear();
            } finally {
            }
        }
        try {
            synchronized (this.releaseLock) {
                try {
                    this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
                } finally {
                }
            }
            updateCheckSysResolutionStatus();
            if (this.enableCheckSysResolutionSupport && !this.codec.getCodecInfo().getCapabilitiesForType(this.codecType.mimeType()).getVideoCapabilities().isSizeSupported(i, i2)) {
                this.codec.release();
                this.hasCreateMediaCodecDecoder = false;
                releaseSurface();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("isSizeSupported return false with the resolution:");
                sbLIZ2.append(i);
                sbLIZ2.append("xheight, fallback software");
                CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
                synchronized (this.callbackLock) {
                    try {
                        VideoDecoder.Callback callback = this.callback;
                        if (callback != null) {
                            CodecXVideoCodecStatus codecXVideoCodecStatus = CodecXVideoCodecStatus.MEDIACODEC_OUT_OF_RESOLUTION;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("isSizeSupported return false with the resolution:");
                            sbLIZ3.append(i);
                            sbLIZ3.append("x");
                            sbLIZ3.append(i2);
                            callback.onMediaCodecStatus(codecXVideoCodecStatus, C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    } finally {
                    }
                }
                return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
            }
            try {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i, i2);
                initMediaFormat(mediaFormatCreateVideoFormat);
                if (this.useAsyncMode) {
                    HandlerThread handlerThread = new HandlerThread("asyncOutput");
                    this.asyncOutputThread = handlerThread;
                    handlerThread.start();
                    this.asyncHandler = new BPEAHandler(C786410Ut5.W2(this.asyncOutputThread));
                    this.running = true;
                    this.outputThreadChecker.detachThread();
                    this.codec.setCallback(new MediaCodec.Callback() { // from class: com.bytedance.codecx.video.AndroidVideoDecoder.1
                        @Override // android.media.MediaCodec.Callback
                        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
                            MediaCodecWrapper mediaCodecWrapper;
                            if (AndroidVideoDecoder.this.running && (mediaCodecWrapper = AndroidVideoDecoder.this.codec) != null && mediaCodecWrapper.getRealCodec() == mediaCodec) {
                                AndroidVideoDecoder.this.isError.set(true);
                            }
                        }

                        @Override // android.media.MediaCodec.Callback
                        public void onInputBufferAvailable(MediaCodec mediaCodec, int i3) {
                            MediaCodecWrapper mediaCodecWrapper;
                            if (AndroidVideoDecoder.this.running && (mediaCodecWrapper = AndroidVideoDecoder.this.codec) != null && mediaCodecWrapper.getRealCodec() == mediaCodec) {
                                synchronized (AndroidVideoDecoder.this.callbackLock) {
                                    try {
                                        AndroidVideoDecoder.this.inputBuffers.addLast(Integer.valueOf(i3));
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                            }
                        }

                        @Override // android.media.MediaCodec.Callback
                        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
                            MediaCodecWrapper mediaCodecWrapper;
                            CodecXLogging.e("AndroidVideoDecoder", "onOutputFormatChanged ");
                            if (AndroidVideoDecoder.this.running && (mediaCodecWrapper = AndroidVideoDecoder.this.codec) != null && mediaCodecWrapper.getRealCodec() == mediaCodec) {
                                AndroidVideoDecoder.this.reformat(mediaFormat);
                            }
                        }

                        @Override // android.media.MediaCodec.Callback
                        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i3, MediaCodec.BufferInfo bufferInfo) {
                            MediaCodecWrapper mediaCodecWrapper;
                            if (AndroidVideoDecoder.this.running && (mediaCodecWrapper = AndroidVideoDecoder.this.codec) != null && mediaCodecWrapper.getRealCodec() == mediaCodec) {
                                try {
                                    AndroidVideoDecoder.this.drainOutputFrame(bufferInfo, i3);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("");
                                    sbLIZ4.append(e);
                                    CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ4));
                                }
                            }
                        }
                    }, this.asyncHandler);
                }
                int i3 = this.maxExSurfaceRecreateDecoderCount;
                if (i3 >= -1) {
                    this.exSurface = null;
                }
                if (this.outSideSurfaceTextureHelper != null && (surface = this.surface) != null) {
                    this.codec.configure(mediaFormatCreateVideoFormat, surface, null, 0);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("initDecodeInternal configure codec done control by outside with internal surface:");
                    sbLIZ4.append(this.surface);
                    CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ4));
                } else {
                    Surface surface2 = this.exSurface;
                    if (surface2 != null) {
                        this.maxExSurfaceRecreateDecoderCount = i3 + 1;
                        this.codec.configure(mediaFormatCreateVideoFormat, surface2, null, 0);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("initDecodeInternal configure codec done with external surface:");
                        sbLIZ5.append(this.exSurface);
                        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ5));
                    } else {
                        this.codec.configure(mediaFormatCreateVideoFormat, this.surface, null, 0);
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("initDecodeInternal configure codec done with internal surface:");
                        sbLIZ6.append(this.surface);
                        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ6));
                    }
                }
                this.codec.start();
                CodecXLogging.w("AndroidVideoDecoder", "initDecodeInternal call codec.start() done");
            } catch (IllegalArgumentException | IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("initDecodeInternal err");
                sbLIZ7.append(e);
                CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ7));
                MediaCodecInfo.CodecCapabilities capabilitiesForType = this.codec.getCodecInfo().getCapabilitiesForType(this.codecType.mimeType());
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("current decoder SupportedHeights:");
                sbLIZ8.append(capabilitiesForType.getVideoCapabilities().getSupportedHeights());
                CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ8));
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("current decoder SupportedWidths:");
                sbLIZ9.append(capabilitiesForType.getVideoCapabilities().getSupportedWidths());
                CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ9));
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("current decoder SupportedFrameRates:");
                sbLIZ10.append(capabilitiesForType.getVideoCapabilities().getSupportedFrameRates());
                CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ10));
                if (capabilitiesForType.getVideoCapabilities().getSupportedHeights().contains(Integer.valueOf(i2)) && capabilitiesForType.getVideoCapabilities().getSupportedWidths().contains(Integer.valueOf(i))) {
                    CodecXLogging.e("AndroidVideoDecoder", "initDecodeInternal Argument err, try reset Argument and reconfig");
                    synchronized (this.callbackLock) {
                        try {
                            VideoDecoder.Callback callback2 = this.callback;
                            if (callback2 != null) {
                                callback2.onMediaCodecStatus(CodecXVideoCodecStatus.MEDIACODEC_EXCEPTION, "initDecode Argument err, try reset Argument and reconfig");
                            }
                        } finally {
                        }
                    }
                    MediaFormat mediaFormatCreateVideoFormat2 = MediaFormat.createVideoFormat(this.codecType.mimeType(), i, i2);
                    if (this.sharedContext == null || this.settings.enableYUVOutput) {
                        mediaFormatCreateVideoFormat2.setInteger("color-format", this.colorFormat);
                    }
                    try {
                        this.codec.configure(mediaFormatCreateVideoFormat2, this.surface, null, 0);
                        this.codec.start();
                    } catch (IllegalArgumentException | IllegalStateException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                        sbLIZ11.append("initDecodeInternal failed when retry config:");
                        sbLIZ11.append(e2);
                        CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ11));
                        StringWriter stringWriter = new StringWriter();
                        e2.printStackTrace(new PrintWriter(stringWriter));
                        synchronized (this.callbackLock) {
                            try {
                                VideoDecoder.Callback callback3 = this.callback;
                                if (callback3 != null) {
                                    callback3.onMediaCodecStatus(CodecXVideoCodecStatus.MEDIACODEC_EXCEPTION, stringWriter.toString());
                                }
                            } finally {
                            }
                        }
                        this.codec.release();
                        this.hasCreateMediaCodecDecoder = false;
                        releaseSurface();
                        return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
                    }
                } else {
                    synchronized (this.callbackLock) {
                        try {
                            VideoDecoder.Callback callback4 = this.callback;
                            if (callback4 != null) {
                                CodecXVideoCodecStatus codecXVideoCodecStatus2 = CodecXVideoCodecStatus.MEDIACODEC_OUT_OF_RESOLUTION;
                                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                sbLIZ12.append("hardware decoder not support the resolution:");
                                sbLIZ12.append(i);
                                sbLIZ12.append("x");
                                sbLIZ12.append(i2);
                                callback4.onMediaCodecStatus(codecXVideoCodecStatus2, C2188811AlT.LIZIZ(sbLIZ12));
                            }
                        } finally {
                        }
                    }
                    this.codec.release();
                    this.hasCreateMediaCodecDecoder = false;
                    releaseSurface();
                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                    sbLIZ13.append("initDecodeInternal err,decoder not support the resolution:");
                    sbLIZ13.append(i);
                    sbLIZ13.append("xheight, fallback software");
                    CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ13));
                    return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
                }
            }
            this.maxExSurfaceRecreateDecoderCount = 0;
            if (!this.useAsyncMode) {
                this.running = true;
                try {
                    this.outputThreadChecker.detachThread();
                    CodecXLogging.w("AndroidVideoDecoder", "initDecodeInternal call createOutputThread()");
                    Thread threadCreateOutputThread = createOutputThread();
                    this.outputThread = threadCreateOutputThread;
                    threadCreateOutputThread.start();
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    this.codec.release();
                    this.hasCreateMediaCodecDecoder = false;
                    releaseSurface();
                    CodecXLogging.e("AndroidVideoDecoder", "initDecodeInternal outputThread create err, fallback software:", e3);
                    return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
                }
            }
            if (this.directRenderMode == 2) {
                createDirectRenderVSyncThread();
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
            sbLIZ14.append("initDecodeInternal done,init video decoder cost time:");
            sbLIZ14.append(jElapsedRealtime2);
            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ14));
            if (this.exSurface != null) {
                if (this.surface == null) {
                    this.usingInternalSurfaceLast = false;
                }
            } else if (this.surface != null && !this.usingInternalSurfaceLast) {
                this.usingInternalSurfaceLast = true;
                synchronized (this.callbackLock) {
                    try {
                        VideoDecoder.Callback callback5 = this.callback;
                        if (callback5 != null) {
                            callback5.onMediaCodecStatus(CodecXVideoCodecStatus.USING_INTERNAL_SURFACE, "using internal surface");
                        }
                    } finally {
                    }
                }
            }
            this.hasCreateMediaCodecDecoder = true;
            return CodecXVideoCodecStatus.OK;
        } catch (IOException | IllegalArgumentException | IllegalStateException | NullPointerException e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append("Cannot create media decoder ");
            sbLIZ15.append(this.codecName);
            CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ15));
            releaseSurface();
            return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private CodecXVideoCodecStatus initOutSideSurfaceTextureHelper(int i, int i2) {
        try {
            if (!this.settings.enableYUVOutput && curEglContextNum < maxEglContextNum && this.outSideSurfaceTextureHelper == null) {
                SurfaceTextureHelper surfaceTextureHelperCreateSurfaceTextureHelper = createSurfaceTextureHelper();
                this.outSideSurfaceTextureHelper = surfaceTextureHelperCreateSurfaceTextureHelper;
                initSurfaceTextureHelper(surfaceTextureHelperCreateSurfaceTextureHelper, true);
            }
            return CodecXVideoCodecStatus.OK;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("err when create surface:");
            sbLIZ.append(e);
            CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
            return CodecXVideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private CodecXVideoCodecStatus reinitDecode(int i, int i2) {
        CodecXVideoCodecStatus codecXVideoCodecStatusInitDecodeInternal;
        CodecXVideoCodecStatus codecXVideoCodecStatusReleaseInternal = releaseInternal();
        if (!this.settings.enableSurfaceTextureReuse) {
            releaseSurface();
        }
        if (codecXVideoCodecStatusReleaseInternal != CodecXVideoCodecStatus.OK) {
            CodecXLogging.e("AndroidVideoDecoder", "releaseInternal err");
            return codecXVideoCodecStatusReleaseInternal;
        }
        int i3 = 0;
        do {
            codecXVideoCodecStatusInitDecodeInternal = initDecodeInternal(i, i2);
            if (CodecXVideoCodecStatus.OK == codecXVideoCodecStatusInitDecodeInternal) {
                break;
            }
            releaseSurface();
            i3++;
        } while (i3 < 2);
        return codecXVideoCodecStatusInitDecodeInternal;
    }

    public NativeCodecXByteMemory allocateI420Buffer(int i, int i2) {
        return NativeCodecXByteMemory.createCodecXByteMemory(i, i2, CodecXPixelFormat.kI420, 0L);
    }

    public void drainOutputFrame(MediaCodec.BufferInfo bufferInfo, int i) {
        OutputBufferInfo outputBufferInfoPoll;
        this.outputFrameCount++;
        if (this.isError.get()) {
            CodecXLogging.w("AndroidVideoDecoder", "codec is error when call drainOutputFrame");
            return;
        }
        if (this.callback == null) {
            CodecXLogging.e("AndroidVideoDecoder", "callback is null, return");
            return;
        }
        if (this.exSurface != null) {
            int i2 = this.texturePlayoutMode;
            if (i2 == 0) {
                try {
                    int i3 = this.directRenderMode;
                    if (1 == i3) {
                        this.codec.releaseOutputBuffer(i, bufferInfo.presentationTimeUs * 1000);
                    } else {
                        if (2 == i3) {
                            synchronized (this.outputBufferQueueLock) {
                                try {
                                    this.outputBufferQueue.put(new OutputBufferInfo(bufferInfo.presentationTimeUs, i));
                                    if (this.outputBufferQueue.size() > maxDirectRenderCacheSize && (outputBufferInfoPoll = this.outputBufferQueue.poll()) != null) {
                                        this.codec.releaseOutputBuffer(outputBufferInfoPoll.bufferIndex, false);
                                        synchronized (this.callbackLock) {
                                            VideoDecoder.Callback callback = this.callback;
                                            if (callback != null) {
                                                callback.onMediaCodecStatus(CodecXVideoCodecStatus.DROP_DECODED_FRAME, "direct render drop frame");
                                            }
                                        }
                                        this.dropDecodedFrameCount++;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                } finally {
                                }
                            }
                            return;
                        }
                        this.codec.releaseOutputBuffer(i, true);
                    }
                    callbackDirectRenderFrame(bufferInfo.presentationTimeUs);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    synchronized (this.callbackLock) {
                        try {
                            VideoDecoder.Callback callback2 = this.callback;
                            if (callback2 != null) {
                                callback2.onMediaCodecStatus(CodecXVideoCodecStatus.MEDIACODEC_EXCEPTION, stringWriter.toString());
                                this.callback.onMediaCodecStatus(CodecXVideoCodecStatus.DROP_DECODED_FRAME, "releaseOutputBuffer err");
                            }
                            this.dropDecodedFrameCount++;
                            return;
                        } finally {
                        }
                    }
                }
            }
            if (1 == i2) {
                deliverTextureFrameOutSide(i, bufferInfo);
                return;
            }
            return;
        }
        if (!this.hasDecodedFirstFrame) {
            this.hasDecodedFirstFrame = true;
            this.firstFrameDecodedTime = SystemClock.elapsedRealtime();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("first frame decoded, width:");
            sbLIZ.append(this.width);
            sbLIZ.append(" height:");
            sbLIZ.append(this.height);
            sbLIZ.append(" cost(ms):");
            sbLIZ.append(this.firstFrameDecodedTime - this.firstFrameComingTime);
            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.surfaceTextureHelper != null && this.texturePlayoutMode == 0) {
            deliverTextureFrame(i, bufferInfo);
        } else if (this.outSideSurfaceTextureHelper != null && 1 == this.texturePlayoutMode) {
            deliverTextureFrameOutSide(i, bufferInfo);
        } else {
            deliverByteFrame(i, bufferInfo);
        }
    }

    @Override // com.bytedance.codecx.video.VideoDecoder
    public CodecXVideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        boolean z;
        synchronized (this.callbackLock) {
            try {
                this.callback = callback;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.settings = settings;
        EglBase.Context context = settings.sharedContext;
        if (context != null) {
            this.sharedContext = context;
        }
        if (settings.enableAsyncMode) {
            z = true;
        } else {
            z = false;
        }
        this.useAsyncMode = z;
        int i = settings.directRenderMode;
        this.directRenderMode = i;
        if (i == 2) {
            this.texturePlayoutMode = 0;
        } else {
            this.texturePlayoutMode = settings.texturePlayoutMode;
        }
        return CodecXVideoCodecStatus.OK;
    }

    public void initSurfaceTextureHelper(SurfaceTextureHelper surfaceTextureHelper, boolean z) {
        if (surfaceTextureHelper == null) {
            CodecXLogging.w("AndroidVideoDecoder", "surfaceTextureHelper create fail,egl context maybe is full, the hw decoder should use yuvoutput mode");
            this.mustUseYUVoutput = true;
            return;
        }
        CodecXLogging.w("AndroidVideoDecoder", "surfaceTextureHelper create successful.");
        if (!this.settings.enableAGFXSurfaceTextureHelper) {
            curEglContextNum++;
        }
        surfaceTextureHelper.setTextureMemoryReuse(this.enableTextureMemoryReuse);
        surfaceTextureHelper.setEnableOutsideControlTextureMemory(z);
        this.surface = new Surface(surfaceTextureHelper.getSurfaceTexture());
        surfaceTextureHelper.startListening(this);
    }

    @Override // com.bytedance.codecx.video.VideoDecoder
    public CodecXVideoCodecStatus setPrivateParam(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("got android hardware decoder setPrivateParam key:");
        sbLIZ.append(str);
        sbLIZ.append(" value:");
        sbLIZ.append(str2);
        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
        if (str.equals("bytertc.hw.decoder.dr.vsync.cache.size")) {
            if (isNumeric(str2)) {
                maxDirectRenderCacheSize = CastIntegerProtector.parseInt(str2);
            }
            return CodecXVideoCodecStatus.OK;
        }
        if (str.equals("bytertc.hw.decoder.maxeglnum")) {
            if (isNumeric(str2)) {
                maxEglContextNum = CastIntegerProtector.parseInt(str2);
            }
            CodecXLogging.w("AndroidVideoDecoder", "this is not a param set to HW Decoder, only for control.");
            return CodecXVideoCodecStatus.OK;
        }
        if (str.equals("bytertc.hw.decoder.check.texture.size")) {
            this.enableTextureSizeCheck = "true".equalsIgnoreCase(str2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("set FLAG_CHECK_TEXTURE_SIZE to ");
            sbLIZ2.append(this.enableTextureSizeCheck);
            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
            return CodecXVideoCodecStatus.OK;
        }
        if (str.equals("bytertc.hw.decoder.texture.memory.reuse")) {
            this.enableTextureMemoryReuse = "true".equalsIgnoreCase(str2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("set FLAG_TEXTURE_MEMORY_REUSE to ");
            sbLIZ3.append(this.enableTextureMemoryReuse);
            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ3));
            return CodecXVideoCodecStatus.OK;
        }
        boolean z = true;
        if (str.equals("bytertc.hw.decoder.sr.scale.to.dst.size")) {
            this.enableScaleToSrDstSize = "true".equalsIgnoreCase(str2);
            this.privateSrParamSet = true;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("set FLAG_SR_SCALE_TO_DST_SIZE to ");
            sbLIZ4.append(this.enableScaleToSrDstSize);
            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ4));
            return CodecXVideoCodecStatus.OK;
        }
        if (str.equals("bytertc.hw.decoder.newinputbuffer")) {
            if (isNumeric(str2)) {
                if (CastIntegerProtector.parseInt(str2) < 1) {
                    z = false;
                }
                this.useNewInputBufferAPI = z;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("this is not a param set to HW Decoder, only for control. useNewInputBufferAPI:");
            sbLIZ5.append(this.useNewInputBufferAPI);
            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ5));
            return CodecXVideoCodecStatus.OK;
        }
        if (str.equals("bytertc.hw.decoder.newoutputbuffer")) {
            if (isNumeric(str2)) {
                if (CastIntegerProtector.parseInt(str2) < 1) {
                    z = false;
                }
                this.useNewOutputBufferAPI = z;
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("this is not a param set to HW Decoder, only for control. useNewOutputBufferAPI:");
            sbLIZ6.append(this.useNewOutputBufferAPI);
            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ6));
            return CodecXVideoCodecStatus.OK;
        }
        this.vpassPrivateParams.put(str, str2);
        return CodecXVideoCodecStatus.OK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$deliverTextureFrameOutSide$1(int i, MediaCodec.BufferInfo bufferInfo, boolean z) {
        try {
            if (z) {
                this.codec.releaseOutputBuffer(i, bufferInfo.presentationTimeUs * 1000);
            } else {
                this.codec.releaseOutputBuffer(i, z);
            }
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CodecXLogging.w("AndroidVideoDecoder", "releaseOutputBuffer failed", e);
            return 0;
        }
    }

    private boolean setAdaptivePlaybackParam(MediaFormat mediaFormat, String str, Integer num) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str) && isNumeric(entry.getValue())) {
                int iMax = Math.max(CastIntegerProtector.parseInt(entry.getValue()), num.intValue());
                if (iMax <= 9000 && iMax > 0) {
                    mediaFormat.setInteger(entry.getKey(), iMax);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setAdaptivePlaybackParam params key: ");
                    sbLIZ.append(entry.getKey());
                    sbLIZ.append(", value:");
                    sbLIZ.append(Math.max(CastIntegerProtector.parseInt(entry.getValue()), num.intValue()));
                    sbLIZ.append(" {privateConfig: ");
                    sbLIZ.append(CastIntegerProtector.parseInt(entry.getValue()));
                    sbLIZ.append(", resoluion: ");
                    sbLIZ.append(num);
                    sbLIZ.append("}");
                    CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
                    return true;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setAdaptivePlaybackParam failed! exceeding the valid range(0, 10000], key: ");
                sbLIZ2.append(entry.getKey());
                sbLIZ2.append(", value: ");
                sbLIZ2.append(iMax);
                sbLIZ2.append(" {privateConfig: ");
                sbLIZ2.append(CastIntegerProtector.parseInt(entry.getValue()));
                sbLIZ2.append(", resoluion: ");
                sbLIZ2.append(num);
                sbLIZ2.append("}");
                CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
                return false;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("setAdaptivePlaybackParam, but private key isn't setted, params: ");
        sbLIZ3.append(str);
        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ3));
        return false;
    }

    private void setIntegerParam(MediaFormat mediaFormat, String str, Integer num) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (isNumeric(entry.getValue())) {
                    mediaFormat.setInteger(entry.getKey(), CastIntegerProtector.parseInt(entry.getValue()));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("the decoder params ");
                    sbLIZ.append(entry.getKey());
                    sbLIZ.append(" is coverd by vpaas with value:");
                    sbLIZ.append(entry.getValue());
                    CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
                    this.privateParams.remove(str);
                    return;
                }
                this.privateParams.remove(str);
                if (entry.getValue().length() > 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("the decoder params ");
                    sbLIZ2.append(entry.getKey());
                    sbLIZ2.append(" set by vpaas is invalid with value:");
                    sbLIZ2.append(entry.getValue());
                    sbLIZ2.append(",skip it");
                    CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("the decoder params ");
                    sbLIZ3.append(entry.getKey());
                    sbLIZ3.append(" is disabled by vpaas,skip it");
                    CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("decoder int params has been set with Key:");
        sbLIZ4.append(str);
        sbLIZ4.append(" Value:");
        sbLIZ4.append(num);
        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ4));
        mediaFormat.setInteger(str, num.intValue());
    }

    private void setStringParam(MediaFormat mediaFormat, String str, String str2) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (entry.getValue().length() > 0) {
                    mediaFormat.setString(entry.getKey(), entry.getValue());
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("the decoder params ");
                    sbLIZ.append(entry.getKey());
                    sbLIZ.append(" is coverd by vpaas with value:");
                    sbLIZ.append(entry.getValue());
                    CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("the decoder params ");
                    sbLIZ2.append(entry.getKey());
                    sbLIZ2.append(" is disabled by vpaas,skip it");
                    CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ2));
                }
                this.privateParams.remove(str);
                return;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("decoder string params has been set with Key:");
        sbLIZ3.append(str);
        sbLIZ3.append(" Value:");
        sbLIZ3.append(str2);
        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ3));
        mediaFormat.setString(str, str2);
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, CodecXVideoCodecStandard codecXVideoCodecStandard, int i, boolean z) {
        if (isSupportedColorFormat(i)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ctor name: ");
            sbLIZ.append(str);
            sbLIZ.append(" type: ");
            sbLIZ.append(codecXVideoCodecStandard);
            sbLIZ.append(" color format(19:I420 21:NV12): ");
            sbLIZ.append(i);
            sbLIZ.append(" enableCacheDecoder:");
            sbLIZ.append(z);
            CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
            this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
            this.codecName = str;
            this.codecType = codecXVideoCodecStandard;
            this.colorFormat = i;
            this.width = 0;
            this.height = 0;
            this.isCacheDecoder = z;
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Unsupported color format: ");
        sbLIZ2.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    private NativeCodecXByteMemory copyI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int i5;
        if (i % 2 != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Stride is not divisible by two: ");
            sbLIZ.append(i);
            CodecXLogging.e("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        int i6 = (i3 + 1) / 2;
        if (i2 % 2 == 0) {
            i5 = (i4 + 1) / 2;
        } else {
            i5 = i4 / 2;
        }
        int i7 = i / 2;
        int i8 = i * i4;
        int i9 = i * i2;
        int i10 = i7 * i5;
        int i11 = i9 + i10;
        int i12 = i9 + ((i7 * i2) / 2);
        int i13 = i12 + i10;
        NativeCodecXByteMemory nativeCodecXByteMemoryAllocateI420Buffer = allocateI420Buffer(i3, i4);
        if (nativeCodecXByteMemoryAllocateI420Buffer == null) {
            return null;
        }
        if (nativeCodecXByteMemoryAllocateI420Buffer.getNumberOfPlanes() != 3) {
            nativeCodecXByteMemoryAllocateI420Buffer.release();
            return null;
        }
        try {
            byteBuffer.limit(i8);
            byteBuffer.position(0);
            try {
                copyPlane(byteBuffer.slice(), i, nativeCodecXByteMemoryAllocateI420Buffer.getPlaneData(0), nativeCodecXByteMemoryAllocateI420Buffer.getPlaneLineSize(0), i3, i4);
                byteBuffer.limit(i11);
                byteBuffer.position(i9);
                copyPlane(byteBuffer.slice(), i7, nativeCodecXByteMemoryAllocateI420Buffer.getPlaneData(1), nativeCodecXByteMemoryAllocateI420Buffer.getPlaneLineSize(1), i6, i5);
                if (i2 % 2 == 1) {
                    byteBuffer.position(i9 + ((i5 - 1) * i7));
                    ByteBuffer planeData = nativeCodecXByteMemoryAllocateI420Buffer.getPlaneData(1);
                    planeData.position(nativeCodecXByteMemoryAllocateI420Buffer.getPlaneLineSize(1) * i5);
                    planeData.put(byteBuffer);
                }
                byteBuffer.limit(i13);
                byteBuffer.position(i12);
                copyPlane(byteBuffer.slice(), i7, nativeCodecXByteMemoryAllocateI420Buffer.getPlaneData(2), nativeCodecXByteMemoryAllocateI420Buffer.getPlaneLineSize(2), i6, i5);
                if (i2 % 2 == 1) {
                    byteBuffer.position(i12 + (i7 * (i5 - 1)));
                    ByteBuffer planeData2 = nativeCodecXByteMemoryAllocateI420Buffer.getPlaneData(2);
                    planeData2.position(nativeCodecXByteMemoryAllocateI420Buffer.getPlaneLineSize(2) * i5);
                    planeData2.put(byteBuffer);
                }
                return nativeCodecXByteMemoryAllocateI420Buffer;
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                CodecXLogging.e("AndroidVideoDecoder", "buffer err:", e);
                nativeCodecXByteMemoryAllocateI420Buffer.release();
                return null;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private NativeCodecXByteMemory copyNV12Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int i5 = (i4 + 1) / 2;
        int i6 = i * i4;
        int i7 = i * i2;
        int i8 = i7 + (i * i5);
        NativeCodecXByteMemory nativeCodecXByteMemoryCreateCodecXByteMemory = NativeCodecXByteMemory.createCodecXByteMemory(i3, i4, CodecXPixelFormat.kNv12, 0L);
        if (nativeCodecXByteMemoryCreateCodecXByteMemory == null) {
            return null;
        }
        if (nativeCodecXByteMemoryCreateCodecXByteMemory.getNumberOfPlanes() != 2) {
            nativeCodecXByteMemoryCreateCodecXByteMemory.release();
            return null;
        }
        try {
            byteBuffer.limit(i6);
            byteBuffer.position(0);
            copyPlane(byteBuffer.slice(), i, nativeCodecXByteMemoryCreateCodecXByteMemory.getPlaneData(0), nativeCodecXByteMemoryCreateCodecXByteMemory.getPlaneLineSize(0), i3, i4);
            byteBuffer.limit(i8);
            byteBuffer.position(i7);
            copyPlane(byteBuffer.slice(), i, nativeCodecXByteMemoryCreateCodecXByteMemory.getPlaneData(1), nativeCodecXByteMemoryCreateCodecXByteMemory.getPlaneLineSize(1), i3, i5);
            return nativeCodecXByteMemoryCreateCodecXByteMemory;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CodecXLogging.e("AndroidVideoDecoder", "copyNV12Buffer err:", e);
            nativeCodecXByteMemoryCreateCodecXByteMemory.release();
            return null;
        }
    }

    @Override // com.bytedance.codecx.video.VideoDecoder
    public CodecXVideoCodecStatus setDeliverParams(boolean z, int i, float f, float f2, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("got android hardware decoder setDeliverParams enable:");
        sbLIZ.append(z);
        sbLIZ.append(", maxTryCount:");
        sbLIZ.append(i);
        sbLIZ.append(", minAccelerateRatio:");
        sbLIZ.append(f);
        sbLIZ.append(", maxDeaccelerateRatio:");
        sbLIZ.append(f2);
        sbLIZ.append(", frameCacheThreshold:");
        sbLIZ.append(i2);
        CodecXLogging.w("AndroidVideoDecoder", C2188811AlT.LIZIZ(sbLIZ));
        this.enableRetryDeliver = z;
        this.maxTryCount = i;
        this.minAccelerateRatio = f;
        this.maxDeaccelerateRatio = f2;
        this.frameCacheThreshold = i2;
        return CodecXVideoCodecStatus.OK;
    }

    public void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        CodecXYuvHelper.nativeCopyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }
}
