package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveTooltipDebugConfig implements Serializable {
    public static final TypeAdapter ADAPTER = new LiveTooltipDebugConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("close_all_frequency_control")
    public boolean allClose;

    @C09CT("business_count_check")
    public boolean businessCheck;

    @C09CT("bubble_change_color")
    public boolean changeColor;

    @C09CT("daily_limit")
    public int dailyLimit;

    @C09CT("outdated_version")
    public int outdatedVersion;

    @C09CT("page_count_check")
    public boolean pageCheck;

    @C09CT("position_count_check")
    public boolean positionCheck;

    public LiveTooltipDebugConfig() {
        this(false, false, 0, 0, true, true, true);
    }

    public final boolean getAllClose() {
        return this.allClose;
    }

    public final boolean getBusinessCheck() {
        return this.businessCheck;
    }

    public final boolean getChangeColor() {
        return this.changeColor;
    }

    public final int getDailyLimit() {
        return this.dailyLimit;
    }

    public final int getOutdatedVersion() {
        return this.outdatedVersion;
    }

    public final boolean getPageCheck() {
        return this.pageCheck;
    }

    public final boolean getPositionCheck() {
        return this.positionCheck;
    }

    public final void setAllClose(boolean z) {
        this.allClose = z;
    }

    public final void setBusinessCheck(boolean z) {
        this.businessCheck = z;
    }

    public final void setChangeColor(boolean z) {
        this.changeColor = z;
    }

    public final void setDailyLimit(int i) {
        this.dailyLimit = i;
    }

    public final void setOutdatedVersion(int i) {
        this.outdatedVersion = i;
    }

    public final void setPageCheck(boolean z) {
        this.pageCheck = z;
    }

    public final void setPositionCheck(boolean z) {
        this.positionCheck = z;
    }

    public LiveTooltipDebugConfig(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5) {
        this.changeColor = z;
        this.allClose = z2;
        this.dailyLimit = i;
        this.outdatedVersion = i2;
        this.positionCheck = z3;
        this.pageCheck = z4;
        this.businessCheck = z5;
    }
}
