package com.ss.android.ugc.aweme.search.common.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSugActiveConfig {
    public static final int $stable = 8;

    @C09CT("active_days_level")
    public int activeDaysLevel = 5;

    @C09CT("active_delay_level")
    public int activeDelayLevel = 5;

    @C09CT("urg_level4")
    public int urgLevel4 = 5;

    @C09CT("urg_level3")
    public int urgLevel3 = 15;

    @C09CT("urg_level2")
    public int urgLevel2 = 30;

    @C09CT("urg_level_other")
    public int urgLevelOther = 60;

    public final int getActiveDaysLevel() {
        return this.activeDaysLevel;
    }

    public final int getActiveDelayLevel() {
        return this.activeDelayLevel;
    }

    public final int getUrgLevel2() {
        return this.urgLevel2;
    }

    public final int getUrgLevel3() {
        return this.urgLevel3;
    }

    public final int getUrgLevel4() {
        return this.urgLevel4;
    }

    public final int getUrgLevelOther() {
        return this.urgLevelOther;
    }

    public final void setActiveDaysLevel(int i) {
        this.activeDaysLevel = i;
    }

    public final void setActiveDelayLevel(int i) {
        this.activeDelayLevel = i;
    }

    public final void setUrgLevel2(int i) {
        this.urgLevel2 = i;
    }

    public final void setUrgLevel3(int i) {
        this.urgLevel3 = i;
    }

    public final void setUrgLevel4(int i) {
        this.urgLevel4 = i;
    }

    public final void setUrgLevelOther(int i) {
        this.urgLevelOther = i;
    }
}
