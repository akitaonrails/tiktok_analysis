package com.ss.android.ugc.profile.business.effect.dashboard;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class MarkDashboardEffectViewedReq {
    public static final int $stable = 0;

    @C09CT("banner_id")
    public final String bannerId;

    @C09CT("popup_banner_type")
    public final int type;

    public MarkDashboardEffectViewedReq() {
        this(0, "");
    }

    public MarkDashboardEffectViewedReq(int i, String str) {
        this.type = i;
        this.bannerId = str;
    }
}
