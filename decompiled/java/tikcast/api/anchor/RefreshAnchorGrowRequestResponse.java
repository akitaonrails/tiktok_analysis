package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorGrowInstanceDetail;
import webcast.data.AnchorGrowInstanceRewardRecordItem;

/* JADX INFO: loaded from: classes29.dex */
public final class RefreshAnchorGrowRequestResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("can_claim_list")
        public List<AnchorGrowInstanceRewardRecordItem> canClaimList = new ArrayList();

        @C09CT("instance_detail")
        public AnchorGrowInstanceDetail instanceDetail;
    }
}
