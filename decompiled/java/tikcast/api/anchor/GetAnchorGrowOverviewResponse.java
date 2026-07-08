package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorGrowInstanceDetail;
import webcast.data.AnchorGrowInstanceRewardRecordItem;
import webcast.data.AnchorGrowLevelAnchorInfo;
import webcast.data.AnchorGrowLevelCurrentLevelDetail;
import webcast.data.AnchorGrowLevelLevelInfo;
import webcast.data.AnchorGrowLevelRewardRecordItem;

/* JADX INFO: loaded from: classes29.dex */
public final class GetAnchorGrowOverviewResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_info")
        public AnchorGrowLevelAnchorInfo anchorInfo;

        @C09CT("current_level_detail")
        public AnchorGrowLevelCurrentLevelDetail currentLevelDetail;

        @C09CT("instance_detail")
        public AnchorGrowInstanceDetail instanceDetail;

        @C09CT("can_claim_list_instance")
        public List<AnchorGrowInstanceRewardRecordItem> canClaimListInstance = new ArrayList();

        @C09CT("special_level_info_list")
        public List<AnchorGrowLevelLevelInfo> specialLevelInfoList = new ArrayList();

        @C09CT("course_list")
        public List<webcast.data.CourseInfo> courseList = new ArrayList();

        @C09CT("can_claim_list")
        public List<AnchorGrowLevelRewardRecordItem> canClaimList = new ArrayList();
    }
}
