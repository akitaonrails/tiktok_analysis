package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ShopOrderCreateResponseDataModel implements Serializable {

    @C09CT("tiktok_order_id")
    public final long tiktokOrderId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShopOrderCreateResponseDataModel) && this.tiktokOrderId == ((ShopOrderCreateResponseDataModel) obj).tiktokOrderId;
    }

    public int hashCode() {
        return C786410Ut5.Y2(this.tiktokOrderId);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopOrderCreateResponseDataModel(tiktokOrderId=");
        sbLIZ.append(this.tiktokOrderId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShopOrderCreateResponseDataModel() {
        this(0L);
    }

    public ShopOrderCreateResponseDataModel(long j) {
        this.tiktokOrderId = j;
    }
}
