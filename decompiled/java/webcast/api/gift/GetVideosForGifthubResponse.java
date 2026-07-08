package webcast.api.gift;

import X.C09CT;
import com.bytedance.android.livesdk.gift.model.GifthubVideoStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetVideosForGifthubResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_anchor_published_highlights")
        public boolean hasAnchorPublishedHighlights;

        @C09CT("has_unpublished_highlight")
        public boolean hasUnpublishedHighlight;

        @C09CT("latest_unpublished_highlight")
        public HighlightInfo latestUnpublishedHighlight;

        @C09CT("num_creators_mention")
        public int numCreatorsMention;

        @C09CT("num_new_gifts")
        public int numNewGifts;

        @C09CT("num_new_viewers")
        public int numNewViewers;

        @C09CT("top_priority_videos")
        public List<GifthubVideoStruct> topPriorityVideos = new ArrayList();

        @C09CT("popular_videos")
        public List<GifthubVideoStruct> popularVideos = new ArrayList();

        @C09CT("user_videos")
        public List<GifthubVideoStruct> userVideos = new ArrayList();

        @C09CT("send_by_you_videos")
        public List<GifthubVideoStruct> sendByYouVideos = new ArrayList();
    }

    public static final class FragmentInfo {

        @C09CT("fragment_id")
        public String fragmentId = "";

        @C09CT("play_url")
        public String playUrl = "";

        @C09CT("cover_url")
        public String coverUrl = "";

        @C09CT("room_id")
        public String roomId = "";
    }

    public static final class HighlightInfo {

        @C09CT("room_id")
        public String roomId = "";

        @C09CT("fragment_ids")
        public List<String> fragmentIds = new ArrayList();

        @C09CT("fragments")
        public List<FragmentInfo> fragments = new ArrayList();
    }
}
