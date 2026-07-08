package com.ss.android.ugc.aweme.ogc.declaration.page;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class LocationInfo implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("name")
    public final String name;

    public LocationInfo() {
        this(null, null);
    }

    public final boolean isValid() {
        String str;
        String str2 = this.id;
        return str2 != null && str2.length() > 0 && (str = this.name) != null && str.length() > 0;
    }

    public LocationInfo(String str, String str2) {
        this.id = str;
        this.name = str2;
    }
}
