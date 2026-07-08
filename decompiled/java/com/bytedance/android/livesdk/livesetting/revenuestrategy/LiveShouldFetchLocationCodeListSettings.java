package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_should_fetch_location_code_list")
public final class LiveShouldFetchLocationCodeListSettings {
    public static final LiveShouldFetchLocationCodeListSettings INSTANCE = new LiveShouldFetchLocationCodeListSettings();
    public static final String[] DEFAULT = {"US", "CA"};

    public final boolean enable(String str) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String[] strArr = DEFAULT;
        String[] stringArrayValue = settingsManager.getStringArrayValue("live_should_fetch_location_code_list", strArr);
        if (stringArrayValue != null) {
            strArr = stringArrayValue;
        }
        return C13LQ.LJIILLIIL(str.toUpperCase(Locale.ROOT), strArr);
    }
}
