package tikcast.api.anchor;

import X.C09CT;
import webcast.data.TargetPromotionLiveAnchorInfo;
import webcast.data.TargetPromotionLiveEventInfo;

/* JADX INFO: loaded from: classes.dex */
public final class GetAnchorTargetPromotionLiveInRoomBannerResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_info")
        public TargetPromotionLiveAnchorInfo anchorInfo;

        @C09CT("event_info")
        public TargetPromotionLiveEventInfo eventInfo;

        @C09CT("is_illegal_pause")
        public boolean isIllegalPause;

        @C09CT("is_live_in_specific_content")
        public boolean isLiveInSpecificContent;
    }
}
