package com.ss.android.ugc.aweme.notification.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeCollapsibility {
    public static final int $stable = 8;

    @C09CT("collapse_by_activity_preference")
    public boolean collapseByActivityPreference;

    @C09CT("cut_off_hours")
    public int cutOffHours = 8;

    @C09CT("at_least_show_count")
    public int atLeastShowCount = 3;

    public final int getAtLeastShowCount() {
        return this.atLeastShowCount;
    }

    public final boolean getCollapseByActivityPreference() {
        return this.collapseByActivityPreference;
    }

    public final int getCutOffHours() {
        return this.cutOffHours;
    }

    public final void setAtLeastShowCount(int i) {
        this.atLeastShowCount = i;
    }

    public final void setCollapseByActivityPreference(boolean z) {
        this.collapseByActivityPreference = z;
    }

    public final void setCutOffHours(int i) {
        this.cutOffHours = i;
    }
}
