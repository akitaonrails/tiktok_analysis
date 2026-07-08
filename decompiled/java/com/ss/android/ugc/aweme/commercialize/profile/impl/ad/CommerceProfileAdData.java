package com.ss.android.ugc.aweme.commercialize.profile.impl.ad;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceProfileAdData {

    @C09CT("loadmore_len_android")
    public final int loadMoreLen;

    @C09CT("open_len_android")
    public final int openLen;

    @C09CT("profile_ad_version")
    public final int profileAdVersion;

    public CommerceProfileAdData() {
        this(0, 12, 12);
    }

    public CommerceProfileAdData(int i, int i2, int i3) {
        this.profileAdVersion = i;
        this.loadMoreLen = i2;
        this.openLen = i3;
    }
}
