package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorNoticeBoard;
import webcast.data.CommunityCommonInfo;
import webcast.data.CommunityGiftInfo;
import webcast.data.FanCustomBenefit;
import webcast.data.FansClubInfo;
import webcast.data.FansLevelInfo;
import webcast.data.SuperFanRelation;
import webcast.data.TaskGroup;

/* JADX INFO: loaded from: classes29.dex */
public final class FansGetTaskInfoV2Response {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_info")
        public User anchorInfo;

        @C09CT("community_gift_info")
        public CommunityGiftInfo communityGiftInfo;

        @C09CT("community_info")
        public CommunityCommonInfo communityInfo;

        @C09CT("fans_club_info")
        public FansClubInfo fansClubInfo;

        @C09CT("game_play_info")
        public GamePlayInfo gamePlayInfo;

        @C09CT("level_info")
        public FansLevelInfo levelInfo;

        @C09CT("notice_board")
        public AnchorNoticeBoard noticeBoard;

        @C09CT("popularity_info")
        public UserPopularityInfo popularityInfo;

        @C09CT("super_fan_relation")
        public SuperFanRelation superFanRelation;

        @C09CT("task_extra")
        public TaskExtra taskExtra;

        @C09CT("user_info")
        public User userInfo;

        @C09CT("user_tip")
        public AnchorNoticeBoard userTip;

        @C09CT("task_group")
        public List<TaskGroup> taskGroup = new ArrayList();

        @C09CT("custom_benefits")
        public List<FanCustomBenefit> customBenefits = new ArrayList();
    }
}
