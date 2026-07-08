package com.ss.android.ugc.aweme.creatortools.creatorplus;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class CPlusSettings {

    @C09CT("creator_plus_should_show")
    public final boolean allowCreatorPlus;

    @C09CT("creator_plus_congrats_url")
    public final String creatorPlusCongratsURL;

    @C09CT("creator_plus_opt_in_url")
    public final String creatorPlusOptInURL;

    public CPlusSettings(boolean z, String str, String str2) {
        this.allowCreatorPlus = z;
        this.creatorPlusOptInURL = str;
        this.creatorPlusCongratsURL = str2;
    }
}
