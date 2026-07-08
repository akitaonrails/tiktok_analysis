package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class QuickMentionConfig {

    @C09CT("accuracy")
    public final int accuracy;

    @C09CT("close_times")
    public final int closeTimes;

    @C09CT("enable_close_button")
    public final boolean enableCloseButton;

    @C09CT("enable_quick_mention")
    public final boolean enableQuickMention;

    @C09CT("exit_times")
    public final int exitTimes;

    @C09CT("show_without_click_times")
    public final int showWithoutClickTimes;

    public QuickMentionConfig() {
        this(false, false, 6, 3, Integer.MAX_VALUE, 20);
    }

    public QuickMentionConfig(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        this.enableQuickMention = z;
        this.enableCloseButton = z2;
        this.showWithoutClickTimes = i;
        this.closeTimes = i2;
        this.exitTimes = i3;
        this.accuracy = i4;
    }
}
