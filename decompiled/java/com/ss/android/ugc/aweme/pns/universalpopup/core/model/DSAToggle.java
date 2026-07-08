package com.ss.android.ugc.aweme.pns.universalpopup.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public final class DSAToggle implements Serializable {

    @C09CT("default")
    public final boolean defaultValue;

    @C09CT("description")
    public final String description;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("name")
    public final String name;

    public DSAToggle() {
        this("", null, "", false);
    }

    public DSAToggle(String str, String str2, String str3, boolean z) {
        this.name = str;
        this.description = str2;
        this.id = str3;
        this.defaultValue = z;
    }
}
