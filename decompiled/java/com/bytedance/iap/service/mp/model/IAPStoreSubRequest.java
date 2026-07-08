package com.bytedance.iap.service.mp.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class IAPStoreSubRequest {

    @C09CT("channel")
    public String channel;

    @C09CT("channel_purchase_ids")
    public List<String> existingSubs;

    public IAPStoreSubRequest(String str, List<String> list) {
        this.channel = str;
        this.existingSubs = list;
    }
}
