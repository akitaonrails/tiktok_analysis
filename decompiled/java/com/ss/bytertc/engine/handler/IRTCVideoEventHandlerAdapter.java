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
public abstract class IRTCVideoEventHandlerAdapter implements IRTCVideoEventHandler {
    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i, int i2) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioFramePlayStateChanged(StreamKey streamKey, String str, FirstFramePlayState firstFramePlayState) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioFrameSendStateChanged(StreamKey streamKey, String str, FirstFrameSendState firstFrameSendState) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioProfanityDetectedCallback(String str) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioRouteChanged(AudioRoute audioRoute) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onConnectionStateChanged(int i, int i2) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onCreateRoomStateChanged(String str, int i) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onError(int i) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onExtensionAccessError(String str, String str2) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstRemoteAudioFrame(StreamKey streamKey) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstRemoteVideoFrameDecoded(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstRemoteVideoFrameRendered(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onHardwareROISupportStateUpdated(boolean z) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onInitializedEngineEGL(GLESVersion gLESVersion) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalProxyStateChanged(LocalProxyType localProxyType, LocalProxyState localProxyState, LocalProxyError localProxyError) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalStreamStats(StreamIndex streamIndex, LocalStreamStats localStreamStats) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLogReport(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLoggerMessage(LogUtil.LogLevel logLevel, String str, Throwable th) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onNetworkDetectionResult(NetworkDetectionLinkType networkDetectionLinkType, int i, int i2, double d, int i3, int i4) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onNetworkDetectionStopped(NetworkDetectionStopReason networkDetectionStopReason) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onNetworkTimeSynchronized() {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onNetworkTypeChanged(int i) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onPerformanceAlarms(StreamIndex streamIndex, PerformanceAlarmMode performanceAlarmMode, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onPerformanceAlarms(PerformanceAlarmMode performanceAlarmMode, String str, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteAudioStateChanged(StreamKey streamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteStreamStats(StreamKey streamKey, RemoteStreamStats remoteStreamStats) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteVideoFrameRelRendered(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteVideoFrameRendered(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteVideoInfoChanged(StreamKey streamKey, RTCStream rTCStream) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteVideoSizeChanged(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteVideoStateChanged(StreamKey streamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteVideoSuperResolutionModeChanged(StreamKey streamKey, VideoSuperResolutionMode videoSuperResolutionMode, VideoSuperResolutionModeChangedReason videoSuperResolutionModeChangedReason) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onSEIMessageReceived(StreamKey streamKey, VideoExternalData videoExternalData) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onSEIMessageReceived(StreamKey streamKey, ByteBuffer byteBuffer) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onSEIStreamUpdate(StreamKey streamKey, SEIStreamUpdateEvent sEIStreamUpdateEvent) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onScreenVideoFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onScreenVideoFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onSimulcastSubscribeFallback(StreamKey streamKey, RemoteStreamSwitch remoteStreamSwitch) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onSimulcastSubscribeFallback(RemoteStreamSwitch remoteStreamSwitch) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onStreamSyncInfoReceived(StreamKey streamKey, StreamSycnInfoConfig.SyncInfoStreamType syncInfoStreamType, ByteBuffer byteBuffer) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onSysStats(SysStats sysStats) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserStartAudioCapture(String str, String str2) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserStartVideoCapture(String str, String str2) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserStopAudioCapture(String str, String str2) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserStopVideoCapture(String str, String str2) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onVideoDenoiseModeChanged(VideoDenoiseMode videoDenoiseMode, VideoDenoiseModeChangedReason videoDenoiseModeChangedReason) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onVideoDeviceStateChanged(String str, VideoDeviceType videoDeviceType, int i, int i2) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onVideoDeviceWarning(String str, VideoDeviceType videoDeviceType, int i) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onVideoFramePlayStateChanged(StreamKey streamKey, String str, FirstFramePlayState firstFramePlayState) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onVideoFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onVideoFrameSendStateChanged(StreamIndex streamIndex, String str, FirstFrameSendState firstFrameSendState) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onVideoFrameSendStateChanged(StreamKey streamKey, String str, FirstFrameSendState firstFrameSendState) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onVideoFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onWarning(int i) {
    }
}
