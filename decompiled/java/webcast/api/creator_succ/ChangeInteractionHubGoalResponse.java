package webcast.api.creator_succ;

import X.C09CT;
import com.bytedance.android.livesdk.message.proto.AnchorActivityTaskProgress;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.common.Text;
import tikcast.api.creator_succ.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class ChangeInteractionHubGoalResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("action_button")
        public ActionButton actionButton;

        @C09CT("gift_info")
        public Gift giftInfo;

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

        @C09CT("task_progress")
        public AnchorActivityTaskProgress taskProgress;
    }
}
