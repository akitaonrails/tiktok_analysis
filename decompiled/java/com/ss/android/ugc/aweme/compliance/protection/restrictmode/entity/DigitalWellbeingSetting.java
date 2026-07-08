package com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class DigitalWellbeingSetting implements Serializable {
    public static final int $stable = 8;

    @C09CT("dw_all_new_feature_release_highlight")
    public boolean dwAllNewFeatureHighlight;

    @C09CT("dw_new_feature_release_highlight")
    public boolean dwNewFeatureReleaseHighlight;

    @C09CT("isTeenageModeSelf")
    public boolean isRestrictModeSelf;

    @C09CT("isWeeklyUpdate")
    public boolean isWeeklyUpdate;

    @C09CT("non_login_screen_time_enable")
    public Boolean nonLoginScreenTimeEnable;

    @C09CT("restrictModeHasPassword")
    public boolean restrictModeHasPassword;

    @C09CT("screenTimeBreaks")
    public int screenTimeBreaks;

    @C09CT("screenTimeType")
    public int screenTimeType;

    @C09CT("timeLockSelfEnable")
    public int timeLockSelfEnable;

    @C09CT("timeLockSelfInMin")
    public int timeLockSelfInMin;

    @C09CT("timeLockSelfType")
    public int timeLockSelfType;

    @C09CT("timelockEligible")
    public int timelockEligible;

    public final boolean getDwAllNewFeatureHighlight() {
        return this.dwAllNewFeatureHighlight;
    }

    public final boolean getDwNewFeatureReleaseHighlight() {
        return this.dwNewFeatureReleaseHighlight;
    }

    public final Boolean getNonLoginScreenTimeEnable() {
        return this.nonLoginScreenTimeEnable;
    }

    public final boolean getRestrictModeHasPassword() {
        return this.restrictModeHasPassword;
    }

    public final int getScreenTimeBreaks() {
        return this.screenTimeBreaks;
    }

    public final int getScreenTimeType() {
        return this.screenTimeType;
    }

    public final int getTimeLockSelfEnable() {
        return this.timeLockSelfEnable;
    }

    public final int getTimeLockSelfInMin() {
        return this.timeLockSelfInMin;
    }

    public final int getTimeLockSelfType() {
        return this.timeLockSelfType;
    }

    public final int getTimelockEligible() {
        return this.timelockEligible;
    }

    public final boolean isRestrictModeSelf() {
        return this.isRestrictModeSelf;
    }

    public final boolean isWeeklyUpdate() {
        return this.isWeeklyUpdate;
    }

    public final void setDwAllNewFeatureHighlight(boolean z) {
        this.dwAllNewFeatureHighlight = z;
    }

    public final void setDwNewFeatureReleaseHighlight(boolean z) {
        this.dwNewFeatureReleaseHighlight = z;
    }

    public final void setNonLoginScreenTimeEnable(Boolean bool) {
        this.nonLoginScreenTimeEnable = bool;
    }

    public final void setRestrictModeHasPassword(boolean z) {
        this.restrictModeHasPassword = z;
    }

    public final void setRestrictModeSelf(boolean z) {
        this.isRestrictModeSelf = z;
    }

    public final void setScreenTimeBreaks(int i) {
        this.screenTimeBreaks = i;
    }

    public final void setScreenTimeType(int i) {
        this.screenTimeType = i;
    }

    public final void setTimeLockSelfEnable(int i) {
        this.timeLockSelfEnable = i;
    }

    public final void setTimeLockSelfInMin(int i) {
        this.timeLockSelfInMin = i;
    }

    public final void setTimeLockSelfType(int i) {
        this.timeLockSelfType = i;
    }

    public final void setTimelockEligible(int i) {
        this.timelockEligible = i;
    }

    public final void setWeeklyUpdate(boolean z) {
        this.isWeeklyUpdate = z;
    }

    public DigitalWellbeingSetting(boolean z, int i, int i2, int i3, int i4, boolean z2, int i5, int i6, boolean z3, boolean z4, Boolean bool, boolean z5) {
        this.isRestrictModeSelf = z;
        this.timeLockSelfInMin = i;
        this.timeLockSelfEnable = i2;
        this.timelockEligible = i3;
        this.timeLockSelfType = i4;
        this.isWeeklyUpdate = z2;
        this.screenTimeBreaks = i5;
        this.screenTimeType = i6;
        this.restrictModeHasPassword = z3;
        this.dwNewFeatureReleaseHighlight = z4;
        this.nonLoginScreenTimeEnable = bool;
        this.dwAllNewFeatureHighlight = z5;
    }
}
