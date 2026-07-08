package com.ss.android.ugc.aweme.specialplus;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class SpecialPlusConfig {
    public static final int $stable = 8;

    @C09CT("version")
    public int version;

    @C09CT("valid_time")
    public SpecialPlusTimePeriod[] validTime = new SpecialPlusTimePeriod[0];

    @C09CT("plus_icon")
    public SpecialPlusMedia plusIcon = new SpecialPlusMedia();

    @C09CT("resource_type")
    public String resourceType = "";

    @C09CT("condition")
    public SpecialPlusLabels labels = new SpecialPlusLabels();

    @C09CT("tips")
    public SpecialPlusTips tips = new SpecialPlusTips();

    @C09CT("app_version")
    public String appVersion = "";

    @C09CT("cool_down_period_in_hours")
    public float cool_down_period_in_hours = 4.0f;

    @C09CT("appearance_period_in_hours")
    public float appearance_period_in_hours = 24.0f;

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final float getAppearance_period_in_hours() {
        return this.appearance_period_in_hours;
    }

    public final float getCool_down_period_in_hours() {
        return this.cool_down_period_in_hours;
    }

    public final SpecialPlusLabels getLabels() {
        return this.labels;
    }

    public final SpecialPlusMedia getPlusIcon() {
        return this.plusIcon;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    public final SpecialPlusTips getTips() {
        return this.tips;
    }

    public final SpecialPlusTimePeriod[] getValidTime() {
        return this.validTime;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setAppearance_period_in_hours(float f) {
        this.appearance_period_in_hours = f;
    }

    public final void setCool_down_period_in_hours(float f) {
        this.cool_down_period_in_hours = f;
    }

    public final void setLabels(SpecialPlusLabels specialPlusLabels) {
        this.labels = specialPlusLabels;
    }

    public final void setPlusIcon(SpecialPlusMedia specialPlusMedia) {
        this.plusIcon = specialPlusMedia;
    }

    public final void setResourceType(String str) {
        this.resourceType = str;
    }

    public final void setTips(SpecialPlusTips specialPlusTips) {
        this.tips = specialPlusTips;
    }

    public final void setValidTime(SpecialPlusTimePeriod[] specialPlusTimePeriodArr) {
        this.validTime = specialPlusTimePeriodArr;
    }

    public final void setVersion(int i) {
        this.version = i;
    }
}
