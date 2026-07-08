package com.ss.android.ugc.aweme.comment.quickmention;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public final class QuickMentionTakoThresholdConfig {

    @C09CT("tako_guide_close_times")
    public final int closeTimes;

    @C09CT("tako_guide_show_without_click_times")
    public final int showWithoutClickTimes;

    @C09CT("tako_guide_post_show_suppress_hours")
    public final int takoGuidePostShowSuppressHours;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickMentionTakoThresholdConfig)) {
            return false;
        }
        QuickMentionTakoThresholdConfig quickMentionTakoThresholdConfig = (QuickMentionTakoThresholdConfig) obj;
        return this.takoGuidePostShowSuppressHours == quickMentionTakoThresholdConfig.takoGuidePostShowSuppressHours && this.closeTimes == quickMentionTakoThresholdConfig.closeTimes && this.showWithoutClickTimes == quickMentionTakoThresholdConfig.showWithoutClickTimes;
    }

    public final int hashCode() {
        return (((this.takoGuidePostShowSuppressHours * 31) + this.closeTimes) * 31) + this.showWithoutClickTimes;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickMentionTakoThresholdConfig(takoGuidePostShowSuppressHours=");
        sbLIZ.append(this.takoGuidePostShowSuppressHours);
        sbLIZ.append(", closeTimes=");
        sbLIZ.append(this.closeTimes);
        sbLIZ.append(", showWithoutClickTimes=");
        sbLIZ.append(this.showWithoutClickTimes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QuickMentionTakoThresholdConfig() {
        this(48, 3, 6);
    }

    public QuickMentionTakoThresholdConfig(int i, int i2, int i3) {
        this.takoGuidePostShowSuppressHours = i;
        this.closeTimes = i2;
        this.showWithoutClickTimes = i3;
    }
}
