package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ShopOrderCreateResponseModel extends BaseResponse implements Serializable {

    @C09CT("data")
    public final ShopOrderCreateResponseDataModel data;

    @C09CT("log_id")
    public final String logId;

    public ShopOrderCreateResponseModel() {
        this(null, null);
    }

    public final ShopOrderCreateResponseModel copy(ShopOrderCreateResponseDataModel shopOrderCreateResponseDataModel, String str) {
        return new ShopOrderCreateResponseModel(shopOrderCreateResponseDataModel, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopOrderCreateResponseModel)) {
            return false;
        }
        ShopOrderCreateResponseModel shopOrderCreateResponseModel = (ShopOrderCreateResponseModel) obj;
        return Intrinsics.LJFF(this.data, shopOrderCreateResponseModel.data) && Intrinsics.LJFF(this.logId, shopOrderCreateResponseModel.logId);
    }

    public int hashCode() {
        ShopOrderCreateResponseDataModel shopOrderCreateResponseDataModel = this.data;
        int iHashCode = (shopOrderCreateResponseDataModel == null ? 0 : shopOrderCreateResponseDataModel.hashCode()) * 31;
        String str = this.logId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopOrderCreateResponseModel(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ShopOrderCreateResponseDataModel getData() {
        return this.data;
    }

    public final String getLogId() {
        return this.logId;
    }

    public ShopOrderCreateResponseModel(ShopOrderCreateResponseDataModel shopOrderCreateResponseDataModel, String str) {
        super(null, null);
        this.data = shopOrderCreateResponseDataModel;
        this.logId = str;
    }
}
