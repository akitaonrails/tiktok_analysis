package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class AuthScopeInfo {

    @C09CT("description")
    public final String description;

    @C09CT("detail")
    public final String detail;

    @C09CT("name")
    public final String name;

    @C09CT("revocable")
    public final Boolean revocable;

    public AuthScopeInfo() {
        this(null, null, null, null);
    }

    public AuthScopeInfo(String str, String str2, String str3, Boolean bool) {
        this.name = str;
        this.description = str2;
        this.detail = str3;
        this.revocable = bool;
    }
}
