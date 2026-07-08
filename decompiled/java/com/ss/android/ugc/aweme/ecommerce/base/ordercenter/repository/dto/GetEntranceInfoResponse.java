package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class GetEntranceInfoResponse extends Response<TradeEntranceInfo> implements Serializable {
    public static final int $stable = 8;

    public GetEntranceInfoResponse(int i, String str, TradeEntranceInfo tradeEntranceInfo) {
        super(i, str, tradeEntranceInfo, null, null);
    }
}
