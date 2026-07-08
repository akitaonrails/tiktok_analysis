package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveAIServices {
    public static final TypeAdapter ADAPTER = new LiveAIServices_OptTypeAdapter(NormalGson.singleton());

    @C09CT("gift_guide_client_collect")
    public GiftGuideOpenPredictService giftGuideOpenPredictService;

    @C09CT("live_har_config")
    public LiveHarConfig liveHarConfig;

    @C09CT("live_ohr_config")
    public LiveOhrConfig liveOhrConfig;

    @C09CT("live_revenue_feature_collect")
    public LiveRevenueFeatureCollectService liveRevenueFeatureCollectService;

    public LiveAIServices() {
        this(new LiveRevenueFeatureCollectService("live_revenue_feature_collect", 0), new GiftGuideOpenPredictService("live_gift_guide_client_collect", 0), new LiveHarConfig(false, false, 60000L, 15000L), new LiveOhrConfig(false));
    }

    public LiveAIServices(LiveRevenueFeatureCollectService liveRevenueFeatureCollectService, GiftGuideOpenPredictService giftGuideOpenPredictService, LiveHarConfig liveHarConfig, LiveOhrConfig liveOhrConfig) {
        this.liveRevenueFeatureCollectService = liveRevenueFeatureCollectService;
        this.giftGuideOpenPredictService = giftGuideOpenPredictService;
        this.liveHarConfig = liveHarConfig;
        this.liveOhrConfig = liveOhrConfig;
    }
}
