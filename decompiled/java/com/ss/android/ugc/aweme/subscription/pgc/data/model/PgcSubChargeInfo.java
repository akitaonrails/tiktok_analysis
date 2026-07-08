package com.ss.android.ugc.aweme.subscription.pgc.data.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PgcSubChargeInfo {
    public static final int $stable = 8;

    @C09CT(alternate = {"LIZ"}, value = "sub_level")
    public final PgcSubLevel subLevel;

    public PgcSubChargeInfo() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PgcSubChargeInfo) && Intrinsics.LJFF(this.subLevel, ((PgcSubChargeInfo) obj).subLevel);
    }

    public int hashCode() {
        PgcSubLevel pgcSubLevel = this.subLevel;
        if (pgcSubLevel == null) {
            return 0;
        }
        return pgcSubLevel.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcSubChargeInfo(subLevel=");
        sbLIZ.append(this.subLevel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PgcSubChargeInfo(PgcSubLevel pgcSubLevel) {
        this.subLevel = pgcSubLevel;
    }
}
