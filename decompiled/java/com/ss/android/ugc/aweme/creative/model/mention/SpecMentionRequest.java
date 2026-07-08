package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SpecMentionRequest {

    @C09CT("cameo_ids")
    public final List<String> cameoIds;

    @C09CT("uids")
    public final List<Long> uids;

    @C09CT("with_my")
    public final Boolean withMy;

    public SpecMentionRequest() {
        this(null, null, Boolean.FALSE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecMentionRequest)) {
            return false;
        }
        SpecMentionRequest specMentionRequest = (SpecMentionRequest) obj;
        return Intrinsics.LJFF(this.cameoIds, specMentionRequest.cameoIds) && Intrinsics.LJFF(this.uids, specMentionRequest.uids) && Intrinsics.LJFF(this.withMy, specMentionRequest.withMy);
    }

    public final int hashCode() {
        List<String> list = this.cameoIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Long> list2 = this.uids;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.withMy;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpecMentionRequest(cameoIds=");
        sbLIZ.append(this.cameoIds);
        sbLIZ.append(", uids=");
        sbLIZ.append(this.uids);
        sbLIZ.append(", withMy=");
        sbLIZ.append(this.withMy);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SpecMentionRequest(List<String> list, List<Long> list2, Boolean bool) {
        this.cameoIds = list;
        this.uids = list2;
        this.withMy = bool;
    }
}
