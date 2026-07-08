package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePitayaSettingsParams {
    public static final TypeAdapter ADAPTER = new LivePitayaSettingsParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("ab_params")
    public Map<String, ? extends Object> abParams;

    @C09CT("live_ai_services")
    public LiveAIServices aiServices;

    @C09CT("enable")
    public int enable;

    @C09CT("frequent_settings")
    public LivePitayaTaskFrequentControlManager fequentSettings;

    @C09CT("init_after_app_start")
    public int initAfterAppStart;

    @C09CT("request_all_pkgs_delay")
    public long requestAllPkgsDelay;

    @C09CT("request_all_pkgs_once")
    public int requestAllPkgsOnce;

    @C09CT("task_settings")
    public LivePitayaTaskSettingsParams taskSettingsParams;

    public LivePitayaSettingsParams() {
        this(0, new LivePitayaTaskSettingsParams(500L), C2097608Jq.LJ(), new LiveAIServices(new LiveRevenueFeatureCollectService("live_revenue_feature_collect", 0), new GiftGuideOpenPredictService("live_gift_guide_client_collect", 0), new LiveHarConfig(false, false, 60000L, 15000L), new LiveOhrConfig(false)), 1, 30000L, 0, new LivePitayaTaskFrequentControlManager(false, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1023, null));
    }

    public LivePitayaSettingsParams(int i, LivePitayaTaskSettingsParams livePitayaTaskSettingsParams, Map<String, ? extends Object> map, LiveAIServices liveAIServices, int i2, long j, int i3, LivePitayaTaskFrequentControlManager livePitayaTaskFrequentControlManager) {
        this.enable = i;
        this.taskSettingsParams = livePitayaTaskSettingsParams;
        this.abParams = map;
        this.aiServices = liveAIServices;
        this.requestAllPkgsOnce = i2;
        this.requestAllPkgsDelay = j;
        this.initAfterAppStart = i3;
        this.fequentSettings = livePitayaTaskFrequentControlManager;
    }
}
