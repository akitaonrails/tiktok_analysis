package com.ss.android.ugc.aweme.im.b2c.preview;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public final class B2CCheckItemRsp extends BaseResponse {

    @C09CT("item_status")
    public final boolean itemStatus;

    public B2CCheckItemRsp() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B2CCheckItemRsp) && this.itemStatus == ((B2CCheckItemRsp) obj).itemStatus;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.itemStatus);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("B2CCheckItemRsp(itemStatus=");
        sbLIZ.append(this.itemStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public B2CCheckItemRsp(boolean z) {
        this.itemStatus = z;
    }
}
