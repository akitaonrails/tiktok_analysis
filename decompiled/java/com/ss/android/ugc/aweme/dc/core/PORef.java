package com.ss.android.ugc.aweme.dc.core;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class PORef {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PORef)) {
            return false;
        }
        PORef pORef = (PORef) obj;
        return Intrinsics.LJFF(this.id, pORef.id) && Intrinsics.LJFF(this.type, pORef.type);
    }

    public PORef(String str, String str2) {
        this.id = str;
        this.type = str2;
    }
}
