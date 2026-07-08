package com.ss.android.ugc.aweme.im.streak.impl.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class DMStreakWidgetConfig {

    @C09CT("default")
    public final DMStreakWidgetDefaultSubConfig defaultSubConfig;

    @C09CT("offset")
    public final DMStreakWidgetDefaultOffsetConfig offsetConfig;

    @C09CT("size")
    public final DMStreakWidgetSizeConfig sizeConfig;

    public DMStreakWidgetConfig() {
        this(new DMStreakWidgetDefaultSubConfig(80), new DMStreakWidgetDefaultOffsetConfig(12, 4, -8, -8), new DMStreakWidgetSizeConfig(100, 100));
    }

    public DMStreakWidgetConfig(DMStreakWidgetDefaultSubConfig dMStreakWidgetDefaultSubConfig, DMStreakWidgetDefaultOffsetConfig dMStreakWidgetDefaultOffsetConfig, DMStreakWidgetSizeConfig dMStreakWidgetSizeConfig) {
        this.defaultSubConfig = dMStreakWidgetDefaultSubConfig;
        this.offsetConfig = dMStreakWidgetDefaultOffsetConfig;
        this.sizeConfig = dMStreakWidgetSizeConfig;
    }
}
