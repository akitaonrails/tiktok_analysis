package com.ss.android.ugc.aweme.im.lightinteract.impl.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BirthdayMultiCheckResponse extends BaseResponse {

    @C09CT("user_has_birthday_infos")
    public final List<UserHasBirthdayInfo> userHasBirthdayInfo;

    public BirthdayMultiCheckResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BirthdayMultiCheckResponse) && Intrinsics.LJFF(this.userHasBirthdayInfo, ((BirthdayMultiCheckResponse) obj).userHasBirthdayInfo);
    }

    public final int hashCode() {
        List<UserHasBirthdayInfo> list = this.userHasBirthdayInfo;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BirthdayMultiCheckResponse(userHasBirthdayInfo=");
        sbLIZ.append(this.userHasBirthdayInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BirthdayMultiCheckResponse(List<UserHasBirthdayInfo> list) {
        this.userHasBirthdayInfo = list;
    }
}
