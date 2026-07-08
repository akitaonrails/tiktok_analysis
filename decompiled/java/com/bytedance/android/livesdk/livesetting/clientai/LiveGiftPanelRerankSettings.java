package com.bytedance.android.livesdk.livesetting.clientai;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftRealTimeApiSettings;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_panel_rerank")
public final class LiveGiftPanelRerankSettings {
    public static final LiveGiftPanelRerankSettings INSTANCE = new LiveGiftPanelRerankSettings();
    public static final LiveGiftPanelRerankParams DEFAULT = new LiveGiftPanelRerankParams(0, 300, "");

    private final LiveGiftPanelRerankParams getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveGiftPanelRerankParams liveGiftPanelRerankParams = DEFAULT;
        LiveGiftPanelRerankParams liveGiftPanelRerankParams2 = (LiveGiftPanelRerankParams) settingsManager.getValueSafely("live_gift_panel_rerank", liveGiftPanelRerankParams);
        return liveGiftPanelRerankParams2 != null ? liveGiftPanelRerankParams2 : liveGiftPanelRerankParams;
    }

    public final String algoPkgName() {
        return getValue().algoPkgName;
    }

    public final long defaultTimer() {
        return getValue().defaultTimer;
    }

    public final boolean enable() {
        return getValue().enable > 0 && !LiveGiftRealTimeApiSettings.INSTANCE.enableRealTimeApiRequest();
    }

    public final LiveGiftPanelRerankParams getDEFAULT() {
        return DEFAULT;
    }
}
