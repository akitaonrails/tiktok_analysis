package com.ss.android.ugc.aweme.model.api.response;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileNaviEditResponse extends BaseResponse {

    @C09CT("navi_id")
    public final String naviId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileNaviEditResponse) && Intrinsics.LJFF(this.naviId, ((ProfileNaviEditResponse) obj).naviId);
    }

    public final int hashCode() {
        String str = this.naviId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileNaviEditResponse(naviId=");
        sbLIZ.append(this.naviId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProfileNaviEditResponse(String str) {
        this.naviId = str;
    }
}
