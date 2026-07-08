package com.ss.android.ugc.aweme.shoutouts.model;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class ShoutoutsOrderRestrict {

    @C09CT("opening")
    public final boolean opening;

    @C09CT("other_restrict")
    public final boolean otherRestrict;

    @C09CT("reason")
    public final String reason;

    @C09CT("restrict_type")
    public final int restrictType;

    public ShoutoutsOrderRestrict(boolean z, boolean z2, String str, int i) {
        this.opening = z;
        this.otherRestrict = z2;
        this.reason = str;
        this.restrictType = i;
    }
}
