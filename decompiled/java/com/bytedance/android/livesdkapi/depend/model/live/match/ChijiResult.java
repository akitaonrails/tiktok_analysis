package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ChijiResult {

    @C09CT("bonus")
    public Long bonus;

    @C09CT("time_str")
    public String timeStr;

    @C09CT("winning_streak")
    public Long winningStreak;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.timeStr != null) {
            sb.append(", time_str=");
            sb.append(this.timeStr);
        }
        if (this.winningStreak != null) {
            sb.append(", winning_streak=");
            sb.append(this.winningStreak);
        }
        if (this.bonus != null) {
            sb.append(", bonus=");
            sb.append(this.bonus);
        }
        sb.replace(0, 2, "ChijiResult{");
        sb.append('}');
        return sb.toString();
    }
}
