package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ShopOrderListResponseModel extends BaseResponse implements Serializable {

    @C09CT("data")
    public final ShopOrderListResponseDataModel data;

    @C09CT("log_id")
    public final String logId;

    public ShopOrderListResponseModel() {
        this(null, null);
    }

    public final ShopOrderListResponseModel copy(ShopOrderListResponseDataModel shopOrderListResponseDataModel, String str) {
        return new ShopOrderListResponseModel(shopOrderListResponseDataModel, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopOrderListResponseModel)) {
            return false;
        }
        ShopOrderListResponseModel shopOrderListResponseModel = (ShopOrderListResponseModel) obj;
        return Intrinsics.LJFF(this.data, shopOrderListResponseModel.data) && Intrinsics.LJFF(this.logId, shopOrderListResponseModel.logId);
    }

    public int hashCode() {
        ShopOrderListResponseDataModel shopOrderListResponseDataModel = this.data;
        int iHashCode = (shopOrderListResponseDataModel == null ? 0 : shopOrderListResponseDataModel.hashCode()) * 31;
        String str = this.logId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopOrderListResponseModel(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ShopOrderListResponseDataModel getData() {
        return this.data;
    }

    public final String getLogId() {
        return this.logId;
    }

    public ShopOrderListResponseModel(ShopOrderListResponseDataModel shopOrderListResponseDataModel, String str) {
        super(null, null);
        this.data = shopOrderListResponseDataModel;
        this.logId = str;
    }
}
