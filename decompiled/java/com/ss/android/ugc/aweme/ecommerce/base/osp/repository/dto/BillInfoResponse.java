package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class BillInfoResponse extends Response<BillInfoData> implements Serializable {
    public static final int $stable = 8;

    public final boolean isShippingValid() {
        return this.code != 23005043;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isValid() {
        T t;
        BillInfoData billInfoData;
        return (!isCodeOK() || (t = this.data) == 0 || ((t instanceof BillInfoData) && (billInfoData = (BillInfoData) t) != null && billInfoData.newShopOrders == null && billInfoData.summary == null && billInfoData.shippingAddress == null)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BillInfoResponse mergeChunk(BillInfoResponse billInfoResponse) {
        BillInfoData billInfoDataLJIILLIIL;
        int i = this.code;
        String str = this.message;
        BillInfoData billInfoData = (BillInfoData) this.data;
        if (billInfoData != null) {
            billInfoDataLJIILLIIL = billInfoData.LJIILLIIL((BillInfoData) billInfoResponse.data);
        } else {
            billInfoDataLJIILLIIL = null;
        }
        return new BillInfoResponse(i, str, billInfoDataLJIILLIIL, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BillInfoResponse merge(BillInfoResponse billInfoResponse, BillInfoRequest billInfoRequest) {
        BillInfoData billInfoDataLJIILL;
        int i = this.code;
        String str = this.message;
        BillInfoData billInfoData = (BillInfoData) this.data;
        if (billInfoData != null) {
            billInfoDataLJIILL = billInfoData.LJIILL((BillInfoData) billInfoResponse.data, billInfoRequest);
        } else {
            billInfoDataLJIILL = null;
        }
        return new BillInfoResponse(i, str, billInfoDataLJIILL, null);
    }

    public BillInfoResponse(int i, String str, BillInfoData billInfoData, Integer num) {
        super(i, str, billInfoData, num, null);
    }
}
