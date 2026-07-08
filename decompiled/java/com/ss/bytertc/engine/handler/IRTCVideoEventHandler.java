package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.GLESVersion;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.SysStats;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.ss.bytertc.engine.data.LocalAudioStreamError;
import com.ss.bytertc.engine.data.LocalAudioStreamState;
import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.data.RemoteAudioState;
import com.ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.StreamSycnInfoConfig;
import com.ss.bytertc.engine.data.VideoDenoiseMode;
import com.ss.bytertc.engine.data.VideoDenoiseModeChangedReason;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.ss.bytertc.engine.data.VideoSuperResolutionModeChangedReason;
import com.ss.bytertc.engine.type.AudioDeviceType;
import com.ss.bytertc.engine.type.FirstFramePlayState;
import com.ss.bytertc.engine.type.FirstFrameSendState;
import com.ss.bytertc.engine.type.LocalProxyError;
import com.ss.bytertc.engine.type.LocalProxyState;
import com.ss.bytertc.engine.type.LocalProxyType;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.LocalVideoStreamError;
import com.ss.bytertc.engine.type.LocalVideoStreamState;
import com.ss.bytertc.engine.type.NetworkDetectionLinkType;
import com.ss.bytertc.engine.type.NetworkDetectionStopReason;
import com.ss.bytertc.engine.type.PerformanceAlarmMode;
import com.ss.bytertc.engine.type.PerformanceAlarmReason;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteStreamSwitch;
import com.ss.bytertc.engine.type.RemoteVideoState;
import com.ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.ss.bytertc.engine.type.RtcUser;
import com.ss.bytertc.engine.type.SEIStreamUpdateEvent;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.bytertc.engine.type.VideoDeviceType;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.VideoExternalData;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public interface IRTCVideoEventHandler {
    void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i, int i2);

    void onAudioFramePlayStateChanged(StreamKey streamKey, String str, FirstFramePlayState firstFramePlayState);

    void onAudioFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState);

    void onAudioFrameSendStateChanged(StreamKey streamKey, String str, FirstFrameSendState firstFrameSendState);

    void onAudioFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState);

    void onAudioProfanityDetectedCallback(String str);

    void onAudioRouteChanged(AudioRoute audioRoute);

    void onConnectionStateChanged(int i, int i2);

    void onCreateRoomStateChanged(String str, int i);

    void onError(int i);

    void onExtensionAccessError(String str, String str2);

    void onFirstLocalAudioFrame(StreamIndex streamIndex);

    void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo);

    void onFirstRemoteAudioFrame(StreamKey streamKey);

    void onFirstRemoteVideoFrameDecoded(StreamKey streamKey, VideoFrameInfo videoFrameInfo);

    void onFirstRemoteVideoFrameRendered(StreamKey streamKey, VideoFrameInfo videoFrameInfo);

    void onHardwareROISupportStateUpdated(boolean z);

    void onInitializedEngineEGL(GLESVersion gLESVersion);

    void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr);

    void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError);

    void onLocalProxyStateChanged(LocalProxyType localProxyType, LocalProxyState localProxyState, LocalProxyError localProxyError);

    void onLocalStreamStats(StreamIndex streamIndex, LocalStreamStats localStreamStats);

    void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo);

    void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError);

    void onLogReport(String str, JSONObject jSONObject);

    void onLoggerMessage(LogUtil.LogLevel logLevel, String str, Throwable th);

    void onNetworkDetectionResult(NetworkDetectionLinkType networkDetectionLinkType, int i, int i2, double d, int i3, int i4);

    void onNetworkDetectionStopped(NetworkDetectionStopReason networkDetectionStopReason);

    void onNetworkTimeSynchronized();

    void onNetworkTypeChanged(int i);

    void onPerformanceAlarms(StreamIndex streamIndex, PerformanceAlarmMode performanceAlarmMode, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData);

    void onPerformanceAlarms(PerformanceAlarmMode performanceAlarmMode, String str, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData);

    void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i);

    void onRemoteAudioStateChanged(StreamKey streamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason);

    void onRemoteStreamStats(StreamKey streamKey, RemoteStreamStats remoteStreamStats);

    void onRemoteVideoFrameRelRendered(StreamKey streamKey, VideoFrameInfo videoFrameInfo);

    void onRemoteVideoFrameRendered(StreamKey streamKey, VideoFrameInfo videoFrameInfo);

    void onRemoteVideoInfoChanged(StreamKey streamKey, RTCStream rTCStream);

    void onRemoteVideoSizeChanged(StreamKey streamKey, VideoFrameInfo videoFrameInfo);

    void onRemoteVideoStateChanged(StreamKey streamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason);

    void onRemoteVideoSuperResolutionModeChanged(StreamKey streamKey, VideoSuperResolutionMode videoSuperResolutionMode, VideoSuperResolutionModeChangedReason videoSuperResolutionModeChangedReason);

    void onSEIMessageReceived(StreamKey streamKey, VideoExternalData videoExternalData);

    void onSEIMessageReceived(StreamKey streamKey, ByteBuffer byteBuffer);

    void onSEIStreamUpdate(StreamKey streamKey, SEIStreamUpdateEvent sEIStreamUpdateEvent);

    void onScreenVideoFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState);

    void onScreenVideoFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState);

    void onSimulcastSubscribeFallback(StreamKey streamKey, RemoteStreamSwitch remoteStreamSwitch);

    void onSimulcastSubscribeFallback(RemoteStreamSwitch remoteStreamSwitch);

    void onStreamSyncInfoReceived(StreamKey streamKey, StreamSycnInfoConfig.SyncInfoStreamType syncInfoStreamType, ByteBuffer byteBuffer);

    void onSysStats(SysStats sysStats);

    void onUserStartAudioCapture(String str, String str2);

    void onUserStartVideoCapture(String str, String str2);

    void onUserStopAudioCapture(String str, String str2);

    void onUserStopVideoCapture(String str, String str2);

    void onVideoDenoiseModeChanged(VideoDenoiseMode videoDenoiseMode, VideoDenoiseModeChangedReason videoDenoiseModeChangedReason);

    void onVideoDeviceStateChanged(String str, VideoDeviceType videoDeviceType, int i, int i2);

    void onVideoDeviceWarning(String str, VideoDeviceType videoDeviceType, int i);

    void onVideoFramePlayStateChanged(StreamKey streamKey, String str, FirstFramePlayState firstFramePlayState);

    void onVideoFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState);

    void onVideoFrameSendStateChanged(StreamIndex streamIndex, String str, FirstFrameSendState firstFrameSendState);

    void onVideoFrameSendStateChanged(StreamKey streamKey, String str, FirstFrameSendState firstFrameSendState);

    void onVideoFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState);

    void onWarning(int i);
}
