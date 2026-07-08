package com.ss.bytertc.engine.handler;

import X.C1275760jIs;
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
public abstract class IRTCRoomEventHandlerAdapter implements IRTCRoomEventHandler {
    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onAVSyncStateChange(AVSyncState aVSyncState) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onAudioStreamBanned(String str, boolean z) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public /* synthetic */ void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
        C1275760jIs.LIZ(this, lyraxTranscoderFeatureEvent);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onLocalStreamStats(LocalStreamStats localStreamStats) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onPublishPrivilegeTokenWillExpire() {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomError(int i) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomMessageReceived(String str, String str2) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomMessageSendResult(long j, int i) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomStateChanged(String str, String str2, int i, String str3) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomStats(RTCRoomStats rTCRoomStats) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomWarning(int i) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamAdd(RTCStream rTCStream) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamPublishSuccess(String str, boolean z) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamStateChanged(StreamKey streamKey, int i, String str) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamStateChanged(String str, String str2, int i, String str3) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onSubscribePrivilegeTokenWillExpire() {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onTokenWillExpire() {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserBizSessionId(String str, String str2) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserJoined(UserInfo userInfo, int i) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserLeave(String str, int i) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserMessageReceived(String str, String str2) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserMessageSendResult(long j, int i) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserPublishScreen(String str, MediaStreamType mediaStreamType) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserPublishStream(StreamKey streamKey, boolean z, MediaStreamType mediaStreamType) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserPublishStream(String str, MediaStreamType mediaStreamType) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserUnpublishScreen(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserUnpublishStream(StreamKey streamKey, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserUnpublishStream(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserVisibilityChanged(boolean z, UserVisibilityChangeError userVisibilityChangeError) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onVideoStreamBanned(String str, boolean z) {
    }
}
