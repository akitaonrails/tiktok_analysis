package com.bytedance.android.livesdk.livesetting.gift;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.android.gms.common.ConnectionResult;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_guide_client_ai_settings")
public final class LiveGiftGuideClientAISettings {
    public static final GiftGuideClientAI DEFAULT;
    public static final LiveGiftGuideClientAISettings INSTANCE;
    public static final Map<String, AutoTriggerConfig> autoTriggerConfig;

    static {
        LiveGiftGuideClientAISettings liveGiftGuideClientAISettings = new LiveGiftGuideClientAISettings();
        INSTANCE = liveGiftGuideClientAISettings;
        DEFAULT = new GiftGuideClientAI("", "", 10000L, 30L, false, 30L, 10, 5, 5, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, null, new NativeTriggerConfig(null, null, 3, null));
        Map<String, AutoTriggerConfig> mapLJ = liveGiftGuideClientAISettings.getValue().autoTriggerConfigMap;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        autoTriggerConfig = mapLJ;
    }

    public final GiftGuideClientAI getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GiftGuideClientAI giftGuideClientAI = DEFAULT;
        GiftGuideClientAI giftGuideClientAI2 = (GiftGuideClientAI) settingsManager.getValueSafely("gift_guide_client_ai_settings", giftGuideClientAI);
        return giftGuideClientAI2 != null ? giftGuideClientAI2 : giftGuideClientAI;
    }

    public final Map<String, AutoTriggerConfig> getAutoTriggerConfig() {
        return autoTriggerConfig;
    }

    public final GiftGuideClientAI getDEFAULT() {
        return DEFAULT;
    }
}
