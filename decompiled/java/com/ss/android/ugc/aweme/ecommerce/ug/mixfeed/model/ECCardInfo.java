package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class ECCardInfo {

    @C09CT("type")
    public final String cardType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    public ECCardInfo() {
        this(null, null);
    }

    public ECCardInfo(String str, String str2) {
        this.id = str;
        this.cardType = str2;
    }
}
