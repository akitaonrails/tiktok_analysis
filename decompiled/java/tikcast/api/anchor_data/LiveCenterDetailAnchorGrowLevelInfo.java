package tikcast.api.anchor_data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorGrowInstanceDetail;
import webcast.data.AnchorGrowInstanceRewardRecordItem;
import webcast.data.AnchorGrowLevelCurrentLevelDetail;
import webcast.data.AnchorGrowLevelRewardRecordItem;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveCenterDetailAnchorGrowLevelInfo {

    @C09CT("current_level_detail")
    public AnchorGrowLevelCurrentLevelDetail currentLevelDetail;

    @C09CT("instance_detail")
    public AnchorGrowInstanceDetail instanceDetail;

    @C09CT("can_claim_list")
    public List<AnchorGrowLevelRewardRecordItem> canClaimList = new ArrayList();

    @C09CT("complete_level_list")
    public List<Long> completeLevelList = new ArrayList();

    @C09CT("can_claim_list_instance")
    public List<AnchorGrowInstanceRewardRecordItem> canClaimListInstance = new ArrayList();
}
