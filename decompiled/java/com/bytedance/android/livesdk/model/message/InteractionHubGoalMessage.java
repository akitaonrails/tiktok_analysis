package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.message.proto.AnchorActivityTaskProgress;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.common.Text;
import tikcast.api.creator_succ.ActionButton;
import tikcast.api.creator_succ.LiveGoalParam;
import tikcast.api.creator_succ.UserParam;

/* JADX INFO: loaded from: classes.dex */
public final class InteractionHubGoalMessage extends AbstractC1136060ffY {

    @C09CT("action_button")
    public ActionButton actionButton;

    @C09CT("has_button")
    public boolean hasButton;

    @C09CT("has_new_gift")
    public boolean hasNewGift;

    @C09CT("interaction_goal")
    public Text interactionGoal;

    @C09CT("interaction_goal_source")
    public int interactionGoalSource;

    @C09CT("interaction_goal_type")
    public int interactionGoalType;

    @C09CT("interaction_tips")
    public Text interactionTips;

    @C09CT("live_goal_param")
    public LiveGoalParam liveGoalParam;

    @C09CT("new_gift_info")
    public Gift newGiftInfo;

    @C09CT("task_progress")
    public AnchorActivityTaskProgress taskProgress;

    @C09CT("user_param")
    public UserParam userParam;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public InteractionHubGoalMessage() {
        this.type = C001A.INTERACTION_HUB_GOAL_MESSAGE;
    }
}
