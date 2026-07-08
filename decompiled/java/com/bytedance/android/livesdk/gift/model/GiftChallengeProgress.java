package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftChallengeProgress {

    @C09CT("challenge_id")
    public long challengeId;

    @C09CT("current_points")
    public long currentPoints;

    @C09CT("stage_data")
    public List<StageData> stageData = new ArrayList();

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    public static final class StageData {

        @C09CT("gift_id")
        public long giftId;

        @C09CT("total_points")
        public long totalPoints;
    }
}
