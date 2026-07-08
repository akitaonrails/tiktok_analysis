package com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class RewardAdCountdownInfo implements Serializable {

    @C09CT("countdown_finish_msg")
    public String countdownFinishMsg;

    @C09CT("countdown_msg")
    public String countdownMsg;

    public final String getCountdownFinishMsg() {
        return this.countdownFinishMsg;
    }

    public final String getCountdownMsg() {
        return this.countdownMsg;
    }

    public final void setCountdownFinishMsg(String str) {
        this.countdownFinishMsg = str;
    }

    public final void setCountdownMsg(String str) {
        this.countdownMsg = str;
    }
}
