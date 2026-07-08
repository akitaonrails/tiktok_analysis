package com.ss.lyrax.room;

import com.ss.lyrax.ILyraxSubscriber;
import com.ss.lyrax.audio.LyraxAudioPropertiesInfo;
import com.ss.lyrax.stream.LyraxNetworkQualityStats;
import com.ss.lyrax.stream.LyraxPublisherStats;
import com.ss.lyrax.stream.LyraxStreamIndex;
import com.ss.lyrax.stream.LyraxStreamKey;
import com.ss.lyrax.stream.LyraxStreamMediaType;
import com.ss.lyrax.stream.LyraxSubscriberStats;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import com.ss.lyrax.transcoder.LyraxTranscoderMixingErrorCode;
import com.ss.lyrax.transcoder.LyraxTranscoderMixingEvent;
import com.ss.lyrax.transcoder.LyraxTranscoderMixingType;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxRoomListener {
    void onAddPublisherStateChanged(LyraxStreamKey lyraxStreamKey, int i, String str);

    void onAudioStreamBanned(String str, boolean z);

    void onCreateLyraxSubscriber(LyraxStreamKey lyraxStreamKey, ILyraxSubscriber iLyraxSubscriber);

    void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent);

    void onForwardStreamEvent(LyraxForwardStreamEventInfo[] lyraxForwardStreamEventInfoArr);

    void onForwardStreamStateChanged(LyraxForwardStreamStateInfo[] lyraxForwardStreamStateInfoArr);

    void onJoinRoom();

    void onLeaveRoom();

    void onLocalAudioPropertiesReport(LyraxAudioPropertiesInfo[] lyraxAudioPropertiesInfoArr);

    void onLocalStreamStats(LyraxStreamIndex lyraxStreamIndex, LyraxPublisherStats lyraxPublisherStats);

    void onNetworkQuality(LyraxNetworkQualityStats lyraxNetworkQualityStats, LyraxNetworkQualityStats[] lyraxNetworkQualityStatsArr);

    void onRemoteAudioPropertiesReport(LyraxAudioPropertiesInfo[] lyraxAudioPropertiesInfoArr, int i);

    void onRemoteStreamStats(LyraxStreamKey lyraxStreamKey, LyraxSubscriberStats lyraxSubscriberStats);

    void onRemoteVideoInfoChanged(LyraxStream lyraxStream);

    void onRemoveLyraxSubscriber(LyraxStreamKey lyraxStreamKey, ILyraxSubscriber iLyraxSubscriber);

    void onRoomMessageReceived(String str, String str2);

    void onRoomMessageSendResult(long j, int i);

    void onRoomStateChanged(String str, int i, String str2);

    void onRoomStats(LyraxRoomStats lyraxRoomStats);

    void onStreamAdd(LyraxStream lyraxStream);

    void onStreamMixingEvent(LyraxTranscoderMixingEvent lyraxTranscoderMixingEvent, String str, LyraxTranscoderMixingErrorCode lyraxTranscoderMixingErrorCode, int i, String str2, LyraxTranscoderMixingType lyraxTranscoderMixingType);

    void onStreamRemove(LyraxStream lyraxStream, LyraxStreamRemoveReason lyraxStreamRemoveReason);

    void onTokenWillExpire();

    void onUserBizSessionId(String str, String str2);

    void onUserJoined(LyraxUserInfo lyraxUserInfo, int i);

    void onUserLeave(String str, int i);

    void onUserMessageReceived(String str, String str2);

    void onUserMessageSendResult(long j, int i);

    void onUserPublishStream(LyraxStreamKey lyraxStreamKey, boolean z, LyraxStreamMediaType lyraxStreamMediaType);

    void onUserStartAudioCapture(String str);

    void onUserStopAudioCapture(String str);

    void onUserUnpublishStream(LyraxStreamKey lyraxStreamKey, LyraxStreamMediaType lyraxStreamMediaType, LyraxStreamRemoveReason lyraxStreamRemoveReason);

    void onUserVisibilityChanged(boolean z, LyraxUserVisibilityChangeError lyraxUserVisibilityChangeError);

    void onVideoStreamBanned(String str, boolean z);
}
