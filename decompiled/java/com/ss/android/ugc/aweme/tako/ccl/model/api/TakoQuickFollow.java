package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class TakoQuickFollow {

    @C09CT("follow_group")
    public final int followGroup;

    @C09CT("follow_type")
    public final int followType;

    @C09CT("query")
    public final String query;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoQuickFollow)) {
            return false;
        }
        TakoQuickFollow takoQuickFollow = (TakoQuickFollow) obj;
        return Intrinsics.LJFF(this.query, takoQuickFollow.query) && this.followGroup == takoQuickFollow.followGroup && this.followType == takoQuickFollow.followType;
    }

    public final int hashCode() {
        return (((this.query.hashCode() * 31) + this.followGroup) * 31) + this.followType;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoQuickFollow(query=");
        sbLIZ.append(this.query);
        sbLIZ.append(", followGroup=");
        sbLIZ.append(this.followGroup);
        sbLIZ.append(", followType=");
        sbLIZ.append(this.followType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoQuickFollow() {
        this("", 0, 0);
    }

    public TakoQuickFollow(String str, int i, int i2) {
        this.query = str;
        this.followGroup = i;
        this.followType = i2;
    }
}
