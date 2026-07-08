package com.bytedance.android.livesdk.livesetting.wallet;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("iap_redirect_url_config")
public final class LiveIAPRedirectionUrlSetting {
    public static final LiveIAPRedirectionUrlSetting INSTANCE = new LiveIAPRedirectionUrlSetting();
    public static final Map<String, Map<String, String>> DEFAULT = C2097608Jq.LJ();

    public final Map<String, Map<String, String>> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely("iap_redirect_url_config", DEFAULT);
    }

    public final Map<String, Map<String, String>> getDEFAULT() {
        return DEFAULT;
    }
}
