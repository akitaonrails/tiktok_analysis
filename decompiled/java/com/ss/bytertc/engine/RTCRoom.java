package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.ForwardStreamInfo;
import com.ss.bytertc.engine.data.RemoteVideoConfig;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.type.DownLinkAudioSelectionPriority;
import com.ss.bytertc.engine.type.LinkMicType;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.MessageConfig;
import com.ss.bytertc.engine.type.PauseResumeControlMediaType;
import com.ss.bytertc.engine.type.SubscribeMediaType;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class RTCRoom implements RTCRoomInterface {
    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract void destroy();

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract String getRoomId();

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int joinRoom(String str, UserInfo userInfo, RTCRoomConfig rTCRoomConfig);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int leaveRoom();

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int pauseAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int pauseForwardStreamToAllRooms();

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int publishScreen(MediaStreamType mediaStreamType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int publishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int publishStream(MediaStreamType mediaStreamType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int replayLivePusherNeedEvent();

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int resumeAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int resumeForwardStreamToAllRooms();

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract long sendRoomBinaryMessage(byte[] bArr);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract long sendRoomMessage(String str);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract long sendUserBinaryMessage(String str, byte[] bArr, MessageConfig messageConfig);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract long sendUserMessage(String str, String str2, MessageConfig messageConfig);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int setBizSessionId(String str);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int setBusinessLabel(String str);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int setDefaultRemoteVideoConfig(RemoteVideoConfig remoteVideoConfig);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int setDownLinkAudioSelectionPriority(StreamIndex streamIndex, DownLinkAudioSelectionPriority downLinkAudioSelectionPriority);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int setGroupChannelId(String str);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int setLinkMicType(LinkMicType linkMicType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int setPostProcessParameter(PostProcessParameter postProcessParameter);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int setRemoteRoomAudioPlaybackVolume(int i);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int setRemoteVideoConfig(String str, RemoteVideoConfig remoteVideoConfig);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int setRemoteVideoConfig(String str, StreamIndex streamIndex, RemoteVideoConfig remoteVideoConfig);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int setRemoteVideoPerformanceConfig(String str, StreamIndex streamIndex, RemoteVideoConfig remoteVideoConfig);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int setUserVisibility(boolean z);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int startForwardStreamToRooms(List<ForwardStreamInfo> list);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int stopForwardStreamToRooms();

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int subscribeAllStreams(StreamIndex streamIndex, MediaStreamType mediaStreamType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int subscribeScreen(String str, MediaStreamType mediaStreamType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int subscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int subscribeStream(String str, MediaStreamType mediaStreamType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int subscribeUserStream(String str, StreamIndex streamIndex, SubscribeMediaType subscribeMediaType, SubscribeVideoConfig subscribeVideoConfig);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int unpublishScreen(MediaStreamType mediaStreamType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int unpublishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int unpublishStream(MediaStreamType mediaStreamType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int unsubscribeAllStreams(StreamIndex streamIndex, MediaStreamType mediaStreamType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int unsubscribeScreen(String str, MediaStreamType mediaStreamType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int unsubscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int unsubscribeStream(String str, MediaStreamType mediaStreamType);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int updateForwardStreamToRooms(List<ForwardStreamInfo> list);

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public abstract int updateToken(String str);
}
