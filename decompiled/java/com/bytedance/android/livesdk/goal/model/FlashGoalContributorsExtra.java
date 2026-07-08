package com.bytedance.android.livesdk.goal.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class FlashGoalContributorsExtra {

    @C09CT("goal_extra")
    public GoalExtra goalExtra;

    public static final class GoalExtra {

        @C09CT("complete_time")
        public long completeTime;

        @C09CT("gift_image")
        public ImageModel giftImage;

        @C09CT("progress")
        public long progress;

        @C09CT("target")
        public long target;
    }
}
