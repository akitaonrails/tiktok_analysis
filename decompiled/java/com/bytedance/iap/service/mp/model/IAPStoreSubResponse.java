package com.bytedance.iap.service.mp.model;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class IAPStoreSubResponse {

    @C09CT("data")
    public Data data;

    @C09CT("status_code")
    public Integer statusCode;

    public static final class Data {

        @C09CT("store_sub_purchases")
        public List<IAPStoreSubPurchases> storeSubs = C13BV.INSTANCE;
    }
}
