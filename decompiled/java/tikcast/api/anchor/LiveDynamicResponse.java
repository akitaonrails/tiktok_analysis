package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.LiveVideoClipCampaignEntrance;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveDynamicResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("live_dynamic_anchor")
        public LiveDynamicAnchor liveDynamicAnchor;

        @C09CT("live_dynamic_interest_list")
        public LiveDynamicInterestList liveDynamicInterestList;

        @C09CT("live_dynamic_revenue_info")
        public LiveDynamicRevenueInfo liveDynamicRevenueInfo;

        @C09CT("live_video_clip_campaign_entrance")
        public LiveVideoClipCampaignEntrance liveVideoClipCampaignEntrance;

        @C09CT("live_dynamic_last_room_highlight_list")
        public List<LiveDynamicHighlight> liveDynamicLastRoomHighlightList = new ArrayList();

        @C09CT("live_dynamic_history_room_list")
        public List<LiveDynamicHistoryRoom> liveDynamicHistoryRoomList = new ArrayList();

        @C09CT("live_dynamic_item_info_list")
        public List<LiveDynamicItemInfo> liveDynamicItemInfoList = new ArrayList();
    }
}
