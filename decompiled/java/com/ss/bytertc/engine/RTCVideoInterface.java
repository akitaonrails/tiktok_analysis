package com.ss.bytertc.engine;

import android.content.Context;
import android.view.View;
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
import com.ss.bytertc.engine.handler.IExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.live.ChorusCacheSyncConfig;
import com.ss.bytertc.engine.live.IChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.live.MixedStreamConfig;
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
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public interface RTCVideoInterface {

    public interface RemoteVideoRendererProvider {
        ILyraxVideoRenderer createRemoteVideoRenderer(RemoteVideoRendererConfig remoteVideoRendererConfig);
    }

    int bindToStandardDowngradeTier(StreamIndex streamIndex, int i, int i2, int i3, int i4);

    String buildRemoteVideoRenderId(StreamKey streamKey);

    RTCRoom createRTCRoom(String str);

    void detachRemoteVideoRenderer(StreamKey streamKey);

    int disableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod);

    int disableAudioProcessor(AudioProcessorMethod audioProcessorMethod);

    int disableDownlinkAudioSelection();

    int enableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod, AudioFormat audioFormat);

    int enableAudioProcessor(AudioProcessorMethod audioProcessorMethod, AudioFormat audioFormat);

    int enableAudioPropertiesReport(AudioPropertiesConfig audioPropertiesConfig);

    int enableAudioToAvatarMode(StreamIndex streamIndex, boolean z);

    int enableDownlinkAudioSelection(int i);

    int enableSEISendE2EInfo(boolean z, int i);

    int enableSimulcastMode(boolean z);

    RTCRoom getLivePusherRoom();

    RTCRoom getLivePusherRoom(String str);

    String getLivePusherTaskId();

    ILyraxAudioPlayer getLyraxAudioPlayer(int i);

    long getNativeHandle();

    NetworkTimeInfo getNetworkTimeInfo();

    LyraxVideoFrame getPooledFrame(VideoPixelFormat videoPixelFormat, int i, int i2, int i3, VideoRotation videoRotation, ColorSpace colorSpace);

    View getRemoteVideoRenderTargetView(StreamKey streamKey);

    ILyraxVideoRenderer getRemoteVideoRenderer(StreamKey streamKey);

    VideoCodecDescription[] getVideoTargetDecoderDescriptions(StreamIndex streamIndex);

    boolean isLyraxFrameEnabled();

    int pullExternalAudioFrame(AudioFrame audioFrame);

    int pushExternalAudioFrame(AudioFrame audioFrame);

    int pushExternalEncodedVideoFrame(StreamIndex streamIndex, int i, RTCEncodedVideoFrame rTCEncodedVideoFrame);

    int pushExternalVideoFrame(StreamIndex streamIndex, VideoFrame videoFrame);

    int pushExternalVideoFrame(VideoFrame videoFrame);

    int pushExternalVideoFrame(VideoFrame videoFrame, boolean z);

    int pushScreenAudioFrame(AudioFrame audioFrame);

    int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver);

    int registerAudioProcessor(IAudioFrameProcessor iAudioFrameProcessor);

    int registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver);

    int registerRemoteEncodedVideoFrameObserver(IRemoteEncodedVideoFrameObserver iRemoteEncodedVideoFrameObserver);

    int replaceBackground(BackgroundMode backgroundMode, DivideModel divideModel);

    int requestRemoteVideoKeyFrame(StreamKey streamKey);

    int sendSEIMessage(StreamIndex streamIndex, VideoExternalData videoExternalData, int i, SEICountPerFrame sEICountPerFrame);

    int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i, SEICountPerFrame sEICountPerFrame);

    int setAudioContentType(StreamIndex streamIndex, AudioContentTypeConfig audioContentTypeConfig);

    int setAudioEncodeConfig(StreamIndex streamIndex, AudioEncodeConfig audioEncodeConfig);

    int setAudioRenderType(AudioRenderType audioRenderType);

    int setAudioScene(AudioSceneType audioSceneType);

    int setAudioSourceType(AudioSourceType audioSourceType);

    int setBusinessId(String str);

    int setCaptureVolume(StreamIndex streamIndex, int i);

    int setCellularEnhancement(MediaTypeEnhancementConfig mediaTypeEnhancementConfig);

    int setDefaultAudioRoute(AudioRoute audioRoute);

    int setExternalVideoEncoderEventHandler(IExternalVideoEncoderEventHandler iExternalVideoEncoderEventHandler);

    int setLiveBitrateGearTable(VideoEncoderConfig[] videoEncoderConfigArr, int i);

    int setLocalStreamPriority(StreamIndex streamIndex, StreamPriority streamPriority);

    int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas);

    int setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, int i);

    void setMixedStreamToCDNObserver(String str, IMixedStreamObserver iMixedStreamObserver);

    int setOnDestroyCompletedCallback(Runnable runnable);

    int setPerformanceGrade(StrategyGrade strategyGrade);

    int setPlaybackVolume(int i);

    int setPublishFallbackOption(PublishFallbackOption publishFallbackOption);

    int setRemoteAudioPlaybackVolume(StreamKey streamKey, int i);

    int setRemoteAudioPlaybackVolume(String str, String str2, int i);

    int setRemoteUserPriority(String str, String str2, RemoteUserPriority remoteUserPriority);

    int setRemoteVideoCanvas(StreamKey streamKey, VideoCanvas videoCanvas);

    int setRemoteVideoRenderConfig(StreamKey streamKey, LyraxVideoRenderConfig lyraxVideoRenderConfig);

    void setRemoteVideoRenderTargetView(String str, View view);

    int setRemoteVideoSink(StreamKey streamKey, IVideoSink iVideoSink, int i);

    int setRemoteVideoSuperResolution(StreamKey streamKey, VideoSuperResolutionMode videoSuperResolutionMode);

    void setRtcScene(RtcScene rtcScene);

    int setRtcVideoEventHandler(IRTCVideoEventHandler iRTCVideoEventHandler);

    int setRuntimeParameters(JSONObject jSONObject);

    int setSEICurrentShiftDiffTime(long j);

    int setScreenAudioSourceType(AudioSourceType audioSourceType);

    int setScreenAudioStreamIndex(StreamIndex streamIndex);

    void setStrategyInfo(String str);

    int setSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions);

    int setVideoCaptureConfig(StreamIndex streamIndex, com.ss.bytertc.engine.video.VideoCaptureConfig videoCaptureConfig);

    int setVideoCaptureConfig(com.ss.bytertc.engine.video.VideoCaptureConfig videoCaptureConfig);

    int setVideoDecoderConfig(StreamKey streamKey, VideoDecoderConfig videoDecoderConfig);

    int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig);

    int setVideoEncoderConfig(StreamIndex streamIndex, VideoSolutionMode videoSolutionMode, VideoEncoderConfig[] videoEncoderConfigArr, int i);

    int setVideoEncoderConfig(VideoEncoderConfig[] videoEncoderConfigArr);

    int setVideoPerformanceConfig(StreamIndex streamIndex, int i, int i2, int i3);

    int setVideoSource(StreamIndex streamIndex, InternalVideoSourceConfig internalVideoSourceConfig);

    int setVideoSourceType(StreamIndex streamIndex, VideoSourceType videoSourceType);

    void setVideoStrategyRunner(IVideoStrategyRunner iVideoStrategyRunner);

    int startAudioCapture();

    int startChorusCacheSync(ChorusCacheSyncConfig chorusCacheSyncConfig, IChorusCacheSyncObserver iChorusCacheSyncObserver);

    int startNetworkDetection(boolean z, int i, boolean z2, int i2);

    int startPushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig, IMixedStreamObserver iMixedStreamObserver);

    int startPushVideoFile(StreamIndex streamIndex, String str, boolean z);

    int stopAudioCapture();

    int stopChorusCacheSync();

    int stopNetworkDetection();

    int stopPushStreamToCDN(String str);

    int stopPushVideoFile(StreamIndex streamIndex);

    int switchToLinkmicWithConfig(StreamIndex streamIndex, VideoSolutionMode videoSolutionMode, VideoEncoderConfig[] videoEncoderConfigArr, int i);

    int updateExternalStats(StreamIndex streamIndex, LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats);

    int updatePushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig);

    public static class RemoteVideoRendererConfig {
        public final Context context;
        public final boolean enableE2EDelayStats;
        public final boolean enableGLES3SupportOpt;
        public final boolean optimizeSwDecodeProcess;
        public final int rtcDeliverType;
        public final boolean useTextureView;

        public RemoteVideoRendererConfig(Context context, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.context = context;
            this.useTextureView = z;
            this.rtcDeliverType = i;
            this.optimizeSwDecodeProcess = z2;
            this.enableE2EDelayStats = z3;
            this.enableGLES3SupportOpt = z4;
        }
    }
}
