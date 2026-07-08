package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.LiveVideoClipCampaignVideo;

/* JADX INFO: loaded from: classes29.dex */
public final class GetLiveVideoClipCampaignVideoListForBSideResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("next_cursor")
        public long nextCursor;

        @C09CT("total")
        public long total;

        @C09CT("video_list")
        public List<LiveVideoClipCampaignVideo> videoList = new ArrayList();
    }
}
