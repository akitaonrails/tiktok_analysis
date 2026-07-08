package com.ss.android.ugc.ur.alias;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AliasListResponse extends BaseResponse {

    @C09CT("user_alias_list")
    public final List<UserAlias> userAlias;

    public AliasListResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AliasListResponse) && Intrinsics.LJFF(this.userAlias, ((AliasListResponse) obj).userAlias);
    }

    public final int hashCode() {
        List<UserAlias> list = this.userAlias;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AliasListResponse(userAlias=");
        sbLIZ.append(this.userAlias);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AliasListResponse(List<UserAlias> list) {
        this.userAlias = list;
    }
}
