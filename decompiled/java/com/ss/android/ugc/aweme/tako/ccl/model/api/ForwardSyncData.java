package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ForwardSyncData {

    @C09CT("forward_data")
    public final String forwardData;

    @C09CT("forward_sync_meta_info")
    public final ForwardSyncMetaInfo forwardSyncMetaInfo;

    @C09CT("request_id")
    public final String requestId;

    public ForwardSyncData() {
        this("", new ForwardSyncMetaInfo(1, 0L, null), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardSyncData)) {
            return false;
        }
        ForwardSyncData forwardSyncData = (ForwardSyncData) obj;
        return Intrinsics.LJFF(this.requestId, forwardSyncData.requestId) && Intrinsics.LJFF(this.forwardSyncMetaInfo, forwardSyncData.forwardSyncMetaInfo) && Intrinsics.LJFF(this.forwardData, forwardSyncData.forwardData);
    }

    public final int hashCode() {
        return (((this.requestId.hashCode() * 31) + this.forwardSyncMetaInfo.hashCode()) * 31) + this.forwardData.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForwardSyncData(requestId=");
        sbLIZ.append(this.requestId);
        sbLIZ.append(", forwardSyncMetaInfo=");
        sbLIZ.append(this.forwardSyncMetaInfo);
        sbLIZ.append(", forwardData=");
        sbLIZ.append(this.forwardData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ForwardSyncData(String str, ForwardSyncMetaInfo forwardSyncMetaInfo, String str2) {
        this.requestId = str;
        this.forwardSyncMetaInfo = forwardSyncMetaInfo;
        this.forwardData = str2;
    }
}
