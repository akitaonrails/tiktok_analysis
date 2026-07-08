package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UcpPixelInfo {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long id;

    public UcpPixelInfo() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UcpPixelInfo) && Intrinsics.LJFF(this.id, ((UcpPixelInfo) obj).id);
    }

    public final int hashCode() {
        Long l = this.id;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpPixelInfo(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UcpPixelInfo(Long l) {
        this.id = l;
    }
}
