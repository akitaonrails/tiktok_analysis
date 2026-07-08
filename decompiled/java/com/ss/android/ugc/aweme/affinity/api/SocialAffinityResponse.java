package com.ss.android.ugc.aweme.affinity.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.affinity.model.SingleSiteAffinity;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class SocialAffinityResponse extends BaseResponse {

    @C09CT("responses")
    public final List<SingleSiteAffinity> siteAffinityList;

    public SocialAffinityResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SocialAffinityResponse) && Intrinsics.LJFF(this.siteAffinityList, ((SocialAffinityResponse) obj).siteAffinityList);
    }

    public final int hashCode() {
        List<SingleSiteAffinity> list = this.siteAffinityList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAffinityResponse(siteAffinityList=");
        sbLIZ.append(this.siteAffinityList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SocialAffinityResponse(List<SingleSiteAffinity> list) {
        this.siteAffinityList = list;
    }
}
