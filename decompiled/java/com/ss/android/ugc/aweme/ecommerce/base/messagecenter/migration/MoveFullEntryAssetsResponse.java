package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.migration;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MoveFullEntryAssetsData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MoveFullEntryAssetsResponse extends BaseResponse {

    @C09CT("data")
    public final MoveFullEntryAssetsData data;

    public MoveFullEntryAssetsResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoveFullEntryAssetsResponse) && Intrinsics.LJFF(this.data, ((MoveFullEntryAssetsResponse) obj).data);
    }

    public final int hashCode() {
        MoveFullEntryAssetsData moveFullEntryAssetsData = this.data;
        if (moveFullEntryAssetsData == null) {
            return 0;
        }
        return moveFullEntryAssetsData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MoveFullEntryAssetsResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MoveFullEntryAssetsResponse(MoveFullEntryAssetsData moveFullEntryAssetsData) {
        this.data = moveFullEntryAssetsData;
    }
}
