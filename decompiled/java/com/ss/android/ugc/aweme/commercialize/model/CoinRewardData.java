package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CoinRewardData implements Serializable {

    @C09CT("reward_duration")
    public final int rewardDuration;

    @C09CT("rewards")
    public final int rewards;

    @C09CT("task_event_key")
    public final String taskEventKey;

    @C09CT("text")
    public final String text;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoinRewardData(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", rewards=");
        sbLIZ.append(this.rewards);
        sbLIZ.append(", rewardDuration=");
        sbLIZ.append(this.rewardDuration);
        sbLIZ.append(", taskEventKey=");
        sbLIZ.append(this.taskEventKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CoinRewardData() {
        this("", 0, 0, "");
    }

    public CoinRewardData(String str, int i, int i2, String str2) {
        this.text = str;
        this.rewards = i;
        this.rewardDuration = i2;
        this.taskEventKey = str2;
    }
}
