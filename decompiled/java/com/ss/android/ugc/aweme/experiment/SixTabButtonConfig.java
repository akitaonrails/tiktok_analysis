package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class SixTabButtonConfig {

    @C09CT("create_bubble_appear_times")
    public final Integer createBubbleAppearTimes;

    @C09CT("create_bubble_interval_time")
    public final Integer createBubbleIntervalTime;

    @C09CT("shoot_style_for_six_tabs")
    public final Integer shootStyleForSixTabs;

    public SixTabButtonConfig(Integer num, Integer num2, Integer num3) {
        this.shootStyleForSixTabs = num;
        this.createBubbleIntervalTime = num2;
        this.createBubbleAppearTimes = num3;
    }
}
