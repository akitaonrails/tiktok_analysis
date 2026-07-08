package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileUserExperiments implements Serializable {

    @C09CT("enable_share_private_account")
    public Boolean canSharePrivateAccount = Boolean.FALSE;

    @C09CT("block_bio_link_jump")
    public int canShowEntrance;

    public final Boolean getCanSharePrivateAccount() {
        return this.canSharePrivateAccount;
    }

    public final int getCanShowEntrance() {
        return this.canShowEntrance;
    }

    public final void setCanSharePrivateAccount(Boolean bool) {
        this.canSharePrivateAccount = bool;
    }

    public final void setCanShowEntrance(int i) {
        this.canShowEntrance = i;
    }
}
