package com.ss.android.ugc.aweme.subscription.pgc.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PgcSubscribingInfo {

    @C09CT("sub_info")
    public final SubInfo subInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PgcSubscribingInfo) && Intrinsics.LJFF(this.subInfo, ((PgcSubscribingInfo) obj).subInfo);
    }

    public final int hashCode() {
        return this.subInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcSubscribingInfo(subInfo=");
        sbLIZ.append(this.subInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PgcSubscribingInfo() {
        this(new SubInfo());
    }

    public PgcSubscribingInfo(SubInfo subInfo) {
        this.subInfo = subInfo;
    }
}
