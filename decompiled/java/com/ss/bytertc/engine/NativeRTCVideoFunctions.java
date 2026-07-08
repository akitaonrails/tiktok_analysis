package com.ss.bytertc.engine;

import android.content.Context;
import android.view.View;
import com.ss.bytertc.engine.data.PreProcessVideoNodeStats;
import com.ss.bytertc.engine.handler.RTCExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.RTCLocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCVideoEventHandler;
import com.ss.bytertc.engine.handler.RTCVideoFrameObserver;
import com.ss.bytertc.engine.live.ChorusCacheSyncConfig;
import com.ss.bytertc.engine.live.ChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.live.PushMixedStreamToCDNObserver;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.IVideoStrategyRunner;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.LyraxVideoFrame;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class NativeRTCVideoFunctions {
    public static native int nativeBindToStandardDowngradeTier(long j, int i, int i2, int i3, int i4, int i5);

    public static native void nativeClearHardWareEncodeContext();

    public static native long nativeCreateRTCVideo(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2);

    public static native long nativeCreateRoom(long j, String str);

    public static native void nativeDestroyRTCVideo(long j);

    public static native int nativeDisableAudioFrameCallback(long j, int i);

    public static native int nativeDisableAudioProcessor(long j, int i);

    public static native int nativeDisableDownlinkAudioSelection(long j);

    public static native int nativeEnableAudioFrameCallback(long j, int i, int i2, int i3);

    public static native int nativeEnableAudioProcessor(long j, int i, int i2, int i3, int i4);

    public static native int nativeEnableAudioPropertiesReport(long j, int i, boolean z, boolean z2, int i2, float f, int i3, boolean z3);

    public static native int nativeEnableAudioToAvatarModeWithStreamId(long j, int i, boolean z);

    public static native int nativeEnableDownlinkAudioSelection(long j, int i);

    public static native int nativeEnableSEISendE2EInfo(long j, boolean z, int i);

    public static native int nativeEnableSimulcastMode(long j, boolean z);

    public static native long nativeGetLivePusherRoom(long j);

    public static native String nativeGetLivePusherRoomId(long j);

    public static native String nativeGetLivePusherTaskId(long j);

    public static native long nativeGetLyraxAudioPlayer(long j, int i);

    public static native NetworkTimeInfo nativeGetNetworkTimeInfo(long j);

    public static native String nativeGetSDKVersion();

    public static native VideoCodecDescription[] nativeGetVideoTargetDecoderDescriptions(long j, int i);

    public static native boolean nativeIsLyraxFrameEnabled(long j);

    public static native void nativeLogApiEvent(long j, String str, String str2);

    public static native int nativePullExternalAudioFrame(long j, byte[] bArr, int i, int i2, int i3);

    public static native int nativePushExternalAudioFrame(long j, byte[] bArr, int i, int i2, int i3);

    public static native int nativePushExternalByteRtcVideoFrame(long j, VideoFrame videoFrame);

    public static native int nativePushExternalEncodedVideoFrame(long j, int i, int i2, ByteBuffer byteBuffer, long j2, long j3, int i3, int i4, int i5, int i6, int i7);

    public static native int nativePushExternalVideoFrameEx(long j, int i, VideoFrame videoFrame);

    public static native int nativePushExternalWebrtcVideoFrame(long j, com.bytedance.realx.video.VideoFrame videoFrame, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, long j2);

    public static native int nativePushLyraxVideoFrame(long j, LyraxVideoFrame lyraxVideoFrame);

    public static native int nativePushLyraxVideoFrameEx(long j, int i, LyraxVideoFrame lyraxVideoFrame);

    public static native int nativePushScreenAudioFrame(long j, byte[] bArr, int i, int i2, int i3);

    public static native int nativeRegisterLocalEncodedVideoFrameObserver(long j, RTCLocalEncodedVideoFrameObserver rTCLocalEncodedVideoFrameObserver);

    public static native int nativeRegisterRemoteEncodedVideoFrameObserver(long j, RTCRemoteEncodedVideoFrameObserver rTCRemoteEncodedVideoFrameObserver);

    public static native int nativeRegisterVideoFrameObserver(long j, RTCVideoFrameObserver rTCVideoFrameObserver);

    public static native int nativeRequestRemoteVideoKeyFrame(long j, String str, String str2, int i);

    public static native int nativeSendMultiSEIMessagePerVideoFrame(long j, int i, byte[] bArr, int i2, int i3);

    public static native int nativeSendSEIMessageWithDataId(long j, int i, ByteBuffer byteBuffer, int i2, int i3, byte b);

    public static native void nativeSetAppContext(Context context);

    public static native void nativeSetAppState(long j, String str);

    public static native int nativeSetAudioContentTypeEx(long j, int i, boolean z, boolean z2, boolean z3);

    public static native int nativeSetAudioEncodeConfigEx(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public static native int nativeSetAudioFrameObserver(long j, IAudioFrameObserver iAudioFrameObserver);

    public static native int nativeSetAudioFrameProcessor(long j, IAudioFrameProcessor iAudioFrameProcessor);

    public static native int nativeSetAudioRenderType(long j, int i);

    public static native int nativeSetAudioScene(long j, int i);

    public static native int nativeSetAudioSourceType(long j, int i);

    public static native int nativeSetBusinessId(long j, String str);

    public static native int nativeSetCaptureVolume(long j, int i, int i2);

    public static native int nativeSetCellularEnhancement(long j, InternalMediaTypeEnhancementConfig internalMediaTypeEnhancementConfig);

    public static native int nativeSetDefaultAudioRoute(long j, int i);

    public static native int nativeSetExternalVideoEncoderEventHandler(long j, RTCExternalVideoEncoderEventHandler rTCExternalVideoEncoderEventHandler);

    public static native boolean nativeSetHardWareEncodeContext();

    public static native int nativeSetLiveBitrateGearTable(long j, List<InternalVideoEncoderConfig> list, int i);

    public static native int nativeSetLocalStreamPriorityEx(long j, int i, int i2);

    public static native int nativeSetLocalVideoCanvas(long j, int i, View view, int i2, int i3);

    public static native int nativeSetLocalVideoSink(long j, int i, IVideoSink iVideoSink, int i2);

    public static native void nativeSetMixedStreamToCDNObserver(long j, String str, PushMixedStreamToCDNObserver pushMixedStreamToCDNObserver);

    public static native void nativeSetNetworkRequestIntercept(int i);

    public static native int nativeSetParameters(String str);

    public static native int nativeSetPerformanceGrade(long j, int i);

    public static native int nativeSetPlaybackVolume(long j, int i);

    public static native int nativeSetPublishFallbackOption(long j, int i);

    public static native int nativeSetRemoteAudioPlaybackVolume(long j, String str, String str2, int i);

    public static native int nativeSetRemoteAudioPlaybackVolumeEx(long j, String str, String str2, int i, int i2);

    public static native int nativeSetRemoteSubscribeFallbackOption(long j, int i);

    public static native int nativeSetRemoteUserPriority(long j, String str, String str2, int i);

    public static native int nativeSetRemoteVideoSink(long j, String str, String str2, int i, IVideoSink iVideoSink, int i2);

    public static native int nativeSetRemoteVideoSuperResolution(long j, String str, String str2, int i, int i2);

    public static native void nativeSetRtcScene(long j, int i);

    public static native int nativeSetRuntimeParameters(long j, String str);

    public static native int nativeSetSEICurrentShiftDiffTime(long j, long j2);

    public static native int nativeSetScreenAudioSourceType(long j, int i);

    public static native int nativeSetScreenAudioStreamIndex(long j, int i);

    public static native void nativeSetStrategyInfo(long j, String str);

    public static native int nativeSetVideoCaptureConfig(long j, InternalVideoCaptureConfig internalVideoCaptureConfig);

    public static native int nativeSetVideoCaptureConfigEx(long j, int i, InternalVideoCaptureConfig internalVideoCaptureConfig);

    public static native int nativeSetVideoDecoderConfig(long j, String str, String str2, int i, int i2);

    public static native int nativeSetVideoEncoderConfigV2(long j, List<InternalVideoEncoderConfig> list);

    public static native int nativeSetVideoEncoderConfigWithSimulcast(long j, int i, int i2, List<InternalVideoEncoderConfig> list, int i3);

    public static native int nativeSetVideoPerformanceConfig(long j, int i, int i2, int i3, int i4);

    public static native int nativeSetVideoSourceEx(long j, int i, int i2, int i3);

    public static native int nativeSetVideoSourceTypeWithStreamId(long j, int i, int i2);

    public static native void nativeSetVideoStrategyRunner(long j, IVideoStrategyRunner iVideoStrategyRunner);

    public static native int nativeSetupLocalScreenSink(long j, IVideoSink iVideoSink, String str);

    public static native int nativeSetupLocalVideoSink(long j, IVideoSink iVideoSink, String str);

    public static native int nativeStartAudioCapture(long j);

    public static native int nativeStartChorusCacheSync(long j, ChorusCacheSyncConfig chorusCacheSyncConfig, ChorusCacheSyncObserver chorusCacheSyncObserver);

    public static native int nativeStartNetworkProbe(long j, boolean z, int i, boolean z2, int i2);

    public static native int nativeStartPushMixedStreamToCDN(long j, String str, MixedStreamConfig mixedStreamConfig, PushMixedStreamToCDNObserver pushMixedStreamToCDNObserver);

    public static native int nativeStartPushVideoFileWithStreamId(long j, int i, String str, boolean z);

    public static native int nativeStartScreenAudioCapture(long j);

    public static native int nativeStopAudioCapture(long j);

    public static native int nativeStopChorusCacheSync(long j);

    public static native int nativeStopNetworkProbe(long j);

    public static native int nativeStopPushStreamToCDN(long j, String str);

    public static native int nativeStopPushVideoFileWithStreamId(long j, int i);

    public static native int nativeStopScreenAudioCapture(long j);

    public static native int nativeUpdateExternalStats(long j, int i, PreProcessVideoNodeStats preProcessVideoNodeStats);

    public static native int nativeUpdatePushMixedStreamToCDN(long j, String str, MixedStreamConfig mixedStreamConfig);
}
