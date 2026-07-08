package com.ss.android.ugc.aweme.inbox;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxRefresh {
    public static final int $stable = 8;

    @C09CT("refresh_by_tab_change")
    public boolean refreshByTabChange = true;

    @C09CT("refresh_threshold_by_tab_change")
    public String refreshThresholdByTabChange = "60";

    @C09CT("refresh_threshold_by_resume")
    public String refreshThresholdByResume = "60";

    public final boolean getRefreshByTabChange() {
        return this.refreshByTabChange;
    }

    public final String getRefreshThresholdByResume() {
        return this.refreshThresholdByResume;
    }

    public final String getRefreshThresholdByTabChange() {
        return this.refreshThresholdByTabChange;
    }

    public final void setRefreshByTabChange(boolean z) {
        this.refreshByTabChange = z;
    }

    public final void setRefreshThresholdByResume(String str) {
        this.refreshThresholdByResume = str;
    }

    public final void setRefreshThresholdByTabChange(String str) {
        this.refreshThresholdByTabChange = str;
    }
}
