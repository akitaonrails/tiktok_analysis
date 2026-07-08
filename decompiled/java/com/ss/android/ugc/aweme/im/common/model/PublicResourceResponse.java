package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PublicResourceResponse extends BaseResponse {

    @C09CT("results")
    public final List<SingleResourceRefreshResp> singleResourceRefreshRespList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PublicResourceResponse) && Intrinsics.LJFF(this.singleResourceRefreshRespList, ((PublicResourceResponse) obj).singleResourceRefreshRespList);
    }

    public final int hashCode() {
        return this.singleResourceRefreshRespList.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublicResourceResponse(singleResourceRefreshRespList=");
        sbLIZ.append(this.singleResourceRefreshRespList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PublicResourceResponse(List<SingleResourceRefreshResp> list) {
        this.singleResourceRefreshRespList = list;
    }
}
