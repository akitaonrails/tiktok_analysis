package com.ss.lyrax;

import com.ss.lyrax.room.ILyraxRoomAutoSubscribeStrategy;
import com.ss.lyrax.room.ILyraxRoomListener;
import com.ss.lyrax.room.LyraxLinkMicType;
import com.ss.lyrax.room.LyraxMessageType;
import com.ss.lyrax.room.LyraxPostProcessParameter;
import com.ss.lyrax.room.LyraxRoomAttribute;
import com.ss.lyrax.room.LyraxRoomConfig;
import com.ss.lyrax.room.LyraxRoomVisibility;
import com.ss.lyrax.room.LyraxUserInfo;
import com.ss.lyrax.room.LyraxVideoRemoteConfig;
import com.ss.lyrax.stream.LyraxForwardStreamInfo;
import com.ss.lyrax.stream.LyraxStreamIndex;
import com.ss.lyrax.stream.LyraxStreamMediaType;
import com.ss.lyrax.transcoder.LyraxTranscoderParam;
import com.ss.lyrax.utils.LyraxValue;
import com.ss.lyrax.video.LyraxVideoPerfDegradeLimit;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxRoom extends ILyraxObject {
    LyraxErrorCode addPublisher(ILyraxPublisher iLyraxPublisher);

    LyraxErrorCode addSubscriber(ILyraxSubscriber iLyraxSubscriber);

    void dispose();

    boolean findPublisher(ILyraxPublisher iLyraxPublisher);

    String getLocalUserId();

    ILyraxPublisher getPublisher(LyraxStreamIndex lyraxStreamIndex);

    String getRoomId();

    LyraxErrorCode joinRoom(String str, LyraxUserInfo lyraxUserInfo, LyraxRoomConfig lyraxRoomConfig);

    LyraxErrorCode leaveRoom();

    LyraxErrorCode muteAllRemoteStream(LyraxStreamIndex lyraxStreamIndex, LyraxStreamMediaType lyraxStreamMediaType);

    LyraxErrorCode pauseAllSubscribedStream(LyraxStreamMediaType lyraxStreamMediaType);

    LyraxErrorCode removePublisher(ILyraxPublisher iLyraxPublisher);

    LyraxErrorCode removeSubscriber(ILyraxSubscriber iLyraxSubscriber);

    LyraxErrorCode replayUserInfoNotification();

    LyraxErrorCode resumeAllSubscribedStream(LyraxStreamMediaType lyraxStreamMediaType);

    long sendRoomMessage(String str);

    long sendUserMessage(String str, String str2, LyraxMessageType lyraxMessageType);

    LyraxErrorCode setDefaultRemoteVideoConfig(LyraxVideoRemoteConfig lyraxVideoRemoteConfig);

    LyraxErrorCode setLinkMicType(LyraxLinkMicType lyraxLinkMicType);

    LyraxErrorCode setListener(ILyraxRoomListener iLyraxRoomListener);

    LyraxErrorCode setLyraxRoomAutoSubscribeStrategy(ILyraxRoomAutoSubscribeStrategy iLyraxRoomAutoSubscribeStrategy);

    LyraxErrorCode setPostProcessParameter(LyraxPostProcessParameter lyraxPostProcessParameter);

    LyraxErrorCode setRemoteAudioPlaybackVolume(int i);

    LyraxErrorCode setRemoteAudioPlaybackVolume(String str, int i);

    LyraxErrorCode setRoomAttribute(LyraxRoomAttribute lyraxRoomAttribute, LyraxValue lyraxValue);

    LyraxErrorCode setRoomVisibility(LyraxRoomVisibility lyraxRoomVisibility);

    LyraxErrorCode setUserVisibility(boolean z);

    LyraxErrorCode setVideoPerfDegradeLimit(String str, LyraxStreamIndex lyraxStreamIndex, LyraxVideoPerfDegradeLimit lyraxVideoPerfDegradeLimit);

    LyraxErrorCode startForwardStreamToRooms(List<LyraxForwardStreamInfo> list);

    LyraxErrorCode startPushMixedStreamToCDN(String str, LyraxTranscoderParam lyraxTranscoderParam);

    LyraxErrorCode stopForwardStreamToRooms();

    LyraxErrorCode stopPushMixedStreamToCDN(String str);

    LyraxErrorCode unmuteAllRemoteStream(LyraxStreamIndex lyraxStreamIndex, LyraxStreamMediaType lyraxStreamMediaType);

    LyraxErrorCode updateForwardStreamToRooms(List<LyraxForwardStreamInfo> list);

    LyraxErrorCode updatePushMixedStreamToCDN(String str, LyraxTranscoderParam lyraxTranscoderParam);

    LyraxErrorCode updateToken(String str);
}
