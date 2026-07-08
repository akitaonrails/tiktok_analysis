package com.ss.android.ugc.aweme.interest.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class InterestFeedCardExpConfig {

    @C09CT("bgm_url")
    public final String bgmUrl;

    @C09CT("disable_first_session")
    public final boolean disableFirstSession;

    @C09CT("is_enable")
    public final boolean isEnable;

    @C09CT("start_at_vv")
    public final int startAtVv;

    public InterestFeedCardExpConfig() {
        this(false, 16, false, "https://sf16-ies-music-va.tiktokcdn.com/obj/tos-useast2a-ve-2774/o43BwcuKDMiO5lxDCeFQQ8ZmTBfTnBBIEVgWtp");
    }

    public InterestFeedCardExpConfig(boolean z, int i, boolean z2, String str) {
        this.isEnable = z;
        this.startAtVv = i;
        this.disableFirstSession = z2;
        this.bgmUrl = str;
    }
}
