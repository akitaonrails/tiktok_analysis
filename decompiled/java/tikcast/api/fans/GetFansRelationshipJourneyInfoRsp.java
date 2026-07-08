package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.creator_succ.CRMUserDisplayItem;
import webcast.data.AnchorCustomizedGift;
import webcast.data.CelebrationPrivilege;
import webcast.data.FanCustomBenefit;
import webcast.data.FansLevelInfo;
import webcast.data.LevelGiftPrivilege;
import webcast.data.RelationshipJourneyInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class GetFansRelationshipJourneyInfoRsp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor")
        public User anchor;

        @C09CT("celebration_privilege_info")
        public CelebrationPrivilege celebrationPrivilegeInfo;

        @C09CT("crm_item_list")
        public List<CRMUserDisplayItem> crmItemList = new ArrayList();

        @C09CT("custom_benefits")
        public List<FanCustomBenefit> customBenefits = new ArrayList();

        @C09CT("customized_gift")
        public AnchorCustomizedGift customizedGift;

        @C09CT("extra")
        public RelationshipJourneyExtra extra;

        @C09CT("level_gift_privilege_info")
        public LevelGiftPrivilege levelGiftPrivilegeInfo;

        @C09CT("level_info")
        public FansLevelInfo levelInfo;

        @C09CT("relation_journey_info")
        public RelationshipJourneyInfo relationJourneyInfo;

        @C09CT("user")
        public User user;
    }
}
