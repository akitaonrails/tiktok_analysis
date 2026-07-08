package com.bytedance.android.livesdk.livesetting.clientai;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_panel_predict_open")
public final class LiveGiftPanelPredictOpenSettings {
    public static final LiveGiftPanelPredictOpenSettings INSTANCE = new LiveGiftPanelPredictOpenSettings();
    public static final LiveGiftPanelPredictOpenParams DEFAULT = new LiveGiftPanelPredictOpenParams(false, 30, "gift_panel_predict_open", 12, -1, false);

    private final LiveGiftPanelPredictOpenParams getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveGiftPanelPredictOpenParams liveGiftPanelPredictOpenParams = DEFAULT;
        LiveGiftPanelPredictOpenParams liveGiftPanelPredictOpenParams2 = (LiveGiftPanelPredictOpenParams) settingsManager.getValueSafely("live_gift_panel_predict_open", liveGiftPanelPredictOpenParams);
        return liveGiftPanelPredictOpenParams2 != null ? liveGiftPanelPredictOpenParams2 : liveGiftPanelPredictOpenParams;
    }

    public final String algoPkgName() {
        return getValue().algoPkgName;
    }

    public final long defaultPredictTimeSec() {
        return getValue().defaultPredictTime;
    }

    public final boolean enable() {
        return getValue().enable;
    }

    public final boolean isTraining() {
        return getValue().isTraining;
    }

    public final int preloadCount() {
        return getValue().preloadCount;
    }

    public final long roomEnterDelayMs() {
        return getValue().roomEnterDelay * 1000;
    }

    public final LiveGiftPanelPredictOpenParams getDEFAULT() {
        return DEFAULT;
    }
}
