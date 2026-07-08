package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class CheckUserNameResponse extends BaseResponse {

    @C09CT("is_valid")
    public final Boolean is_valid;

    @C09CT("recommended_unique_ids")
    public final List<String> recommended_unique_ids;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckUserNameResponse)) {
            return false;
        }
        CheckUserNameResponse checkUserNameResponse = (CheckUserNameResponse) obj;
        return Intrinsics.LJFF(this.is_valid, checkUserNameResponse.is_valid) && Intrinsics.LJFF(this.recommended_unique_ids, checkUserNameResponse.recommended_unique_ids);
    }

    public final int hashCode() {
        Boolean bool = this.is_valid;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<String> list = this.recommended_unique_ids;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckUserNameResponse(is_valid=");
        sbLIZ.append(this.is_valid);
        sbLIZ.append(", recommended_unique_ids=");
        sbLIZ.append(this.recommended_unique_ids);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckUserNameResponse(Boolean bool, List<String> list) {
        this.is_valid = bool;
        this.recommended_unique_ids = list;
    }
}
