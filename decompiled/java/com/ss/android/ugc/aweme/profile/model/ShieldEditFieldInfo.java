package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class ShieldEditFieldInfo implements Serializable {

    @C09CT("link")
    public final String link;

    @C09CT("shield_edit_field")
    public final Integer shieldEditField;

    public ShieldEditFieldInfo() {
        this(null, "");
    }

    public ShieldEditFieldInfo(Integer num, String str) {
        this.shieldEditField = num;
        this.link = str;
    }
}
