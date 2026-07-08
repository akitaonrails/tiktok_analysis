package com.ss.bytertc.engine;

import X.C2188811AlT;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.realx.video.EglBaseCheckerHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
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
import com.ss.bytertc.engine.data.EngineConfig;
import com.ss.bytertc.engine.data.RtcScene;
import com.ss.bytertc.engine.data.SEICountPerFrame;
import com.ss.bytertc.engine.data.StrategyGrade;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.StreamPriority;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.data.VideoSolutionMode;
import com.ss.bytertc.engine.data.VideoSourceType;
import com.ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.engineimpl.RTCVideoImplV2;
import com.ss.bytertc.engine.handler.IExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.live.ChorusCacheSyncConfig;
import com.ss.bytertc.engine.live.IChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderImpl;
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
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.EngineConfigCheck;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.utils.RTCEglContextChecker;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.IVideoStrategyRunner;
import com.ss.bytertc.engine.video.VideoDecoderConfig;
import com.ss.bytertc.engine.video.VideoExternalData;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.LyraxVideoFrame;
import com.ss.lyrax.audio.ILyraxAudioPlayer;
import com.ss.lyrax.subscriber.LyraxVideoRenderConfig;
import com.ss.lyrax.video.ILyraxVideoRenderer;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public abstract class RTCVideo implements RTCVideoInterface {
    public static RTCVideoImpl mInstance;
    public static RTCVideoImpl mInstanceEx;
    public static RTCVideoImplV2 mInstanceV2;
    public static RTCEglContextChecker mRtcEglContextChecker;
    public static RTCNativeLibraryLoader mRtcNativeLibraryLoader = new RTCNativeLibraryLoaderImpl();

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int bindToStandardDowngradeTier(StreamIndex streamIndex, int i, int i2, int i3, int i4);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract String buildRemoteVideoRenderId(StreamKey streamKey);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract RTCRoom createRTCRoom(String str);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract void detachRemoteVideoRenderer(StreamKey streamKey);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int disableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int disableAudioProcessor(AudioProcessorMethod audioProcessorMethod);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int disableDownlinkAudioSelection();

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int enableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod, AudioFormat audioFormat);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int enableAudioProcessor(AudioProcessorMethod audioProcessorMethod, AudioFormat audioFormat);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int enableAudioPropertiesReport(AudioPropertiesConfig audioPropertiesConfig);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int enableAudioToAvatarMode(StreamIndex streamIndex, boolean z);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int enableDownlinkAudioSelection(int i);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int enableSEISendE2EInfo(boolean z, int i);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int enableSimulcastMode(boolean z);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract RTCRoom getLivePusherRoom();

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract RTCRoom getLivePusherRoom(String str);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract String getLivePusherTaskId();

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract ILyraxAudioPlayer getLyraxAudioPlayer(int i);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract long getNativeHandle();

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract NetworkTimeInfo getNetworkTimeInfo();

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract LyraxVideoFrame getPooledFrame(VideoPixelFormat videoPixelFormat, int i, int i2, int i3, VideoRotation videoRotation, ColorSpace colorSpace);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract View getRemoteVideoRenderTargetView(StreamKey streamKey);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract ILyraxVideoRenderer getRemoteVideoRenderer(StreamKey streamKey);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract VideoCodecDescription[] getVideoTargetDecoderDescriptions(StreamIndex streamIndex);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract boolean isLyraxFrameEnabled();

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int pullExternalAudioFrame(AudioFrame audioFrame);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int pushExternalAudioFrame(AudioFrame audioFrame);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int pushExternalEncodedVideoFrame(StreamIndex streamIndex, int i, RTCEncodedVideoFrame rTCEncodedVideoFrame);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int pushExternalVideoFrame(StreamIndex streamIndex, VideoFrame videoFrame);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int pushExternalVideoFrame(VideoFrame videoFrame);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int pushExternalVideoFrame(VideoFrame videoFrame, boolean z);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int pushScreenAudioFrame(AudioFrame audioFrame);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int registerAudioProcessor(IAudioFrameProcessor iAudioFrameProcessor);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int registerRemoteEncodedVideoFrameObserver(IRemoteEncodedVideoFrameObserver iRemoteEncodedVideoFrameObserver);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int replaceBackground(BackgroundMode backgroundMode, DivideModel divideModel);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int requestRemoteVideoKeyFrame(StreamKey streamKey);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int sendSEIMessage(StreamIndex streamIndex, VideoExternalData videoExternalData, int i, SEICountPerFrame sEICountPerFrame);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i, SEICountPerFrame sEICountPerFrame);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setAudioContentType(StreamIndex streamIndex, AudioContentTypeConfig audioContentTypeConfig);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setAudioEncodeConfig(StreamIndex streamIndex, AudioEncodeConfig audioEncodeConfig);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setAudioRenderType(AudioRenderType audioRenderType);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setAudioScene(AudioSceneType audioSceneType);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setAudioSourceType(AudioSourceType audioSourceType);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setBusinessId(String str);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setCaptureVolume(StreamIndex streamIndex, int i);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setCellularEnhancement(MediaTypeEnhancementConfig mediaTypeEnhancementConfig);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setDefaultAudioRoute(AudioRoute audioRoute);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setExternalVideoEncoderEventHandler(IExternalVideoEncoderEventHandler iExternalVideoEncoderEventHandler);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setLiveBitrateGearTable(VideoEncoderConfig[] videoEncoderConfigArr, int i);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setLocalStreamPriority(StreamIndex streamIndex, StreamPriority streamPriority);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, int i);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract void setMixedStreamToCDNObserver(String str, IMixedStreamObserver iMixedStreamObserver);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setOnDestroyCompletedCallback(Runnable runnable);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setPerformanceGrade(StrategyGrade strategyGrade);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setPlaybackVolume(int i);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setPublishFallbackOption(PublishFallbackOption publishFallbackOption);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setRemoteAudioPlaybackVolume(StreamKey streamKey, int i);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setRemoteAudioPlaybackVolume(String str, String str2, int i);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setRemoteUserPriority(String str, String str2, RemoteUserPriority remoteUserPriority);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setRemoteVideoCanvas(StreamKey streamKey, VideoCanvas videoCanvas);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setRemoteVideoRenderConfig(StreamKey streamKey, LyraxVideoRenderConfig lyraxVideoRenderConfig);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract void setRemoteVideoRenderTargetView(String str, View view);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setRemoteVideoSink(StreamKey streamKey, IVideoSink iVideoSink, int i);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setRemoteVideoSuperResolution(StreamKey streamKey, VideoSuperResolutionMode videoSuperResolutionMode);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract void setRtcScene(RtcScene rtcScene);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setRtcVideoEventHandler(IRTCVideoEventHandler iRTCVideoEventHandler);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setRuntimeParameters(JSONObject jSONObject);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setSEICurrentShiftDiffTime(long j);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setScreenAudioSourceType(AudioSourceType audioSourceType);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setScreenAudioStreamIndex(StreamIndex streamIndex);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract void setStrategyInfo(String str);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setVideoCaptureConfig(StreamIndex streamIndex, com.ss.bytertc.engine.video.VideoCaptureConfig videoCaptureConfig);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setVideoCaptureConfig(com.ss.bytertc.engine.video.VideoCaptureConfig videoCaptureConfig);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setVideoDecoderConfig(StreamKey streamKey, VideoDecoderConfig videoDecoderConfig);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setVideoEncoderConfig(StreamIndex streamIndex, VideoSolutionMode videoSolutionMode, VideoEncoderConfig[] videoEncoderConfigArr, int i);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setVideoEncoderConfig(VideoEncoderConfig[] videoEncoderConfigArr);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setVideoPerformanceConfig(StreamIndex streamIndex, int i, int i2, int i3);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setVideoSource(StreamIndex streamIndex, InternalVideoSourceConfig internalVideoSourceConfig);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int setVideoSourceType(StreamIndex streamIndex, VideoSourceType videoSourceType);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract void setVideoStrategyRunner(IVideoStrategyRunner iVideoStrategyRunner);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int startAudioCapture();

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int startChorusCacheSync(ChorusCacheSyncConfig chorusCacheSyncConfig, IChorusCacheSyncObserver iChorusCacheSyncObserver);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int startNetworkDetection(boolean z, int i, boolean z2, int i2);

    @Override // com.ss.bytertc.engine.RTCVideoInterface, X.InterfaceC1276010jJH
    public abstract int startPushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig, IMixedStreamObserver iMixedStreamObserver);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int startPushVideoFile(StreamIndex streamIndex, String str, boolean z);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int stopAudioCapture();

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int stopChorusCacheSync();

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int stopNetworkDetection();

    @Override // com.ss.bytertc.engine.RTCVideoInterface, X.InterfaceC1276010jJH
    public abstract int stopPushStreamToCDN(String str);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int stopPushVideoFile(StreamIndex streamIndex);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int switchToLinkmicWithConfig(StreamIndex streamIndex, VideoSolutionMode videoSolutionMode, VideoEncoderConfig[] videoEncoderConfigArr, int i);

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public abstract int updateExternalStats(StreamIndex streamIndex, LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats);

    @Override // com.ss.bytertc.engine.RTCVideoInterface, X.InterfaceC1276010jJH
    public abstract int updatePushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig);

    public static synchronized void destroyRTCVideo() {
        RTCVideoImpl rTCVideoImpl = mInstance;
        if (rTCVideoImpl != null) {
            rTCVideoImpl.doDestroy(false);
            mInstance = null;
            mRtcNativeLibraryLoader = null;
            mRtcEglContextChecker = null;
        }
        RTCVideoImplV2 rTCVideoImplV2 = mInstanceV2;
        if (rTCVideoImplV2 != null) {
            rTCVideoImplV2.doDestroy();
            mInstanceV2 = null;
            mRtcNativeLibraryLoader = null;
            mRtcEglContextChecker = null;
        }
    }

    public static synchronized void destroyRTCVideoV2() {
        RTCVideoImplV2 rTCVideoImplV2 = mInstanceV2;
        if (rTCVideoImplV2 != null) {
            rTCVideoImplV2.doDestroy();
            mInstanceV2 = null;
            mRtcNativeLibraryLoader = null;
            mRtcEglContextChecker = null;
        }
    }

    public static String getSDKVersion() {
        return RTCVideoImpl.getSDKVersion();
    }

    public static void setAppContext(Context context) {
        NativeRTCVideoFunctions.nativeSetAppContext(context);
    }

    public static void setRtcEglContextChecker(RTCEglContextChecker rTCEglContextChecker) {
        if (rTCEglContextChecker != null) {
            mRtcEglContextChecker = rTCEglContextChecker;
            EglBaseCheckerHelper.setEglContextChecker(mRtcEglContextChecker);
        }
    }

    public static void setRtcNativeLibraryLoader(RTCNativeLibraryLoader rTCNativeLibraryLoader) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set rtc native library loader");
        sbLIZ.append(rTCNativeLibraryLoader);
        LogUtil.i("RtcVideo", C2188811AlT.LIZIZ(sbLIZ));
        mRtcNativeLibraryLoader = rTCNativeLibraryLoader;
    }

    public static synchronized RTCVideo createRTCVideo(Context context, IRTCVideoEventHandler iRTCVideoEventHandler, EngineConfig engineConfig) {
        if (EngineConfigCheck.checkValid(engineConfig) != 0) {
            return null;
        }
        try {
            engineConfig.parameters.put("rtc.native_load_path", engineConfig.nativeLoadPath);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        RTCVideoImpl rTCVideoImpl = mInstance;
        if (rTCVideoImpl != null) {
            return rTCVideoImpl;
        }
        try {
            RTCVideoImpl rTCVideoImpl2 = new RTCVideoImpl(context, engineConfig.appID, iRTCVideoEventHandler, engineConfig.eglContext, engineConfig.glesVersion, engineConfig.parameters);
            mInstance = rTCVideoImpl2;
            return rTCVideoImpl2;
        } catch (IllegalStateException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createRTCVideo: throw exception ");
            sbLIZ.append(e2.getMessage());
            LogUtil.e("RtcVideo", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static synchronized RTCVideo createRTCVideo(Context context, String str, IRTCVideoEventHandler iRTCVideoEventHandler, Object obj, JSONObject jSONObject) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                RTCVideoImpl rTCVideoImpl = mInstance;
                if (rTCVideoImpl == null && mInstanceEx == null) {
                    try {
                        RTCVideoImpl rTCVideoImpl2 = new RTCVideoImpl(context, str, iRTCVideoEventHandler, obj, GLESVersion.GLES_VERSION_2, jSONObject, false);
                        mInstance = rTCVideoImpl2;
                        return rTCVideoImpl2;
                    } catch (IllegalStateException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("createRTCVideo: throw exception ");
                        sbLIZ.append(e.getMessage());
                        LogUtil.e("RtcVideo", C2188811AlT.LIZIZ(sbLIZ));
                        return null;
                    }
                }
                return rTCVideoImpl;
            }
        }
        LogUtil.e("RtcVideo", "createRTCVideo: context or app id is empty");
        return null;
    }

    public static synchronized RTCVideo createRTCVideo(Context context, String str, IRTCVideoEventHandler iRTCVideoEventHandler, Object obj, GLESVersion gLESVersion, JSONObject jSONObject) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                RTCVideoImpl rTCVideoImpl = mInstance;
                if (rTCVideoImpl == null && mInstanceEx == null) {
                    try {
                        RTCVideoImpl rTCVideoImpl2 = new RTCVideoImpl(context, str, iRTCVideoEventHandler, obj, gLESVersion, jSONObject, false);
                        mInstance = rTCVideoImpl2;
                        return rTCVideoImpl2;
                    } catch (IllegalStateException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("createRTCVideo: throw exception ");
                        sbLIZ.append(e.getMessage());
                        LogUtil.e("RtcVideo", C2188811AlT.LIZIZ(sbLIZ));
                        return null;
                    }
                }
                return rTCVideoImpl;
            }
        }
        LogUtil.e("RtcVideo", "createRTCVideo: context or app id is empty");
        return null;
    }

    public static synchronized RTCVideo createRTCVideoV2(Context context, String str, IRTCVideoEventHandler iRTCVideoEventHandler, Object obj, GLESVersion gLESVersion, JSONObject jSONObject) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                RTCVideoImplV2 rTCVideoImplV2 = mInstanceV2;
                if (rTCVideoImplV2 != null) {
                    return rTCVideoImplV2;
                }
                try {
                    RTCVideoImplV2 rTCVideoImplV22 = new RTCVideoImplV2(context, str, iRTCVideoEventHandler, obj, gLESVersion, jSONObject);
                    mInstanceV2 = rTCVideoImplV22;
                    return rTCVideoImplV22;
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("createRTCVideoV2: throw exception ");
                    sbLIZ.append(e.getMessage());
                    LogUtil.e("RtcVideo", C2188811AlT.LIZIZ(sbLIZ));
                    return null;
                }
            }
        }
        LogUtil.e("RtcVideo", "createRTCVideoV2: context or app id is empty");
        return null;
    }
}
