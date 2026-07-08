package com.ss.android.ugc.aweme.relation.auth.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class FrequencyConfig {

    @C09CT("enable_contact_dialog")
    public final boolean enableContact;

    @C09CT("enable_facebook_dialog")
    public final boolean enableFB;

    @C09CT("enable_rec_user_dialog")
    public final boolean enableRecUser;

    public FrequencyConfig() {
        this(true, true, true);
    }

    public FrequencyConfig(boolean z, boolean z2, boolean z3) {
        this.enableFB = z;
        this.enableContact = z2;
        this.enableRecUser = z3;
    }
}
