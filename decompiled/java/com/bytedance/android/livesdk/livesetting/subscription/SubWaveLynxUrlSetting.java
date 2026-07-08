package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscription_wave_url")
public final class SubWaveLynxUrlSetting {
    public static final String DEFAULT = "";
    public static final SubWaveLynxUrlSetting INSTANCE = new SubWaveLynxUrlSetting();
    public static JSONObject _urlMap;

    private final JSONObject getUrlMapV2() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = _urlMap;
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        try {
            jSONObject = new JSONObject(SettingsManager.INSTANCE.getStringValue("live_subscription_wave_url", DEFAULT));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
        }
        _urlMap = jSONObject;
        return jSONObject;
    }

    public final String getAnchorWavePopup() {
        return getUrlMapV2().optString("anchor_wave_popup", "");
    }

    public final String getUserWavePopup() {
        return getUrlMapV2().optString("user_wave_popup", "");
    }

    public final String getWaveIntroPopup() {
        return getUrlMapV2().optString("wave_intro_popup", "");
    }

    public final String getWaveSettingPage() {
        return getUrlMapV2().optString("wave_setting_page", "");
    }

    public final String getWaveSettingPopup() {
        return getUrlMapV2().optString("wave_setting_popup", "");
    }
}
