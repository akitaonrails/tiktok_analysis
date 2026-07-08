package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MentionCheckRequest {

    @C09CT("cameo_id_list")
    public final List<String> cameoIds;

    @C09CT("libra_key")
    public final String libraKey;

    public MentionCheckRequest() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MentionCheckRequest)) {
            return false;
        }
        MentionCheckRequest mentionCheckRequest = (MentionCheckRequest) obj;
        return Intrinsics.LJFF(this.cameoIds, mentionCheckRequest.cameoIds) && Intrinsics.LJFF(this.libraKey, mentionCheckRequest.libraKey);
    }

    public final int hashCode() {
        List<String> list = this.cameoIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.libraKey;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionCheckRequest(cameoIds=");
        sbLIZ.append(this.cameoIds);
        sbLIZ.append(", libraKey=");
        sbLIZ.append(this.libraKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MentionCheckRequest(List<String> list, String str) {
        this.cameoIds = list;
        this.libraKey = str;
    }
}
