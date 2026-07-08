package com.ss.android.ugc.aweme.search.pages.result.entitycard.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EntityCardLandingPageResponse extends BaseResponse {

    @C09CT("data")
    public final EntityCardLandingPageData data;

    public EntityCardLandingPageResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EntityCardLandingPageResponse) && Intrinsics.LJFF(this.data, ((EntityCardLandingPageResponse) obj).data);
    }

    public final int hashCode() {
        EntityCardLandingPageData entityCardLandingPageData = this.data;
        if (entityCardLandingPageData == null) {
            return 0;
        }
        return entityCardLandingPageData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EntityCardLandingPageResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EntityCardLandingPageResponse(EntityCardLandingPageData entityCardLandingPageData) {
        this.data = entityCardLandingPageData;
    }
}
