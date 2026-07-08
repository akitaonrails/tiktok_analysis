package webcast.api.game_station;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.BriefBenefitInfo;
import com.bytedance.android.livesdk.game.model.EsportsTournamentInfo;
import com.bytedance.android.livesdk.game.model.FeedItemList;
import com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo;
import com.bytedance.android.livesdk.game.model.GameDetailLiveInfo;
import com.bytedance.android.livesdk.game.model.GameStationAttributionInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameOfficialAccount;
import com.bytedance.android.livesdk.game.model.GameStationOuterActivityInfo;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class DetailHomeBizData {

    @C09CT("attribution_info")
    public GameStationAttributionInfo attributionInfo;

    @C09CT("common")
    public DetailHomeCommon common;

    @C09CT("esports_info")
    public EsportsTournamentInfo esportsInfo;

    @C09CT("game_detail_header_info")
    public GameDetailHeaderInfo gameDetailHeaderInfo;

    @C09CT("game_info")
    public GameStationGameInfo gameInfo;

    @C09CT("live_info")
    public GameDetailLiveInfo liveInfo;

    @C09CT("official_account")
    public GameStationGameOfficialAccount officialAccount;

    @C09CT("promote_task_info")
    public PromoteTaskInfo promoteTaskInfo;

    @C09CT("videos")
    public FeedItemList videos;

    @C09CT("reward_list")
    public List<BriefBenefitInfo> rewardList = new ArrayList();

    @C09CT("activity_list")
    public List<GameStationOuterActivityInfo> activityList = new ArrayList();

    public static final class PromoteTaskInfo {

        @C09CT("live_take_permission")
        public boolean liveTakePermission;

        @C09CT("live_task_info")
        public PartnershipTask liveTaskInfo;

        @C09CT("promote_task_type")
        public int promoteTaskType;
    }
}
