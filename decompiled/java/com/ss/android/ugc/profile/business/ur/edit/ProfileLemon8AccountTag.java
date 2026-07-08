package com.ss.android.ugc.profile.business.ur.edit;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileLemon8AccountTag {

    @C09CT("is_tt_authorized")
    public final Boolean isTTAuthorized;

    @C09CT("lemon8_profile_link")
    public final String lemon8ProfileLink;

    public ProfileLemon8AccountTag() {
        this(Boolean.FALSE, "https://www.lemon8-app.com/bind/profile");
    }

    public ProfileLemon8AccountTag(Boolean bool, String str) {
        this.isTTAuthorized = bool;
        this.lemon8ProfileLink = str;
    }
}
