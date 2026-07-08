package com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class AdRewardBubbleInfo implements Serializable {

    @C09CT("countdown_msg")
    public String countdownMsg;

    @C09CT("default_error_msg")
    public String defaultErrorMsg;

    @C09CT("show_time")
    public int showTime;

    public final String getCountdownMsg() {
        return this.countdownMsg;
    }

    public final String getDefaultErrorMsg() {
        return this.defaultErrorMsg;
    }

    public final int getShowTime() {
        return this.showTime;
    }

    public final void setCountdownMsg(String str) {
        this.countdownMsg = str;
    }

    public final void setDefaultErrorMsg(String str) {
        this.defaultErrorMsg = str;
    }

    public final void setShowTime(int i) {
        this.showTime = i;
    }
}
