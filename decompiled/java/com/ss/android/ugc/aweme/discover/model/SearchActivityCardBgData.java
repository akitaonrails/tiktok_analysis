package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchActivityCardBgData implements Serializable {

    @C09CT("activity_bg_color")
    public String activityBgColor;

    @C09CT("activity_bg_range")
    public Integer activityBgRange;

    @C09CT("bg_color_mode")
    public Integer bgColorMode;

    @C09CT("gradient_config")
    public SearchActivityCardGradientConfig gradientConfig;

    public final String getActivityBgColor() {
        return this.activityBgColor;
    }

    public final Integer getActivityBgRange() {
        return this.activityBgRange;
    }

    public final Integer getBgColorMode() {
        return this.bgColorMode;
    }

    public final SearchActivityCardGradientConfig getGradientConfig() {
        return this.gradientConfig;
    }

    public final void setActivityBgColor(String str) {
        this.activityBgColor = str;
    }

    public final void setActivityBgRange(Integer num) {
        this.activityBgRange = num;
    }

    public final void setBgColorMode(Integer num) {
        this.bgColorMode = num;
    }

    public final void setGradientConfig(SearchActivityCardGradientConfig searchActivityCardGradientConfig) {
        this.gradientConfig = searchActivityCardGradientConfig;
    }
}
