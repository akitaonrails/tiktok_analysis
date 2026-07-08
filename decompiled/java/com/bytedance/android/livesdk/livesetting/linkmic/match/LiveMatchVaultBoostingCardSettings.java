package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_match_item_vault_boosting_gloves_setting")
public final class LiveMatchVaultBoostingCardSettings {
    public static final boolean DEFAULT = true;
    public static final LiveMatchVaultBoostingCardSettings INSTANCE = new LiveMatchVaultBoostingCardSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_item_vault_boosting_gloves_setting", DEFAULT);
    }
}
