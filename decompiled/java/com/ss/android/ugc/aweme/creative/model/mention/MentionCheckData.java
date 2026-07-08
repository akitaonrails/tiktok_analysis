package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MentionCheckData {

    @C09CT("permission_map")
    public final Map<String, Integer> permissionResult;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MentionCheckData) && Intrinsics.LJFF(this.permissionResult, ((MentionCheckData) obj).permissionResult);
    }

    public final int hashCode() {
        Map<String, Integer> map = this.permissionResult;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionCheckData(permissionResult=");
        sbLIZ.append(this.permissionResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MentionCheckData() {
        this(C2097608Jq.LJ());
    }

    public MentionCheckData(Map<String, Integer> map) {
        this.permissionResult = map;
    }
}
