package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.BenefitView;
import com.bytedance.android.livesdk.chatroom.api.SubWaveInfo;
import com.bytedance.android.livesdk.chatroom.api.UpdateTips;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.goal.model.SubGoalRecommendInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class GetSubGoalResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_goal_history")
        public boolean hasGoalHistory;

        @C09CT("is_contributor")
        public boolean isContributor;

        @C09CT("need_show_sub_only_goal")
        public boolean needShowSubOnlyGoal;

        @C09CT("ongoing_goal")
        public LiveStreamGoal ongoingGoal;

        @C09CT("recommended_extension_amount")
        public long recommendedExtensionAmount;

        @C09CT("specified_goal")
        public LiveStreamGoal specifiedGoal;

        @C09CT("sub_goal_history_info")
        public SubGoalHistoryInfo subGoalHistoryInfo;

        @C09CT("sub_pin")
        public SubPin subPin;

        @C09CT("sub_wave_info")
        public SubWaveInfo subWaveInfo;

        @C09CT("sub_wave_strike_enabled")
        public boolean subWaveStrikeEnabled;

        @C09CT("not_start_goals")
        public List<LiveStreamGoal> notStartGoals = new ArrayList();

        @C09CT("recommend_info")
        public Map<Integer, SubGoalRecommendInfo> recommendInfo = new LinkedHashMap();

        @C09CT("benefits")
        public List<BenefitView> benefits = new ArrayList();

        @C09CT("sub_milestone_message")
        public String subMilestoneMessage = "";

        @C09CT("transaction_tips")
        public List<UpdateTips> transactionTips = new ArrayList();
    }

    public static final class SubGoalHistoryInfo {

        @C09CT("has_completed_goal")
        public boolean hasCompletedGoal;
    }

    public static final class SubPin {

        @C09CT("cooling_down_time")
        public long coolingDownTime;

        @C09CT("pin_status")
        public int pinStatus;
    }
}
