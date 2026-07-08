package com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay;

import X.C09CT;
import X.C188F;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.live.LiveImageModel;

/* JADX INFO: loaded from: classes33.dex */
public interface ECLiveRoomReplayApi {
    public static final C188F LIZ = C188F.LIZ;

    @InterfaceC1501170pAR("/aweme/v1/oec/room/replay")
    Object getRoomReplayInfo(@InterfaceC1485405rg GetRoomReplayInfoRequest getRoomReplayInfoRequest, InterfaceC1364105Vn<? super BaseResponse<RoomReplayInfo>> interfaceC1364105Vn);

    public static final class LiveRoomInfo {

        @C09CT("author_info")
        public final AuthorInfo authorInfo;

        @C09CT("likes")
        public final String likes;

        public LiveRoomInfo() {
            this(null, null);
        }

        public LiveRoomInfo(AuthorInfo authorInfo, String str) {
            this.authorInfo = authorInfo;
            this.likes = str;
        }
    }

    public static final class RoomReplayVideoMeta {

        @C09CT("video_info")
        public final Video video;

        @C09CT("item_id")
        public final String videoId;

        public RoomReplayVideoMeta() {
            this(null, null);
        }

        public RoomReplayVideoMeta(String str, Video video) {
            this.videoId = str;
            this.video = video;
        }
    }

    public static final class AuthorInfo {

        @C09CT("author_id")
        public final String authorId;

        @C09CT("avatar")
        public final LiveImageModel avatar;

        @C09CT("nick_name")
        public final String nickName;

        public AuthorInfo() {
            this(null, null, null);
        }

        public AuthorInfo(String str, String str2, LiveImageModel liveImageModel) {
            this.authorId = str;
            this.nickName = str2;
            this.avatar = liveImageModel;
        }
    }

    public static final class GetRoomReplayInfoRequest {

        @C09CT("order_id")
        public final String orderId;

        @C09CT("replay_start_time_ms")
        public final String replayStartTimeMs;

        @C09CT("room_id")
        public final String roomId;

        public GetRoomReplayInfoRequest(String str, String str2, String str3) {
            this.roomId = str;
            this.replayStartTimeMs = str2;
            this.orderId = str3;
        }
    }

    public static final class RoomReplayInfo {

        @C09CT("da_info")
        public final String daInfo;

        @C09CT("live_room_info")
        public final LiveRoomInfo liveRoomInfo;

        @C09CT("video_meta")
        public final RoomReplayVideoMeta videoMeta;

        @C09CT("video_replay_start_time_ms")
        public final String videoReplayStartTimeMs;

        public RoomReplayInfo() {
            this(null, null, null, null);
        }

        public RoomReplayInfo(RoomReplayVideoMeta roomReplayVideoMeta, String str, LiveRoomInfo liveRoomInfo, String str2) {
            this.videoMeta = roomReplayVideoMeta;
            this.videoReplayStartTimeMs = str;
            this.liveRoomInfo = liveRoomInfo;
            this.daInfo = str2;
        }
    }
}
