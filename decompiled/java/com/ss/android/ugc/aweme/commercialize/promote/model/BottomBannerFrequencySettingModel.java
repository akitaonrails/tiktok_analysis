package com.ss.android.ugc.aweme.commercialize.promote.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class BottomBannerFrequencySettingModel implements Serializable {

    @C09CT("click_time_gap")
    public Integer clickTimeGap;

    @C09CT("regular_version_click_times")
    public Integer regularVersionClickTimes;

    @C09CT("regular_version_show_times")
    public Integer regularVersionShowTimes;

    @C09CT("should_preload")
    public Boolean shouldPreload;

    @C09CT("strict_version_click_times")
    public Integer strictVersionClickTimes;

    @C09CT("strict_version_show_times")
    public Integer strictVersionShowTimes;

    public BottomBannerFrequencySettingModel() {
        this(0, 0, 0, 0, 0, Boolean.FALSE);
    }

    public final Integer getClickTimeGap() {
        return this.clickTimeGap;
    }

    public final Integer getRegularVersionClickTimes() {
        return this.regularVersionClickTimes;
    }

    public final Integer getRegularVersionShowTimes() {
        return this.regularVersionShowTimes;
    }

    public final Boolean getShouldPreload() {
        return this.shouldPreload;
    }

    public final Integer getStrictVersionClickTimes() {
        return this.strictVersionClickTimes;
    }

    public final Integer getStrictVersionShowTimes() {
        return this.strictVersionShowTimes;
    }

    public final void setClickTimeGap(Integer num) {
        this.clickTimeGap = num;
    }

    public final void setRegularVersionClickTimes(Integer num) {
        this.regularVersionClickTimes = num;
    }

    public final void setRegularVersionShowTimes(Integer num) {
        this.regularVersionShowTimes = num;
    }

    public final void setShouldPreload(Boolean bool) {
        this.shouldPreload = bool;
    }

    public final void setStrictVersionClickTimes(Integer num) {
        this.strictVersionClickTimes = num;
    }

    public final void setStrictVersionShowTimes(Integer num) {
        this.strictVersionShowTimes = num;
    }

    public BottomBannerFrequencySettingModel(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool) {
        this.regularVersionShowTimes = num;
        this.strictVersionShowTimes = num2;
        this.regularVersionClickTimes = num3;
        this.strictVersionClickTimes = num4;
        this.clickTimeGap = num5;
        this.shouldPreload = bool;
    }
}
