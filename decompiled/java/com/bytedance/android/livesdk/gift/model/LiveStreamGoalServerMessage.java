package com.bytedance.android.livesdk.gift.model;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.goal.model.GoalPinInfo;

/* JADX INFO: loaded from: classes.dex */
public final class LiveStreamGoalServerMessage extends AbstractC1136060ffY {

    @C09CT("contribute_count")
    public long contributeCount;

    @C09CT("contribute_score")
    public long contributeScore;

    @C09CT("contribute_subgoal")
    public LiveStreamSubGoal contributeSubgoal;

    @C09CT("contributor_avatar")
    public ImageModel contributorAvatar;

    @C09CT("contributor_display_id")
    public String contributorDisplayId;

    @C09CT("contributor_id")
    public long contributorId;

    @C09CT("contributor_id_str")
    public String contributorIdStr;

    @C09CT("gift_repeat_count")
    public long giftRepeatCount;

    @C09CT("goal")
    public LiveStreamGoal goal;

    @C09CT("goal_extra")
    public String goalExtra;

    @C09CT("indicator")
    public LiveStreamGoalIndicator indicator;

    @C09CT("pin_info")
    public GoalPinInfo pinInfo;

    @C09CT("update_source")
    public int updateSource;

    public LiveStreamGoalServerMessage() {
        this.type = C001A.STREAM_GOAL_SERVER_MESSAGE;
        this.contributorDisplayId = "";
        this.contributorIdStr = "";
        this.goalExtra = "";
    }
}
