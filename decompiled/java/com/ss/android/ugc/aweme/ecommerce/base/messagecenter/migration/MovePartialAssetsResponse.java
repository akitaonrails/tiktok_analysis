package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.migration;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MovePartialAssetsResponse extends BaseResponse {

    @C09CT("data")
    public final MovePartialAssetsData data;

    public MovePartialAssetsResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MovePartialAssetsResponse) && Intrinsics.LJFF(this.data, ((MovePartialAssetsResponse) obj).data);
    }

    public final int hashCode() {
        MovePartialAssetsData movePartialAssetsData = this.data;
        if (movePartialAssetsData == null) {
            return 0;
        }
        return movePartialAssetsData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MovePartialAssetsResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MovePartialAssetsResponse(MovePartialAssetsData movePartialAssetsData) {
        this.data = movePartialAssetsData;
    }
}
