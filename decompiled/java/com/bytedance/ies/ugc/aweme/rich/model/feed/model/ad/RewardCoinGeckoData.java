package com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class RewardCoinGeckoData implements Serializable {

    @C09CT("channel")
    public String channel;

    @C09CT("task_finish_lottie_name")
    public String taskFinishLottieName;

    public final String getChannel() {
        return this.channel;
    }

    public final String getTaskFinishLottieName() {
        return this.taskFinishLottieName;
    }

    public final void setChannel(String str) {
        this.channel = str;
    }

    public final void setTaskFinishLottieName(String str) {
        this.taskFinishLottieName = str;
    }
}
