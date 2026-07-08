package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorGrowInstanceRewardRecordItem;

/* JADX INFO: loaded from: classes29.dex */
public final class InstanceRewardRecord {

    @C09CT("can_claim_list")
    public List<AnchorGrowInstanceRewardRecordItem> canClaimList = new ArrayList();

    @C09CT("already_claim_list")
    public List<AnchorGrowInstanceRewardRecordItem> alreadyClaimList = new ArrayList();

    @C09CT("expired_claim_list")
    public List<AnchorGrowInstanceRewardRecordItem> expiredClaimList = new ArrayList();
}
