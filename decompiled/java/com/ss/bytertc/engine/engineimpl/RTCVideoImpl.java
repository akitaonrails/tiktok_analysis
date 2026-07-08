package com.ss.bytertc.engine.engineimpl;

import X.C08FF;
import X.C0W9U;
import X.C0W9W;
import X.C1280730jQt;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.librarian.Librarian;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.bytertc.engine.GLESVersion;
import com.ss.bytertc.engine.IAudioFrameObserver;
import com.ss.bytertc.engine.IAudioFrameProcessor;
import com.ss.bytertc.engine.IMetadataObserver;
import com.ss.bytertc.engine.InternalMediaTypeEnhancementConfig;
import com.ss.bytertc.engine.InternalVideoCaptureConfig;
import com.ss.bytertc.engine.InternalVideoEncoderConfig;
import com.ss.bytertc.engine.InternalVideoSourceConfig;
import com.ss.bytertc.engine.LyraxAudioPlayer;
import com.ss.bytertc.engine.NativeRTCVideoFunctions;
import com.ss.bytertc.engine.NetworkTimeInfo;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.RTCRoomImpl;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.VideoCanvas;
import com.ss.bytertc.engine.VideoCodecDescription;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.adapter.VideoFrameSinkAdapter;
import com.ss.bytertc.engine.adapter.VideoSinkTask;
import com.ss.bytertc.engine.data.AudioContentTypeConfig;
import com.ss.bytertc.engine.data.AudioEncodeConfig;
import com.ss.bytertc.engine.data.AudioFormat;
import com.ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.ss.bytertc.engine.data.AudioProcessorMethod;
import com.ss.bytertc.engine.data.AudioPropertiesConfig;
import com.ss.bytertc.engine.data.AudioRenderType;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.AudioSampleRate;
import com.ss.bytertc.engine.data.AudioSourceType;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.PreProcessVideoNodeStats;
import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.data.RtcScene;
import com.ss.bytertc.engine.data.SEICountPerFrame;
import com.ss.bytertc.engine.data.StrategyGrade;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.StreamPriority;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.data.VideoSolutionMode;
import com.ss.bytertc.engine.data.VideoSourceType;
import com.ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.handler.IExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.handler.RTCExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.RTCLocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCVideoEventHandler;
import com.ss.bytertc.engine.live.ChorusCacheSyncConfig;
import com.ss.bytertc.engine.live.ChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.IChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.live.LiveTranscodingObserver;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.live.PushMixedStreamToCDNObserver;
import com.ss.bytertc.engine.loader.LyraxPluginConfig;
import com.ss.bytertc.engine.loader.RTCNativeLibraryListenerImpl;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderInfo;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener;
import com.ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.IRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.RTCEncodedVideoFrame;
import com.ss.bytertc.engine.type.AudioSceneType;
import com.ss.bytertc.engine.type.BackgroundMode;
import com.ss.bytertc.engine.type.DivideModel;
import com.ss.bytertc.engine.type.MediaTypeEnhancementConfig;
import com.ss.bytertc.engine.type.PublishFallbackOption;
import com.ss.bytertc.engine.type.RemoteUserPriority;
import com.ss.bytertc.engine.type.SubscribeFallbackOptions;
import com.ss.bytertc.engine.utils.AppMonitor;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogRecover;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.utils.VideoFrameConverter;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.IVideoStrategyRunner;
import com.ss.bytertc.engine.video.VideoCaptureConfig;
import com.ss.bytertc.engine.video.VideoDecoderConfig;
import com.ss.bytertc.engine.video.VideoExternalData;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.builder.GLTextureVideoFrameBuilder;
import com.ss.bytertc.engine.video.impl.LyraxVideoFrame;
import com.ss.bytertc.engine.video.impl.VideoFramePool;
import com.ss.lyrax.audio.ILyraxAudioPlayer;
import com.ss.lyrax.subscriber.LyraxVideoRenderConfig;
import com.ss.lyrax.video.ILyraxVideoRenderer;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class RTCVideoImpl extends RTCVideo {
    public static boolean mLibraryLoaded;
    public AppMonitor.Callback appStateCallback;
    public ChorusCacheSyncObserver mChorusObserver;
    public Context mContext;
    public Handler mEglHandler;
    public HandlerThread mEglThread;
    public RTCVideoEventHandler mEngineEventHandler;
    public IExternalVideoEncoderEventHandler mExternalVideoEncoderHandler;
    public boolean mIsFront;
    public boolean mIsUseCustomEglEnv;
    public final ReentrantReadWriteLock.ReadLock mJniReadLock;
    public final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    public RTCRoomImpl mLivePusherRtcRoom;
    public ILiveTranscodingObserver mLiveTranscodingObserver;
    public ILocalEncodedVideoFrameObserver mLocalEncodedVideoFrameObserver;
    public LogUtil.ILoggerSink mLoggerSink;
    public Map<Integer, LyraxAudioPlayer> mLyraxAudioPlayerMap;
    public IMetadataObserver mMetadataObserver;
    public PushMixedStreamToCDNObserver mMixedStreamToCDNObserver;
    public long mNativeEngine;
    public Runnable mOnDestroyCompletedCallback;
    public final ReentrantReadWriteLock mReadWriteLock;
    public IRemoteEncodedVideoFrameObserver mRemoteEncodedVideoFrameObserver;
    public EglBase mRootEglBase;
    public int mRootEglVersion;
    public IRTCVideoEventHandler mRtcEngineHandler;
    public RTCExternalVideoEncoderEventHandler mRtcExVideoEncoderHandler;
    public RTCLocalEncodedVideoFrameObserver mRtcLocalEncodedVideoFrameObserver;
    public RTCRemoteEncodedVideoFrameObserver mRtcRemoteEncodedVideoFrameObserver;
    public VideoFrameConverter mScreenFrameConverter;
    public State mState;
    public LiveTranscodingObserver mTranscodingObserver;
    public VideoFrameConverter mVideoFrameConverter;
    public VideoFramePool mVideoFramePool;
    public VideoSinkTask mVideoSinkTask;
    public long nativeLivePusherRtcRoom;
    public final TimerTask timerTask;
    public static RTCNativeLibraryLoaderListener mRtcNativeLibraryListener = new RTCNativeLibraryListenerImpl();
    public static RTCNativeLibraryLoaderInfo sRtcLoaderInfo = new RTCNativeLibraryLoaderInfo();
    public static String mDeviceId = "";
    public static Timer timer = new PthreadTimer("/RTCVideoImpl");

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public String buildRemoteVideoRenderId(StreamKey streamKey) {
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public void detachRemoteVideoRenderer(StreamKey streamKey) {
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public View getRemoteVideoRenderTargetView(StreamKey streamKey) {
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public ILyraxVideoRenderer getRemoteVideoRenderer(StreamKey streamKey) {
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int replaceBackground(BackgroundMode backgroundMode, DivideModel divideModel) {
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRemoteVideoCanvas(StreamKey streamKey, VideoCanvas videoCanvas) {
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public void setRemoteVideoRenderTargetView(String str, View view) {
    }

    static {
        loadSoFile();
    }

    public static String getSDKVersion() {
        if (!mLibraryLoaded) {
            return "";
        }
        try {
            return NativeRTCVideoFunctions.nativeGetSDKVersion();
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rtc loader info:");
            sbLIZ.append(sRtcLoaderInfo.toString());
            sbLIZ.append(" exception info:");
            sbLIZ.append(e.getStackTrace().toString());
            throw new UnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static String getSdkVersion() {
        if (!mLibraryLoaded) {
            return "";
        }
        try {
            NativeRTCVideoFunctions.nativeGetSDKVersion();
            return NativeRTCVideoFunctions.nativeGetSDKVersion();
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rtc loader info:");
            sbLIZ.append(sRtcLoaderInfo.toString());
            sbLIZ.append(" exception info:");
            sbLIZ.append(e.getStackTrace().toString());
            throw new UnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doDestroy$3() {
        C1C7U.LIZ("RTCVideoImpl@9779.doDestroy$1L");
        Runnable runnable = this.mOnDestroyCompletedCallback;
        if (runnable != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("RTCVideoImpl@9779.doDestroy$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doDestroy$4() {
        C1C7U.LIZ("RTCVideoImpl@9779.doDestroy$2L");
        EglBase eglBase = this.mRootEglBase;
        if (eglBase != null) {
            eglBase.release();
            this.mRootEglBase = null;
        }
        C1C7U.LIZIZ("RTCVideoImpl@9779.doDestroy$2L");
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int disableDownlinkAudioSelection() {
        LogUtil.d("RtcVideoImpl", "disableDownlinkAudioSelection");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, disableDownlinkAudioSelection failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            int iNativeDisableDownlinkAudioSelection = NativeRTCVideoFunctions.nativeDisableDownlinkAudioSelection(this.mNativeEngine);
            this.mJniReadLock.unlock();
            return iNativeDisableDownlinkAudioSelection;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public boolean engineInvalid() {
        return this.mNativeEngine == 0;
    }

    public EglBase getEGLContext() {
        EglBase eglBase = this.mRootEglBase;
        if (eglBase != null) {
            return eglBase;
        }
        return null;
    }

    public GLESVersion getGLESVersion() {
        return this.mRootEglBase != null ? GLESVersion.fromId(this.mRootEglVersion) : GLESVersion.GLES_VERSION_UNKNOWN;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public RTCRoom getLivePusherRoom() {
        LogUtil.d("RtcVideoImpl", "getLivePusherRoom");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, getLivePusherRoom failed.");
            } else {
                long jNativeGetLivePusherRoom = NativeRTCVideoFunctions.nativeGetLivePusherRoom(this.mNativeEngine);
                if (jNativeGetLivePusherRoom != 0) {
                    long j = this.nativeLivePusherRtcRoom;
                    if (j == 0 || this.mLivePusherRtcRoom == null || j != jNativeGetLivePusherRoom) {
                        this.mLivePusherRtcRoom = new RTCRoomImpl(NativeRTCVideoFunctions.nativeGetLivePusherRoomId(jNativeGetLivePusherRoom), jNativeGetLivePusherRoom);
                        this.nativeLivePusherRtcRoom = jNativeGetLivePusherRoom;
                    }
                    RTCRoomImpl rTCRoomImpl = this.mLivePusherRtcRoom;
                    this.mJniReadLock.unlock();
                    return rTCRoomImpl;
                }
                LogUtil.e("RtcVideoImpl", "getLivePusherRoom faild, native room is invalid");
                this.nativeLivePusherRtcRoom = 0L;
            }
            this.mJniReadLock.unlock();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public String getLivePusherTaskId() {
        LogUtil.d("RtcVideoImpl", "getLivePusherTaskId");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, getLivePusherTaskId failed.");
                this.mJniReadLock.unlock();
                return null;
            }
            String strNativeGetLivePusherTaskId = NativeRTCVideoFunctions.nativeGetLivePusherTaskId(this.mNativeEngine);
            this.mJniReadLock.unlock();
            return strNativeGetLivePusherTaskId;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public NetworkTimeInfo getNetworkTimeInfo() {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, getNetworkTimeInfo");
                this.mJniReadLock.unlock();
                return null;
            }
            NetworkTimeInfo networkTimeInfoNativeGetNetworkTimeInfo = NativeRTCVideoFunctions.nativeGetNetworkTimeInfo(this.mNativeEngine);
            this.mJniReadLock.unlock();
            return networkTimeInfoNativeGetNetworkTimeInfo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public boolean isLyraxFrameEnabled() {
        this.mJniReadLock.lock();
        try {
            boolean zNativeIsLyraxFrameEnabled = NativeRTCVideoFunctions.nativeIsLyraxFrameEnabled(this.mNativeEngine);
            this.mJniReadLock.unlock();
            return zNativeIsLyraxFrameEnabled;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int startAudioCapture() {
        int iNativeStartAudioCapture;
        LogUtil.d("RtcVideoImpl", "startAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startAudioCapture failed.");
                iNativeStartAudioCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartAudioCapture = NativeRTCVideoFunctions.nativeStartAudioCapture(this.mNativeEngine);
            }
            this.mJniReadLock.unlock();
            return iNativeStartAudioCapture;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int stopAudioCapture() {
        int iNativeStopAudioCapture;
        LogUtil.d("RtcVideoImpl", "stopAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopAudioCapture failed.");
                iNativeStopAudioCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopAudioCapture = NativeRTCVideoFunctions.nativeStopAudioCapture(this.mNativeEngine);
            }
            this.mJniReadLock.unlock();
            return iNativeStopAudioCapture;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int stopChorusCacheSync() {
        int iNativeStopChorusCacheSync;
        LogUtil.d("RtcVideoImpl", "stopChorusCacheSync...");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopChorusCacheSync failed.");
                iNativeStopChorusCacheSync = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopChorusCacheSync = NativeRTCVideoFunctions.nativeStopChorusCacheSync(this.mNativeEngine);
            }
            this.mJniReadLock.unlock();
            return iNativeStopChorusCacheSync;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int stopNetworkDetection() {
        int iNativeStopNetworkProbe;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, sendCustomMessage failed.");
                iNativeStopNetworkProbe = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopNetworkProbe = NativeRTCVideoFunctions.nativeStopNetworkProbe(this.mNativeEngine);
            }
            this.mJniReadLock.unlock();
            return iNativeStopNetworkProbe;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public static Context getApplicationContext() {
        return ContextUtils.getApplicationContext();
    }

    public static void loadSoFile() {
        String soLibraryName = LyraxPluginConfig.getSoLibraryName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[LYRAX_SO_LOAD] RTCVideoImpl.loadSoFile: soName=");
        sbLIZ.append(soLibraryName);
        sbLIZ.append(", pluginState=");
        sbLIZ.append(LyraxPluginConfig.getPluginState());
        LyraxPluginConfig.safeLogW("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (mLibraryLoaded) {
            mRtcNativeLibraryListener.onLoadAlready(soLibraryName);
        } else {
            RTCNativeLibraryLoader rTCNativeLibraryLoader = RTCVideo.mRtcNativeLibraryLoader;
            if (rTCNativeLibraryLoader != null) {
                mLibraryLoaded = true;
                boolean zLoad = rTCNativeLibraryLoader.load("bytenn") & true;
                mLibraryLoaded = zLoad;
                boolean zLoad2 = zLoad & RTCVideo.mRtcNativeLibraryLoader.load(soLibraryName);
                mLibraryLoaded = zLoad2;
                if (zLoad2) {
                    mRtcNativeLibraryListener.onLoadSuccess(soLibraryName);
                } else {
                    mRtcNativeLibraryListener.onLoadError(soLibraryName);
                }
                sRtcLoaderInfo.setLoaderClassName(RTCVideo.mRtcNativeLibraryLoader.getClass().getSimpleName());
            } else {
                try {
                    INVOKESTATIC_com_ss_bytertc_engine_engineimpl_RTCVideoImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                    INVOKESTATIC_com_ss_bytertc_engine_engineimpl_RTCVideoImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(soLibraryName);
                    mLibraryLoaded = true;
                    mRtcNativeLibraryListener.onLoadSuccess(soLibraryName);
                    sRtcLoaderInfo.setLoaderClassName("System.loader");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Success to load native library: ");
                    sbLIZ2.append(soLibraryName);
                    LogUtil.e("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ2));
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Failed to load native library: ");
                    sbLIZ3.append(soLibraryName);
                    LogUtil.e("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ3), e);
                }
                mRtcNativeLibraryListener.onLoadError(soLibraryName);
            }
            sRtcLoaderInfo.setLoadResult(mLibraryLoaded);
            sRtcLoaderInfo.setLoadTimeStampMs(System.currentTimeMillis());
            sRtcLoaderInfo.setSdkVersion(getSDKVersion());
        }
        sRtcLoaderInfo.loadLibrary();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public long getNativeHandle() {
        if (!engineInvalid()) {
            return this.mNativeEngine;
        }
        LogUtil.e("RtcVideoImpl", "native engine is invalid, getNativeHandle failed.");
        return -1L;
    }

    public ILocalEncodedVideoFrameObserver getEncodedVideoFrameObserver() {
        return this.mLocalEncodedVideoFrameObserver;
    }

    public IExternalVideoEncoderEventHandler getExternalVideoEncoderEventHandler() {
        return this.mExternalVideoEncoderHandler;
    }

    public ILiveTranscodingObserver getLiveTranscodingObserver() {
        return this.mLiveTranscodingObserver;
    }

    public IMetadataObserver getMetadataObserver() {
        return this.mMetadataObserver;
    }

    public IRemoteEncodedVideoFrameObserver getRemoteEncodedVideoFrameObserver() {
        return this.mRemoteEncodedVideoFrameObserver;
    }

    public IRTCVideoEventHandler getRtcEngineHandler() {
        return this.mRtcEngineHandler;
    }

    public enum State {
        IDLE,
        IN_ROOM,
        DESTORY;

        public static State valueOf(String str) {
            return (State) C08FF.LIZ(State.class, str);
        }
    }

    public static void INVOKESTATIC_com_ss_bytertc_engine_engineimpl_RTCVideoImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(int i) {
        String str;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetAppState failed.");
                this.mJniReadLock.unlock();
                return;
            }
            long j = this.mNativeEngine;
            if (i == 1) {
                str = "active";
            } else {
                str = "background";
            }
            NativeRTCVideoFunctions.nativeSetAppState(j, str);
            this.mJniReadLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public static void setAppContext(Context context) {
        NativeRTCVideoFunctions.nativeSetAppContext(context);
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public RTCRoom createRTCRoom(String str) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, createRoom failed.");
            } else {
                if (str == null) {
                    str = "";
                }
                long jNativeCreateRoom = NativeRTCVideoFunctions.nativeCreateRoom(this.mNativeEngine, str);
                if (jNativeCreateRoom == 0) {
                    LogUtil.e("RtcVideoImpl", "createRoom failed, native room is invalid");
                } else {
                    RTCRoomImpl rTCRoomImpl = new RTCRoomImpl(str, jNativeCreateRoom);
                    this.mJniReadLock.unlock();
                    return rTCRoomImpl;
                }
            }
            this.mJniReadLock.unlock();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public void destroyRTCVideo(long j) {
        NativeRTCVideoFunctions.nativeDestroyRTCVideo(j);
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int disableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod) {
        int iNativeDisableAudioFrameCallback;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, disableAudioFrameCallback failed.");
                iNativeDisableAudioFrameCallback = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeDisableAudioFrameCallback = NativeRTCVideoFunctions.nativeDisableAudioFrameCallback(this.mNativeEngine, audioFrameCallbackMethod.value());
            }
            this.mJniReadLock.unlock();
            return iNativeDisableAudioFrameCallback;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int disableAudioProcessor(AudioProcessorMethod audioProcessorMethod) {
        int iNativeDisableAudioProcessor;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, disableAudioProcessor failed.");
                iNativeDisableAudioProcessor = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeDisableAudioProcessor = NativeRTCVideoFunctions.nativeDisableAudioProcessor(this.mNativeEngine, audioProcessorMethod.value());
            }
            this.mJniReadLock.unlock();
            return iNativeDisableAudioProcessor;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public void doDestroy(boolean z) {
        LogUtil.d("RtcVideoImpl", "destroy RtcEngineImpl.");
        this.mJniWriteLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, no need to destroy now.");
                this.mJniWriteLock.unlock();
                return;
            }
            long j = this.mNativeEngine;
            this.mNativeEngine = 0L;
            this.mJniWriteLock.unlock();
            this.mState = State.DESTORY;
            if (!z) {
                destroyRTCVideo(j);
            }
            NativeRTCVideoFunctions.nativeClearHardWareEncodeContext();
            Map<Integer, LyraxAudioPlayer> map = this.mLyraxAudioPlayerMap;
            if (map != null) {
                Iterator<LyraxAudioPlayer> it2 = map.values().iterator();
                while (it2.hasNext()) {
                    it2.next().destroy();
                }
            }
            this.mIsFront = true;
            this.mVideoFrameConverter.dispose();
            this.mVideoFrameConverter = null;
            this.mScreenFrameConverter.dispose();
            this.mScreenFrameConverter = null;
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0jLb
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$doDestroy$3();
                }
            });
            AppMonitor appMonitor = AppMonitor.get(this.mContext);
            appMonitor.unRegister(this.appStateCallback);
            appMonitor.release(this.mContext);
            ThreadUtils.invokeAtFrontUninterruptibly(this.mEglHandler, new Runnable() { // from class: X.0jLc
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$doDestroy$4();
                }
            });
            HandlerThread handlerThread = this.mEglThread;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            VideoSinkTask videoSinkTask = this.mVideoSinkTask;
            if (videoSinkTask != null) {
                videoSinkTask.exit();
            }
            VideoFramePool videoFramePool = this.mVideoFramePool;
            if (videoFramePool != null) {
                videoFramePool.release();
            }
            LogUtil.setLoggerSink(null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniWriteLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int enableAudioPropertiesReport(AudioPropertiesConfig audioPropertiesConfig) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                iValue = NativeRTCVideoFunctions.nativeEnableAudioPropertiesReport(this.mNativeEngine, audioPropertiesConfig.interval, audioPropertiesConfig.enableSpectrum, audioPropertiesConfig.enableVad, audioPropertiesConfig.localMainReportMode.value(), audioPropertiesConfig.smooth, audioPropertiesConfig.audioReportMode.value(), audioPropertiesConfig.enableVoicePitch);
            } else {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, EnableAudioPropertiesReport failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            }
            this.mJniReadLock.unlock();
            return iValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int enableDownlinkAudioSelection(int i) {
        LogUtil.d("RtcVideoImpl", "enableDownlinkAudioSelection");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                int iNativeEnableDownlinkAudioSelection = NativeRTCVideoFunctions.nativeEnableDownlinkAudioSelection(this.mNativeEngine, i);
                this.mJniReadLock.unlock();
                return iNativeEnableDownlinkAudioSelection;
            }
            LogUtil.e("RtcVideoImpl", "native engine is invalid, enableDownlinkAudioSelection failed.");
            this.mJniReadLock.unlock();
            return -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int enableSimulcastMode(boolean z) {
        int iNativeEnableSimulcastMode;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoResolutions failed.");
                iNativeEnableSimulcastMode = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableSimulcastMode = NativeRTCVideoFunctions.nativeEnableSimulcastMode(this.mNativeEngine, z);
            }
            this.mJniReadLock.unlock();
            return iNativeEnableSimulcastMode;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public RTCRoom getLivePusherRoom(String str) {
        return getLivePusherRoom();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public ILyraxAudioPlayer getLyraxAudioPlayer(int i) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, getLyraxAudioPlayer");
            } else {
                Map<Integer, LyraxAudioPlayer> map = this.mLyraxAudioPlayerMap;
                if (map != null && map.containsKey(Integer.valueOf(i))) {
                    LyraxAudioPlayer lyraxAudioPlayer = this.mLyraxAudioPlayerMap.get(Integer.valueOf(i));
                    this.mJniReadLock.unlock();
                    return lyraxAudioPlayer;
                }
                long jNativeGetLyraxAudioPlayer = NativeRTCVideoFunctions.nativeGetLyraxAudioPlayer(this.mNativeEngine, i);
                if (jNativeGetLyraxAudioPlayer == 0) {
                    LogUtil.e("RtcVideoImpl", "getLyraxAudioPlayer failed");
                } else {
                    LyraxAudioPlayer lyraxAudioPlayer2 = new LyraxAudioPlayer(jNativeGetLyraxAudioPlayer, this.mNativeEngine);
                    if (this.mLyraxAudioPlayerMap == null) {
                        this.mLyraxAudioPlayerMap = new HashMap();
                    }
                    this.mLyraxAudioPlayerMap.put(Integer.valueOf(i), lyraxAudioPlayer2);
                    this.mJniReadLock.unlock();
                    return lyraxAudioPlayer2;
                }
            }
            this.mJniReadLock.unlock();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public VideoCodecDescription[] getVideoTargetDecoderDescriptions(StreamIndex streamIndex) {
        LogUtil.d("RtcVideoImpl", "getVideoTargetDecoderDescriptions");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, getVideoTargetDecoderDescriptions failed.");
                this.mJniReadLock.unlock();
                return null;
            }
            VideoCodecDescription[] videoCodecDescriptionArrNativeGetVideoTargetDecoderDescriptions = NativeRTCVideoFunctions.nativeGetVideoTargetDecoderDescriptions(this.mNativeEngine, streamIndex.value());
            this.mJniReadLock.unlock();
            return videoCodecDescriptionArrNativeGetVideoTargetDecoderDescriptions;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int pullExternalAudioFrame(AudioFrame audioFrame) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            try {
                if (!engineInvalid() && this.mState != State.DESTORY) {
                    if (audioFrame == null) {
                        LogUtil.e("RtcVideoImpl", "audioFrame is null, pullExternalAudioFrame failed.");
                        iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                    } else {
                        AudioSampleRate audioSampleRate = audioFrame.sampleRate;
                        if (audioSampleRate == null) {
                            LogUtil.e("RtcVideoImpl", "sample rate is null, pullExternalAudioFrame failed.");
                            iValue = ReturnStatus.RETURN_STATUS_AUDIO_DEVICE_FORMAT_NOT_SUPPORT.value();
                        } else if (audioFrame.channel == null) {
                            LogUtil.e("RtcVideoImpl", "channel is null, pullExternalAudioFrame failed.");
                            iValue = ReturnStatus.RETURN_STATUS_AUDIO_DEVICE_FORMAT_NOT_SUPPORT.value();
                        } else {
                            iValue = NativeRTCVideoFunctions.nativePullExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioSampleRate.value(), audioFrame.channel.value());
                        }
                    }
                } else {
                    LogUtil.e("RtcVideoImpl", "native engine is invalid, pullExternalAudioFrame failed.");
                    iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iValue = ReturnStatus.RETURN_STATUS_AUDIO_DEVICE_FORMAT_NOT_SUPPORT.value();
            }
            this.mJniReadLock.unlock();
            return iValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int pushExternalAudioFrame(AudioFrame audioFrame) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            try {
                if (!engineInvalid() && this.mState != State.DESTORY) {
                    if (audioFrame == null) {
                        LogUtil.e("RtcVideoImpl", "audioFrame is null, pushExternalAudioFrame failed.");
                        iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                    } else {
                        AudioSampleRate audioSampleRate = audioFrame.sampleRate;
                        if (audioSampleRate == null) {
                            LogUtil.e("RtcVideoImpl", "sample rate is null, pushExternalAudioFrame failed.");
                            iValue = ReturnStatus.RETURN_STATUS_AUDIO_DEVICE_FORMAT_NOT_SUPPORT.value();
                        } else if (audioFrame.channel == null) {
                            LogUtil.e("RtcVideoImpl", "channel is null, pushExternalAudioFrame failed.");
                            iValue = ReturnStatus.RETURN_STATUS_AUDIO_DEVICE_FORMAT_NOT_SUPPORT.value();
                        } else {
                            iValue = NativeRTCVideoFunctions.nativePushExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioSampleRate.value(), audioFrame.channel.value());
                        }
                    }
                } else {
                    LogUtil.e("RtcVideoImpl", "native engine is invalid, pushExternalAudioFrame failed.");
                    iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iValue = ReturnStatus.RETURN_STATUS_AUDIO_DEVICE_FORMAT_NOT_SUPPORT.value();
            }
            this.mJniReadLock.unlock();
            return iValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int pushExternalVideoFrame(VideoFrame videoFrame) {
        return pushExternalVideoFrame(videoFrame, this.mIsUseCustomEglEnv);
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int pushScreenAudioFrame(AudioFrame audioFrame) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                iValue = NativeRTCVideoFunctions.nativePushScreenAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
            } else {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, PushScreenAudioFrame failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            }
            this.mJniReadLock.unlock();
            return iValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        int iNativeSetAudioFrameObserver;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, registerAudioFrameObserver failed.");
                iNativeSetAudioFrameObserver = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioFrameObserver = NativeRTCVideoFunctions.nativeSetAudioFrameObserver(this.mNativeEngine, iAudioFrameObserver);
            }
            this.mJniReadLock.unlock();
            return iNativeSetAudioFrameObserver;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int registerAudioProcessor(IAudioFrameProcessor iAudioFrameProcessor) {
        int iNativeSetAudioFrameProcessor;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, registerAudioProcessor failed.");
                iNativeSetAudioFrameProcessor = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioFrameProcessor = NativeRTCVideoFunctions.nativeSetAudioFrameProcessor(this.mNativeEngine, iAudioFrameProcessor);
            }
            this.mJniReadLock.unlock();
            return iNativeSetAudioFrameProcessor;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver) {
        int iNativeRegisterLocalEncodedVideoFrameObserver;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, registerAudioFrameObserver failed.");
                iNativeRegisterLocalEncodedVideoFrameObserver = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mLocalEncodedVideoFrameObserver = iLocalEncodedVideoFrameObserver;
                if (iLocalEncodedVideoFrameObserver == null) {
                    iNativeRegisterLocalEncodedVideoFrameObserver = NativeRTCVideoFunctions.nativeRegisterLocalEncodedVideoFrameObserver(this.mNativeEngine, null);
                } else {
                    iNativeRegisterLocalEncodedVideoFrameObserver = NativeRTCVideoFunctions.nativeRegisterLocalEncodedVideoFrameObserver(this.mNativeEngine, this.mRtcLocalEncodedVideoFrameObserver);
                }
            }
            this.mJniReadLock.unlock();
            return iNativeRegisterLocalEncodedVideoFrameObserver;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int registerRemoteEncodedVideoFrameObserver(IRemoteEncodedVideoFrameObserver iRemoteEncodedVideoFrameObserver) {
        int iNativeRegisterRemoteEncodedVideoFrameObserver;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, RegisterRemoteEncodedVideoFrameObserver failed.");
                iNativeRegisterRemoteEncodedVideoFrameObserver = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mRemoteEncodedVideoFrameObserver = iRemoteEncodedVideoFrameObserver;
                if (iRemoteEncodedVideoFrameObserver == null) {
                    iNativeRegisterRemoteEncodedVideoFrameObserver = NativeRTCVideoFunctions.nativeRegisterRemoteEncodedVideoFrameObserver(this.mNativeEngine, null);
                } else {
                    iNativeRegisterRemoteEncodedVideoFrameObserver = NativeRTCVideoFunctions.nativeRegisterRemoteEncodedVideoFrameObserver(this.mNativeEngine, this.mRtcRemoteEncodedVideoFrameObserver);
                }
            }
            this.mJniReadLock.unlock();
            return iNativeRegisterRemoteEncodedVideoFrameObserver;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int requestRemoteVideoKeyFrame(StreamKey streamKey) {
        int iNativeRequestRemoteVideoKeyFrame;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, RequestRemoteVideoKeyFrame failed.");
                iNativeRequestRemoteVideoKeyFrame = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeRequestRemoteVideoKeyFrame = NativeRTCVideoFunctions.nativeRequestRemoteVideoKeyFrame(this.mNativeEngine, streamKey.getRoomId(), streamKey.getUserId(), streamKey.getStreamIndex().value());
            }
            this.mJniReadLock.unlock();
            return iNativeRequestRemoteVideoKeyFrame;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), runnable);
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setAudioRenderType(AudioRenderType audioRenderType) {
        int iNativeSetAudioRenderType;
        LogUtil.d("RtcVideoImpl", "SetAudioRenderType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetAudioRenderType failed.");
                iNativeSetAudioRenderType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioRenderType = NativeRTCVideoFunctions.nativeSetAudioRenderType(this.mNativeEngine, audioRenderType.value());
            }
            this.mJniReadLock.unlock();
            return iNativeSetAudioRenderType;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setAudioScene(AudioSceneType audioSceneType) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAudioScene...audioScene: ");
        sbLIZ.append(audioSceneType);
        LogUtil.d("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setAudioScene failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            int iNativeSetAudioScene = NativeRTCVideoFunctions.nativeSetAudioScene(this.mNativeEngine, audioSceneType.value);
            this.mJniReadLock.unlock();
            return iNativeSetAudioScene;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setAudioSourceType(AudioSourceType audioSourceType) {
        int iNativeSetAudioSourceType;
        LogUtil.d("RtcVideoImpl", "SetAudioSourceType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetAudioSourceType failed.");
                iNativeSetAudioSourceType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioSourceType = NativeRTCVideoFunctions.nativeSetAudioSourceType(this.mNativeEngine, audioSourceType.value());
            }
            this.mJniReadLock.unlock();
            return iNativeSetAudioSourceType;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setBusinessId(String str) {
        int iNativeSetBusinessId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setBusinessId failed.");
                iNativeSetBusinessId = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetBusinessId = NativeRTCVideoFunctions.nativeSetBusinessId(this.mNativeEngine, str);
            }
            this.mJniReadLock.unlock();
            return iNativeSetBusinessId;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setCellularEnhancement(MediaTypeEnhancementConfig mediaTypeEnhancementConfig) {
        LogUtil.d("RtcVideoImpl", "setCellularEnhancement");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                int iNativeSetCellularEnhancement = NativeRTCVideoFunctions.nativeSetCellularEnhancement(this.mNativeEngine, new InternalMediaTypeEnhancementConfig(mediaTypeEnhancementConfig));
                this.mJniReadLock.unlock();
                return iNativeSetCellularEnhancement;
            }
            LogUtil.e("RtcVideoImpl", "native engine is invalid, setCellularEnhancement failed.");
            this.mJniReadLock.unlock();
            return -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setDefaultAudioRoute(AudioRoute audioRoute) {
        int iNativeSetDefaultAudioRoute;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDefaultAudioRoute: ");
        sbLIZ.append(audioRoute.value());
        LogUtil.d("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setDefaultAudioRoute failed.");
                iNativeSetDefaultAudioRoute = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetDefaultAudioRoute = NativeRTCVideoFunctions.nativeSetDefaultAudioRoute(this.mNativeEngine, audioRoute.value());
            }
            this.mJniReadLock.unlock();
            return iNativeSetDefaultAudioRoute;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setExternalVideoEncoderEventHandler(IExternalVideoEncoderEventHandler iExternalVideoEncoderEventHandler) {
        int iNativeSetExternalVideoEncoderEventHandler;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setExternalVideoEncoderEventHandler failed.");
                iNativeSetExternalVideoEncoderEventHandler = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mExternalVideoEncoderHandler = iExternalVideoEncoderEventHandler;
                if (iExternalVideoEncoderEventHandler == null) {
                    iNativeSetExternalVideoEncoderEventHandler = NativeRTCVideoFunctions.nativeSetExternalVideoEncoderEventHandler(this.mNativeEngine, null);
                } else {
                    iNativeSetExternalVideoEncoderEventHandler = NativeRTCVideoFunctions.nativeSetExternalVideoEncoderEventHandler(this.mNativeEngine, this.mRtcExVideoEncoderHandler);
                }
            }
            this.mJniReadLock.unlock();
            return iNativeSetExternalVideoEncoderEventHandler;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setOnDestroyCompletedCallback(Runnable runnable) {
        this.mOnDestroyCompletedCallback = runnable;
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setPerformanceGrade(StrategyGrade strategyGrade) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPerformanceGrade...grade: ");
        sbLIZ.append(strategyGrade);
        LogUtil.d("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setPerformanceGrade failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            int iNativeSetPerformanceGrade = NativeRTCVideoFunctions.nativeSetPerformanceGrade(this.mNativeEngine, strategyGrade.value());
            this.mJniReadLock.unlock();
            return iNativeSetPerformanceGrade;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setPlaybackVolume(int i) {
        int iNativeSetPlaybackVolume;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setPlaybackVolume failed.");
                iNativeSetPlaybackVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetPlaybackVolume = NativeRTCVideoFunctions.nativeSetPlaybackVolume(this.mNativeEngine, i);
            }
            this.mJniReadLock.unlock();
            return iNativeSetPlaybackVolume;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setPublishFallbackOption(PublishFallbackOption publishFallbackOption) {
        int iNativeSetPublishFallbackOption;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPublishFallbackOption: option: ");
        sbLIZ.append(publishFallbackOption);
        LogUtil.d("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setPublishFallbackOption failed.");
                iNativeSetPublishFallbackOption = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetPublishFallbackOption = NativeRTCVideoFunctions.nativeSetPublishFallbackOption(this.mNativeEngine, publishFallbackOption.value());
            }
            this.mJniReadLock.unlock();
            return iNativeSetPublishFallbackOption;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public void setRtcScene(RtcScene rtcScene) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRtcScene...rtcScene: ");
        sbLIZ.append(rtcScene);
        LogUtil.d("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setRtcScene failed.");
                this.mJniReadLock.unlock();
            } else {
                if (rtcScene != null) {
                    NativeRTCVideoFunctions.nativeSetRtcScene(this.mNativeEngine, rtcScene.value());
                }
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRtcVideoEventHandler(IRTCVideoEventHandler iRTCVideoEventHandler) {
        LogUtil.d("RtcVideoImpl", "setRtcEngineEventHandler");
        this.mRtcEngineHandler = iRTCVideoEventHandler;
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRuntimeParameters(JSONObject jSONObject) {
        String strJ3;
        int iNativeSetRuntimeParameters;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetRuntimeParameters failed.");
                iNativeSetRuntimeParameters = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                long j = this.mNativeEngine;
                if (jSONObject == null) {
                    strJ3 = "";
                } else {
                    strJ3 = C786410Ut5.J3(jSONObject);
                }
                iNativeSetRuntimeParameters = NativeRTCVideoFunctions.nativeSetRuntimeParameters(j, strJ3);
            }
            this.mJniReadLock.unlock();
            return iNativeSetRuntimeParameters;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setSEICurrentShiftDiffTime(long j) {
        int iNativeSetSEICurrentShiftDiffTime;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setSEICurrentShiftDiffTime failed.");
                iNativeSetSEICurrentShiftDiffTime = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetSEICurrentShiftDiffTime = NativeRTCVideoFunctions.nativeSetSEICurrentShiftDiffTime(this.mNativeEngine, j);
            }
            this.mJniReadLock.unlock();
            return iNativeSetSEICurrentShiftDiffTime;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setScreenAudioSourceType(AudioSourceType audioSourceType) {
        int iNativeSetScreenAudioSourceType;
        LogUtil.d("RtcVideoImpl", "SetScreenAudioSourceType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetScreenAudioSourceType failed.");
                iNativeSetScreenAudioSourceType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetScreenAudioSourceType = NativeRTCVideoFunctions.nativeSetScreenAudioSourceType(this.mNativeEngine, audioSourceType.value());
            }
            this.mJniReadLock.unlock();
            return iNativeSetScreenAudioSourceType;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setScreenAudioStreamIndex(StreamIndex streamIndex) {
        int iNativeSetScreenAudioStreamIndex;
        this.mJniReadLock.lock();
        try {
            LogUtil.d("RtcVideoImpl", "SetScreenAudioStreamIndex");
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetScreenAudioStreamIndex failed.");
                iNativeSetScreenAudioStreamIndex = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetScreenAudioStreamIndex = NativeRTCVideoFunctions.nativeSetScreenAudioStreamIndex(this.mNativeEngine, streamIndex.value());
            }
            this.mJniReadLock.unlock();
            return iNativeSetScreenAudioStreamIndex;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public void setStrategyInfo(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setStrategyInfo deviceInfoJsonStr: ");
        sbLIZ.append(str);
        LogUtil.d("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setStrategyInfo failed.");
                this.mJniReadLock.unlock();
            } else {
                if (str != null) {
                    NativeRTCVideoFunctions.nativeSetStrategyInfo(this.mNativeEngine, str);
                }
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions) {
        int iNativeSetRemoteSubscribeFallbackOption;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRemoteSubscribeFallbackOption: option: ");
        sbLIZ.append(subscribeFallbackOptions);
        LogUtil.d("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setRemoteSubscribeFallbackOption failed.");
                iNativeSetRemoteSubscribeFallbackOption = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteSubscribeFallbackOption = NativeRTCVideoFunctions.nativeSetRemoteSubscribeFallbackOption(this.mNativeEngine, subscribeFallbackOptions.value());
            }
            this.mJniReadLock.unlock();
            return iNativeSetRemoteSubscribeFallbackOption;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoCaptureConfig(VideoCaptureConfig videoCaptureConfig) {
        int iNativeSetVideoCaptureConfig;
        this.mJniReadLock.lock();
        try {
            if (videoCaptureConfig == null) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid or videoCaptureConfig is null, setVideoCaptureConfig failed.");
                iNativeSetVideoCaptureConfig = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid or videoCaptureConfig is null, setVideoCaptureConfig failed.");
                iNativeSetVideoCaptureConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setVideoCaptureConfig: ");
                sbLIZ.append(videoCaptureConfig.toString());
                LogUtil.d("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ));
                iNativeSetVideoCaptureConfig = NativeRTCVideoFunctions.nativeSetVideoCaptureConfig(this.mNativeEngine, new InternalVideoCaptureConfig(videoCaptureConfig.capturePreference.getValue(), videoCaptureConfig.width, videoCaptureConfig.height, videoCaptureConfig.frameRate));
            }
            this.mJniReadLock.unlock();
            return iNativeSetVideoCaptureConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoEncoderConfig(VideoEncoderConfig[] videoEncoderConfigArr) {
        int iNativeSetVideoEncoderConfigV2;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoEncoderConfig failed.");
                iNativeSetVideoEncoderConfigV2 = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoEncoderConfigArr == null) {
                iNativeSetVideoEncoderConfigV2 = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ArrayList arrayList = new ArrayList();
                int length = videoEncoderConfigArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        VideoEncoderConfig videoEncoderConfig = videoEncoderConfigArr[i];
                        if (!videoEncoderConfig.isValid()) {
                            LogUtil.e("RtcVideoImpl", "setVideoEncoderConfig with illegal params");
                            iNativeSetVideoEncoderConfigV2 = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                            break;
                        }
                        arrayList.add(new InternalVideoEncoderConfig(videoEncoderConfig));
                        i++;
                    } else {
                        iNativeSetVideoEncoderConfigV2 = NativeRTCVideoFunctions.nativeSetVideoEncoderConfigV2(this.mNativeEngine, arrayList);
                        break;
                    }
                }
            }
            this.mJniReadLock.unlock();
            return iNativeSetVideoEncoderConfigV2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public void setVideoStrategyRunner(IVideoStrategyRunner iVideoStrategyRunner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVideoStrategyRunner...videoStrategyRunner: ");
        sbLIZ.append(iVideoStrategyRunner);
        LogUtil.d("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoStrategyRunner failed.");
                this.mJniReadLock.unlock();
            } else {
                NativeRTCVideoFunctions.nativeSetVideoStrategyRunner(this.mNativeEngine, iVideoStrategyRunner);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface, X.InterfaceC1276010jJH
    public int stopPushStreamToCDN(String str) {
        int iNativeStopPushStreamToCDN;
        LogUtil.d("RtcVideoImpl", "stopPushStreamToCDN...");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopPushStreamToCDN failed.");
                iNativeStopPushStreamToCDN = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopPushStreamToCDN = NativeRTCVideoFunctions.nativeStopPushStreamToCDN(this.mNativeEngine, str);
            }
            this.mJniReadLock.unlock();
            return iNativeStopPushStreamToCDN;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int stopPushVideoFile(StreamIndex streamIndex) {
        int iNativeStopPushVideoFileWithStreamId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopPushVideoFile failed.");
                iNativeStopPushVideoFileWithStreamId = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopPushVideoFileWithStreamId = NativeRTCVideoFunctions.nativeStopPushVideoFileWithStreamId(this.mNativeEngine, streamIndex.value());
            }
            this.mJniReadLock.unlock();
            return iNativeStopPushVideoFileWithStreamId;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig) {
        return setVideoEncoderConfig(new VideoEncoderConfig[]{videoEncoderConfig});
    }

    private int checkImageWaterValid(MixedStreamConfig.MixedStreamLayoutConfig mixedStreamLayoutConfig, StringBuilder sb) {
        if (mixedStreamLayoutConfig != null && mixedStreamLayoutConfig.getRegions() != null) {
            MixedStreamConfig.MixedStreamLayoutRegionConfig[] regions = mixedStreamLayoutConfig.getRegions();
            for (int i = 0; i < regions.length; i++) {
                MixedStreamConfig.MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig = regions[i];
                if (mixedStreamLayoutRegionConfig.getRegionContentType() == MixedStreamConfig.MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_IMAGE && mixedStreamLayoutRegionConfig.getImageWaterMarkConfig() != null && mixedStreamLayoutRegionConfig.getImageWaterMark() != null) {
                    int imageHeight = mixedStreamLayoutRegionConfig.getImageWaterMarkConfig().getImageHeight();
                    int imageWidth = mixedStreamLayoutRegionConfig.getImageWaterMarkConfig().getImageWidth();
                    if (mixedStreamLayoutRegionConfig.getImageWaterMark().length < imageHeight * imageWidth * 4) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            ReturnStatus returnStatus = ReturnStatus.RETURN_STATUS_PARAMETER_ERR;
                            jSONObject.put("error_code", returnStatus.value());
                            jSONObject.put("index", i);
                            jSONObject.put("actual_length", mixedStreamLayoutRegionConfig.getImageWaterMark().length);
                            jSONObject.put("param_width", imageWidth);
                            jSONObject.put("param_height", imageHeight);
                            sb.append(jSONObject);
                            return returnStatus.value();
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
            return ReturnStatus.RETURN_STATUS_SUCCESS.value();
        }
        return ReturnStatus.RETURN_STATUS_SUCCESS.value();
    }

    private void initEglContext(Object obj, GLESVersion gLESVersion) {
        if (gLESVersion != null && gLESVersion != GLESVersion.GLES_VERSION_UNKNOWN) {
            EglBase.EglVersion.setPreferredEglVersion(gLESVersion.value());
        } else {
            EglBase.EglVersion.setPreferredEglVersion(2);
        }
        if (obj == null) {
            this.mRootEglBase = C1280730jQt.LIZ();
            this.mIsUseCustomEglEnv = false;
            return;
        }
        if (obj instanceof EGLContext) {
            this.mRootEglBase = C1280730jQt.LIZLLL((EGLContext) obj, C1280730jQt.LJIIJ(2, EglBase.Config.CONFIG_PLAIN));
        } else if (obj instanceof android.opengl.EGLContext) {
            this.mRootEglBase = C1280730jQt.LJFF((android.opengl.EGLContext) obj, C1280730jQt.LJIIJ(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_PLAIN));
        } else if (obj instanceof EglBase) {
            EglBase eglBase = (EglBase) obj;
            this.mRootEglBase = C1280730jQt.LIZJ(eglBase.getEglBaseContext(), C1280730jQt.LJIIJ(eglBase.getGLESVersion(), EglBase.Config.CONFIG_PLAIN));
        } else {
            this.mRootEglBase = C1280730jQt.LIZ();
        }
        this.mIsUseCustomEglEnv = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(Object obj, GLESVersion gLESVersion) {
        C1C7U.LIZ("RTCVideoImpl@9779.<init>$1L");
        initEglContext(obj, gLESVersion);
        this.mRootEglBase.createDummyPbufferSurface();
        this.mRootEglBase.makeCurrent();
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetCurrentDisplay(), this.mRootEglBase.getEglBaseContext().getEgl14Context(), 12440, iArr, 0);
        int i = iArr[0];
        if (i != 2 && i != 3) {
            iArr[0] = this.mRootEglBase.getGLESVersion();
        }
        this.mRootEglVersion = iArr[0];
        NativeRTCVideoFunctions.nativeSetHardWareEncodeContext();
        this.mRootEglBase.detachCurrent();
        C1C7U.LIZIZ("RTCVideoImpl@9779.<init>$1L");
    }

    public static /* synthetic */ void lambda$pushExternalVideoFrame$5(VideoFrame videoFrame, CountDownLatch countDownLatch) {
        C1C7U.LIZ("RTCVideoImpl@9779.pushExternalVideoFrame$1L");
        videoFrame.release();
        countDownLatch.countDown();
        C1C7U.LIZIZ("RTCVideoImpl@9779.pushExternalVideoFrame$1L");
    }

    public static /* synthetic */ void lambda$pushExternalVideoFrame$6(VideoFrame videoFrame, CountDownLatch countDownLatch) {
        C1C7U.LIZ("RTCVideoImpl@9779.pushExternalVideoFrame$2L");
        videoFrame.release();
        countDownLatch.countDown();
        C1C7U.LIZIZ("RTCVideoImpl@9779.pushExternalVideoFrame$2L");
    }

    private void logApiEvent(String str, String str2) {
        if (!engineInvalid()) {
            NativeRTCVideoFunctions.nativeLogApiEvent(this.mNativeEngine, str, str2);
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int enableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod, AudioFormat audioFormat) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, enableAudioFrameCallback failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (audioFormat.channel != null && audioFormat.sampleRate != null) {
                iValue = NativeRTCVideoFunctions.nativeEnableAudioFrameCallback(this.mNativeEngine, audioFrameCallbackMethod.value(), audioFormat.sampleRate.value(), audioFormat.channel.value());
            } else {
                LogUtil.e("RtcVideoImpl", "channel or samplerate is invalid, enableAudioFrameCallback failed.");
                iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            }
            this.mJniReadLock.unlock();
            return iValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int enableAudioProcessor(AudioProcessorMethod audioProcessorMethod, AudioFormat audioFormat) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, enableAudioProcessor failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (audioFormat.channel != null && audioFormat.sampleRate != null) {
                iValue = NativeRTCVideoFunctions.nativeEnableAudioProcessor(this.mNativeEngine, audioProcessorMethod.value(), audioFormat.sampleRate.value(), audioFormat.channel.value(), audioFormat.samplesPerCall);
            } else {
                LogUtil.e("RtcVideoImpl", "channel or samplerate is invalid, enableAudioProcessor failed.");
                iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            }
            this.mJniReadLock.unlock();
            return iValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int enableAudioToAvatarMode(StreamIndex streamIndex, boolean z) {
        int iNativeEnableAudioToAvatarModeWithStreamId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, enableAudioToAvatarMode failed.");
                iNativeEnableAudioToAvatarModeWithStreamId = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableAudioToAvatarModeWithStreamId = NativeRTCVideoFunctions.nativeEnableAudioToAvatarModeWithStreamId(this.mNativeEngine, streamIndex.value(), z);
            }
            this.mJniReadLock.unlock();
            return iNativeEnableAudioToAvatarModeWithStreamId;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int enableSEISendE2EInfo(boolean z, int i) {
        int iNativeEnableSEISendE2EInfo;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, enableSEISendE2EInfo failed.");
                iNativeEnableSEISendE2EInfo = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableSEISendE2EInfo = NativeRTCVideoFunctions.nativeEnableSEISendE2EInfo(this.mNativeEngine, z, i);
            }
            this.mJniReadLock.unlock();
            return iNativeEnableSEISendE2EInfo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int pushExternalVideoFrame(StreamIndex streamIndex, final VideoFrame videoFrame) {
        int iValue;
        ReturnStatus returnStatusFromId;
        LogUtil.d("RtcVideoImpl", "pushExternalVideoFrame");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                if (videoFrame == null) {
                    LogUtil.i("RtcVideoImpl", "pushExternalVideoFrame: videoFrame is null, drop frame.");
                    iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    if (videoFrame instanceof LyraxVideoFrame) {
                        returnStatusFromId = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushLyraxVideoFrameEx(this.mNativeEngine, streamIndex.value(), (LyraxVideoFrame) videoFrame));
                    } else if (videoFrame.getFrameType() != VideoFrameType.RAW_MEMORY && !videoFrame.hasReleaseCallback()) {
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        videoFrame.retain();
                        GLTextureVideoFrameBuilder gLTextureVideoFrameBuilder = new GLTextureVideoFrameBuilder(videoFrame.getPixelFormat());
                        gLTextureVideoFrameBuilder.setTextureID(videoFrame.getTextureID());
                        gLTextureVideoFrameBuilder.setTextureMatrix(videoFrame.getTextureMatrix());
                        gLTextureVideoFrameBuilder.setEGLContext(videoFrame.getEGLContext());
                        gLTextureVideoFrameBuilder.setColorSpace(videoFrame.getColorSpace());
                        gLTextureVideoFrameBuilder.setWidth(videoFrame.getWidth());
                        gLTextureVideoFrameBuilder.setHeight(videoFrame.getHeight());
                        gLTextureVideoFrameBuilder.setRotation(videoFrame.getRotation());
                        gLTextureVideoFrameBuilder.setExternalDataInfo(videoFrame.getExternalDataInfo());
                        gLTextureVideoFrameBuilder.setExternalDataArray(videoFrame.getExternalDataArray());
                        gLTextureVideoFrameBuilder.setSupplementaryInfo(videoFrame.getSupplementaryInfo());
                        gLTextureVideoFrameBuilder.setTimeStampUs(videoFrame.getTimeStampUs());
                        gLTextureVideoFrameBuilder.setReleaseCallback(new Runnable() { // from class: X.0jLV
                            @Override // java.lang.Runnable
                            public final void run() {
                                RTCVideoImpl.lambda$pushExternalVideoFrame$6(videoFrame, countDownLatch);
                            }
                        });
                        VideoFrame videoFrameBuild = gLTextureVideoFrameBuilder.build();
                        returnStatusFromId = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushExternalVideoFrameEx(this.mNativeEngine, streamIndex.value(), videoFrameBuild));
                        videoFrameBuild.release();
                        if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 1000L)) {
                            LogUtil.w("RtcVideoImpl", "pushExternalVideoFrame: pushExternalVideoFrame timeout.");
                        }
                    } else {
                        returnStatusFromId = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushExternalVideoFrameEx(this.mNativeEngine, streamIndex.value(), videoFrame));
                    }
                    iValue = returnStatusFromId.value();
                }
            } else {
                LogUtil.e("RtcVideoImpl", "pushExternalVideoFrame: native engine is invalid, pushExternalVideoFrame failed.");
                videoFrame.release();
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            }
            this.mJniReadLock.unlock();
            return iValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setAudioContentType(StreamIndex streamIndex, AudioContentTypeConfig audioContentTypeConfig) {
        int iNativeSetAudioContentTypeEx;
        LogUtil.d("RtcVideoImpl", "SetAudioContentType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetAudioContentType failed.");
                iNativeSetAudioContentTypeEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioContentTypeEx = NativeRTCVideoFunctions.nativeSetAudioContentTypeEx(this.mNativeEngine, streamIndex.value(), audioContentTypeConfig.hasMic, audioContentTypeConfig.hasScreenAudio, audioContentTypeConfig.hasMediaPlayer);
            }
            this.mJniReadLock.unlock();
            return iNativeSetAudioContentTypeEx;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setAudioEncodeConfig(StreamIndex streamIndex, AudioEncodeConfig audioEncodeConfig) {
        int iNativeSetAudioEncodeConfigEx;
        LogUtil.d("RtcVideoImpl", "SetAudioEncodeConfig");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetAudioEncodeConfig failed.");
                iNativeSetAudioEncodeConfigEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioEncodeConfigEx = NativeRTCVideoFunctions.nativeSetAudioEncodeConfigEx(this.mNativeEngine, streamIndex.value(), audioEncodeConfig.codecType, audioEncodeConfig.encMode, audioEncodeConfig.channelNum, audioEncodeConfig.encBitrate, audioEncodeConfig.useDtx, audioEncodeConfig.useInbandfec, audioEncodeConfig.sampleRate, audioEncodeConfig.packetSize);
            }
            this.mJniReadLock.unlock();
            return iNativeSetAudioEncodeConfigEx;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setCaptureVolume(StreamIndex streamIndex, int i) {
        int iNativeSetCaptureVolume;
        LogUtil.d("RtcVideoImpl", "setCaptureVolume");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setCaptureVolume failed.");
                iNativeSetCaptureVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetCaptureVolume = NativeRTCVideoFunctions.nativeSetCaptureVolume(this.mNativeEngine, i, streamIndex.value());
            }
            this.mJniReadLock.unlock();
            return iNativeSetCaptureVolume;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setLiveBitrateGearTable(VideoEncoderConfig[] videoEncoderConfigArr, int i) {
        int iNativeSetLiveBitrateGearTable;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setLiveBitrateGearTable failed.");
                iNativeSetLiveBitrateGearTable = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoEncoderConfigArr == null) {
                iNativeSetLiveBitrateGearTable = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ArrayList arrayList = new ArrayList();
                int length = videoEncoderConfigArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        VideoEncoderConfig videoEncoderConfig = videoEncoderConfigArr[i2];
                        if (!videoEncoderConfig.isValid()) {
                            LogUtil.e("RtcVideoImpl", "setLiveBitrateGearTable with illegal params");
                            iNativeSetLiveBitrateGearTable = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                            break;
                        }
                        arrayList.add(new InternalVideoEncoderConfig(videoEncoderConfig));
                        i2++;
                    } else {
                        iNativeSetLiveBitrateGearTable = NativeRTCVideoFunctions.nativeSetLiveBitrateGearTable(this.mNativeEngine, arrayList, i);
                        break;
                    }
                }
            }
            this.mJniReadLock.unlock();
            return iNativeSetLiveBitrateGearTable;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setLocalStreamPriority(StreamIndex streamIndex, StreamPriority streamPriority) {
        LogUtil.d("RtcVideoImpl", "setLocalStreamPriority");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                int iNativeSetLocalStreamPriorityEx = NativeRTCVideoFunctions.nativeSetLocalStreamPriorityEx(this.mNativeEngine, streamIndex.value(), streamPriority.value());
                this.mJniReadLock.unlock();
                return iNativeSetLocalStreamPriorityEx;
            }
            LogUtil.e("RtcVideoImpl", "native engine is invalid, setLocalStreamPriority failed.");
            this.mJniReadLock.unlock();
            return -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas) {
        int iNativeSetLocalVideoCanvas;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setLocalVideoCanvas failed.");
                iNativeSetLocalVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                if (videoCanvas == null) {
                    videoCanvas = new VideoCanvas();
                }
                iNativeSetLocalVideoCanvas = NativeRTCVideoFunctions.nativeSetLocalVideoCanvas(this.mNativeEngine, streamIndex.value(), videoCanvas.renderView, videoCanvas.renderMode, videoCanvas.backgroundColor);
            }
            this.mJniReadLock.unlock();
            return iNativeSetLocalVideoCanvas;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public void setMixedStreamToCDNObserver(String str, IMixedStreamObserver iMixedStreamObserver) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMixedStreamToCDNObserver...taskId: ");
        sbLIZ.append(str);
        LogUtil.d("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setMixedStreamToCDNObserver failed.");
                this.mJniReadLock.unlock();
                return;
            }
            PushMixedStreamToCDNObserver pushMixedStreamToCDNObserver = this.mMixedStreamToCDNObserver;
            if (pushMixedStreamToCDNObserver != null) {
                pushMixedStreamToCDNObserver.setUserObserver(str, iMixedStreamObserver);
            }
            if (iMixedStreamObserver != null) {
                NativeRTCVideoFunctions.nativeSetMixedStreamToCDNObserver(this.mNativeEngine, str, this.mMixedStreamToCDNObserver);
            } else {
                NativeRTCVideoFunctions.nativeSetMixedStreamToCDNObserver(this.mNativeEngine, str, null);
            }
            this.mJniReadLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRemoteAudioPlaybackVolume(StreamKey streamKey, int i) {
        LogUtil.d("RtcVideoImpl", "setRemoteAudioPlaybackVolume");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                int iNativeSetRemoteAudioPlaybackVolumeEx = NativeRTCVideoFunctions.nativeSetRemoteAudioPlaybackVolumeEx(this.mNativeEngine, streamKey.getRoomId(), streamKey.getUserId(), streamKey.getStreamIndex().value(), i);
                this.mJniReadLock.unlock();
                return iNativeSetRemoteAudioPlaybackVolumeEx;
            }
            LogUtil.e("RtcVideoImpl", "native engine is invalid, setRemoteAudioPlaybackVolume failed.");
            this.mJniReadLock.unlock();
            return -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRemoteVideoRenderConfig(StreamKey streamKey, LyraxVideoRenderConfig lyraxVideoRenderConfig) {
        return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRemoteVideoSuperResolution(StreamKey streamKey, VideoSuperResolutionMode videoSuperResolutionMode) {
        int iNativeSetRemoteVideoSuperResolution;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRemoteVideoSuperResolution: ");
        sbLIZ.append(streamKey.toString());
        sbLIZ.append(" ");
        sbLIZ.append(videoSuperResolutionMode.toString());
        LogUtil.d("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setRemoteVideoSuperResolution failed.");
                iNativeSetRemoteVideoSuperResolution = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteVideoSuperResolution = NativeRTCVideoFunctions.nativeSetRemoteVideoSuperResolution(this.mNativeEngine, streamKey.getRoomId(), streamKey.getUserId(), streamKey.getStreamIndex().value(), videoSuperResolutionMode.value());
            }
            this.mJniReadLock.unlock();
            return iNativeSetRemoteVideoSuperResolution;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoCaptureConfig(StreamIndex streamIndex, VideoCaptureConfig videoCaptureConfig) {
        LogUtil.d("RtcVideoImpl", "setVideoCaptureConfig");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                int iNativeSetVideoCaptureConfigEx = NativeRTCVideoFunctions.nativeSetVideoCaptureConfigEx(this.mNativeEngine, streamIndex.value(), new InternalVideoCaptureConfig(videoCaptureConfig.capturePreference.getValue(), videoCaptureConfig.width, videoCaptureConfig.height, videoCaptureConfig.frameRate));
                this.mJniReadLock.unlock();
                return iNativeSetVideoCaptureConfigEx;
            }
            LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoCaptureConfig failed.");
            this.mJniReadLock.unlock();
            return -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoDecoderConfig(StreamKey streamKey, VideoDecoderConfig videoDecoderConfig) {
        int iNativeSetVideoDecoderConfig;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetVideoDecoderConfig failed.");
                iNativeSetVideoDecoderConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoDecoderConfig = NativeRTCVideoFunctions.nativeSetVideoDecoderConfig(this.mNativeEngine, streamKey.getRoomId(), streamKey.getUserId(), streamKey.getStreamIndex().value(), videoDecoderConfig.value());
            }
            this.mJniReadLock.unlock();
            return iNativeSetVideoDecoderConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoSource(StreamIndex streamIndex, InternalVideoSourceConfig internalVideoSourceConfig) {
        LogUtil.d("RtcVideoImpl", "setVideoSource");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                int iNativeSetVideoSourceEx = NativeRTCVideoFunctions.nativeSetVideoSourceEx(this.mNativeEngine, streamIndex.value(), internalVideoSourceConfig.getVideoSourceType(), internalVideoSourceConfig.getVideoSourceCategory());
                this.mJniReadLock.unlock();
                return iNativeSetVideoSourceEx;
            }
            LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoSource failed.");
            this.mJniReadLock.unlock();
            return -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoSourceType(StreamIndex streamIndex, VideoSourceType videoSourceType) {
        int iNativeSetVideoSourceTypeWithStreamId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoInputType failed.");
                iNativeSetVideoSourceTypeWithStreamId = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoSourceTypeWithStreamId = NativeRTCVideoFunctions.nativeSetVideoSourceTypeWithStreamId(this.mNativeEngine, streamIndex.value(), videoSourceType.value());
            }
            this.mJniReadLock.unlock();
            return iNativeSetVideoSourceTypeWithStreamId;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int startChorusCacheSync(ChorusCacheSyncConfig chorusCacheSyncConfig, IChorusCacheSyncObserver iChorusCacheSyncObserver) {
        int iNativeStartChorusCacheSync;
        this.mJniReadLock.lock();
        if (iChorusCacheSyncObserver != null) {
            try {
                this.mChorusObserver.setUserObserver(iChorusCacheSyncObserver);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mJniReadLock.unlock();
                throw th;
            }
        }
        LogUtil.d("RtcVideoImpl", "startChorusCacheSync...");
        if (chorusCacheSyncConfig == null) {
            LogUtil.d("RtcVideoImpl", "startChorusCacheSync...chorusConfig is null, no effect, please check.");
            iNativeStartChorusCacheSync = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        } else if (engineInvalid()) {
            LogUtil.e("RtcVideoImpl", "native engine is invalid, startChorusCacheSync failed.");
            iNativeStartChorusCacheSync = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        } else {
            iNativeStartChorusCacheSync = NativeRTCVideoFunctions.nativeStartChorusCacheSync(this.mNativeEngine, chorusCacheSyncConfig, this.mChorusObserver);
        }
        this.mJniReadLock.unlock();
        return iNativeStartChorusCacheSync;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int updateExternalStats(StreamIndex streamIndex, LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats) throws Throwable {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                try {
                    iValue = NativeRTCVideoFunctions.nativeUpdateExternalStats(this.mNativeEngine, streamIndex.value(), new PreProcessVideoNodeStats(lyraxPreProcessVideoNodeStats.frame_rate_camera_output, lyraxPreProcessVideoNodeStats.frame_rate_render_input, lyraxPreProcessVideoNodeStats.frame_rate_render_output, lyraxPreProcessVideoNodeStats.up_render_stall_100, lyraxPreProcessVideoNodeStats.up_render_stall_200, lyraxPreProcessVideoNodeStats.up_render_stall_500, lyraxPreProcessVideoNodeStats.average_bmf_process_time, lyraxPreProcessVideoNodeStats.average_effect_process_time, lyraxPreProcessVideoNodeStats.average_render_process_time, lyraxPreProcessVideoNodeStats.average_frame_interval_time, lyraxPreProcessVideoNodeStats.render_stall_details, lyraxPreProcessVideoNodeStats.effect_process_details, lyraxPreProcessVideoNodeStats.original_capture_width, lyraxPreProcessVideoNodeStats.original_capture_height, lyraxPreProcessVideoNodeStats.adapted_resolution_width, lyraxPreProcessVideoNodeStats.adapted_resolution_height));
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    this.mJniReadLock.unlock();
                    throw th;
                }
            } else {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, updateExternalStats failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            }
            this.mJniReadLock.unlock();
            return iValue;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface, X.InterfaceC1276010jJH
    public int updatePushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig) {
        int iNativeUpdatePushMixedStreamToCDN;
        this.mJniReadLock.lock();
        try {
            LogUtil.d("RtcVideoImpl", "updatePushMixedStreamToCDN...");
            if (mixedStreamConfig == null) {
                LogUtil.d("RtcVideoImpl", "updatePushMixedStreamToCDN...mLiveTranscoding is null, no effect, please check.");
                iNativeUpdatePushMixedStreamToCDN = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, updatePushMixedStreamToCDN failed.");
                iNativeUpdatePushMixedStreamToCDN = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                StringBuilder sb = new StringBuilder();
                if (checkImageWaterValid(mixedStreamConfig.getLayout(), sb) != 0) {
                    LogUtil.e("RtcVideoImpl", sb.toString());
                    logApiEvent("updatePushMixedStreamToCDNError", sb.toString());
                    iNativeUpdatePushMixedStreamToCDN = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else if (mixedStreamConfig.getTranscodeMessage() == null) {
                    iNativeUpdatePushMixedStreamToCDN = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    LogUtil.d("RtcVideoImpl", "updatePushMixedStreamToCDN...");
                    iNativeUpdatePushMixedStreamToCDN = NativeRTCVideoFunctions.nativeUpdatePushMixedStreamToCDN(this.mNativeEngine, str, mixedStreamConfig);
                }
            }
            this.mJniReadLock.unlock();
            return iNativeUpdatePushMixedStreamToCDN;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int pushExternalVideoFrame(final VideoFrame videoFrame, boolean z) {
        int iValue;
        ReturnStatus returnStatusFromId;
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                if (videoFrame == null) {
                    LogUtil.i("RtcVideoImpl", "pushExternalVideoFrame: videoFrame is null, drop frame.");
                    iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    if (videoFrame instanceof LyraxVideoFrame) {
                        returnStatusFromId = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushLyraxVideoFrame(this.mNativeEngine, (LyraxVideoFrame) videoFrame));
                    } else if (videoFrame.getFrameType() != VideoFrameType.RAW_MEMORY && !videoFrame.hasReleaseCallback()) {
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        videoFrame.retain();
                        GLTextureVideoFrameBuilder gLTextureVideoFrameBuilder = new GLTextureVideoFrameBuilder(videoFrame.getPixelFormat());
                        gLTextureVideoFrameBuilder.setTextureID(videoFrame.getTextureID());
                        gLTextureVideoFrameBuilder.setTextureMatrix(videoFrame.getTextureMatrix());
                        gLTextureVideoFrameBuilder.setEGLContext(videoFrame.getEGLContext());
                        gLTextureVideoFrameBuilder.setColorSpace(videoFrame.getColorSpace());
                        gLTextureVideoFrameBuilder.setWidth(videoFrame.getWidth());
                        gLTextureVideoFrameBuilder.setHeight(videoFrame.getHeight());
                        gLTextureVideoFrameBuilder.setRotation(videoFrame.getRotation());
                        gLTextureVideoFrameBuilder.setExternalDataInfo(videoFrame.getExternalDataInfo());
                        gLTextureVideoFrameBuilder.setSupplementaryInfo(videoFrame.getSupplementaryInfo());
                        gLTextureVideoFrameBuilder.setTimeStampUs(videoFrame.getTimeStampUs());
                        gLTextureVideoFrameBuilder.setExternalDataArray(videoFrame.getExternalDataArray());
                        gLTextureVideoFrameBuilder.setReleaseCallback(new Runnable() { // from class: X.0jLU
                            @Override // java.lang.Runnable
                            public final void run() {
                                RTCVideoImpl.lambda$pushExternalVideoFrame$5(videoFrame, countDownLatch);
                            }
                        });
                        VideoFrame videoFrameBuild = gLTextureVideoFrameBuilder.build();
                        returnStatusFromId = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushExternalByteRtcVideoFrame(this.mNativeEngine, videoFrameBuild));
                        videoFrameBuild.release();
                        if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 1000L)) {
                            LogUtil.w("RtcVideoImpl", "pushExternalVideoFrame: pushExternalVideoFrame timeout.");
                        }
                    } else {
                        returnStatusFromId = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushExternalByteRtcVideoFrame(this.mNativeEngine, videoFrame));
                    }
                    iValue = returnStatusFromId.value();
                }
            } else {
                LogUtil.e("RtcVideoImpl", "pushExternalVideoFrame: native engine is invalid, pushExternalVideoFrame failed.");
                videoFrame.release();
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            }
            this.mJniReadLock.unlock();
            return iValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(LogUtil.LogLevel logLevel, String str, Throwable th) {
        IRTCVideoEventHandler rtcEngineHandler = getRtcEngineHandler();
        if (rtcEngineHandler != null) {
            try {
                rtcEngineHandler.onLoggerMessage(logLevel, str, th);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int pushExternalEncodedVideoFrame(StreamIndex streamIndex, int i, RTCEncodedVideoFrame rTCEncodedVideoFrame) {
        int iNativePushExternalEncodedVideoFrame;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, PushExternalEncodedVideoFrame failed.");
                iNativePushExternalEncodedVideoFrame = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePushExternalEncodedVideoFrame = NativeRTCVideoFunctions.nativePushExternalEncodedVideoFrame(this.mNativeEngine, streamIndex.value(), i, rTCEncodedVideoFrame.buffer, rTCEncodedVideoFrame.timestampUs, rTCEncodedVideoFrame.timestampDtsUs, rTCEncodedVideoFrame.width, rTCEncodedVideoFrame.height, rTCEncodedVideoFrame.videoCodecType.value(), rTCEncodedVideoFrame.videoPictureType.value(), rTCEncodedVideoFrame.videoRotation.value());
            }
            this.mJniReadLock.unlock();
            return iNativePushExternalEncodedVideoFrame;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, int i) {
        VideoFrameSinkAdapter videoFrameSinkAdapter;
        int iNativeSetLocalVideoSink;
        this.mJniReadLock.lock();
        try {
            if (streamIndex == null) {
                LogUtil.e("RtcVideoImpl", "EventType: setLocalVideoSink, streamIndex is null");
                iNativeSetLocalVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setLocalVideoSink failed.");
                iNativeSetLocalVideoSink = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                if (iVideoSink == null) {
                    videoFrameSinkAdapter = null;
                } else {
                    videoFrameSinkAdapter = new VideoFrameSinkAdapter(iVideoSink);
                }
                iNativeSetLocalVideoSink = NativeRTCVideoFunctions.nativeSetLocalVideoSink(this.mNativeEngine, streamIndex.value(), videoFrameSinkAdapter, i);
            }
            this.mJniReadLock.unlock();
            return iNativeSetLocalVideoSink;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRemoteAudioPlaybackVolume(String str, String str2, int i) {
        int iNativeSetRemoteAudioPlaybackVolume;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setRemoteAudioPlaybackVolume failed.");
                iNativeSetRemoteAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (str == null) {
                LogUtil.e("RtcVideoImpl", "setRemoteAudioPlaybackVolume: roomId is null adjust failed");
                iNativeSetRemoteAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (str2 == null) {
                LogUtil.e("RtcVideoImpl", "setRemoteAudioPlaybackVolume: uid is null adjust failed");
                iNativeSetRemoteAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                iNativeSetRemoteAudioPlaybackVolume = NativeRTCVideoFunctions.nativeSetRemoteAudioPlaybackVolume(this.mNativeEngine, str, str2, i);
            }
            this.mJniReadLock.unlock();
            return iNativeSetRemoteAudioPlaybackVolume;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRemoteUserPriority(String str, String str2, RemoteUserPriority remoteUserPriority) {
        int iNativeSetRemoteUserPriority;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRemoteUserPriority: uid: ");
        sbLIZ.append(str2);
        sbLIZ.append(", priority: ");
        sbLIZ.append(remoteUserPriority);
        LogUtil.d("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setRemoteUserPriority failed.");
                iNativeSetRemoteUserPriority = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (str2 == null) {
                LogUtil.e("RtcVideoImpl", "setRemoteUserPriority: uid is null set failed");
                iNativeSetRemoteUserPriority = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                iNativeSetRemoteUserPriority = NativeRTCVideoFunctions.nativeSetRemoteUserPriority(this.mNativeEngine, str, str2, remoteUserPriority.value());
            }
            this.mJniReadLock.unlock();
            return iNativeSetRemoteUserPriority;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRemoteVideoSink(StreamKey streamKey, IVideoSink iVideoSink, int i) {
        VideoFrameSinkAdapter videoFrameSinkAdapter;
        int iNativeSetRemoteVideoSink;
        this.mJniReadLock.lock();
        try {
            if (streamKey == null) {
                LogUtil.e("RtcVideoImpl", "EventType: setupRemoteRenderInternal, streamKey is null");
                iNativeSetRemoteVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (streamKey.getStreamIndex() == null) {
                LogUtil.e("RtcVideoImpl", "EventType: setupRemoteRenderInternal, streamIndex is null");
                iNativeSetRemoteVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setRemoteVideoSink failed.");
                iNativeSetRemoteVideoSink = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                String roomId = streamKey.getRoomId();
                if (iVideoSink != null) {
                    videoFrameSinkAdapter = new VideoFrameSinkAdapter(iVideoSink);
                } else {
                    videoFrameSinkAdapter = null;
                }
                iNativeSetRemoteVideoSink = NativeRTCVideoFunctions.nativeSetRemoteVideoSink(this.mNativeEngine, roomId, streamKey.getUserId(), streamKey.getStreamIndex().value(), videoFrameSinkAdapter, i);
            }
            this.mJniReadLock.unlock();
            return iNativeSetRemoteVideoSink;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface, X.InterfaceC1276010jJH
    public int startPushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig, IMixedStreamObserver iMixedStreamObserver) {
        int iNativeStartPushMixedStreamToCDN;
        this.mJniReadLock.lock();
        try {
            LogUtil.d("RtcVideoImpl", "startPushMixedStreamToCDN...");
            if (mixedStreamConfig == null) {
                LogUtil.d("RtcVideoImpl", "startPushMixedStreamToCDN...liveTranscode is null, no effect, please check.");
                iNativeStartPushMixedStreamToCDN = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, enableLiveTranscoding failed.");
                iNativeStartPushMixedStreamToCDN = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (mixedStreamConfig.getTranscodeMessage() == null) {
                iNativeStartPushMixedStreamToCDN = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                StringBuilder sb = new StringBuilder();
                if (checkImageWaterValid(mixedStreamConfig.getLayout(), sb) != 0) {
                    LogUtil.e("RtcVideoImpl", sb.toString());
                    logApiEvent("startPushMixedStreamToCDNError", sb.toString());
                    iNativeStartPushMixedStreamToCDN = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    PushMixedStreamToCDNObserver pushMixedStreamToCDNObserver = this.mMixedStreamToCDNObserver;
                    if (pushMixedStreamToCDNObserver != null) {
                        pushMixedStreamToCDNObserver.setUserObserver(str, iMixedStreamObserver);
                    }
                    LogUtil.d("RtcVideoImpl", "startPushMixedStreamToCDN...");
                    iNativeStartPushMixedStreamToCDN = NativeRTCVideoFunctions.nativeStartPushMixedStreamToCDN(this.mNativeEngine, str, mixedStreamConfig, this.mMixedStreamToCDNObserver);
                }
            }
            this.mJniReadLock.unlock();
            return iNativeStartPushMixedStreamToCDN;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int startPushVideoFile(StreamIndex streamIndex, String str, boolean z) {
        int iNativeStartPushVideoFileWithStreamId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startPushVideoFile failed.");
                iNativeStartPushVideoFileWithStreamId = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartPushVideoFileWithStreamId = NativeRTCVideoFunctions.nativeStartPushVideoFileWithStreamId(this.mNativeEngine, streamIndex.value(), str, z);
            }
            this.mJniReadLock.unlock();
            return iNativeStartPushVideoFileWithStreamId;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public long createRTCVideo(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2) {
        return NativeRTCVideoFunctions.nativeCreateRTCVideo(context, str, rTCVideoEventHandler, str2);
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int sendSEIMessage(StreamIndex streamIndex, VideoExternalData videoExternalData, int i, SEICountPerFrame sEICountPerFrame) {
        int iNativeSendSEIMessageWithDataId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, sendSEIMessage failed.");
                iNativeSendSEIMessageWithDataId = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSendSEIMessageWithDataId = NativeRTCVideoFunctions.nativeSendSEIMessageWithDataId(this.mNativeEngine, streamIndex.value(), videoExternalData.getData(), i, sEICountPerFrame.value(), videoExternalData.getDataId());
            }
            this.mJniReadLock.unlock();
            return iNativeSendSEIMessageWithDataId;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoEncoderConfig(StreamIndex streamIndex, VideoSolutionMode videoSolutionMode, VideoEncoderConfig[] videoEncoderConfigArr, int i) {
        int iNativeSetVideoEncoderConfigWithSimulcast;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoEncoderConfig failed.");
                iNativeSetVideoEncoderConfigWithSimulcast = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoEncoderConfigArr == null) {
                iNativeSetVideoEncoderConfigWithSimulcast = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ArrayList arrayList = new ArrayList();
                int length = videoEncoderConfigArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        VideoEncoderConfig videoEncoderConfig = videoEncoderConfigArr[i2];
                        if (!videoEncoderConfig.isValid()) {
                            LogUtil.e("RtcVideoImpl", "setVideoEncoderConfig with illegal params");
                            iNativeSetVideoEncoderConfigWithSimulcast = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                            break;
                        }
                        arrayList.add(new InternalVideoEncoderConfig(videoEncoderConfig));
                        i2++;
                    } else {
                        iNativeSetVideoEncoderConfigWithSimulcast = NativeRTCVideoFunctions.nativeSetVideoEncoderConfigWithSimulcast(this.mNativeEngine, streamIndex.value(), videoSolutionMode.value(), arrayList, i);
                        break;
                    }
                }
            }
            this.mJniReadLock.unlock();
            return iNativeSetVideoEncoderConfigWithSimulcast;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoPerformanceConfig(StreamIndex streamIndex, int i, int i2, int i3) {
        int iNativeSetVideoPerformanceConfig;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoPerformanceConfig failed.");
                iNativeSetVideoPerformanceConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoPerformanceConfig = NativeRTCVideoFunctions.nativeSetVideoPerformanceConfig(this.mNativeEngine, streamIndex.value(), i, i2, i3);
            }
            this.mJniReadLock.unlock();
            return iNativeSetVideoPerformanceConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int startNetworkDetection(boolean z, int i, boolean z2, int i2) {
        int iNativeStartNetworkProbe;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, sendCustomMessage failed.");
                iNativeStartNetworkProbe = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartNetworkProbe = NativeRTCVideoFunctions.nativeStartNetworkProbe(this.mNativeEngine, z, i, z2, i2);
            }
            this.mJniReadLock.unlock();
            return iNativeStartNetworkProbe;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int switchToLinkmicWithConfig(StreamIndex streamIndex, VideoSolutionMode videoSolutionMode, VideoEncoderConfig[] videoEncoderConfigArr, int i) {
        setRtcScene(RtcScene.RTC_SCENE_LINK_MIC);
        return setVideoEncoderConfig(streamIndex, videoSolutionMode, videoEncoderConfigArr, i);
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i, SEICountPerFrame sEICountPerFrame) {
        int iNativeSendMultiSEIMessagePerVideoFrame;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, registerMetadataObserver failed.");
                iNativeSendMultiSEIMessagePerVideoFrame = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSendMultiSEIMessagePerVideoFrame = NativeRTCVideoFunctions.nativeSendMultiSEIMessagePerVideoFrame(this.mNativeEngine, streamIndex.value(), bArr, i, sEICountPerFrame.value());
            }
            this.mJniReadLock.unlock();
            return iNativeSendMultiSEIMessagePerVideoFrame;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int bindToStandardDowngradeTier(StreamIndex streamIndex, int i, int i2, int i3, int i4) {
        int iNativeBindToStandardDowngradeTier;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, bindToStandardDowngradeTier failed.");
                iNativeBindToStandardDowngradeTier = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeBindToStandardDowngradeTier = NativeRTCVideoFunctions.nativeBindToStandardDowngradeTier(this.mNativeEngine, streamIndex.value(), i, i2, i3, i4);
            }
            this.mJniReadLock.unlock();
            return iNativeBindToStandardDowngradeTier;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public RTCVideoImpl(Context context, String str, IRTCVideoEventHandler iRTCVideoEventHandler, Object obj, GLESVersion gLESVersion, JSONObject jSONObject) {
        this(context, str, iRTCVideoEventHandler, obj, gLESVersion, jSONObject, false);
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public synchronized LyraxVideoFrame getPooledFrame(VideoPixelFormat videoPixelFormat, int i, int i2, int i3, VideoRotation videoRotation, ColorSpace colorSpace) {
        this.mJniReadLock.lock();
        try {
            VideoFramePool videoFramePool = this.mVideoFramePool;
            if (videoFramePool == null) {
                VideoFramePool videoFramePool2 = new VideoFramePool(1, 3, videoPixelFormat, i, i2, i3, videoRotation, colorSpace);
                this.mVideoFramePool = videoFramePool2;
                LyraxVideoFrame lyraxVideoFrameAcquireFrame = videoFramePool2.acquireFrame();
                this.mJniReadLock.unlock();
                return lyraxVideoFrameAcquireFrame;
            }
            if (videoFramePool.isFramePoolEligible(videoPixelFormat, i, i2, i3, videoRotation, colorSpace)) {
                LyraxVideoFrame lyraxVideoFrameAcquireFrame2 = this.mVideoFramePool.acquireFrame();
                this.mJniReadLock.unlock();
                return lyraxVideoFrameAcquireFrame2;
            }
            this.mVideoFramePool.release();
            VideoFramePool videoFramePool3 = new VideoFramePool(1, 3, videoPixelFormat, i, i2, i3, videoRotation, colorSpace);
            this.mVideoFramePool = videoFramePool3;
            LyraxVideoFrame lyraxVideoFrameAcquireFrame3 = videoFramePool3.acquireFrame();
            this.mJniReadLock.unlock();
            return lyraxVideoFrameAcquireFrame3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public RTCVideoImpl(Context context, String str, IRTCVideoEventHandler iRTCVideoEventHandler, final Object obj, final GLESVersion gLESVersion, JSONObject jSONObject, boolean z) {
        String str2;
        int i;
        String strJ3;
        this.mRootEglVersion = 2;
        this.mIsFront = true;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        C0W9W c0w9w = new C0W9W() { // from class: com.ss.bytertc.engine.engineimpl.RTCVideoImpl.1
            private void bpea_origin_timer_run() {
                com_ss_bytertc_engine_engineimpl_RTCVideoImpl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_bytertc_engine_engineimpl_RTCVideoImpl$1__run$___twin___() {
                RTCVideoImpl.this.runOnUIThread(new Runnable() { // from class: com.ss.bytertc.engine.engineimpl.RTCVideoImpl.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C1C7U.LIZ("RTCVideoImpl@9779.<field>$1$1");
                        com_ss_bytertc_engine_engineimpl_RTCVideoImpl$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        C1C7U.LIZIZ("RTCVideoImpl@9779.<field>$1$1");
                    }

                    public void com_ss_bytertc_engine_engineimpl_RTCVideoImpl$1$1__run$___twin___() {
                        LogRecover.nativeSendLogRecoverRequest();
                    }

                    public static void com_ss_bytertc_engine_engineimpl_RTCVideoImpl$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC00291 runnableC00291) {
                        try {
                            runnableC00291.com_ss_bytertc_engine_engineimpl_RTCVideoImpl$1$1__run$___twin___();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                });
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                C1C7U.LIZ("RTCVideoImpl@9779.<field>$1");
                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                try {
                    com_ss_bytertc_engine_engineimpl_RTCVideoImpl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("RTCVideoImpl@9779.<field>$1");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    throw th;
                }
            }

            public static void com_ss_bytertc_engine_engineimpl_RTCVideoImpl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_ss_bytertc_engine_engineimpl_RTCVideoImpl$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        this.timerTask = c0w9w;
        this.mLoggerSink = new LogUtil.ILoggerSink() { // from class: X.0jLX
            @Override // com.ss.bytertc.engine.utils.LogUtil.ILoggerSink
            public final void onLoggerMessage(LogUtil.LogLevel logLevel, String str3, Throwable th) {
                this.LIZ.lambda$new$0(logLevel, str3, th);
            }
        };
        this.appStateCallback = new AppMonitor.Callback() { // from class: X.0jLg
            @Override // com.ss.bytertc.engine.utils.AppMonitor.Callback
            public final void callback(int i2) {
                this.LIZ.lambda$new$1(i2);
            }
        };
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create RtcEngineImpl with appId: ");
        sbLIZ.append(str);
        LogUtil.d("RtcVideoImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (mLibraryLoaded && str != null) {
            HandlerThread handlerThread = new HandlerThread("rtc_egl_thread");
            this.mEglThread = handlerThread;
            handlerThread.start();
            VideoSinkTask videoSinkTask = new VideoSinkTask();
            this.mVideoSinkTask = videoSinkTask;
            videoSinkTask.init();
            BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(this.mEglThread));
            this.mEglHandler = bPEAHandler;
            ThreadUtils.invokeAtFrontUninterruptibly(bPEAHandler, new Runnable() { // from class: X.0jLY
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$new$2(obj, gLESVersion);
                }
            });
            if (iRTCVideoEventHandler != null) {
                iRTCVideoEventHandler.onInitializedEngineEGL(GLESVersion.fromId(this.mRootEglVersion));
            }
            this.mContext = C786410Ut5.N3(context);
            this.mState = State.IDLE;
            this.mRtcEngineHandler = iRTCVideoEventHandler;
            LogUtil.setLoggerSink(this.mLoggerSink);
            this.mEngineEventHandler = new RTCVideoEventHandler(this);
            this.mVideoFrameConverter = new VideoFrameConverter();
            this.mScreenFrameConverter = new VideoFrameConverter();
            this.mRtcLocalEncodedVideoFrameObserver = new RTCLocalEncodedVideoFrameObserver(this);
            this.mRtcRemoteEncodedVideoFrameObserver = new RTCRemoteEncodedVideoFrameObserver(this);
            this.mTranscodingObserver = new LiveTranscodingObserver();
            this.mChorusObserver = new ChorusCacheSyncObserver();
            this.mMixedStreamToCDNObserver = new PushMixedStreamToCDNObserver();
            this.mRtcExVideoEncoderHandler = new RTCExternalVideoEncoderEventHandler(this);
            try {
                Context contextN3 = C786410Ut5.N3(this.mContext);
                RTCVideoEventHandler rTCVideoEventHandler = this.mEngineEventHandler;
                if (jSONObject == null) {
                    strJ3 = "";
                } else {
                    strJ3 = C786410Ut5.J3(jSONObject);
                }
                this.mNativeEngine = createRTCVideo(contextN3, str, rTCVideoEventHandler, strJ3);
                if (!engineInvalid()) {
                    timer.schedule(c0w9w, 1000L, 600000L);
                    AppMonitor.get(context).register(context, this.appStateCallback);
                    return;
                } else {
                    LogUtil.e("RtcVideoImpl", "create native engine error, native engine is invalid.");
                    throw new IllegalStateException("pthread key create fail");
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("rtc loader info:");
                sbLIZ2.append(sRtcLoaderInfo.toString());
                sbLIZ2.append(" exception info:");
                sbLIZ2.append(e.getStackTrace().toString());
                throw new UnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!mLibraryLoaded) {
            str2 = "rtc sdk load so failed";
            i = -1072;
        } else {
            str2 = "app id is null";
            i = -1005;
        }
        try {
            jSONObject2.put("event_key", "rtc_error");
            jSONObject2.put("rtc_app_id", str);
            jSONObject2.put("device_id", mDeviceId);
            jSONObject2.put("error_code", i);
            jSONObject2.put("message", str2);
            jSONObject2.put("timestamp", System.currentTimeMillis());
            jSONObject2.put("rtc_timestamp", System.currentTimeMillis());
            jSONObject2.put("os", "android");
            jSONObject2.put("product_line", "rtc");
            jSONObject2.put("report_version", 5);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (iRTCVideoEventHandler != null) {
            iRTCVideoEventHandler.onLogReport("live_webrtc_monitor_log", jSONObject2);
            iRTCVideoEventHandler.onError(i);
        }
        LogUtil.e("RtcVideoImpl", str2);
        throw new IllegalStateException("Create engine failed ".concat(str2));
    }
}
