package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorGrowLevelCurrentLevelDetail;
import webcast.data.AnchorGrowLevelRewardRecordItem;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorGrowLevelCurrentLevelDetailResult {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("can_claim_list")
        public List<AnchorGrowLevelRewardRecordItem> canClaimList = new ArrayList();

        @C09CT("complete_level_list")
        public List<Long> completeLevelList = new ArrayList();

        @C09CT("current_level_detail")
        public AnchorGrowLevelCurrentLevelDetail currentLevelDetail;
    }
}
