package com.ss.android.ugc.tiktok.pns;

/* JADX INFO: loaded from: classes.dex */
public final class PnSUserDetailsInfoBean {
    public final Boolean isMinor;
    public final int todayUsageTime;

    public PnSUserDetailsInfoBean() {
        this(Boolean.FALSE, 0);
    }

    public final Boolean isMinor() {
        return this.isMinor;
    }

    public PnSUserDetailsInfoBean(Boolean bool, int i) {
        this.isMinor = bool;
        this.todayUsageTime = i;
    }
}
