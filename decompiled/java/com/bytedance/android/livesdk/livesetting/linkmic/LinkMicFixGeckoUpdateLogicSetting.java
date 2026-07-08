package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_fix_gecko_update_logic_setting")
public final class LinkMicFixGeckoUpdateLogicSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixGeckoUpdateLogicSetting INSTANCE = new LinkMicFixGeckoUpdateLogicSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_gecko_update_logic_setting", DEFAULT);
    }
}
