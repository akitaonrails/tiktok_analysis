package webcast.api.room;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes.dex */
public final class MockResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("guide_videos")
        public GuideVideoURL guideVideos;

        @C09CT("mock_room_id")
        public long mockRoomId;

        @C09CT("room")
        public Room room;
    }

    public static final class GuideVideoURL {

        @C09CT("match_url")
        public String matchUrl = "";

        @C09CT("interact_url")
        public String interactUrl = "";

        @C09CT("cohost_url")
        public String cohostUrl = "";

        @C09CT("gift_url")
        public String giftUrl = "";

        @C09CT("multiguest_url")
        public String multiguestUrl = "";
    }
}
