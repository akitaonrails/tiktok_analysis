package com.ss.android.ugc.aweme.model.api.response;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ProfileNaviInfoResponse extends BaseResponse {

    @C09CT("navi")
    public final ProfileNaviDataModel navi;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileNaviInfoResponse) && Intrinsics.LJFF(this.navi, ((ProfileNaviInfoResponse) obj).navi);
    }

    public final int hashCode() {
        ProfileNaviDataModel profileNaviDataModel = this.navi;
        if (profileNaviDataModel == null) {
            return 0;
        }
        return profileNaviDataModel.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileNaviInfoResponse(navi=");
        sbLIZ.append(this.navi);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProfileNaviInfoResponse(ProfileNaviDataModel profileNaviDataModel) {
        this.navi = profileNaviDataModel;
    }
}
