package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ShareReward implements Serializable {

    @C09CT("highest_profit")
    public final String highestProfit;

    @C09CT("reward_consume_percent")
    public final Integer rewardConsumePercent;

    public ShareReward() {
        this(null, null);
    }

    public ShareReward(Integer num, String str) {
        this.rewardConsumePercent = num;
        this.highestProfit = str;
    }
}
