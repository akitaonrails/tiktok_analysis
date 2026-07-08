package com.ss.bytertc.engine.engineimpl;

import X.C08FF;
import X.C2188811AlT;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.realx.base.Logging;
import com.bytedance.realx.video.EglBase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.BitRateTable;
import com.ss.bytertc.engine.GLESVersion;
import com.ss.bytertc.engine.IAudioFrameObserver;
import com.ss.bytertc.engine.IAudioFrameProcessor;
import com.ss.bytertc.engine.InternalVideoSourceConfig;
import com.ss.bytertc.engine.NetworkTimeInfo;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.RTCRoomImplV2;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.VideoCanvas;
import com.ss.bytertc.engine.VideoCodecDescription;
import com.ss.bytertc.engine.VideoDegradeConfig;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.VideoResolutionConfig;
import com.ss.bytertc.engine.data.AudioContentTypeConfig;
import com.ss.bytertc.engine.data.AudioEncodeConfig;
import com.ss.bytertc.engine.data.AudioFormat;
import com.ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.ss.bytertc.engine.data.AudioProcessorMethod;
import com.ss.bytertc.engine.data.AudioPropertiesConfig;
import com.ss.bytertc.engine.data.AudioRenderType;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.AudioSourceType;
import com.ss.bytertc.engine.data.ColorSpace;
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
import com.ss.bytertc.engine.handler.IExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.live.ChorusCacheSyncConfig;
import com.ss.bytertc.engine.live.IChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.loader.LyraxPluginConfig;
import com.ss.bytertc.engine.loader.RTCNativeLibraryListenerImpl;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderInfo;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener;
import com.ss.bytertc.engine.lyraxwrapper.LyraxEngineWrapper;
import com.ss.bytertc.engine.lyraxwrapper.LyraxUtils;
import com.ss.bytertc.engine.lyraxwrapper.LyraxVideoSinkWrapper;
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
import com.ss.bytertc.engine.type.VideoStrategyChannelParams;
import com.ss.bytertc.engine.type.VideoStrategyChannelResult;
import com.ss.bytertc.engine.type.VideoStrategyParams;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.IVideoStrategyResultListener;
import com.ss.bytertc.engine.video.IVideoStrategyRunner;
import com.ss.bytertc.engine.video.VideoCaptureConfig;
import com.ss.bytertc.engine.video.VideoDecoderConfig;
import com.ss.bytertc.engine.video.VideoExternalData;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.LyraxVideoFrame;
import com.ss.lyrax.ILyraxAudio;
import com.ss.lyrax.ILyraxEngine;
import com.ss.lyrax.ILyraxPublisher;
import com.ss.lyrax.ILyraxRoom;
import com.ss.lyrax.ILyraxSubscriber;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.audio.ILyraxAudioPlayer;
import com.ss.lyrax.audio.LyraxAudioChannel;
import com.ss.lyrax.audio.LyraxAudioCodecType;
import com.ss.lyrax.audio.LyraxAudioContentConfig;
import com.ss.lyrax.audio.LyraxAudioEncoderConfig;
import com.ss.lyrax.audio.LyraxAudioFrame;
import com.ss.lyrax.audio.LyraxAudioOption;
import com.ss.lyrax.audio.LyraxAudioPropertiesConfig;
import com.ss.lyrax.audio.LyraxAudioPropertiesMode;
import com.ss.lyrax.audio.LyraxAudioRenderType;
import com.ss.lyrax.audio.LyraxAudioReportMode;
import com.ss.lyrax.audio.LyraxAudioRoute;
import com.ss.lyrax.audio.LyraxAudioSampleRate;
import com.ss.lyrax.audio.LyraxAudioSceneType;
import com.ss.lyrax.audio.LyraxAudioSourceType;
import com.ss.lyrax.engine.ILyraxVideoStrategyRunner;
import com.ss.lyrax.engine.LyraxAndroidOption;
import com.ss.lyrax.engine.LyraxBusinessOption;
import com.ss.lyrax.engine.LyraxEglEnvironment;
import com.ss.lyrax.engine.LyraxEngineOption;
import com.ss.lyrax.engine.LyraxLiveType;
import com.ss.lyrax.engine.LyraxMediaEnhanceConfig;
import com.ss.lyrax.engine.LyraxNetworkOption;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.lyrax.engine.LyraxStrategyGrade;
import com.ss.lyrax.engine.LyraxVideoStrategyChannelParams;
import com.ss.lyrax.engine.LyraxVideoStrategyChannelResult;
import com.ss.lyrax.engine.LyraxVideoStrategyParams;
import com.ss.lyrax.engine.LyraxVideoStrategyResultListener;
import com.ss.lyrax.stream.LyraxStreamIndex;
import com.ss.lyrax.stream.LyraxStreamKey;
import com.ss.lyrax.subscriber.LyraxVideoRenderConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderParam;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.ILyraxVideoRenderer;
import com.ss.lyrax.video.ILyraxVideoRendererFactory;
import com.ss.lyrax.video.LyraxBitRateTable;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.lyrax.video.LyraxVideoBitrateGearTableItem;
import com.ss.lyrax.video.LyraxVideoCPUBufferFrameBuilder;
import com.ss.lyrax.video.LyraxVideoCodecConfig;
import com.ss.lyrax.video.LyraxVideoCodecMode;
import com.ss.lyrax.video.LyraxVideoCodecType;
import com.ss.lyrax.video.LyraxVideoColorSpace;
import com.ss.lyrax.video.LyraxVideoContentType;
import com.ss.lyrax.video.LyraxVideoDecoderConfig;
import com.ss.lyrax.video.LyraxVideoDecoderOutputType;
import com.ss.lyrax.video.LyraxVideoDegradeConfig;
import com.ss.lyrax.video.LyraxVideoEncoderConfig;
import com.ss.lyrax.video.LyraxVideoEncoderMode;
import com.ss.lyrax.video.LyraxVideoEncoderPreference;
import com.ss.lyrax.video.LyraxVideoEncoderProfile;
import com.ss.lyrax.video.LyraxVideoExtraData;
import com.ss.lyrax.video.LyraxVideoGLTextureFrameBuilder;
import com.ss.lyrax.video.LyraxVideoOption;
import com.ss.lyrax.video.LyraxVideoPerfDegradeLimit;
import com.ss.lyrax.video.LyraxVideoPixelFormat;
import com.ss.lyrax.video.LyraxVideoRendererManager;
import com.ss.lyrax.video.LyraxVideoResolutionConfig;
import com.ss.lyrax.video.LyraxVideoRotation;
import com.ss.lyrax.video.LyraxVideoSeiParamV1;
import com.ss.lyrax.video.LyraxVideoSourceConfig;
import com.ss.lyrax.video.LyraxVideoSourceType;
import com.ss.lyrax.video.LyraxVideoSuperResolutionMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class RTCVideoImplV2 extends RTCVideo {
    public static boolean sLibraryLoaded;
    public Context mContext;
    public LyraxEngineWrapper mLyraxEngineWrapper;
    public boolean mNegotiateVideoCodec;
    public volatile State mState;
    public static RTCNativeLibraryLoaderListener mRtcNativeLibraryListener = new RTCNativeLibraryListenerImpl();
    public static RTCNativeLibraryLoaderInfo sRtcLoaderInfo = new RTCNativeLibraryLoaderInfo();
    public final Map<String, RTCRoom> mRtcRooms = new ConcurrentHashMap();
    public final Map<String, String> mTaskMap = new ConcurrentHashMap();
    public ConcurrentHashMap<Integer, ILyraxAudioPlayer> mLyraxAudioPlayerMap = null;
    public boolean mEnableRemoveSceneNone = false;

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public RTCRoom getLivePusherRoom() {
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public String getLivePusherTaskId() {
        return "";
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public long getNativeHandle() {
        return 0L;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public LyraxVideoFrame getPooledFrame(VideoPixelFormat videoPixelFormat, int i, int i2, int i3, VideoRotation videoRotation, ColorSpace colorSpace) {
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public boolean isLyraxFrameEnabled() {
        return false;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public void setMixedStreamToCDNObserver(String str, IMixedStreamObserver iMixedStreamObserver) {
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setOnDestroyCompletedCallback(Runnable runnable) {
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setPublishFallbackOption(PublishFallbackOption publishFallbackOption) {
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRemoteUserPriority(String str, String str2, RemoteUserPriority remoteUserPriority) {
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public void setRtcScene(RtcScene rtcScene) {
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions) {
        return 0;
    }

    /* JADX INFO: renamed from: com.ss.bytertc.engine.engineimpl.RTCVideoImplV2$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$LyraxErrorCode;

        static {
            int[] iArr = new int[LyraxErrorCode.values().length];
            $SwitchMap$com$ss$lyrax$LyraxErrorCode = iArr;
            try {
                iArr[LyraxErrorCode.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$LyraxErrorCode[LyraxErrorCode.INVALID_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$LyraxErrorCode[LyraxErrorCode.INVALID_PARAMS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$LyraxErrorCode[LyraxErrorCode.NOT_SUPPORT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$LyraxErrorCode[LyraxErrorCode.FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
    }

    static {
        loadSoFile();
    }

    private LyraxVideoRendererManager getVideoRendererManager() {
        return this.mLyraxEngineWrapper.getVideoRendererManager();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int disableDownlinkAudioSelection() {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxEngine engine = this.mLyraxEngineWrapper.getEngine();
        return engine != null ? lyraxErrorToReturnStatus(engine.disableDownlinkAudioSelection()).value() : ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    public void doDestroy() {
        LogUtil.d("RTCVideoImplV2", "destroy RtcEngineImplV2");
        this.mLyraxEngineWrapper.getEngine().reportAPICall("java_doDestroy", "");
        this.mState = State.DESTORY;
        ConcurrentHashMap<Integer, ILyraxAudioPlayer> concurrentHashMap = this.mLyraxAudioPlayerMap;
        if (concurrentHashMap != null) {
            Iterator<ILyraxAudioPlayer> it2 = concurrentHashMap.values().iterator();
            while (it2.hasNext()) {
                it2.next().dispose();
            }
        }
        this.mLyraxEngineWrapper.dispose();
        LogUtil.setLoggerSink(null);
    }

    public ILyraxEngine getEngine() {
        LyraxEngineWrapper lyraxEngineWrapper = this.mLyraxEngineWrapper;
        if (lyraxEngineWrapper != null) {
            return lyraxEngineWrapper.getEngine();
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public NetworkTimeInfo getNetworkTimeInfo() {
        if (this.mState == State.DESTORY) {
            return null;
        }
        ILyraxEngine engine = this.mLyraxEngineWrapper.getEngine();
        NetworkTimeInfo networkTimeInfoCreate = NetworkTimeInfo.create();
        if (engine != null) {
            networkTimeInfoCreate.timestamp = engine.getNetworkTimeInfo();
        }
        return networkTimeInfoCreate;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int startAudioCapture() {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxAudio orCreateAudioModule = this.mLyraxEngineWrapper.getOrCreateAudioModule();
        return orCreateAudioModule != null ? lyraxErrorToReturnStatus(orCreateAudioModule.startAudioCapture()).value() : ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int stopAudioCapture() {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxAudio orCreateAudioModule = this.mLyraxEngineWrapper.getOrCreateAudioModule();
        return orCreateAudioModule != null ? lyraxErrorToReturnStatus(orCreateAudioModule.stopAudioCapture()).value() : ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int stopChorusCacheSync() {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int stopNetworkDetection() {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    public static void loadSoFile() {
        String soLibraryName = LyraxPluginConfig.getSoLibraryName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[LYRAX_SO_LOAD] RTCVideoImplV2.loadSoFile: soName=");
        sbLIZ.append(soLibraryName);
        sbLIZ.append(", pluginState=");
        sbLIZ.append(LyraxPluginConfig.getPluginState());
        LyraxPluginConfig.safeLogW("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
        if (sLibraryLoaded) {
            mRtcNativeLibraryListener.onLoadAlready(soLibraryName);
        } else {
            RTCNativeLibraryLoader rTCNativeLibraryLoader = RTCVideo.mRtcNativeLibraryLoader;
            if (rTCNativeLibraryLoader != null) {
                sLibraryLoaded = true;
                boolean zLoad = rTCNativeLibraryLoader.load("bytenn") & true;
                sLibraryLoaded = zLoad;
                boolean zLoad2 = zLoad & RTCVideo.mRtcNativeLibraryLoader.load(soLibraryName);
                sLibraryLoaded = zLoad2;
                if (zLoad2) {
                    mRtcNativeLibraryListener.onLoadSuccess(soLibraryName);
                } else {
                    mRtcNativeLibraryListener.onLoadError(soLibraryName);
                }
                sRtcLoaderInfo.setLoaderClassName(RTCVideo.mRtcNativeLibraryLoader.getClass().getSimpleName());
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Success to load native library: ");
                sbLIZ2.append(soLibraryName);
                LogUtil.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                try {
                    NativeLoader.INVOKESTATIC_com_ss_bytertc_engine_engineimpl_NativeLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                    NativeLoader.INVOKESTATIC_com_ss_bytertc_engine_engineimpl_NativeLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(soLibraryName);
                    sLibraryLoaded = true;
                    mRtcNativeLibraryListener.onLoadSuccess(soLibraryName);
                    sRtcLoaderInfo.setLoaderClassName("System.loader");
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Success to load native library: ");
                    sbLIZ3.append(soLibraryName);
                    LogUtil.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ3));
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Failed to load native library: ");
                    sbLIZ4.append(soLibraryName);
                    LogUtil.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ4), e);
                }
                mRtcNativeLibraryListener.onLoadError(soLibraryName);
            }
            sRtcLoaderInfo.setLoadResult(sLibraryLoaded);
            sRtcLoaderInfo.setLoadTimeStampMs(System.currentTimeMillis());
            sRtcLoaderInfo.setSdkVersion(RTCVideoImpl.getSDKVersion());
        }
        sRtcLoaderInfo.loadLibrary();
    }

    public List<ILyraxVideoRenderer> detachAllRemoteVideoRenderers() {
        ArrayList arrayList;
        LyraxVideoRendererManager videoRendererManager = getVideoRendererManager();
        if (videoRendererManager == null) {
            return new ArrayList();
        }
        synchronized (this.mLyraxEngineWrapper.getSubscriberAddSinkLock()) {
            try {
                ILyraxVideoRenderer[] iLyraxVideoRendererArrDetachAllVideoRenderers = videoRendererManager.detachAllVideoRenderers();
                arrayList = new ArrayList(iLyraxVideoRendererArrDetachAllVideoRenderers.length);
                for (ILyraxVideoRenderer iLyraxVideoRenderer : iLyraxVideoRendererArrDetachAllVideoRenderers) {
                    if (iLyraxVideoRenderer != null) {
                        arrayList.add(iLyraxVideoRenderer);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    public EglBase getEGLContext() {
        return LyraxEglEnvironment.getEGLContext();
    }

    public GLESVersion getGLESVersion() {
        return LyraxEglEnvironment.getGLESVersion();
    }

    public enum State {
        IDLE,
        IN_ROOM,
        DESTORY;

        public static State valueOf(String str) {
            return (State) C08FF.LIZ(State.class, str);
        }
    }

    public static LyraxVideoExtraData[] convertToLyraxVideoExternalDataArray(VideoExternalData[] videoExternalDataArr) {
        if (videoExternalDataArr == null) {
            return null;
        }
        LyraxVideoExtraData[] lyraxVideoExtraDataArr = new LyraxVideoExtraData[videoExternalDataArr.length];
        for (int i = 0; i < videoExternalDataArr.length; i++) {
            VideoExternalData videoExternalData = videoExternalDataArr[i];
            if (videoExternalData != null) {
                LyraxVideoExtraData lyraxVideoExtraData = new LyraxVideoExtraData();
                lyraxVideoExtraData.setChannelId(videoExternalData.getDataId());
                ByteBuffer data = videoExternalData.getData();
                if (data != null) {
                    data.rewind();
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(data.remaining());
                    byteBufferAllocateDirect.put(data);
                    byteBufferAllocateDirect.rewind();
                    lyraxVideoExtraData.setSeiData(byteBufferAllocateDirect);
                } else {
                    lyraxVideoExtraData.setSeiData(null);
                }
                lyraxVideoExtraDataArr[i] = lyraxVideoExtraData;
            }
        }
        return lyraxVideoExtraDataArr;
    }

    private LyraxStreamKey toLyraxRemoteStreamKey(StreamKey streamKey) {
        return new LyraxStreamKey("", streamKey.getRoomId(), streamKey.getUserId(), LyraxStreamIndex.fromId(streamKey.getStreamIndex().value()));
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public String buildRemoteVideoRenderId(StreamKey streamKey) {
        if (streamKey != null && streamKey.getStreamIndex() != null) {
            return this.mLyraxEngineWrapper.buildRenderId(toLyraxRemoteStreamKey(streamKey));
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public RTCRoom createRTCRoom(String str) {
        if (this.mState == State.DESTORY) {
            return null;
        }
        RTCRoomImplV2 rTCRoomImplV2 = new RTCRoomImplV2(this.mLyraxEngineWrapper.getOrCreateRoom(str), this.mLyraxEngineWrapper);
        this.mRtcRooms.put(str, rTCRoomImplV2);
        return rTCRoomImplV2;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public void detachRemoteVideoRenderer(StreamKey streamKey) {
        LyraxVideoRendererManager videoRendererManager;
        String strBuildRenderId;
        if (streamKey != null && (videoRendererManager = getVideoRendererManager()) != null && (strBuildRenderId = this.mLyraxEngineWrapper.buildRenderId(toLyraxRemoteStreamKey(streamKey))) != null && !strBuildRenderId.isEmpty()) {
            synchronized (this.mLyraxEngineWrapper.getSubscriberAddSinkLock()) {
                try {
                    ILyraxVideoRenderer iLyraxVideoRendererDetachVideoRenderer = videoRendererManager.detachVideoRenderer(strBuildRenderId);
                    if (iLyraxVideoRendererDetachVideoRenderer != null) {
                        iLyraxVideoRendererDetachVideoRenderer.release();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int disableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int disableAudioProcessor(AudioProcessorMethod audioProcessorMethod) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int enableAudioPropertiesReport(AudioPropertiesConfig audioPropertiesConfig) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        return lyraxErrorToReturnStatus(this.mLyraxEngineWrapper.getEngine().enableAudioPropertiesReport(new LyraxAudioPropertiesConfig(audioPropertiesConfig.interval, audioPropertiesConfig.enableSpectrum, audioPropertiesConfig.enableVad, LyraxAudioReportMode.fromId(audioPropertiesConfig.localMainReportMode.value()), audioPropertiesConfig.smooth, LyraxAudioPropertiesMode.fromId(audioPropertiesConfig.audioReportMode.value()), audioPropertiesConfig.enableVoicePitch))).value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int enableDownlinkAudioSelection(int i) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxEngine engine = this.mLyraxEngineWrapper.getEngine();
        if (engine != null) {
            return lyraxErrorToReturnStatus(engine.enableDownlinkAudioSelection(i)).value();
        }
        return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int enableSimulcastMode(boolean z) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    public ILyraxVideoRenderer findRemoteVideoRenderer(StreamKey streamKey) {
        LyraxVideoRendererManager videoRendererManager;
        String strBuildRenderId;
        if (streamKey == null || (videoRendererManager = getVideoRendererManager()) == null || (strBuildRenderId = this.mLyraxEngineWrapper.buildRenderId(toLyraxRemoteStreamKey(streamKey))) == null || strBuildRenderId.isEmpty()) {
            return null;
        }
        return videoRendererManager.findVideoRenderer(strBuildRenderId);
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public RTCRoom getLivePusherRoom(String str) {
        if (this.mState == State.DESTORY) {
            return null;
        }
        return this.mRtcRooms.get(str);
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public ILyraxAudioPlayer getLyraxAudioPlayer(int i) {
        if (this.mState == State.DESTORY || this.mLyraxEngineWrapper.getEngine() == null) {
            return null;
        }
        ConcurrentHashMap<Integer, ILyraxAudioPlayer> concurrentHashMap = this.mLyraxAudioPlayerMap;
        if (concurrentHashMap != null && concurrentHashMap.containsKey(Integer.valueOf(i))) {
            return this.mLyraxAudioPlayerMap.get(Integer.valueOf(i));
        }
        ILyraxAudio orCreateAudioModule = this.mLyraxEngineWrapper.getOrCreateAudioModule();
        if (orCreateAudioModule == null) {
            return null;
        }
        ILyraxAudioPlayer iLyraxAudioPlayerCreateAudioPlayer = orCreateAudioModule.createAudioPlayer();
        if (this.mLyraxAudioPlayerMap == null) {
            this.mLyraxAudioPlayerMap = new ConcurrentHashMap<>();
        }
        this.mLyraxAudioPlayerMap.put(Integer.valueOf(i), iLyraxAudioPlayerCreateAudioPlayer);
        return iLyraxAudioPlayerCreateAudioPlayer;
    }

    public ILyraxVideoRenderer getOrCreateRemoteVideoRenderer(StreamKey streamKey) {
        LyraxVideoRendererManager videoRendererManager;
        String strBuildRenderId;
        if (streamKey == null || (videoRendererManager = getVideoRendererManager()) == null || (strBuildRenderId = this.mLyraxEngineWrapper.buildRenderId(toLyraxRemoteStreamKey(streamKey))) == null || strBuildRenderId.isEmpty()) {
            return null;
        }
        return videoRendererManager.getVideoRenderer(strBuildRenderId);
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public View getRemoteVideoRenderTargetView(StreamKey streamKey) {
        ILyraxVideoRenderer remoteVideoRenderer = getRemoteVideoRenderer(streamKey);
        if (remoteVideoRenderer != null) {
            return remoteVideoRenderer.getRenderTargetView();
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public ILyraxVideoRenderer getRemoteVideoRenderer(StreamKey streamKey) {
        return findRemoteVideoRenderer(streamKey);
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public VideoCodecDescription[] getVideoTargetDecoderDescriptions(StreamIndex streamIndex) {
        if (this.mState == State.DESTORY) {
            return null;
        }
        List<LyraxVideoCodecConfig> videoTargetDecoderDescriptions = this.mLyraxEngineWrapper.getEngine().getVideoTargetDecoderDescriptions();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < videoTargetDecoderDescriptions.size(); i++) {
            arrayList.add(new VideoCodecDescription(((LyraxVideoCodecConfig) ListProtector.get(videoTargetDecoderDescriptions, i)).codecType.value(), ((LyraxVideoCodecConfig) ListProtector.get(videoTargetDecoderDescriptions, i)).codecMode.value()));
        }
        return (VideoCodecDescription[]) arrayList.toArray(new VideoCodecDescription[0]);
    }

    public ReturnStatus lyraxErrorToReturnStatus(LyraxErrorCode lyraxErrorCode) {
        ReturnStatus returnStatus = ReturnStatus.RETURN_STATUS_NOT_SUPPORT;
        int i = AnonymousClass2.$SwitchMap$com$ss$lyrax$LyraxErrorCode[lyraxErrorCode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i == 5) {
                        return ReturnStatus.RETURN_STATUS_FAILURE;
                    }
                    return returnStatus;
                }
                return ReturnStatus.RETURN_STATUS_PARAMETER_ERR;
            }
            return ReturnStatus.RETURN_STATUS_WRONG_STATE;
        }
        return ReturnStatus.RETURN_STATUS_SUCCESS;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int pullExternalAudioFrame(AudioFrame audioFrame) {
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int pushExternalAudioFrame(AudioFrame audioFrame) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        if (audioFrame == null) {
            LogUtil.e("RTCVideoImplV2", "audioFrame is null, pushExternalAudioFrame failed.");
            return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        }
        if (audioFrame.sampleRate == null) {
            LogUtil.e("RTCVideoImplV2", "sample rate is null, pushExternalAudioFrame failed.");
            return ReturnStatus.RETURN_STATUS_AUDIO_DEVICE_FORMAT_NOT_SUPPORT.value();
        }
        if (audioFrame.channel == null) {
            LogUtil.e("RTCVideoImplV2", "channel is null, pushExternalAudioFrame failed.");
            return ReturnStatus.RETURN_STATUS_AUDIO_DEVICE_FORMAT_NOT_SUPPORT.value();
        }
        ILyraxAudio audioModule = this.mLyraxEngineWrapper.getAudioModule();
        if (audioModule != null) {
            return lyraxErrorToReturnStatus(audioModule.pushExternalAudioFrame(new LyraxAudioFrame(audioFrame.buffer, audioFrame.samples, LyraxAudioSampleRate.fromId(audioFrame.sampleRate.value()), LyraxAudioChannel.fromId(audioFrame.channel.value()), audioFrame.timestamp_us))).value();
        }
        return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int pushExternalVideoFrame(VideoFrame videoFrame) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        return pushExternalVideoFrame(videoFrame, false);
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int pushScreenAudioFrame(AudioFrame audioFrame) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int registerAudioProcessor(IAudioFrameProcessor iAudioFrameProcessor) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int registerRemoteEncodedVideoFrameObserver(IRemoteEncodedVideoFrameObserver iRemoteEncodedVideoFrameObserver) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int requestRemoteVideoKeyFrame(StreamKey streamKey) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxSubscriber subscriber = this.mLyraxEngineWrapper.getSubscriber(streamKey);
        if (subscriber != null) {
            return lyraxErrorToReturnStatus(subscriber.requestVideoKeyFrame()).value();
        }
        return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setAudioRenderType(AudioRenderType audioRenderType) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxAudio orCreateAudioModule = this.mLyraxEngineWrapper.getOrCreateAudioModule();
        if (orCreateAudioModule != null) {
            return lyraxErrorToReturnStatus(orCreateAudioModule.setAudioRenderType(LyraxAudioRenderType.fromId(audioRenderType.value()))).value();
        }
        return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setAudioScene(AudioSceneType audioSceneType) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxAudio orCreateAudioModule = this.mLyraxEngineWrapper.getOrCreateAudioModule();
        if (orCreateAudioModule != null) {
            return lyraxErrorToReturnStatus(orCreateAudioModule.setAudioScene(LyraxAudioSceneType.fromId(audioSceneType.value()))).value();
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setAudioSourceType(AudioSourceType audioSourceType) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxAudio orCreateAudioModule = this.mLyraxEngineWrapper.getOrCreateAudioModule();
        if (orCreateAudioModule != null) {
            return lyraxErrorToReturnStatus(orCreateAudioModule.setAudioSourceType(LyraxAudioSourceType.fromId(audioSourceType.value()))).value();
        }
        return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setBusinessId(String str) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxEngine engine = this.mLyraxEngineWrapper.getEngine();
        if (engine != null) {
            return lyraxErrorToReturnStatus(engine.setBusinessID(str)).value();
        }
        return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setCellularEnhancement(MediaTypeEnhancementConfig mediaTypeEnhancementConfig) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxEngine engine = this.mLyraxEngineWrapper.getEngine();
        if (engine != null) {
            return lyraxErrorToReturnStatus(engine.setCellularEnhancement(new LyraxMediaEnhanceConfig(mediaTypeEnhancementConfig.enhanceSignaling, mediaTypeEnhancementConfig.enhanceAudio, mediaTypeEnhancementConfig.enhanceVideo, mediaTypeEnhancementConfig.enhanceScreenAudio, mediaTypeEnhancementConfig.enhanceScreenVideo))).value();
        }
        return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setDefaultAudioRoute(AudioRoute audioRoute) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxAudio orCreateAudioModule = this.mLyraxEngineWrapper.getOrCreateAudioModule();
        if (orCreateAudioModule != null) {
            return lyraxErrorToReturnStatus(orCreateAudioModule.setDefaultAudioRoute(LyraxAudioRoute.fromId(audioRoute.value()))).value();
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setExternalVideoEncoderEventHandler(IExternalVideoEncoderEventHandler iExternalVideoEncoderEventHandler) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    public void setGlobalSingleViewMode(boolean z) {
        LyraxVideoRendererManager videoRendererManager = getVideoRendererManager();
        if (videoRendererManager != null) {
            videoRendererManager.setGlobalSingleViewMode(z);
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setPerformanceGrade(StrategyGrade strategyGrade) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxEngine engine = this.mLyraxEngineWrapper.getEngine();
        if (engine != null) {
            return lyraxErrorToReturnStatus(engine.setPerformanceGrade(LyraxStrategyGrade.fromId(strategyGrade.value()))).value();
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setPlaybackVolume(int i) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxAudio orCreateAudioModule = this.mLyraxEngineWrapper.getOrCreateAudioModule();
        if (orCreateAudioModule != null) {
            return lyraxErrorToReturnStatus(orCreateAudioModule.setPlaybackVolume(i)).value();
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    public void setRemoteVideoRendererFactory(ILyraxVideoRendererFactory iLyraxVideoRendererFactory) {
        LyraxVideoRendererManager videoRendererManager;
        if (iLyraxVideoRendererFactory != null && (videoRendererManager = this.mLyraxEngineWrapper.getVideoRendererManager()) != null) {
            videoRendererManager.setVideoRendererFactory(iLyraxVideoRendererFactory);
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRtcVideoEventHandler(IRTCVideoEventHandler iRTCVideoEventHandler) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        this.mLyraxEngineWrapper.setUserVideoEventHandler(iRTCVideoEventHandler);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int setRuntimeParameters(org.json.JSONObject r22) {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.engineimpl.RTCVideoImplV2.setRuntimeParameters(org.json.JSONObject):int");
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setSEICurrentShiftDiffTime(long j) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxPublisher publisher = this.mLyraxEngineWrapper.getPublisher(StreamIndex.STREAM_INDEX_MAIN);
        if (publisher != null) {
            Logging.e("RTCVideoImplV2", "setSEICurrentShiftDiffTime");
            return lyraxErrorToReturnStatus(publisher.setCurrentShiftDiffTimeSEIV2(j)).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setScreenAudioSourceType(AudioSourceType audioSourceType) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setScreenAudioStreamIndex(StreamIndex streamIndex) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public void setStrategyInfo(String str) {
        ILyraxEngine engine;
        if (this.mState != State.DESTORY && (engine = this.mLyraxEngineWrapper.getEngine()) != null) {
            engine.setStrategyInfo(str);
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoCaptureConfig(VideoCaptureConfig videoCaptureConfig) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoEncoderConfig(VideoEncoderConfig[] videoEncoderConfigArr) {
        VideoSolutionMode videoSolutionMode;
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        if (videoEncoderConfigArr.length > 1) {
            videoSolutionMode = VideoSolutionMode.VIDEO_SOLUTION_MODE_SIMULCAST;
        } else {
            videoSolutionMode = VideoSolutionMode.VIDEO_SOLUTION_MODE_SINGLE;
        }
        return setVideoEncoderConfig(StreamIndex.STREAM_INDEX_MAIN, videoSolutionMode, videoEncoderConfigArr, videoEncoderConfigArr.length);
    }

    public int setVideoPlatformSource(ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper) {
        int iBindVideoPlatformWrapper;
        ILyraxEngine engine = this.mLyraxEngineWrapper.getEngine();
        if (engine == null) {
            Logging.w("RTCVideoImplV2", "setVideoPlatformSource: engine is null");
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVideoPlatformSource wrapper=");
        sbLIZ.append(iLyraxVideoPlatformWrapper);
        Logging.d("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
        if (iLyraxVideoPlatformWrapper == null) {
            iBindVideoPlatformWrapper = engine.unbindVideoPlatformWrapper();
        } else {
            iBindVideoPlatformWrapper = engine.bindVideoPlatformWrapper(iLyraxVideoPlatformWrapper);
        }
        LyraxErrorCode lyraxErrorCodeFromId = LyraxErrorCode.fromId(iBindVideoPlatformWrapper);
        if (lyraxErrorCodeFromId == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setVideoPlatformSource: unknown lyrax error=");
            sbLIZ2.append(iBindVideoPlatformWrapper);
            Logging.w("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ2));
            return ReturnStatus.RETURN_STATUS_FAILURE.value();
        }
        return lyraxErrorToReturnStatus(lyraxErrorCodeFromId).value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public void setVideoStrategyRunner(IVideoStrategyRunner iVideoStrategyRunner) {
        if (this.mState == State.DESTORY) {
            Logging.e("RTCVideoImplV2", "setVideoStrategyRunner, engine has disposed");
            return;
        }
        if (iVideoStrategyRunner == null) {
            Logging.e("RTCVideoImplV2", "setVideoStrategyRunner is null");
            return;
        }
        Logging.d("RTCVideoImplV2", "setVideoStrategyRunner");
        ILyraxVideoStrategyRunner iLyraxVideoStrategyRunner = new ILyraxVideoStrategyRunner(iVideoStrategyRunner) { // from class: com.ss.bytertc.engine.engineimpl.RTCVideoImplV2.1
            public final IVideoStrategyRunner mRunner;
            public final /* synthetic */ IVideoStrategyRunner val$videoStrategyRunner;

            @Override // com.ss.lyrax.engine.ILyraxVideoStrategyRunner
            public boolean isActive() {
                boolean zIsActive = this.mRunner.isActive();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isActive");
                sbLIZ.append(zIsActive);
                Logging.d("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
                return zIsActive;
            }

            @Override // com.ss.lyrax.engine.ILyraxVideoStrategyRunner
            public void setResultListener(LyraxVideoStrategyResultListener lyraxVideoStrategyResultListener) {
                Logging.d("RTCVideoImplV2", "setResultListener");
                this.mRunner.setResultListener(new IVideoStrategyResultListener(lyraxVideoStrategyResultListener) { // from class: com.ss.bytertc.engine.engineimpl.RTCVideoImplV2.1.1
                    public final LyraxVideoStrategyResultListener mListener;
                    public final /* synthetic */ LyraxVideoStrategyResultListener val$listener;

                    @Override // com.ss.bytertc.engine.video.IVideoStrategyResultListener
                    public void onVideoStrategyResult(VideoStrategyChannelResult[] videoStrategyChannelResultArr) {
                        Logging.d("RTCVideoImplV2", "onVideoStrategyResult start");
                        LyraxVideoStrategyChannelResult[] lyraxVideoStrategyChannelResultArr = new LyraxVideoStrategyChannelResult[videoStrategyChannelResultArr.length];
                        for (int i = 0; i < videoStrategyChannelResultArr.length; i++) {
                            LyraxVideoStrategyChannelResult lyraxVideoStrategyChannelResult = new LyraxVideoStrategyChannelResult();
                            VideoStrategyChannelResult videoStrategyChannelResult = videoStrategyChannelResultArr[i];
                            lyraxVideoStrategyChannelResult.channelIndex = videoStrategyChannelResult.channelIndex;
                            lyraxVideoStrategyChannelResult.perfWidth = videoStrategyChannelResult.perfWidth;
                            lyraxVideoStrategyChannelResult.perfHeight = videoStrategyChannelResult.perfHeight;
                            lyraxVideoStrategyChannelResult.perfFps = videoStrategyChannelResult.perfFps;
                            lyraxVideoStrategyChannelResult.netWidth = videoStrategyChannelResult.netWidth;
                            lyraxVideoStrategyChannelResult.netHeight = videoStrategyChannelResult.netHeight;
                            lyraxVideoStrategyChannelResult.netFps = videoStrategyChannelResult.netFps;
                            lyraxVideoStrategyChannelResult.finalWidth = videoStrategyChannelResult.finalWidth;
                            lyraxVideoStrategyChannelResult.finalHeight = videoStrategyChannelResult.finalHeight;
                            lyraxVideoStrategyChannelResult.finalFps = videoStrategyChannelResult.finalFps;
                            lyraxVideoStrategyChannelResult.finalBps = videoStrategyChannelResult.finalBps;
                            lyraxVideoStrategyChannelResult.maxBps = videoStrategyChannelResult.maxBps;
                            lyraxVideoStrategyChannelResult.minBps = videoStrategyChannelResult.minBps;
                            lyraxVideoStrategyChannelResult.minRequestBps = videoStrategyChannelResult.minRequestBps;
                            lyraxVideoStrategyChannelResultArr[i] = lyraxVideoStrategyChannelResult;
                        }
                        Logging.d("RTCVideoImplV2", "onVideoStrategyResult finish");
                        this.mListener.onVideoStrategyResult(lyraxVideoStrategyChannelResultArr);
                    }

                    {
                        this.val$listener = lyraxVideoStrategyResultListener;
                        this.mListener = lyraxVideoStrategyResultListener;
                    }
                });
            }

            @Override // com.ss.lyrax.engine.ILyraxVideoStrategyRunner
            public void updateFeatures(LyraxVideoStrategyParams lyraxVideoStrategyParams) {
                Logging.d("RTCVideoImplV2", "updateFeatures");
                VideoStrategyParams videoStrategyParams = new VideoStrategyParams();
                videoStrategyParams.mediaTargetBps = lyraxVideoStrategyParams.getMediaTargetBps();
                videoStrategyParams.sceneType = lyraxVideoStrategyParams.getSceneType();
                videoStrategyParams.channelEncInfoTable = new VideoStrategyChannelParams[lyraxVideoStrategyParams.getChannelEncInfoTable().length];
                for (int i = 0; i < lyraxVideoStrategyParams.getChannelEncInfoTable().length; i++) {
                    LyraxVideoStrategyChannelParams lyraxVideoStrategyChannelParams = lyraxVideoStrategyParams.getChannelEncInfoTable()[i];
                    VideoStrategyChannelParams videoStrategyChannelParams = new VideoStrategyChannelParams();
                    videoStrategyChannelParams.channelIndex = lyraxVideoStrategyChannelParams.channelIndex;
                    videoStrategyChannelParams.subscriberMaxDownlinkBps = lyraxVideoStrategyChannelParams.subscriberMaxDownlinkBps;
                    videoStrategyChannelParams.subscriberCount = lyraxVideoStrategyChannelParams.subscriberCount;
                    videoStrategyChannelParams.cfgMaxEncWidth = lyraxVideoStrategyChannelParams.cfgMaxEncWidth;
                    videoStrategyChannelParams.cfgMaxEncHeight = lyraxVideoStrategyChannelParams.cfgMaxEncHeight;
                    videoStrategyChannelParams.cfgMaxEncFps = lyraxVideoStrategyChannelParams.cfgMaxEncFps;
                    videoStrategyChannelParams.cfgMinEncBps = lyraxVideoStrategyChannelParams.cfgMinEncBps;
                    videoStrategyChannelParams.cfgMaxEncBps = lyraxVideoStrategyChannelParams.cfgMaxEncBps;
                    videoStrategyChannelParams.currentEncWidth = lyraxVideoStrategyChannelParams.currentEncWidth;
                    videoStrategyChannelParams.currentEncHeight = lyraxVideoStrategyChannelParams.currentEncHeight;
                    videoStrategyChannelParams.currentEncTargetFps = lyraxVideoStrategyChannelParams.currentEncTargetFps;
                    videoStrategyChannelParams.currentEncTargetBps = lyraxVideoStrategyChannelParams.currentEncTargetBps;
                    videoStrategyParams.channelEncInfoTable[i] = videoStrategyChannelParams;
                }
                Logging.d("RTCVideoImplV2", "updateFeatures finish");
                this.mRunner.updateFeatures(videoStrategyParams);
            }

            {
                this.val$videoStrategyRunner = iVideoStrategyRunner;
                this.mRunner = iVideoStrategyRunner;
            }
        };
        ILyraxEngine engine = this.mLyraxEngineWrapper.getEngine();
        if (engine != null) {
            Logging.d("RTCVideoImplV2", "setVideoStrategyRunner");
            engine.setVideoStrategyRunner(iLyraxVideoStrategyRunner);
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface, X.InterfaceC1276010jJH
    public int stopPushStreamToCDN(String str) {
        ILyraxEngine engine = this.mLyraxEngineWrapper.getEngine();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" taskId: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.mState == State.DESTORY) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" state: ");
            sbLIZ2.append(this.mState);
            engine.reportAPICall("java_stopPushMixedStreamToCDN", C2188811AlT.LIZIZ(sbLIZ2));
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        if (this.mRtcRooms.isEmpty()) {
            LogUtil.e("RTCVideoImplV2", "No room now, please call create room first");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" No room");
            engine.reportAPICall("java_stopPushMixedStreamToCDN", C2188811AlT.LIZIZ(sbLIZ3));
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        String str2 = this.mTaskMap.get(str);
        if (str2 == null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append("No task");
            engine.reportAPICall("java_stopPushMixedStreamToCDN", C2188811AlT.LIZIZ(sbLIZ4));
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxRoom room = this.mLyraxEngineWrapper.getRoom(str2);
        this.mTaskMap.remove(str);
        if (room != null) {
            engine.reportAPICall("java_stopPushMixedStreamToCDN", strLIZIZ);
            return lyraxErrorToReturnStatus(room.stopPushMixedStreamToCDN(str)).value();
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(strLIZIZ);
        sbLIZ5.append("room is null");
        engine.reportAPICall("java_stopPushMixedStreamToCDN", C2188811AlT.LIZIZ(sbLIZ5));
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int stopPushVideoFile(StreamIndex streamIndex) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopPushVideoFile: index: ");
        sbLIZ.append(streamIndex.value());
        Logging.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
        ILyraxPublisher orCreatePublisher = this.mLyraxEngineWrapper.getOrCreatePublisher(streamIndex);
        if (orCreatePublisher != null) {
            return lyraxErrorToReturnStatus(orCreatePublisher.stopPushVideoFile()).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        return setVideoEncoderConfig(StreamIndex.STREAM_INDEX_MAIN, VideoSolutionMode.VIDEO_SOLUTION_MODE_SINGLE, new VideoEncoderConfig[]{videoEncoderConfig}, 1);
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int enableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod, AudioFormat audioFormat) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int enableAudioProcessor(AudioProcessorMethod audioProcessorMethod, AudioFormat audioFormat) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int enableAudioToAvatarMode(StreamIndex streamIndex, boolean z) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableAudioToAvatarMode: index: ");
        sbLIZ.append(streamIndex.value());
        Logging.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
        ILyraxPublisher orCreatePublisher = this.mLyraxEngineWrapper.getOrCreatePublisher(streamIndex);
        if (orCreatePublisher != null) {
            return lyraxErrorToReturnStatus(orCreatePublisher.enableAudioToAvatarMode(z)).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int enableSEISendE2EInfo(boolean z, int i) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        Logging.e("RTCVideoImplV2", "enableSEISendE2EInfo: index: 0");
        ILyraxPublisher orCreatePublisher = this.mLyraxEngineWrapper.getOrCreatePublisher(StreamIndex.STREAM_INDEX_MAIN);
        if (orCreatePublisher != null) {
            return lyraxErrorToReturnStatus(orCreatePublisher.enableSendE2EInfoSEIV2(z, i)).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int pushExternalVideoFrame(StreamIndex streamIndex, VideoFrame videoFrame) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        if (videoFrame == null) {
            return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        }
        ILyraxPublisher publisher = this.mLyraxEngineWrapper.getPublisher(streamIndex);
        if (publisher != null && !(videoFrame instanceof LyraxVideoFrame)) {
            if (videoFrame.getFrameType() == VideoFrameType.RAW_MEMORY) {
                LyraxVideoExtraData[] lyraxVideoExtraDataArrConvertToLyraxVideoExternalDataArray = convertToLyraxVideoExternalDataArray(videoFrame.getExternalDataArray());
                LyraxVideoCPUBufferFrameBuilder lyraxVideoCPUBufferFrameBuilder = new LyraxVideoCPUBufferFrameBuilder(LyraxVideoPixelFormat.fromId(videoFrame.getPixelFormat().value()));
                lyraxVideoCPUBufferFrameBuilder.setWidth(videoFrame.getWidth());
                lyraxVideoCPUBufferFrameBuilder.setHeight(videoFrame.getHeight());
                lyraxVideoCPUBufferFrameBuilder.setRotation(LyraxVideoRotation.fromId(videoFrame.getRotation().value()));
                lyraxVideoCPUBufferFrameBuilder.setColorSpace(LyraxVideoColorSpace.fromId(videoFrame.getColorSpace().value()));
                lyraxVideoCPUBufferFrameBuilder.setExtraDataInfo(videoFrame.getExternalDataInfo());
                lyraxVideoCPUBufferFrameBuilder.setSupplementaryInfo(videoFrame.getSupplementaryInfo());
                lyraxVideoCPUBufferFrameBuilder.setTimeStampUs(videoFrame.getTimeStampUs());
                lyraxVideoCPUBufferFrameBuilder.setOriginalCaptureTimestampMs(videoFrame.getOriginalCaptureTimestampMs());
                lyraxVideoCPUBufferFrameBuilder.setOriginalEffectTimestampMs(videoFrame.getOriginalEffectTimestampMs());
                lyraxVideoCPUBufferFrameBuilder.setExtraDataArray(lyraxVideoExtraDataArrConvertToLyraxVideoExternalDataArray);
                int numberOfPlanes = videoFrame.getNumberOfPlanes();
                ByteBuffer[] byteBufferArr = new ByteBuffer[numberOfPlanes];
                int[] iArr = new int[numberOfPlanes];
                for (int i = 0; i < numberOfPlanes; i++) {
                    byteBufferArr[i] = videoFrame.getPlaneData(i);
                    iArr[i] = videoFrame.getPlaneStride(i);
                    lyraxVideoCPUBufferFrameBuilder.setPlaneData(i, byteBufferArr[i]);
                    lyraxVideoCPUBufferFrameBuilder.setPlaneStride(i, iArr[i]);
                }
                return lyraxErrorToReturnStatus(publisher.pushVideoFrame(lyraxVideoCPUBufferFrameBuilder.build())).value();
            }
            LyraxVideoExtraData[] lyraxVideoExtraDataArrConvertToLyraxVideoExternalDataArray2 = convertToLyraxVideoExternalDataArray(videoFrame.getExternalDataArray());
            LyraxVideoGLTextureFrameBuilder lyraxVideoGLTextureFrameBuilder = new LyraxVideoGLTextureFrameBuilder(LyraxVideoPixelFormat.fromId(videoFrame.getPixelFormat().value()));
            lyraxVideoGLTextureFrameBuilder.setTextureID(videoFrame.getTextureID());
            lyraxVideoGLTextureFrameBuilder.setTextureMatrix(videoFrame.getTextureMatrix());
            lyraxVideoGLTextureFrameBuilder.setEGLContext(videoFrame.getEGLContext());
            lyraxVideoGLTextureFrameBuilder.setColorSpace(LyraxVideoColorSpace.fromId(videoFrame.getColorSpace().value()));
            lyraxVideoGLTextureFrameBuilder.setWidth(videoFrame.getWidth());
            lyraxVideoGLTextureFrameBuilder.setHeight(videoFrame.getHeight());
            lyraxVideoGLTextureFrameBuilder.setRotation(LyraxVideoRotation.fromId(videoFrame.getRotation().value()));
            lyraxVideoGLTextureFrameBuilder.setExtraDataInfo(videoFrame.getExternalDataInfo());
            lyraxVideoGLTextureFrameBuilder.setSupplementaryInfo(videoFrame.getSupplementaryInfo());
            lyraxVideoGLTextureFrameBuilder.setTimeStampUs(videoFrame.getTimeStampUs());
            lyraxVideoGLTextureFrameBuilder.setOriginalCaptureTimestampMs(videoFrame.getOriginalCaptureTimestampMs());
            lyraxVideoGLTextureFrameBuilder.setOriginalEffectTimestampMs(videoFrame.getOriginalEffectTimestampMs());
            lyraxVideoGLTextureFrameBuilder.setExtraDataArray(lyraxVideoExtraDataArrConvertToLyraxVideoExternalDataArray2);
            return lyraxErrorToReturnStatus(publisher.pushVideoFrame(lyraxVideoGLTextureFrameBuilder.build())).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int replaceBackground(BackgroundMode backgroundMode, DivideModel divideModel) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setAudioContentType(StreamIndex streamIndex, AudioContentTypeConfig audioContentTypeConfig) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAudioContentType: index: ");
        sbLIZ.append(streamIndex.value());
        Logging.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
        ILyraxPublisher orCreatePublisher = this.mLyraxEngineWrapper.getOrCreatePublisher(streamIndex);
        if (orCreatePublisher == null) {
            return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        }
        LyraxAudioContentConfig lyraxAudioContentConfig = new LyraxAudioContentConfig();
        lyraxAudioContentConfig.hasMic = audioContentTypeConfig.hasMic;
        lyraxAudioContentConfig.hasScreenAudio = audioContentTypeConfig.hasScreenAudio;
        lyraxAudioContentConfig.hasMediaPlayer = audioContentTypeConfig.hasMediaPlayer;
        lyraxAudioContentConfig.hasSpecialAudio = false;
        return lyraxErrorToReturnStatus(orCreatePublisher.setAudioContentConfig(lyraxAudioContentConfig)).value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setAudioEncodeConfig(StreamIndex streamIndex, AudioEncodeConfig audioEncodeConfig) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAudioEncodeConfig: index: ");
        sbLIZ.append(streamIndex.value());
        Logging.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
        ILyraxPublisher orCreatePublisher = this.mLyraxEngineWrapper.getOrCreatePublisher(streamIndex);
        if (orCreatePublisher != null) {
            LyraxAudioEncoderConfig lyraxAudioEncoderConfig = new LyraxAudioEncoderConfig();
            lyraxAudioEncoderConfig.codecType = LyraxAudioCodecType.fromId(audioEncodeConfig.codecType);
            lyraxAudioEncoderConfig.channelNum = LyraxAudioChannel.fromId(audioEncodeConfig.channelNum);
            lyraxAudioEncoderConfig.sampleRate = LyraxAudioSampleRate.fromId(audioEncodeConfig.sampleRate);
            return lyraxErrorToReturnStatus(orCreatePublisher.setAudioEncoderConfig(lyraxAudioEncoderConfig)).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setCaptureVolume(StreamIndex streamIndex, int i) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCaptureVolume: index: ");
        sbLIZ.append(streamIndex.value());
        Logging.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
        ILyraxPublisher orCreatePublisher = this.mLyraxEngineWrapper.getOrCreatePublisher(streamIndex);
        if (orCreatePublisher != null) {
            return lyraxErrorToReturnStatus(orCreatePublisher.setAudioCaptureVolume(i)).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setLiveBitrateGearTable(VideoEncoderConfig[] videoEncoderConfigArr, int i) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxEngine engine = this.mLyraxEngineWrapper.getEngine();
        if (engine != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                VideoEncoderConfig videoEncoderConfig = videoEncoderConfigArr[i2];
                arrayList.add(new LyraxVideoBitrateGearTableItem(videoEncoderConfig.width, videoEncoderConfig.height, videoEncoderConfig.frameRate, videoEncoderConfig.maxBitrate, videoEncoderConfig.minBitrate));
            }
            return lyraxErrorToReturnStatus(engine.setVideoBitrateGearTable(arrayList)).value();
        }
        return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setLocalStreamPriority(StreamIndex streamIndex, StreamPriority streamPriority) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRemoteAudioPlaybackVolume(StreamKey streamKey, int i) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxSubscriber subscriber = this.mLyraxEngineWrapper.getSubscriber(streamKey);
        if (subscriber != null) {
            return lyraxErrorToReturnStatus(subscriber.setAudioPlaybackVolume(i)).value();
        }
        this.mLyraxEngineWrapper.setRemoteAudioPlaybackVolume(new LyraxStreamKey("", streamKey.getRoomId(), streamKey.getUserId(), LyraxStreamIndex.fromId(streamKey.getStreamIndex().value())), i);
        return ReturnStatus.RETURN_STATUS_SUCCESS.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRemoteVideoCanvas(StreamKey streamKey, VideoCanvas videoCanvas) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRemoteVideoRenderConfig(StreamKey streamKey, LyraxVideoRenderConfig lyraxVideoRenderConfig) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        if (streamKey != null && lyraxVideoRenderConfig != null) {
            LyraxVideoRendererManager videoRendererManager = this.mLyraxEngineWrapper.getVideoRendererManager();
            if (videoRendererManager == null) {
                return ReturnStatus.RETURN_STATUS_FAILURE.value();
            }
            LyraxStreamKey lyraxRemoteStreamKey = toLyraxRemoteStreamKey(streamKey);
            String str = lyraxVideoRenderConfig.renderId;
            if (str == null || str.isEmpty()) {
                lyraxVideoRenderConfig.renderId = this.mLyraxEngineWrapper.buildRenderId(lyraxRemoteStreamKey);
            }
            synchronized (this.mLyraxEngineWrapper.getSubscriberAddSinkLock()) {
                try {
                    videoRendererManager.setVideoRenderConfig(lyraxVideoRenderConfig);
                    ILyraxSubscriber subscriber = this.mLyraxEngineWrapper.getSubscriber(streamKey);
                    if (subscriber != null && lyraxErrorToReturnStatus(subscriber.setVideoRenderConfig(lyraxVideoRenderConfig)) != ReturnStatus.RETURN_STATUS_SUCCESS) {
                        return ReturnStatus.RETURN_STATUS_FAILURE.value();
                    }
                    return ReturnStatus.RETURN_STATUS_SUCCESS.value();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public void setRemoteVideoRenderTargetView(String str, View view) {
        LyraxVideoRendererManager videoRendererManager;
        if (str != null && !str.isEmpty() && (videoRendererManager = getVideoRendererManager()) != null) {
            videoRendererManager.setRenderTargetView(str, view);
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRemoteVideoSuperResolution(StreamKey streamKey, VideoSuperResolutionMode videoSuperResolutionMode) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxSubscriber subscriber = this.mLyraxEngineWrapper.getSubscriber(streamKey);
        if (subscriber != null) {
            return lyraxErrorToReturnStatus(subscriber.setVideoSuperResolution(LyraxVideoSuperResolutionMode.fromId(videoSuperResolutionMode.value()))).value();
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoCaptureConfig(StreamIndex streamIndex, VideoCaptureConfig videoCaptureConfig) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoDecoderConfig(StreamKey streamKey, VideoDecoderConfig videoDecoderConfig) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        LyraxStreamKey lyraxStreamKey = new LyraxStreamKey("", streamKey.getRoomId(), streamKey.getUserId(), LyraxStreamIndex.fromId(streamKey.getStreamIndex().value()));
        LyraxVideoDecoderConfig videoDecoderConfig2 = this.mLyraxEngineWrapper.getVideoDecoderConfig(lyraxStreamKey);
        if (videoDecoderConfig2 != null) {
            videoDecoderConfig2.outputType = LyraxVideoDecoderOutputType.fromId(videoDecoderConfig.value());
        } else {
            videoDecoderConfig2 = new LyraxVideoDecoderConfig(LyraxVideoDecoderOutputType.fromId(videoDecoderConfig.value()), null);
        }
        this.mLyraxEngineWrapper.setVideoDecoderConfig(lyraxStreamKey, videoDecoderConfig2);
        ILyraxSubscriber subscriber = this.mLyraxEngineWrapper.getSubscriber(streamKey);
        if (subscriber != null) {
            return lyraxErrorToReturnStatus(subscriber.setVideoDecoderConfig(videoDecoderConfig2)).value();
        }
        return ReturnStatus.RETURN_STATUS_SUCCESS.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoSource(StreamIndex streamIndex, InternalVideoSourceConfig internalVideoSourceConfig) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVideoSource: index: ");
        sbLIZ.append(streamIndex.value());
        Logging.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
        ILyraxPublisher orCreatePublisher = this.mLyraxEngineWrapper.getOrCreatePublisher(streamIndex);
        if (orCreatePublisher != null) {
            LyraxVideoSourceConfig lyraxVideoSourceConfig = new LyraxVideoSourceConfig(LyraxVideoSourceType.fromId(internalVideoSourceConfig.getVideoSourceType()), LyraxVideoContentType.fromId(internalVideoSourceConfig.getVideoSourceCategory()));
            this.mLyraxEngineWrapper.setVideoSouceConfig(LyraxStreamIndex.fromId(streamIndex.value()), lyraxVideoSourceConfig);
            return lyraxErrorToReturnStatus(orCreatePublisher.setVideoSourceConfig(lyraxVideoSourceConfig)).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoSourceType(StreamIndex streamIndex, VideoSourceType videoSourceType) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVideoSourceType: index: ");
        sbLIZ.append(streamIndex.value());
        Logging.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
        ILyraxPublisher orCreatePublisher = this.mLyraxEngineWrapper.getOrCreatePublisher(streamIndex);
        if (orCreatePublisher != null) {
            LyraxVideoSourceConfig videoSourceConfig = this.mLyraxEngineWrapper.getVideoSourceConfig(LyraxStreamIndex.fromId(streamIndex.value()));
            if (videoSourceConfig != null) {
                videoSourceConfig.sourceType = LyraxVideoSourceType.fromId(videoSourceType.value());
            } else {
                videoSourceConfig = new LyraxVideoSourceConfig(LyraxVideoSourceType.fromId(videoSourceType.value()), LyraxVideoContentType.CAMERA);
            }
            this.mLyraxEngineWrapper.setVideoSouceConfig(LyraxStreamIndex.fromId(streamIndex.value()), videoSourceConfig);
            return lyraxErrorToReturnStatus(orCreatePublisher.setVideoSourceConfig(videoSourceConfig)).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int startChorusCacheSync(ChorusCacheSyncConfig chorusCacheSyncConfig, IChorusCacheSyncObserver iChorusCacheSyncObserver) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int updateExternalStats(StreamIndex streamIndex, LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxPublisher publisher = this.mLyraxEngineWrapper.getPublisher(streamIndex);
        if (publisher != null) {
            return lyraxErrorToReturnStatus(publisher.updateLyraxExternalStats(lyraxPreProcessVideoNodeStats)).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface, X.InterfaceC1276010jJH
    public int updatePushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        StringBuilder sb = new StringBuilder();
        if (!LyraxUtils.checkMixedStreamConfigValid(mixedStreamConfig, sb)) {
            LogUtil.e("RTCVideoImplV2", sb.toString());
            return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        }
        if (this.mRtcRooms.isEmpty()) {
            LogUtil.e("RTCVideoImplV2", "No room now, please call create room first");
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        LyraxTranscoderParam lyraxTranscoderParamCreateLyraxTranscoderParam = LyraxUtils.createLyraxTranscoderParam(mixedStreamConfig);
        ILyraxRoom room = this.mLyraxEngineWrapper.getRoom(mixedStreamConfig.getRoomID());
        if (room != null) {
            return lyraxErrorToReturnStatus(room.updatePushMixedStreamToCDN(str, lyraxTranscoderParamCreateLyraxTranscoderParam)).value();
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int pushExternalVideoFrame(VideoFrame videoFrame, boolean z) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        return pushExternalVideoFrame(StreamIndex.STREAM_INDEX_MAIN, videoFrame);
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int pushExternalEncodedVideoFrame(StreamIndex streamIndex, int i, RTCEncodedVideoFrame rTCEncodedVideoFrame) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, int i) {
        LyraxVideoPixelFormat lyraxVideoPixelFormat;
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLocalVideoSink: index: ");
        sbLIZ.append(streamIndex.value());
        Logging.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
        ILyraxPublisher orCreatePublisher = this.mLyraxEngineWrapper.getOrCreatePublisher(streamIndex);
        if (orCreatePublisher == null) {
            return ReturnStatus.RETURN_STATUS_FAILURE.value();
        }
        if (i == 0) {
            lyraxVideoPixelFormat = LyraxVideoPixelFormat.UNKNOWN;
        } else if (i == 1) {
            lyraxVideoPixelFormat = LyraxVideoPixelFormat.I420;
        } else if (i == 5) {
            lyraxVideoPixelFormat = LyraxVideoPixelFormat.RGBA;
        } else {
            return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        }
        LyraxStreamIndex lyraxStreamIndexFromId = LyraxStreamIndex.fromId(streamIndex.value());
        if (iVideoSink != null) {
            LyraxVideoSinkWrapper localVideoSinkAdapter = this.mLyraxEngineWrapper.getLocalVideoSinkAdapter(lyraxStreamIndexFromId);
            if (localVideoSinkAdapter != null) {
                orCreatePublisher.removeVideoFrameSink(localVideoSinkAdapter);
                this.mLyraxEngineWrapper.removeLocalVideoSinkAdapter(lyraxStreamIndexFromId);
            }
            LyraxVideoSinkWrapper lyraxVideoSinkWrapper = new LyraxVideoSinkWrapper(iVideoSink, lyraxVideoPixelFormat);
            orCreatePublisher.addVideoFrameSink(lyraxVideoSinkWrapper, lyraxVideoPixelFormat);
            this.mLyraxEngineWrapper.setLocalVideoSinkAdapter(lyraxStreamIndexFromId, lyraxVideoSinkWrapper);
        } else {
            LyraxVideoSinkWrapper localVideoSinkAdapter2 = this.mLyraxEngineWrapper.getLocalVideoSinkAdapter(lyraxStreamIndexFromId);
            if (localVideoSinkAdapter2 != null) {
                orCreatePublisher.removeVideoFrameSink(localVideoSinkAdapter2);
                this.mLyraxEngineWrapper.removeLocalVideoSinkAdapter(lyraxStreamIndexFromId);
            }
        }
        return ReturnStatus.RETURN_STATUS_SUCCESS.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRemoteAudioPlaybackVolume(String str, String str2, int i) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxRoom room = this.mLyraxEngineWrapper.getRoom(str);
        if (room != null) {
            return lyraxErrorToReturnStatus(room.setRemoteAudioPlaybackVolume(str2, i)).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setRemoteVideoSink(StreamKey streamKey, IVideoSink iVideoSink, int i) {
        LyraxVideoPixelFormat lyraxVideoPixelFormat;
        ILyraxEngine engine = this.mLyraxEngineWrapper.getEngine();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" roomId: ");
        sbLIZ.append(streamKey.getRoomId());
        sbLIZ.append(" userId: ");
        sbLIZ.append(streamKey.getUserId());
        sbLIZ.append(" streamIndex: ");
        sbLIZ.append(streamKey.getStreamIndex().value());
        engine.reportAPICall("java_setRemoteVideoSink", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        LyraxStreamKey lyraxStreamKey = new LyraxStreamKey("", streamKey.getRoomId(), streamKey.getUserId(), LyraxStreamIndex.fromId(streamKey.getStreamIndex().value()));
        if (i == 0) {
            lyraxVideoPixelFormat = LyraxVideoPixelFormat.UNKNOWN;
        } else if (i == 1) {
            lyraxVideoPixelFormat = LyraxVideoPixelFormat.I420;
        } else if (i == 5) {
            lyraxVideoPixelFormat = LyraxVideoPixelFormat.RGBA;
        } else {
            return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        }
        if (iVideoSink != null) {
            LyraxVideoSinkWrapper remoteVideoSinkAdapter = this.mLyraxEngineWrapper.getRemoteVideoSinkAdapter(lyraxStreamKey);
            if (remoteVideoSinkAdapter != null) {
                ILyraxSubscriber subscriber = this.mLyraxEngineWrapper.getSubscriber(streamKey);
                if (subscriber != null) {
                    subscriber.removeVideoFrameSink(remoteVideoSinkAdapter);
                }
                this.mLyraxEngineWrapper.removeRemoteVideoSinkAdapter(lyraxStreamKey);
            }
            synchronized (this.mLyraxEngineWrapper.getSubscriberAddSinkLock()) {
                try {
                    LyraxVideoSinkWrapper lyraxVideoSinkWrapper = new LyraxVideoSinkWrapper(iVideoSink, lyraxVideoPixelFormat);
                    ILyraxSubscriber subscriber2 = this.mLyraxEngineWrapper.getSubscriber(streamKey);
                    if (subscriber2 != null) {
                        subscriber2.addVideoFrameSink(lyraxVideoSinkWrapper, lyraxVideoPixelFormat);
                    }
                    this.mLyraxEngineWrapper.setRemoteVideoSinkAdapater(lyraxStreamKey, lyraxVideoSinkWrapper);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            LyraxVideoSinkWrapper remoteVideoSinkAdapter2 = this.mLyraxEngineWrapper.getRemoteVideoSinkAdapter(lyraxStreamKey);
            if (remoteVideoSinkAdapter2 != null) {
                ILyraxSubscriber subscriber3 = this.mLyraxEngineWrapper.getSubscriber(streamKey);
                if (subscriber3 != null) {
                    subscriber3.removeVideoFrameSink(remoteVideoSinkAdapter2);
                }
                this.mLyraxEngineWrapper.removeRemoteVideoSinkAdapter(lyraxStreamKey);
            }
        }
        return ReturnStatus.RETURN_STATUS_SUCCESS.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface, X.InterfaceC1276010jJH
    public int startPushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig, IMixedStreamObserver iMixedStreamObserver) {
        ILyraxEngine engine = this.mLyraxEngineWrapper.getEngine();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" taskId: ");
        sbLIZ.append(str);
        sbLIZ.append(" mixedConfig: ");
        sbLIZ.append(mixedStreamConfig.toString());
        engine.reportAPICall("java_startPushMixedStreamToCDN", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        StringBuilder sb = new StringBuilder();
        if (!LyraxUtils.checkMixedStreamConfigValid(mixedStreamConfig, sb)) {
            LogUtil.e("RTCVideoImplV2", sb.toString());
            return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        }
        if (this.mRtcRooms.isEmpty()) {
            LogUtil.e("RTCVideoImplV2", "No room now, please call create room first");
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        LyraxTranscoderParam lyraxTranscoderParamCreateLyraxTranscoderParam = LyraxUtils.createLyraxTranscoderParam(mixedStreamConfig);
        RTCRoom rTCRoom = this.mRtcRooms.get(mixedStreamConfig.getRoomID());
        if (rTCRoom == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Room not found for roomId: ");
            sbLIZ2.append(mixedStreamConfig.getRoomID());
            LogUtil.w("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ2));
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        Logging.e("RTCVideoImplV2", "startPushMixedStreamToCDN: index: 0");
        if (!(rTCRoom instanceof RTCRoomImplV2)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Room is not RTCRoomImplV2 for roomId: ");
            sbLIZ3.append(mixedStreamConfig.getRoomID());
            LogUtil.w("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ3));
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ((RTCRoomImplV2) rTCRoom).setMixStreamObserver(str, iMixedStreamObserver);
        this.mTaskMap.put(str, mixedStreamConfig.getRoomID());
        ILyraxPublisher orCreatePublisher = this.mLyraxEngineWrapper.getOrCreatePublisher(StreamIndex.STREAM_INDEX_MAIN);
        if (orCreatePublisher != null) {
            orCreatePublisher.setE2EAnchorLinkmicIdSEIV2(lyraxTranscoderParamCreateLyraxTranscoderParam.getUserId());
        }
        ILyraxRoom room = this.mLyraxEngineWrapper.getRoom(mixedStreamConfig.getRoomID());
        if (room != null) {
            return lyraxErrorToReturnStatus(room.startPushMixedStreamToCDN(str, lyraxTranscoderParamCreateLyraxTranscoderParam)).value();
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int startPushVideoFile(StreamIndex streamIndex, String str, boolean z) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPushVideoFile, getOrCreatePublisher: index: ");
        sbLIZ.append(streamIndex.value());
        Logging.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
        ILyraxPublisher orCreatePublisher = this.mLyraxEngineWrapper.getOrCreatePublisher(streamIndex);
        if (orCreatePublisher != null) {
            return lyraxErrorToReturnStatus(orCreatePublisher.startPushVideoFile(str, z)).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int sendSEIMessage(StreamIndex streamIndex, VideoExternalData videoExternalData, int i, SEICountPerFrame sEICountPerFrame) {
        boolean z;
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxPublisher publisher = this.mLyraxEngineWrapper.getPublisher(streamIndex);
        if (publisher != null) {
            ByteBuffer data = videoExternalData.getData();
            data.rewind();
            byte[] bArr = new byte[data.remaining()];
            data.get(bArr);
            if (sEICountPerFrame == SEICountPerFrame.SEI_COUNT_PER_FRAME_MULTI) {
                z = true;
            } else {
                z = false;
            }
            LyraxVideoSeiParamV1 lyraxVideoSeiParamV1 = new LyraxVideoSeiParamV1(bArr, i, z);
            lyraxVideoSeiParamV1.channelId = videoExternalData.getDataId() & 255;
            return lyraxErrorToReturnStatus(publisher.sendSEIV1(lyraxVideoSeiParamV1)).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoEncoderConfig(StreamIndex streamIndex, VideoSolutionMode videoSolutionMode, VideoEncoderConfig[] videoEncoderConfigArr, int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        LyraxVideoEncoderProfile.VideoDegradeLevels videoDegradeLevels;
        LyraxVideoEncoderProfile lyraxVideoEncoderProfile;
        ArrayList arrayList3;
        ArrayList arrayList4;
        LyraxVideoEncoderProfile.VideoDegradeLevels videoDegradeLevels2;
        VideoEncoderConfig[] videoEncoderConfigArr2 = videoEncoderConfigArr;
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        if (i > 0 && videoEncoderConfigArr2.length != 0) {
            int i2 = 0;
            if (i == 1 && videoSolutionMode == VideoSolutionMode.VIDEO_SOLUTION_MODE_SINGLE && videoEncoderConfigArr2.length > 1) {
                videoEncoderConfigArr2 = new VideoEncoderConfig[]{videoEncoderConfigArr2[0]};
            }
            if (this.mNegotiateVideoCodec) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setVideoEncoderConfig: index: ");
                sbLIZ.append(streamIndex.value());
                Logging.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
                ILyraxPublisher orCreatePublisher = this.mLyraxEngineWrapper.getOrCreatePublisher(streamIndex);
                if (orCreatePublisher != null) {
                    LyraxVideoEncoderMode lyraxVideoEncoderModeFromId = LyraxVideoEncoderMode.fromId(videoSolutionMode.value());
                    ArrayList arrayList5 = new ArrayList();
                    while (i2 < videoEncoderConfigArr2.length) {
                        VideoEncoderConfig videoEncoderConfig = videoEncoderConfigArr2[i2];
                        if (videoEncoderConfig.minBitrateTables != null) {
                            arrayList3 = new ArrayList(videoEncoderConfig.minBitrateTables.size());
                            for (BitRateTable bitRateTable : videoEncoderConfig.minBitrateTables) {
                                if (bitRateTable != null) {
                                    LyraxBitRateTable lyraxBitRateTable = new LyraxBitRateTable();
                                    lyraxBitRateTable.pixels = bitRateTable.pixels;
                                    lyraxBitRateTable.minKbps = bitRateTable.minKbps;
                                    arrayList3.add(lyraxBitRateTable);
                                }
                            }
                        } else {
                            arrayList3 = null;
                        }
                        if (videoEncoderConfig.resolutionBase != null) {
                            arrayList4 = new ArrayList(videoEncoderConfig.resolutionBase.size());
                            for (VideoResolutionConfig videoResolutionConfig : videoEncoderConfig.resolutionBase) {
                                if (videoResolutionConfig != null) {
                                    LyraxVideoResolutionConfig lyraxVideoResolutionConfig = new LyraxVideoResolutionConfig();
                                    lyraxVideoResolutionConfig.width = videoResolutionConfig.width;
                                    lyraxVideoResolutionConfig.height = videoResolutionConfig.height;
                                    lyraxVideoResolutionConfig.framerate = videoResolutionConfig.framerate;
                                    lyraxVideoResolutionConfig.maxKbps = videoResolutionConfig.maxKbps;
                                    lyraxVideoResolutionConfig.minKbps = videoResolutionConfig.minKbps;
                                    lyraxVideoResolutionConfig.defaultKbps = videoResolutionConfig.defaultKbps;
                                    arrayList4.add(lyraxVideoResolutionConfig);
                                }
                            }
                        } else {
                            arrayList4 = null;
                        }
                        if (videoEncoderConfig.degradeLevels != null) {
                            videoDegradeLevels2 = new LyraxVideoEncoderProfile.VideoDegradeLevels();
                            List<VideoDegradeConfig> list = videoEncoderConfig.degradeLevels.perf;
                            if (list != null) {
                                for (VideoDegradeConfig videoDegradeConfig : list) {
                                    if (videoDegradeConfig != null) {
                                        LyraxVideoDegradeConfig lyraxVideoDegradeConfig = new LyraxVideoDegradeConfig();
                                        lyraxVideoDegradeConfig.width = videoDegradeConfig.width;
                                        lyraxVideoDegradeConfig.height = videoDegradeConfig.height;
                                        lyraxVideoDegradeConfig.framerate = videoDegradeConfig.framerate;
                                        lyraxVideoDegradeConfig.upThresholdKbps = videoDegradeConfig.upThresholdKbps;
                                        lyraxVideoDegradeConfig.downThresholdKbps = videoDegradeConfig.downThresholdKbps;
                                        videoDegradeLevels2.perf.add(lyraxVideoDegradeConfig);
                                    }
                                }
                            }
                            List<VideoDegradeConfig> list2 = videoEncoderConfig.degradeLevels.f440net;
                            if (list2 != null) {
                                for (VideoDegradeConfig videoDegradeConfig2 : list2) {
                                    if (videoDegradeConfig2 != null) {
                                        LyraxVideoDegradeConfig lyraxVideoDegradeConfig2 = new LyraxVideoDegradeConfig();
                                        lyraxVideoDegradeConfig2.width = videoDegradeConfig2.width;
                                        lyraxVideoDegradeConfig2.height = videoDegradeConfig2.height;
                                        lyraxVideoDegradeConfig2.framerate = videoDegradeConfig2.framerate;
                                        lyraxVideoDegradeConfig2.upThresholdKbps = videoDegradeConfig2.upThresholdKbps;
                                        lyraxVideoDegradeConfig2.downThresholdKbps = videoDegradeConfig2.downThresholdKbps;
                                        videoDegradeLevels2.f441net.add(lyraxVideoDegradeConfig2);
                                    }
                                }
                            }
                        } else {
                            videoDegradeLevels2 = null;
                        }
                        arrayList5.add(new LyraxVideoEncoderProfile(videoEncoderConfig.width, videoEncoderConfig.height, videoEncoderConfig.frameRate, 0, videoEncoderConfig.maxBitrate, videoEncoderConfig.minBitrate, LyraxVideoEncoderPreference.fromId(videoEncoderConfig.encodePreference.getValue()), LyraxVideoCodecType.AUTO, LyraxVideoCodecMode.AUTO, null, null, null, arrayList3, videoDegradeLevels2, arrayList4));
                        i2++;
                    }
                    return lyraxErrorToReturnStatus(orCreatePublisher.setVideoEncoderConfig(new LyraxVideoEncoderConfig(lyraxVideoEncoderModeFromId, arrayList5))).value();
                }
                return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setVideoEncoderConfig: index: ");
            sbLIZ2.append(streamIndex.value());
            Logging.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ2));
            ILyraxPublisher orCreatePublisher2 = this.mLyraxEngineWrapper.getOrCreatePublisher(streamIndex);
            if (orCreatePublisher2 != null) {
                LyraxVideoEncoderConfig videoEncoderConfig2 = orCreatePublisher2.getVideoEncoderConfig();
                LyraxVideoEncoderMode lyraxVideoEncoderModeFromId2 = LyraxVideoEncoderMode.fromId(videoSolutionMode.value());
                ArrayList arrayList6 = new ArrayList();
                int i3 = 0;
                while (i3 < videoEncoderConfigArr2.length) {
                    VideoEncoderConfig videoEncoderConfig3 = videoEncoderConfigArr2[i3];
                    if (videoEncoderConfig3.minBitrateTables != null) {
                        arrayList = new ArrayList(videoEncoderConfig3.minBitrateTables.size());
                        for (BitRateTable bitRateTable2 : videoEncoderConfig3.minBitrateTables) {
                            if (bitRateTable2 != null) {
                                LyraxBitRateTable lyraxBitRateTable2 = new LyraxBitRateTable();
                                lyraxBitRateTable2.pixels = bitRateTable2.pixels;
                                lyraxBitRateTable2.minKbps = bitRateTable2.minKbps;
                                arrayList.add(lyraxBitRateTable2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (videoEncoderConfig3.resolutionBase != null) {
                        arrayList2 = new ArrayList(videoEncoderConfig3.resolutionBase.size());
                        for (VideoResolutionConfig videoResolutionConfig2 : videoEncoderConfig3.resolutionBase) {
                            if (videoResolutionConfig2 != null) {
                                LyraxVideoResolutionConfig lyraxVideoResolutionConfig2 = new LyraxVideoResolutionConfig();
                                lyraxVideoResolutionConfig2.width = videoResolutionConfig2.width;
                                lyraxVideoResolutionConfig2.height = videoResolutionConfig2.height;
                                lyraxVideoResolutionConfig2.framerate = videoResolutionConfig2.framerate;
                                lyraxVideoResolutionConfig2.maxKbps = videoResolutionConfig2.maxKbps;
                                lyraxVideoResolutionConfig2.minKbps = videoResolutionConfig2.minKbps;
                                lyraxVideoResolutionConfig2.defaultKbps = videoResolutionConfig2.defaultKbps;
                                arrayList2.add(lyraxVideoResolutionConfig2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                    if (videoEncoderConfig3.degradeLevels != null) {
                        videoDegradeLevels = new LyraxVideoEncoderProfile.VideoDegradeLevels();
                        List<VideoDegradeConfig> list3 = videoEncoderConfig3.degradeLevels.perf;
                        if (list3 != null) {
                            for (VideoDegradeConfig videoDegradeConfig3 : list3) {
                                if (videoDegradeConfig3 != null) {
                                    LyraxVideoDegradeConfig lyraxVideoDegradeConfig3 = new LyraxVideoDegradeConfig();
                                    lyraxVideoDegradeConfig3.width = videoDegradeConfig3.width;
                                    lyraxVideoDegradeConfig3.height = videoDegradeConfig3.height;
                                    lyraxVideoDegradeConfig3.framerate = videoDegradeConfig3.framerate;
                                    lyraxVideoDegradeConfig3.upThresholdKbps = videoDegradeConfig3.upThresholdKbps;
                                    lyraxVideoDegradeConfig3.downThresholdKbps = videoDegradeConfig3.downThresholdKbps;
                                    videoDegradeLevels.perf.add(lyraxVideoDegradeConfig3);
                                }
                            }
                        }
                        List<VideoDegradeConfig> list4 = videoEncoderConfig3.degradeLevels.f440net;
                        if (list4 != null) {
                            for (VideoDegradeConfig videoDegradeConfig4 : list4) {
                                if (videoDegradeConfig4 != null) {
                                    LyraxVideoDegradeConfig lyraxVideoDegradeConfig4 = new LyraxVideoDegradeConfig();
                                    lyraxVideoDegradeConfig4.width = videoDegradeConfig4.width;
                                    lyraxVideoDegradeConfig4.height = videoDegradeConfig4.height;
                                    lyraxVideoDegradeConfig4.framerate = videoDegradeConfig4.framerate;
                                    lyraxVideoDegradeConfig4.upThresholdKbps = videoDegradeConfig4.upThresholdKbps;
                                    lyraxVideoDegradeConfig4.downThresholdKbps = videoDegradeConfig4.downThresholdKbps;
                                    videoDegradeLevels.f441net.add(lyraxVideoDegradeConfig4);
                                }
                            }
                        }
                    } else {
                        videoDegradeLevels = null;
                    }
                    if (!videoEncoderConfig2.encoderProfiles.isEmpty() && (lyraxVideoEncoderProfile = (LyraxVideoEncoderProfile) ListProtector.get(videoEncoderConfig2.encoderProfiles, i2)) != null) {
                        arrayList6.add(new LyraxVideoEncoderProfile(videoEncoderConfig3.width, videoEncoderConfig3.height, videoEncoderConfig3.frameRate, 0, videoEncoderConfig3.maxBitrate, videoEncoderConfig3.minBitrate, LyraxVideoEncoderPreference.fromId(videoEncoderConfig3.encodePreference.getValue()), lyraxVideoEncoderProfile.codecType, lyraxVideoEncoderProfile.codecMode, lyraxVideoEncoderProfile.enbleBframe, lyraxVideoEncoderProfile.gopSize, lyraxVideoEncoderProfile.forceUserCodec, arrayList, videoDegradeLevels, arrayList2));
                    } else {
                        arrayList6.add(new LyraxVideoEncoderProfile(videoEncoderConfig3.width, videoEncoderConfig3.height, videoEncoderConfig3.frameRate, 0, videoEncoderConfig3.maxBitrate, videoEncoderConfig3.minBitrate, LyraxVideoEncoderPreference.fromId(videoEncoderConfig3.encodePreference.getValue()), LyraxVideoCodecType.AUTO, LyraxVideoCodecMode.AUTO, null, null, null, arrayList, videoDegradeLevels, arrayList2));
                    }
                    i3++;
                    i2 = 0;
                }
                return lyraxErrorToReturnStatus(orCreatePublisher2.setVideoEncoderConfig(new LyraxVideoEncoderConfig(lyraxVideoEncoderModeFromId2, arrayList6))).value();
            }
            return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int setVideoPerformanceConfig(StreamIndex streamIndex, int i, int i2, int i3) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVideoPerformanceConfig, getOrCreatePublisher: index: ");
        sbLIZ.append(streamIndex.value());
        Logging.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
        LyraxVideoPerfDegradeLimit lyraxVideoPerfDegradeLimit = new LyraxVideoPerfDegradeLimit(i, i2, i3);
        ILyraxPublisher publisher = this.mLyraxEngineWrapper.getPublisher(streamIndex);
        if (publisher != null) {
            return lyraxErrorToReturnStatus(publisher.setVideoPerfDegradeLimit(lyraxVideoPerfDegradeLimit)).value();
        }
        this.mLyraxEngineWrapper.setVideoPerfLimitation(LyraxStreamIndex.fromId(streamIndex.value()), lyraxVideoPerfDegradeLimit);
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int startNetworkDetection(boolean z, int i, boolean z2, int i2) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int switchToLinkmicWithConfig(StreamIndex streamIndex, VideoSolutionMode videoSolutionMode, VideoEncoderConfig[] videoEncoderConfigArr, int i) {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i, SEICountPerFrame sEICountPerFrame) {
        boolean z;
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        ILyraxPublisher publisher = this.mLyraxEngineWrapper.getPublisher(streamIndex);
        if (publisher != null) {
            if (sEICountPerFrame == SEICountPerFrame.SEI_COUNT_PER_FRAME_MULTI) {
                z = true;
            } else {
                z = false;
            }
            return lyraxErrorToReturnStatus(publisher.sendSEIV1(new LyraxVideoSeiParamV1(bArr, i, z))).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    private LyraxEngineOption createLyraxEngineOptionWithParameters(Context context, Object obj, GLESVersion gLESVersion, JSONObject jSONObject, String str) {
        LyraxLiveType lyraxLiveType;
        LyraxScene lyraxScene;
        LyraxEngineOption lyraxEngineOption = new LyraxEngineOption();
        LyraxBusinessOption lyraxBusinessOption = lyraxEngineOption.businessOption;
        lyraxBusinessOption.appId = str;
        lyraxBusinessOption.abLabel = jSONObject.optString("rtc.ab_label", "");
        lyraxEngineOption.businessOption.aid = jSONObject.optString("rtc.aid", "");
        lyraxEngineOption.businessOption.deviceId = jSONObject.optString("rtc.device_id", "");
        LyraxBusinessOption lyraxBusinessOption2 = lyraxEngineOption.businessOption;
        if (jSONObject.optInt("rtc.live_type", 0) == 0) {
            lyraxLiveType = LyraxLiveType.VIDEO;
        } else {
            lyraxLiveType = LyraxLiveType.GAME;
        }
        lyraxBusinessOption2.liveType = lyraxLiveType;
        LyraxAndroidOption lyraxAndroidOption = new LyraxAndroidOption();
        lyraxAndroidOption.context = context;
        lyraxAndroidOption.eglContext = obj;
        lyraxAndroidOption.glesVersion = gLESVersion;
        lyraxEngineOption.androidOption = lyraxAndroidOption;
        LyraxAudioOption lyraxAudioOption = new LyraxAudioOption();
        lyraxAudioOption.enableAocLocalConfigs = jSONObject.optBoolean("rtc.enable_aoc_local_configs", false);
        lyraxAudioOption.enableAudioRouteOptimization = jSONObject.optBoolean("rtc.enable_audio_route_optimization", false);
        lyraxEngineOption.audioOption = lyraxAudioOption;
        LyraxVideoOption lyraxVideoOption = new LyraxVideoOption();
        lyraxVideoOption.enableDownNativeRender = jSONObject.optBoolean("rtc.enable_down_native_render", false);
        lyraxVideoOption.capturePipelineStage = jSONObject.optInt("rtc.capture_pipeline_stage", -1);
        lyraxEngineOption.videoOption = lyraxVideoOption;
        LyraxNetworkOption lyraxNetworkOption = new LyraxNetworkOption();
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "access_hosts");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (!jSONArray.isNull(i)) {
                        arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
                    }
                }
            }
            lyraxNetworkOption.accessHosts = arrayList;
            lyraxNetworkOption.accessGroupId = jSONObject.optString("rtc.access_group_id", "");
            lyraxNetworkOption.liveRole = jSONObject.optString("rtc.live_role", "");
            lyraxNetworkOption.clearNetCache = jSONObject.optBoolean("rtc.clear_net_cache", false);
            lyraxNetworkOption.customMediaServerIp = jSONObject.optString("rtc.custom_media_server_ip", "");
            lyraxEngineOption.networkOption = lyraxNetworkOption;
            lyraxEngineOption.logSdkWebsocketUrl = jSONObject.optString("rtc.log_sdk_websocket_url", "");
            lyraxEngineOption.enableEventUpload = true;
            lyraxEngineOption.autotestParameters = jSONObject.optString("rtc.auto_test_params");
            lyraxEngineOption.parameters = jSONObject.optString("rtc.parameters");
            lyraxEngineOption.enableLocalLogCallback = jSONObject.optBoolean("rtc.enable_log_callback", false);
            if (jSONObject.optBoolean("rtc.enable_rtc_video_v2", false)) {
                lyraxScene = LyraxScene.LINKMIC;
            } else {
                lyraxScene = LyraxScene.LIVE;
            }
            lyraxEngineOption.scene = lyraxScene;
            lyraxEngineOption.inAnchorNet = true;
            lyraxEngineOption.forceInitEnv = true;
            boolean zOptBoolean = jSONObject.optBoolean("rtc.enable_remove_scene_none", false);
            lyraxEngineOption.enableRemoveSceneNone = zOptBoolean;
            this.mEnableRemoveSceneNone = zOptBoolean;
            lyraxEngineOption.videoStrategyActiveScene = jSONObject.optInt("rtc.video_strategy_active_scene", 0);
            String str2 = lyraxNetworkOption.liveRole;
            if (str2 != null) {
                if (str2.equals("host")) {
                    lyraxEngineOption.scene = LyraxScene.LIVE;
                    lyraxEngineOption.inAnchorNet = jSONObject.optBoolean("rtc.in_anchor_net", true);
                } else if (lyraxNetworkOption.liveRole.equals("guest")) {
                    lyraxEngineOption.inAnchorNet = false;
                    if (this.mEnableRemoveSceneNone) {
                        lyraxEngineOption.scene = LyraxScene.LINKMIC;
                    } else {
                        lyraxEngineOption.scene = LyraxScene.NONE;
                    }
                }
            }
            lyraxEngineOption.forceInitEnv = true;
            lyraxEngineOption.enablePreGetConfig = jSONObject.optBoolean("rtc.enable_pre_get_config", false);
            return lyraxEngineOption;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo, com.ss.bytertc.engine.RTCVideoInterface
    public int bindToStandardDowngradeTier(StreamIndex streamIndex, int i, int i2, int i3, int i4) {
        if (this.mState == State.DESTORY) {
            return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindToStandardDowngradeTier: index: ");
        sbLIZ.append(streamIndex.value());
        Logging.e("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
        ILyraxPublisher orCreatePublisher = this.mLyraxEngineWrapper.getOrCreatePublisher(streamIndex);
        if (orCreatePublisher != null) {
            return lyraxErrorToReturnStatus(orCreatePublisher.setVideoStandardDowngradeTier(i, i2, i3, i4)).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    public RTCVideoImplV2(Context context, String str, IRTCVideoEventHandler iRTCVideoEventHandler, Object obj, GLESVersion gLESVersion, JSONObject jSONObject) {
        String str2;
        int i;
        this.mNegotiateVideoCodec = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create RtcEngineImplV2 with appId: ");
        sbLIZ.append(str);
        LogUtil.d("RTCVideoImplV2", C2188811AlT.LIZIZ(sbLIZ));
        if (sLibraryLoaded && str != null) {
            this.mContext = context;
            this.mState = State.IDLE;
            try {
                this.mLyraxEngineWrapper = new LyraxEngineWrapper(createLyraxEngineOptionWithParameters(context, obj, gLESVersion, jSONObject, str), iRTCVideoEventHandler);
                if (jSONObject.has("rtc.video_codec_negotiate")) {
                    this.mNegotiateVideoCodec = jSONObject.optBoolean("rtc.video_codec_negotiate");
                } else {
                    this.mNegotiateVideoCodec = true;
                }
                if (jSONObject.has("rtc.video_decoder")) {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtc.video_decoder");
                    ArrayList arrayList = new ArrayList();
                    if (jSONArrayOptJSONArray != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                            LyraxVideoCodecType lyraxVideoCodecType = LyraxVideoCodecType.AUTO;
                            LyraxVideoCodecMode lyraxVideoCodecMode = LyraxVideoCodecMode.AUTO;
                            LyraxVideoCodecConfig lyraxVideoCodecConfig = new LyraxVideoCodecConfig(lyraxVideoCodecType, lyraxVideoCodecMode);
                            String strOptString = jSONObjectOptJSONObject.optString("codec_name");
                            if (strOptString.equals("auto")) {
                                lyraxVideoCodecConfig.codecType = lyraxVideoCodecType;
                            } else if (strOptString.equals("h264")) {
                                lyraxVideoCodecConfig.codecType = LyraxVideoCodecType.H264;
                            } else if (strOptString.equals("bytevc1")) {
                                lyraxVideoCodecConfig.codecType = LyraxVideoCodecType.BYTEVC1;
                            }
                            String strOptString2 = jSONObjectOptJSONObject.optString("codec_mode");
                            if (strOptString2.equals("auto")) {
                                lyraxVideoCodecConfig.codecMode = lyraxVideoCodecMode;
                            } else if (strOptString2.equals("hardware")) {
                                lyraxVideoCodecConfig.codecMode = LyraxVideoCodecMode.HARDWARE;
                            } else if (strOptString2.equals("software")) {
                                lyraxVideoCodecConfig.codecMode = LyraxVideoCodecMode.SOFTWARE;
                            }
                            arrayList.add(lyraxVideoCodecConfig);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        this.mLyraxEngineWrapper.setVideoCodecConfig(arrayList);
                        return;
                    }
                    return;
                }
                return;
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
        if (!sLibraryLoaded) {
            str2 = "rtc sdk load so failed";
            i = -1072;
        } else {
            str2 = "app id is null";
            i = -1005;
        }
        try {
            jSONObject2.put("event_key", "rtc_error");
            jSONObject2.put("rtc_app_id", str);
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
        LogUtil.e("RTCVideoImplV2", str2);
        throw new IllegalStateException("Create engine failed ".concat(str2));
    }
}
