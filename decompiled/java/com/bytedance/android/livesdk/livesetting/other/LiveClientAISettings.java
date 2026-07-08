package com.bytedance.android.livesdk.livesetting.other;

import X.C098200Yq;
import X.C189200o6;
import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey("live_client_ai_settings")
public final class LiveClientAISettings {
    public static final LiveClientAISettings INSTANCE = new LiveClientAISettings();
    public static final LivePitayaSettingsParams DEFAULT = new LivePitayaSettingsParams(0, new LivePitayaTaskSettingsParams(500), C2097608Jq.LJ(), new LiveAIServices(new LiveRevenueFeatureCollectService("live_revenue_feature_collect", 0), new GiftGuideOpenPredictService("live_gift_guide_client_collect", 0), new LiveHarConfig(false, false, 60000, 15000), new LiveOhrConfig(false)), 1, 30000, 0, new LivePitayaTaskFrequentControlManager(false, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1023, null));

    private final LivePitayaSettingsParams getSettingsValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePitayaSettingsParams livePitayaSettingsParams = DEFAULT;
        LivePitayaSettingsParams livePitayaSettingsParams2 = (LivePitayaSettingsParams) settingsManager.getValueSafely("live_client_ai_settings", livePitayaSettingsParams);
        return livePitayaSettingsParams2 != null ? livePitayaSettingsParams2 : livePitayaSettingsParams;
    }

    public final JSONObject abParams() {
        Object c098200Yq;
        try {
            c098200Yq = new JSONObject(INSTANCE.getSettingsValue().abParams);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        JSONObject jSONObject = new JSONObject();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = jSONObject;
        }
        return (JSONObject) c098200Yq;
    }

    public final LiveAIServices aiServices() {
        return getSettingsValue().aiServices;
    }

    public final boolean enable() {
        return getSettingsValue().enable > 0;
    }

    public final LivePitayaTaskFrequentControlManager frequentControlSettings() {
        return getSettingsValue().fequentSettings;
    }

    public final LivePitayaTaskSettingsParams getTaskSettings() {
        return getSettingsValue().taskSettingsParams;
    }

    public final boolean initAfterAppStart() {
        return getSettingsValue().initAfterAppStart > 0;
    }

    public final long requestAllPkgsDelay() {
        return getSettingsValue().requestAllPkgsDelay;
    }

    public final boolean requestAllPkgsOnce() {
        return getSettingsValue().requestAllPkgsOnce > 0;
    }

    public final LivePitayaSettingsParams getDEFAULT() {
        return DEFAULT;
    }
}
