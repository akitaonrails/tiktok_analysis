package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class StateConfig {
    public static final TypeAdapter ADAPTER = new StateConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("state_check_duration")
    public int checkDuration;

    @C09CT("state_compare_recheck")
    public int doubleCheck;

    @C09CT("state_stat_report")
    public boolean enableStat;

    @C09CT("state_filter_by_type")
    public boolean filterStateType;

    @C09CT("state_im_config")
    public int imConfig;

    @C09CT("state_sync_rtc")
    public boolean syncWithRTC;

    public StateConfig() {
        this(15, false, true, true, 1, 60);
    }

    public final int getCheckDuration() {
        return this.checkDuration;
    }

    public final int getDoubleCheck() {
        return this.doubleCheck;
    }

    public final boolean getEnableStat() {
        return this.enableStat;
    }

    public final boolean getFilterStateType() {
        return this.filterStateType;
    }

    public final int getImConfig() {
        return this.imConfig;
    }

    public final boolean getSyncWithRTC() {
        return this.syncWithRTC;
    }

    public final void setCheckDuration(int i) {
        this.checkDuration = i;
    }

    public final void setDoubleCheck(int i) {
        this.doubleCheck = i;
    }

    public final void setEnableStat(boolean z) {
        this.enableStat = z;
    }

    public final void setFilterStateType(boolean z) {
        this.filterStateType = z;
    }

    public final void setImConfig(int i) {
        this.imConfig = i;
    }

    public final void setSyncWithRTC(boolean z) {
        this.syncWithRTC = z;
    }

    public StateConfig(int i, boolean z, boolean z2, boolean z3, int i2, int i3) {
        this.imConfig = i;
        this.enableStat = z;
        this.syncWithRTC = z2;
        this.filterStateType = z3;
        this.doubleCheck = i2;
        this.checkDuration = i3;
    }
}
