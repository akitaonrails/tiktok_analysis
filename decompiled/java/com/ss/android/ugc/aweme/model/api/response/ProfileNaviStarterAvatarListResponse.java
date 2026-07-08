package com.ss.android.ugc.aweme.model.api.response;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviInitialDataModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileNaviStarterAvatarListResponse extends BaseResponse {

    @C09CT("can_auto_create")
    public final Boolean canAutoCreate;

    @C09CT("initial_navis")
    public final List<ProfileNaviInitialDataModel> starterAvatarList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviStarterAvatarListResponse)) {
            return false;
        }
        ProfileNaviStarterAvatarListResponse profileNaviStarterAvatarListResponse = (ProfileNaviStarterAvatarListResponse) obj;
        return Intrinsics.LJFF(this.starterAvatarList, profileNaviStarterAvatarListResponse.starterAvatarList) && Intrinsics.LJFF(this.canAutoCreate, profileNaviStarterAvatarListResponse.canAutoCreate);
    }

    public final int hashCode() {
        List<ProfileNaviInitialDataModel> list = this.starterAvatarList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.canAutoCreate;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileNaviStarterAvatarListResponse(starterAvatarList=");
        sbLIZ.append(this.starterAvatarList);
        sbLIZ.append(", canAutoCreate=");
        sbLIZ.append(this.canAutoCreate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProfileNaviStarterAvatarListResponse(List<ProfileNaviInitialDataModel> list, Boolean bool) {
        this.starterAvatarList = list;
        this.canAutoCreate = bool;
    }
}
