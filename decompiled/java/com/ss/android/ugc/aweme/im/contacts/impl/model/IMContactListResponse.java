package com.ss.android.ugc.aweme.im.contacts.impl.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class IMContactListResponse extends BaseResponse {

    @C09CT("muf_count")
    public final Integer mufCount;

    @C09CT("next_index")
    public final Integer nextIndex;

    @C09CT("next_user_type")
    public final Integer nextUserType;

    @C09CT("users")
    public final List<IMUserProfileInfo> users;

    public IMContactListResponse() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMContactListResponse)) {
            return false;
        }
        IMContactListResponse iMContactListResponse = (IMContactListResponse) obj;
        return Intrinsics.LJFF(this.users, iMContactListResponse.users) && Intrinsics.LJFF(this.nextIndex, iMContactListResponse.nextIndex) && Intrinsics.LJFF(this.nextUserType, iMContactListResponse.nextUserType) && Intrinsics.LJFF(this.mufCount, iMContactListResponse.mufCount);
    }

    public final int hashCode() {
        List<IMUserProfileInfo> list = this.users;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.nextIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.nextUserType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.mufCount;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMContactListResponse(users=");
        sbLIZ.append(this.users);
        sbLIZ.append(", nextIndex=");
        sbLIZ.append(this.nextIndex);
        sbLIZ.append(", nextUserType=");
        sbLIZ.append(this.nextUserType);
        sbLIZ.append(", mufCount=");
        sbLIZ.append(this.mufCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMContactListResponse(List<IMUserProfileInfo> list, Integer num, Integer num2, Integer num3) {
        this.users = list;
        this.nextIndex = num;
        this.nextUserType = num2;
        this.mufCount = num3;
    }
}
