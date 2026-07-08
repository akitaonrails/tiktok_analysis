package com.bytedance.android.livesdk.activity.quiz.model;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class QuizRewardRule {

    @C09CT("send_amount")
    public int sendAmount;

    @C09CT("settler_code")
    public String settlerCode = "";

    @C09CT("reward_list")
    public List<RewardItem> rewardList = C13BV.INSTANCE;

    public static final class RewardItem {

        @C09CT("reward_name")
        public String rewardName = "";

        @C09CT("reward_amount")
        public String rewardAmount = "";
    }
}
