package com.ss.android.ugc.aweme.profile.menu;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class ProfileNewMenuFrequencyData implements Serializable {

    @C09CT("bubble_delay_after_viewer")
    public final Integer bubbleDelayAfterViewer;

    @C09CT("bubble_delay_close_time")
    public final Integer bubbleDelayCloseTime;

    @C09CT("bubble_exit_day")
    public final Integer bubbleExitDay;

    @C09CT("bubble_max_day")
    public final Integer bubbleMaxDay;

    @C09CT("bubble_max_show_count")
    public final Integer bubbleMaxShowCount;

    @C09CT("bubble_delay_show_time")
    public final Float popShowDelayTime;

    @C09CT("red_dot_exit_day")
    public final Integer redDotExitDay;

    @C09CT("red_dot_max_expose_count")
    public final Integer redDotMaxExposeCount;

    public final Integer getBubbleDelayAfterViewer() {
        return this.bubbleDelayAfterViewer;
    }

    public final Integer getBubbleDelayCloseTime() {
        return this.bubbleDelayCloseTime;
    }

    public final Integer getBubbleExitDay() {
        return this.bubbleExitDay;
    }

    public final Integer getBubbleMaxDay() {
        return this.bubbleMaxDay;
    }

    public final Integer getBubbleMaxShowCount() {
        return this.bubbleMaxShowCount;
    }

    public final Float getPopShowDelayTime() {
        return this.popShowDelayTime;
    }

    public final Integer getRedDotExitDay() {
        return this.redDotExitDay;
    }

    public final Integer getRedDotMaxExposeCount() {
        return this.redDotMaxExposeCount;
    }
}
