package com.ss.android.ugc.aweme.network.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GetManagementPageSettingsResponse extends com.ss.android.ugc.aweme.base.api.BaseResponse {

    @C09CT("access_criteria_collection")
    public final GroupAccessCriteriaCollection accessCriteriaCollection;

    public GetManagementPageSettingsResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetManagementPageSettingsResponse) && Intrinsics.LJFF(this.accessCriteriaCollection, ((GetManagementPageSettingsResponse) obj).accessCriteriaCollection);
    }

    public final int hashCode() {
        GroupAccessCriteriaCollection groupAccessCriteriaCollection = this.accessCriteriaCollection;
        if (groupAccessCriteriaCollection == null) {
            return 0;
        }
        return groupAccessCriteriaCollection.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetManagementPageSettingsResponse(accessCriteriaCollection=");
        sbLIZ.append(this.accessCriteriaCollection);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetManagementPageSettingsResponse(GroupAccessCriteriaCollection groupAccessCriteriaCollection) {
        this.accessCriteriaCollection = groupAccessCriteriaCollection;
    }
}
