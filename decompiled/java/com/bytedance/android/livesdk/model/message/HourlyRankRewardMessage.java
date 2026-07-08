package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HourlyRankRewardMessage extends AbstractC1136060ffY {

    @C09CT("winners")
    public List<HourlyRankRewardInfo> winners;

    public HourlyRankRewardMessage() {
        this.type = C001A.HOURLY_RANK_REWARD_MESSAGE;
    }
}
