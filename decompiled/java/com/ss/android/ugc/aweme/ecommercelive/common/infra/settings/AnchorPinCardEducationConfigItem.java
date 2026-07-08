package com.ss.android.ugc.aweme.ecommercelive.common.infra.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class AnchorPinCardEducationConfigItem {

    @C09CT("duration")
    public final long duration;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("show_offset")
    public final long showOffset;

    public AnchorPinCardEducationConfigItem() {
        this(1000L, 10000L, false);
    }

    public AnchorPinCardEducationConfigItem(long j, long j2, boolean z) {
        this.showOffset = j;
        this.duration = j2;
        this.enable = z;
    }
}
