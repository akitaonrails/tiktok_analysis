package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class CreatorSubInfo implements Serializable {

    @C09CT("has_optin")
    public final Boolean hasOptin;

    @C09CT("is_revoke")
    public final Boolean isRevoke;

    public final Boolean getHasOptin() {
        return this.hasOptin;
    }

    public final Boolean isRevoke() {
        return this.isRevoke;
    }

    public CreatorSubInfo(Boolean bool, Boolean bool2) {
        this.hasOptin = bool;
        this.isRevoke = bool2;
    }
}
