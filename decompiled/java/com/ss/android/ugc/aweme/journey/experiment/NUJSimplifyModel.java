package com.ss.android.ugc.aweme.journey.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class NUJSimplifyModel {

    @C09CT("should_delay_personal_ads")
    public final boolean delayAds;

    @C09CT("should_delay_social_pop")
    public final boolean delaySocial;

    @C09CT("should_remove_is")
    public final boolean skipIS;

    @C09CT("should_remove_language")
    public final boolean skipLanguage;

    public NUJSimplifyModel() {
        this(false, false, false, false);
    }

    public NUJSimplifyModel(boolean z, boolean z2, boolean z3, boolean z4) {
        this.delayAds = z;
        this.delaySocial = z2;
        this.skipLanguage = z3;
        this.skipIS = z4;
    }
}
