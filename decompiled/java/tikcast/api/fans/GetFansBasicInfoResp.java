package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorCustomizedGift;
import webcast.data.CelebrationMilestoneInfo;
import webcast.data.CelebrationPrivilege;
import webcast.data.CurrentSuperFanContract;
import webcast.data.FanCustomBenefit;
import webcast.data.FansClubInfo;
import webcast.data.FansLevelInfo;
import webcast.data.LevelGiftPrivilege;
import webcast.data.RelationshipJourneyInfo;
import webcast.data.SubSplitStatus;
import webcast.data.SuperFanPackage;
import webcast.data.SuperFanPermissionInfo;
import webcast.data.TaskMeta;

/* JADX INFO: loaded from: classes8.dex */
public final class GetFansBasicInfoResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_info")
        public User anchorInfo;

        @C09CT("celebration_privilege_info")
        public CelebrationPrivilege celebrationPrivilegeInfo;

        @C09CT("current_contract_info")
        public CurrentSuperFanContract currentContractInfo;

        @C09CT("customized_gift")
        public AnchorCustomizedGift customizedGift;

        @C09CT("extra")
        public FansBasicInfoExtra extra;

        @C09CT("fans_club_info")
        public FansClubInfo fansClubInfo;

        @C09CT("faq_data")
        public FaqData faqData;

        @C09CT("heart_me_task_info")
        public TaskMeta heartMeTaskInfo;

        @C09CT("level_gift_privilege_info")
        public LevelGiftPrivilege levelGiftPrivilegeInfo;

        @C09CT("level_info")
        public FansLevelInfo levelInfo;

        @C09CT("milestone_info")
        public CelebrationMilestoneInfo milestoneInfo;

        @C09CT("relationship_journey_info")
        public RelationshipJourneyInfo relationshipJourneyInfo;

        @C09CT("sub_split_status")
        public SubSplitStatus subSplitStatus;

        @C09CT("super_fan_permission_info")
        public SuperFanPermissionInfo superFanPermissionInfo;

        @C09CT("super_fan_task_info")
        public TaskMeta superFanTaskInfo;

        @C09CT("user_info")
        public User userInfo;

        @C09CT("all_pkg_infos")
        public List<SuperFanPackage> allPkgInfos = new ArrayList();

        @C09CT("custom_benefits")
        public List<FanCustomBenefit> customBenefits = new ArrayList();
    }
}
