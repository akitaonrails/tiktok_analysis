package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_panel_refactor_domain_setting")
public final class GiftPanelDomainRefactorSettings {
    public static final int DEFAULT = 0;
    public static final GiftPanelDomainRefactorSettings INSTANCE = new GiftPanelDomainRefactorSettings();

    public static final boolean isEnabled() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_panel_refactor_domain_setting", DEFAULT) > 0;
    }
}
