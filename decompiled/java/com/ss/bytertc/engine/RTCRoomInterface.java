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
public interface RTCRoomInterface {
    void destroy();

    String getRoomId();

    int joinRoom(String str, UserInfo userInfo, RTCRoomConfig rTCRoomConfig);

    int leaveRoom();

    int pauseAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType);

    int pauseForwardStreamToAllRooms();

    int publishScreen(MediaStreamType mediaStreamType);

    int publishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType);

    int publishStream(MediaStreamType mediaStreamType);

    int replayLivePusherNeedEvent();

    int resumeAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType);

    int resumeForwardStreamToAllRooms();

    long sendRoomBinaryMessage(byte[] bArr);

    long sendRoomMessage(String str);

    long sendUserBinaryMessage(String str, byte[] bArr, MessageConfig messageConfig);

    long sendUserMessage(String str, String str2, MessageConfig messageConfig);

    int setBizSessionId(String str);

    int setBusinessLabel(String str);

    int setDefaultRemoteVideoConfig(RemoteVideoConfig remoteVideoConfig);

    int setDownLinkAudioSelectionPriority(StreamIndex streamIndex, DownLinkAudioSelectionPriority downLinkAudioSelectionPriority);

    int setGroupChannelId(String str);

    int setLinkMicType(LinkMicType linkMicType);

    int setPostProcessParameter(PostProcessParameter postProcessParameter);

    int setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler);

    int setRemoteRoomAudioPlaybackVolume(int i);

    int setRemoteVideoConfig(String str, RemoteVideoConfig remoteVideoConfig);

    int setRemoteVideoConfig(String str, StreamIndex streamIndex, RemoteVideoConfig remoteVideoConfig);

    int setRemoteVideoPerformanceConfig(String str, StreamIndex streamIndex, RemoteVideoConfig remoteVideoConfig);

    int setUserVisibility(boolean z);

    int startForwardStreamToRooms(List<ForwardStreamInfo> list);

    int stopForwardStreamToRooms();

    int subscribeAllStreams(StreamIndex streamIndex, MediaStreamType mediaStreamType);

    int subscribeScreen(String str, MediaStreamType mediaStreamType);

    int subscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType);

    int subscribeStream(String str, MediaStreamType mediaStreamType);

    int subscribeUserStream(String str, StreamIndex streamIndex, SubscribeMediaType subscribeMediaType, SubscribeVideoConfig subscribeVideoConfig);

    int unpublishScreen(MediaStreamType mediaStreamType);

    int unpublishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType);

    int unpublishStream(MediaStreamType mediaStreamType);

    int unsubscribeAllStreams(StreamIndex streamIndex, MediaStreamType mediaStreamType);

    int unsubscribeScreen(String str, MediaStreamType mediaStreamType);

    int unsubscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType);

    int unsubscribeStream(String str, MediaStreamType mediaStreamType);

    int updateForwardStreamToRooms(List<ForwardStreamInfo> list);

    int updateToken(String str);
}
