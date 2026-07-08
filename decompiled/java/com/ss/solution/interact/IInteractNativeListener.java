package com.ss.solution.interact;

import com.ss.lyrax.audio.LyraxAudioPropertiesInfo;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.lyrax.stream.LyraxStreamKey;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import com.ss.lyrax.video.LyraxVideoExtraData;

/* JADX INFO: loaded from: classes21.dex */
public interface IInteractNativeListener {
    void onAudioEnabled(boolean z, String str);

    void onAudioMuted(boolean z, String str);

    void onAuxStreamPublished(String str);

    void onAuxStreamRenderFrame(String str, int i);

    void onAuxStreamUnpublished(String str);

    void onConnectionDidInterrupted();

    void onConnectionDidLost();

    void onConnectionStateChanged(boolean z);

    void onDidLeaveChannel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    void onDidRejoinChannel(String str, String str2, int i);

    void onError(int i, String str);

    void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent);

    void onFirstLocalAudioFrame(int i);

    void onFirstLocalVideoFrame(int i, int i2, int i3);

    void onFirstRemoteAudioFrame(LyraxStreamKey lyraxStreamKey, int i);

    void onFirstRemoteAudioFrameDecoded(String str, int i);

    void onFirstRemoteAuxStreamVideoRendered(String str);

    void onFirstRemoteVideoDecoded(LyraxStreamKey lyraxStreamKey, int i, int i2, int i3);

    void onFirstRemoteVideoFrameRealRendered(LyraxStreamKey lyraxStreamKey, int i, int i2);

    void onFirstRemoteVideoFrameRendered(String str, int i, int i2);

    void onForwardStreamStateChanged(String str, int i, int i2);

    void onInfoCallback(int i, String str);

    void onJoinRoomResult(String str, String str2, int i, int i2);

    void onLocalAudioEnabled(boolean z, String str);

    void onLocalAudioPropertiesReport(LyraxAudioPropertiesInfo[] lyraxAudioPropertiesInfoArr, int i);

    void onLocalAudioStats(int i);

    void onLocalAudioVadState(int i);

    void onLocalAuxStreamStarted(String str, int i);

    void onLocalAuxStreamStopped(String str, int i);

    void onLocalVideoEnabled(boolean z, String str);

    void onLocalVideoStats(int i, int i2, int i3, int i4, int i5);

    void onMediaDeviceStateChanged(String str, int i, int i2, int i3);

    void onNetworkDetectionResult(int i, int i2, int i3, double d, int i4, int i5);

    void onNetworkDetectionStopped(int i);

    void onNetworkQuality(String str, int i, int i2);

    void onPerformanceAlarms(int i, int i2, int i3, int i4, int i5);

    void onPublishRtmpStreamSucceed();

    void onPublishStreamSucceed(String str);

    void onPublishVideoStats(int i, int i2);

    void onPushExternalVideoFrameSizeChanged(int i, int i2);

    void onRemoteAudioPropertiesReport(LyraxAudioPropertiesInfo[] lyraxAudioPropertiesInfoArr, int i);

    void onRemoteAudioStats(LyraxStreamKey lyraxStreamKey, int i);

    void onRemoteVideoFrameRendered(String str, int i, int i2);

    void onRemoteVideoStats(LyraxStreamKey lyraxStreamKey, int i, int i2, int i3, int i4, int i5);

    void onReportPushStreamEvent(String str, String str2);

    void onReportToTTMonitorData(String str, String str2);

    void onRoomMessageReceived(String str, String str2);

    void onRoomMessageSendResult(long j, int i);

    void onSceneSet(LyraxScene lyraxScene);

    void onStreamAdd(String str, String str2);

    void onStreamMixingEvent(int i, String str, int i2, int i3, String str2, int i4);

    void onStreamRemoved(String str, String str2);

    void onUpdateLayoutOfSessionViews(boolean z);

    void onUpdateLinkmicInfo(String str, String str2);

    void onUserBizSessionId(String str, String str2);

    void onUserJoined(String str, String str2, int i);

    void onUserMessageReceived(String str, String str2);

    void onUserMessageSendResult(long j, int i);

    void onUserOffline(String str, int i);

    void onVideoEnabled(boolean z, String str);

    void onVideoMuted(boolean z, String str);

    void onVideoSEIReceived(LyraxStreamKey lyraxStreamKey, LyraxVideoExtraData lyraxVideoExtraData);

    void onVideoSizeChanged(LyraxStreamKey lyraxStreamKey, int i, int i2, int i3);

    void onWarning(int i, String str);

    void onWillLeaveChannel();
}
