package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalIndicator;

/* JADX INFO: loaded from: classes.dex */
public final class StreamGoalData {

    @C09CT("goal")
    public LiveStreamGoal goal;

    @C09CT("goal_extra")
    public String goalExtra = "";

    @C09CT("indicator")
    public LiveStreamGoalIndicator indicator;

    @C09CT("update_source")
    public int updateSource;
}
