package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.LiveJourneyRewardInfo;
import webcast.data.TargetPromotionLiveAnchorInfo;
import webcast.data.TargetPromotionLiveEventInfo;

/* JADX INFO: loaded from: classes.dex */
public final class GetAnchorTargetPromotionLiveOverviewResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_info")
        public TargetPromotionLiveAnchorInfo anchorInfo;

        @C09CT("event_info")
        public TargetPromotionLiveEventInfo eventInfo;

        @C09CT("can_use_reward_list")
        public List<LiveJourneyRewardInfo> canUseRewardList = new ArrayList();

        @C09CT("can_receive_reward_list")
        public List<LiveJourneyRewardInfo> canReceiveRewardList = new ArrayList();
    }
}
