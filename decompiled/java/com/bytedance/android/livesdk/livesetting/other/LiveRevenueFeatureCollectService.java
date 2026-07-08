package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRevenueFeatureCollectService {
    public static final TypeAdapter ADAPTER;

    @C09CT("business_name")
    public String businessName;

    @C09CT("enable")
    public int enable;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveRevenueFeatureCollectService_OptTypeAdapter();
    }

    public LiveRevenueFeatureCollectService() {
        this("live_revenue_feature_collect", 0);
    }

    public LiveRevenueFeatureCollectService(String str, int i) {
        this.businessName = str;
        this.enable = i;
    }
}
