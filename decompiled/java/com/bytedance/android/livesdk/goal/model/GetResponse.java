package com.bytedance.android.livesdk.goal.model;

import X.C09CT;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class GetResponse {

    @C09CT("data")
    public Data data;

    public static final class ChallengeInfo {

        @C09CT("challenge_duration")
        public long challengeDuration;

        @C09CT("flare_cards_remaining")
        public long flareCardsRemaining;

        @C09CT("goals")
        public List<LiveStreamGoal> goals;

        @C09CT("received_flare_card_award")
        public boolean receivedFlareCardAward;

        @C09CT("reward_duration")
        public long rewardDuration;

        @C09CT("show_moy_challenge_entrance")
        public boolean showMoyChallengeEntrance;
    }

    public static final class Data {

        @C09CT("anchor_ab_params")
        public Map<String, String> anchorAbParams;

        @C09CT("anchor_onboard_permit")
        public AnchorOnBoardPermit anchorOnboardPermit;

        @C09CT("auto_create")
        public int autoCreate;

        @C09CT("can_set_vote")
        public boolean canSetVote;

        @C09CT("challenge_info")
        public ChallengeInfo challengeInfo;

        @C09CT("hide_live_goal")
        public boolean hideLiveGoal;

        @C09CT("is_contributor")
        public boolean isContributor;

        @C09CT("is_live_goal_integration")
        public boolean isLiveGoalIntegration;

        @C09CT("is_new_user")
        public boolean isNewUser;

        @C09CT("is_user_opt_out_contributor")
        public boolean isUserOptOutContributor;

        @C09CT("isHost")
        public boolean ishost;

        @C09CT("not_start_goals")
        public List<LiveStreamGoal> notStartGoals;

        @C09CT("ongoing_goal")
        public LiveStreamGoal ongoingGoal;

        @C09CT("owner")
        public GoalOwner owner;

        @C09CT("pin")
        public Pin pin;

        @C09CT("recommend_info")
        public Map<Integer, SubGoalRecommendInfo> recommendInfo;

        @C09CT("show_default_description")
        public boolean showDefaultDescription;

        @C09CT("specified_goal")
        public LiveStreamGoal specifiedGoal;
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
