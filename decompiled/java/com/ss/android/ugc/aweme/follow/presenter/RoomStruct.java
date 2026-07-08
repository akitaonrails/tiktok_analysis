package com.ss.android.ugc.aweme.follow.presenter;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes34.dex */
public class RoomStruct extends LiveRoomStruct {
    public static RoomStruct fromAweme(Aweme aweme) {
        UrlModel avatarThumb;
        RoomStruct roomStruct = new RoomStruct();
        User author = aweme.getAuthor();
        roomStruct.owner = author;
        if (author != null) {
            roomStruct.id = author.roomId;
        }
        if (aweme.getRoom() != null) {
            roomStruct.id = aweme.getRoom().roomId;
            roomStruct.tvStationRoomStruct = aweme.getRoom().tvStationRoomStruct;
        }
        if (aweme.getAuthor() != null) {
            if (aweme.getAuthor().roomCover != null) {
                avatarThumb = aweme.getAuthor().roomCover;
            } else {
                avatarThumb = aweme.getAuthor().getAvatarThumb();
            }
            roomStruct.roomCover = avatarThumb;
        }
        if (aweme.getStreamUrlModel() != null) {
            StreamUrlStruct streamUrlStruct = new StreamUrlStruct();
            roomStruct.stream_url = streamUrlStruct;
            streamUrlStruct.rtmp_pull_url = aweme.getStreamUrlModel().rtmpPullUrl;
        }
        roomStruct.isOfficialType = false;
        roomStruct.isScreenshot = false;
        roomStruct.isThirdParty = false;
        roomStruct.liveTypeAudio = false;
        if (aweme.getVideoFeedTag() != null) {
            roomStruct.videoFeedTag = aweme.getVideoFeedTag();
        }
        return roomStruct;
    }

    public static LiveMode getStreamType(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct.isScreenshot) {
            return LiveMode.SCREEN_RECORD;
        }
        int i = liveRoomStruct.liveRoomMode;
        if (i == 6) {
            return LiveMode.LIVE_STUDIO;
        }
        if (liveRoomStruct.isThirdParty) {
            return LiveMode.THIRD_PARTY;
        }
        if (liveRoomStruct.liveTypeAudio) {
            return LiveMode.AUDIO;
        }
        if (i == 7) {
            return LiveMode.LIVE_VOICE;
        }
        return LiveMode.VIDEO;
    }

    public static LiveMode getStreamType(NewLiveRoomStruct newLiveRoomStruct) {
        if (newLiveRoomStruct.isScreenshot) {
            return LiveMode.SCREEN_RECORD;
        }
        int i = newLiveRoomStruct.liveRoomMode;
        if (i == 6) {
            return LiveMode.LIVE_STUDIO;
        }
        if (newLiveRoomStruct.isThirdParty) {
            return LiveMode.THIRD_PARTY;
        }
        if (newLiveRoomStruct.liveTypeAudio) {
            return LiveMode.AUDIO;
        }
        if (i == 7) {
            return LiveMode.LIVE_VOICE;
        }
        return LiveMode.VIDEO;
    }
}
