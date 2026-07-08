package com.ss.android.ugc.aweme.subscription.pgc.data.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PgcSubLevel {
    public static final int $stable = 8;

    @C09CT(alternate = {"LIZ"}, value = "subscribe_badge")
    public final SubscribeBadge subscribeBadge;

    public PgcSubLevel() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PgcSubLevel) && Intrinsics.LJFF(this.subscribeBadge, ((PgcSubLevel) obj).subscribeBadge);
    }

    public int hashCode() {
        SubscribeBadge subscribeBadge = this.subscribeBadge;
        if (subscribeBadge == null) {
            return 0;
        }
        return subscribeBadge.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcSubLevel(subscribeBadge=");
        sbLIZ.append(this.subscribeBadge);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PgcSubLevel(SubscribeBadge subscribeBadge) {
        this.subscribeBadge = subscribeBadge;
    }
}
