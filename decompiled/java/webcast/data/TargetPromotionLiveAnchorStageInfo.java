package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TargetPromotionLiveAnchorStageInfo {

    @C09CT("basic_stage_progress_info")
    public TargetPromotionLiveAnchorStageProgressInfo basicStageProgressInfo;

    @C09CT("current_go_live_mins")
    public long currentGoLiveMins;

    @C09CT("is_stage_streak_bonus")
    public boolean isStageStreakBonus;

    @C09CT("stage")
    public long stage;

    @C09CT("stage_completed_time")
    public long stageCompletedTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("extra_bonus_stage_progress_list")
    public List<TargetPromotionLiveAnchorStageProgressInfo> extraBonusStageProgressList = new ArrayList();

    @C09CT("task_title")
    public String taskTitle = "";

    @C09CT("recap_title")
    public String recapTitle = "";

    @C09CT("progress_bar_color")
    public String progressBarColor = "";
}
