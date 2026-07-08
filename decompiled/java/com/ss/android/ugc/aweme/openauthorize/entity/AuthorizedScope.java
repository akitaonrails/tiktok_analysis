package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class AuthorizedScope implements Serializable {
    public Boolean isEnabled;

    @C09CT("scope_desc")
    public final String scopeDesc;

    @C09CT("scope_name")
    public final String scopeName;

    @C09CT("is_scope_required")
    public final Boolean scopeRequired;

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(Boolean bool) {
        this.isEnabled = bool;
    }

    public AuthorizedScope(String str, String str2, Boolean bool, Boolean bool2) {
        this.scopeName = str;
        this.scopeDesc = str2;
        this.scopeRequired = bool;
        this.isEnabled = bool2;
    }
}
