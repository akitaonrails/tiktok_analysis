package com.bytedance.android.livesdk.livesetting.subscription;

import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscription_anchor_videos_url")
public final class SubOnlyVideoLynxUrlSetting {
    public static final String DEFAULT = "";
    public static final SubOnlyVideoLynxUrlSetting INSTANCE;
    public static final String subOnlyVideosFAQ;

    static {
        SubOnlyVideoLynxUrlSetting subOnlyVideoLynxUrlSetting = new SubOnlyVideoLynxUrlSetting();
        INSTANCE = subOnlyVideoLynxUrlSetting;
        subOnlyVideosFAQ = subOnlyVideoLynxUrlSetting.getValue().optString("subonly_videos_faq", "");
    }

    public final JSONObject getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        return TextUtils.isEmpty(settingsManager.getStringValue("live_subscription_anchor_videos_url", str)) ? new JSONObject() : new JSONObject(settingsManager.getStringValue("live_subscription_anchor_videos_url", str));
    }

    public final String getSubOnlyVideosFAQ() {
        return subOnlyVideosFAQ;
    }
}
