package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class UserPronounsInfo implements Serializable {

    @C09CT("enable_edit_pronouns")
    public Boolean enableEditPronouns;

    @C09CT("pronouns")
    public String pronouns;

    public final Boolean getEnableEditPronouns() {
        return this.enableEditPronouns;
    }

    public final String getPronouns() {
        return this.pronouns;
    }

    public final void setEnableEditPronouns(Boolean bool) {
        this.enableEditPronouns = bool;
    }

    public final void setPronouns(String str) {
        this.pronouns = str;
    }
}
