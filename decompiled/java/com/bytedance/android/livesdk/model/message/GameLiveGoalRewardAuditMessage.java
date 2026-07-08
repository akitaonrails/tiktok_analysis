package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.game.model.LiveGoalReward;

/* JADX INFO: loaded from: classes.dex */
public final class GameLiveGoalRewardAuditMessage extends AbstractC1136060ffY {

    @C09CT("live_goal_reward")
    public LiveGoalReward liveGoalReward;

    public GameLiveGoalRewardAuditMessage() {
        this.type = C001A.GAME_LIVE_GOAL_REWARD_AUDIT_MESSAGE;
    }
}
