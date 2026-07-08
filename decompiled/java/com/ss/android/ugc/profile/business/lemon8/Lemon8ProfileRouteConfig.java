package com.ss.android.ugc.profile.business.lemon8;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class Lemon8ProfileRouteConfig {

    @C09CT("other_profile_opt_enable")
    public final boolean othersProfileOptEnable;

    @C09CT("lemon8_others_profile_redirect_uri")
    public final String redirectUri;

    @C09CT("self_profile_opt_enable")
    public final boolean selfProfileOptEnable;

    @C09CT("tt_ab_version_id")
    public final int vid;

    public Lemon8ProfileRouteConfig() {
        this(0, false, false, "");
    }

    public Lemon8ProfileRouteConfig(int i, boolean z, boolean z2, String str) {
        this.vid = i;
        this.othersProfileOptEnable = z;
        this.selfProfileOptEnable = z2;
        this.redirectUri = str;
    }
}
