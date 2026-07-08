package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_fdm_fetch_sub_space_url")
public final class TTLiveSubSpaceLynxUrlSetting {
    public static JSONObject _urlMap;
    public static final TTLiveSubSpaceLynxUrlSetting INSTANCE = new TTLiveSubSpaceLynxUrlSetting();
    public static final String DEFAULT = "";

    private final JSONObject getUrlMap() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = _urlMap;
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        try {
            jSONObject = new JSONObject(SettingsManager.INSTANCE.getStringValue(TTLiveSubSpaceLynxUrlSetting.class));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
        }
        _urlMap = jSONObject;
        return jSONObject;
    }

    public final String getIntroPopup() {
        return getUrlMap().optString("sub_space_guide_post", "");
    }
}
