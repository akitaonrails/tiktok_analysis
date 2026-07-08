package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftGuideOpenPredictService {
    public static final TypeAdapter ADAPTER;

    @C09CT("business_name")
    public String businessName;

    @C09CT("enable")
    public int enable;

    static {
        NormalGson.singleton();
        ADAPTER = new GiftGuideOpenPredictService_OptTypeAdapter();
    }

    public GiftGuideOpenPredictService() {
        this("live_gift_guide_client_collect", 0);
    }

    public GiftGuideOpenPredictService(String str, int i) {
        this.businessName = str;
        this.enable = i;
    }
}
