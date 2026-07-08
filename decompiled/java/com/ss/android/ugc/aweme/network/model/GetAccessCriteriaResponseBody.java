package com.ss.android.ugc.aweme.network.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class GetAccessCriteriaResponseBody extends com.ss.android.ugc.aweme.base.api.BaseResponse {

    @C09CT("access_criteria_collections")
    public final List<GroupAccessCriteriaCollection> accessCriteriaCollections;

    public GetAccessCriteriaResponseBody() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetAccessCriteriaResponseBody) && Intrinsics.LJFF(this.accessCriteriaCollections, ((GetAccessCriteriaResponseBody) obj).accessCriteriaCollections);
    }

    public final int hashCode() {
        List<GroupAccessCriteriaCollection> list = this.accessCriteriaCollections;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetAccessCriteriaResponseBody(accessCriteriaCollections=");
        sbLIZ.append(this.accessCriteriaCollections);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetAccessCriteriaResponseBody(List<GroupAccessCriteriaCollection> list) {
        this.accessCriteriaCollections = list;
    }
}
