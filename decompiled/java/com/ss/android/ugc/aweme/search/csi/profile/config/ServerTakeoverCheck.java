package com.ss.android.ugc.aweme.search.csi.profile.config;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class ServerTakeoverCheck {

    @C09CT("business_account")
    public final boolean businessAccount;

    @C09CT("children_mode")
    public final boolean childrenMode;

    @C09CT("feed_nonpersonalized")
    public final boolean feedNonPersonalized;

    @C09CT("private_account")
    public final boolean privateAccount;

    public ServerTakeoverCheck() {
        this(false, false, false, false);
    }

    public ServerTakeoverCheck(boolean z, boolean z2, boolean z3, boolean z4) {
        this.businessAccount = z;
        this.privateAccount = z2;
        this.childrenMode = z3;
        this.feedNonPersonalized = z4;
    }
}
