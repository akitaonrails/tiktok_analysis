package com.ss.android.ugc.profile.business.effect.dashboard;

/* JADX INFO: loaded from: classes30.dex */
public final class MarkDashboardEffectViewedResp {
    public static final int $stable = 8;
    public int httpStatusCode;

    public MarkDashboardEffectViewedResp() {
        this(-1);
    }

    public MarkDashboardEffectViewedResp(int i) {
        this.httpStatusCode = i;
    }

    public final void setHttpStatusCode(int i) {
        this.httpStatusCode = i;
    }
}
