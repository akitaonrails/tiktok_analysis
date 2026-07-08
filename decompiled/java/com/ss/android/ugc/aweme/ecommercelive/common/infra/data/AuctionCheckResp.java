package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class AuctionCheckResp {

    @C09CT("agreement")
    public final Map<String, Object> actionAgreement;

    @C09CT("address_payment_schema")
    public final String addressPaymentSchema;

    public AuctionCheckResp() {
        this(null, null);
    }

    public AuctionCheckResp(Map<String, ? extends Object> map, String str) {
        this.actionAgreement = map;
        this.addressPaymentSchema = str;
    }
}
