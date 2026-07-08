package com.ss.android.ugc.profile.business.ur.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class ThirdPartyBindingEntry {
    public static final int $stable = 0;

    @C09CT("ins")
    public final boolean ins;

    @C09CT("twitter")
    public final boolean twitter;

    @C09CT("youtube")
    public final boolean youtube;

    public ThirdPartyBindingEntry() {
        this(true, true, true);
    }

    public ThirdPartyBindingEntry(boolean z, boolean z2, boolean z3) {
        this.twitter = z;
        this.ins = z2;
        this.youtube = z3;
    }
}
