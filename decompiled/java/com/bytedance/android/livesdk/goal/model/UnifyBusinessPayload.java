package com.bytedance.android.livesdk.goal.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class UnifyBusinessPayload {

    @C09CT("anchor_onboard_permit")
    public AnchorOnBoardPermit anchorOnboardPermit;

    @C09CT("live_goal_integration_enabled")
    public boolean liveGoalIntegrationEnabled;

    @C09CT("ongoing_goal")
    public GoalV2 ongoingGoal;

    @C09CT("owner")
    public GoalOwner owner;

    @C09CT("pin")
    public Pin pin;

    public static final class AnchorOnBoardPermit {

        @C09CT("anchor_onboard_permit")
        public boolean anchorOnboardPermit;

        @C09CT("permit_tips")
        public String permitTips = "";
    }

    public static final class Pin {

        @C09CT("cold_down")
        public boolean coldDown;

        @C09CT("pin_end_time")
        public long pinEndTime;

        @C09CT("ready_time")
        public long readyTime;
    }
}
