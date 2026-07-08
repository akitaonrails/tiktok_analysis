package tikcast.api.anchor_data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorLiveJourneyExpXFoldCardDetail;
import webcast.data.AnchorLiveJourneyGuideInfo;
import webcast.data.LiveJourneyLevelInfo;
import webcast.data.LiveJourneySeasonInfo;
import webcast.data.LiveJourneyTaskRecordInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class RealtimeLiveCenterLiveJourneyInfo {

    @C09CT("current_level_info")
    public LiveJourneyLevelInfo currentLevelInfo;

    @C09CT("current_week_left_time")
    public long currentWeekLeftTime;

    @C09CT("guide_info")
    public AnchorLiveJourneyGuideInfo guideInfo;

    @C09CT("season_info")
    public LiveJourneySeasonInfo seasonInfo;

    @C09CT("using_exp_xfold_card_detail")
    public AnchorLiveJourneyExpXFoldCardDetail usingExpXfoldCardDetail;

    @C09CT("show_task_list")
    public List<LiveJourneyTaskRecordInfo> showTaskList = new ArrayList();

    @C09CT("can_claim_level_list")
    public List<LiveJourneyLevelInfo> canClaimLevelList = new ArrayList();

    @C09CT("jump_url")
    public String jumpUrl = "";

    @C09CT("reached_level_list")
    public List<LiveJourneyLevelInfo> reachedLevelList = new ArrayList();
}
