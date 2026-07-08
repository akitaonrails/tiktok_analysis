package com.ss.android.ugc.aweme.im.contacts.impl.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class UserProfileResponse extends BaseResponse {

    @C09CT("self_biz_info")
    public final IMSelfBizInfoResponse selfBizInfo;

    @C09CT("users")
    public final List<IMUserProfileInfo> users;

    public UserProfileResponse() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileResponse)) {
            return false;
        }
        UserProfileResponse userProfileResponse = (UserProfileResponse) obj;
        return Intrinsics.LJFF(this.users, userProfileResponse.users) && Intrinsics.LJFF(this.selfBizInfo, userProfileResponse.selfBizInfo);
    }

    public final int hashCode() {
        List<IMUserProfileInfo> list = this.users;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        IMSelfBizInfoResponse iMSelfBizInfoResponse = this.selfBizInfo;
        return iHashCode + (iMSelfBizInfoResponse != null ? iMSelfBizInfoResponse.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserProfileResponse(users=");
        sbLIZ.append(this.users);
        sbLIZ.append(", selfBizInfo=");
        sbLIZ.append(this.selfBizInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UserProfileResponse(List<IMUserProfileInfo> list, IMSelfBizInfoResponse iMSelfBizInfoResponse) {
        this.users = list;
        this.selfBizInfo = iMSelfBizInfoResponse;
    }
}
