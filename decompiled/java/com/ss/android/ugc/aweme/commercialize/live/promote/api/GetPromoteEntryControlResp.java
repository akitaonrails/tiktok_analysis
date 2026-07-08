package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetPromoteEntryControlResp extends BaseResponse {

    @C09CT("showType")
    public final Integer entryShowType;

    public GetPromoteEntryControlResp() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPromoteEntryControlResp) && Intrinsics.LJFF(this.entryShowType, ((GetPromoteEntryControlResp) obj).entryShowType);
    }

    public final int hashCode() {
        Integer num = this.entryShowType;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetPromoteEntryControlResp(entryShowType=");
        sbLIZ.append(this.entryShowType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetPromoteEntryControlResp(Integer num) {
        this.entryShowType = num;
    }
}
