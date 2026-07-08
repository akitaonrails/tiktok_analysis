package com.bytedance.geckox.policy.meta;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class ChannelMetaDataReportSettings {

    @C09CT("create_days")
    public final int createDays;
    public final boolean enabled;

    @C09CT("exclude_aks")
    public final List<String> excludeAks;

    @C09CT("new_user_threshold")
    public final int newUserThreshold;

    @C09CT("recent_days")
    public final int recentDays;
    public final int sampling;

    public ChannelMetaDataReportSettings() {
        this(false, null, 20, 14, 1, 7);
    }

    public final int getCreateDays() {
        return this.createDays;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<String> getExcludeAks() {
        return this.excludeAks;
    }

    public final int getNewUserThreshold() {
        return this.newUserThreshold;
    }

    public final int getRecentDays() {
        return this.recentDays;
    }

    public final int getSampling() {
        return this.sampling;
    }

    public ChannelMetaDataReportSettings(boolean z, List<String> list, int i, int i2, int i3, int i4) {
        this.enabled = z;
        this.excludeAks = list;
        this.sampling = i;
        this.createDays = i2;
        this.newUserThreshold = i3;
        this.recentDays = i4;
    }
}
