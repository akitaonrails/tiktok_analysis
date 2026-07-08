package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class HybridShortStartConfigModel {

    @C09CT("opt_bullet")
    public boolean optBullet;

    @C09CT("opt_report")
    public boolean optReport;

    public HybridShortStartConfigModel() {
        this(false, false);
    }

    public HybridShortStartConfigModel(boolean z, boolean z2) {
        this.optReport = z;
        this.optBullet = z2;
    }
}
