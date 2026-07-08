package com.ss.android.ugc.aweme.service.interest.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes27.dex */
public final class InterestTag {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("selected")
    public final Boolean selected;

    @C09CT("text")
    public String text;

    public InterestTag(String str, String str2, Boolean bool) {
        this.id = str;
        this.text = str2;
        this.selected = bool;
    }
}
