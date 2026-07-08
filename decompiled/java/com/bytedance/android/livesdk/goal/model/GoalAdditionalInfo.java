package com.bytedance.android.livesdk.goal.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GoalAdditionalInfo {

    @C09CT("gift_goal_additional_info")
    public GiftGoalAdditionalInfo giftGoalAdditionalInfo;

    @C09CT("theme")
    public List<GoalTheme> theme = new ArrayList();

    public static final class GiftGoalAdditionalInfo {

        @C09CT("gift_relay_metas")
        public List<GiftRelayMeta> giftRelayMetas = new ArrayList();

        public static final class GiftRelayMeta {

            @C09CT("challenge_type")
            public int challengeType;

            @C09CT("complete_time")
            public long completeTime;

            @C09CT("expire_time")
            public long expireTime;

            @C09CT("id_str")
            public String idStr = "";

            @C09CT("type")
            public int type;
        }
    }
}
