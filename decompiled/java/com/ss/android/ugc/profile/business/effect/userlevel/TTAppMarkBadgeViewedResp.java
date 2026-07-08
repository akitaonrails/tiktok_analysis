package com.ss.android.ugc.profile.business.effect.userlevel;

/* JADX INFO: loaded from: classes36.dex */
public final class TTAppMarkBadgeViewedResp {
    public static final int $stable = 8;
    public int httpStatusCode;

    public TTAppMarkBadgeViewedResp() {
        this(-1);
    }

    public TTAppMarkBadgeViewedResp(int i) {
        this.httpStatusCode = i;
    }

    public final void setHttpStatusCode(int i) {
        this.httpStatusCode = i;
    }
}
