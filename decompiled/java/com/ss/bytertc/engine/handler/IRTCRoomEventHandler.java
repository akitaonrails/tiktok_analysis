package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.data.AVSyncState;
import com.ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.StreamRemoveReason;
import com.ss.bytertc.engine.type.UserVisibilityChangeError;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public interface IRTCRoomEventHandler {
    void onAVSyncStateChange(AVSyncState aVSyncState);

    void onAudioStreamBanned(String str, boolean z);

    void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent);

    void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr);

    void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr);

    void onLeaveRoom(RTCRoomStats rTCRoomStats);

    void onLocalStreamStats(LocalStreamStats localStreamStats);

    void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr);

    void onPublishPrivilegeTokenWillExpire();

    void onRemoteStreamStats(RemoteStreamStats remoteStreamStats);

    void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer);

    void onRoomError(int i);

    void onRoomMessageReceived(String str, String str2);

    void onRoomMessageSendResult(long j, int i);

    void onRoomStateChanged(String str, String str2, int i, String str3);

    void onRoomStats(RTCRoomStats rTCRoomStats);

    void onRoomWarning(int i);

    void onStreamAdd(RTCStream rTCStream);

    void onStreamPublishSuccess(String str, boolean z);

    void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason);

    void onStreamStateChanged(StreamKey streamKey, int i, String str);

    void onStreamStateChanged(String str, String str2, int i, String str3);

    void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig);

    void onSubscribePrivilegeTokenWillExpire();

    void onTokenWillExpire();

    void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer);

    void onUserBizSessionId(String str, String str2);

    void onUserJoined(UserInfo userInfo, int i);

    void onUserLeave(String str, int i);

    void onUserMessageReceived(String str, String str2);

    void onUserMessageSendResult(long j, int i);

    void onUserPublishScreen(String str, MediaStreamType mediaStreamType);

    void onUserPublishStream(StreamKey streamKey, boolean z, MediaStreamType mediaStreamType);

    void onUserPublishStream(String str, MediaStreamType mediaStreamType);

    void onUserUnpublishScreen(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason);

    void onUserUnpublishStream(StreamKey streamKey, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason);

    void onUserUnpublishStream(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason);

    void onUserVisibilityChanged(boolean z, UserVisibilityChangeError userVisibilityChangeError);

    void onVideoStreamBanned(String str, boolean z);
}
