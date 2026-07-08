package com.bytedance.android.livesdk.livesetting.gift;

import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fest25_gift_skin_change_config")
public final class LiveFest25GiftSkinChangeConfig {
    public static final LiveFest25GiftSkinChangeConfig INSTANCE = new LiveFest25GiftSkinChangeConfig();
    public static final SkinGiftBubbleConfig DEFAULT = new SkinGiftBubbleConfig(false, C13BV.INSTANCE);

    public final SkinGiftBubbleConfig getBubbleConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SkinGiftBubbleConfig skinGiftBubbleConfig = DEFAULT;
        SkinGiftBubbleConfig skinGiftBubbleConfig2 = (SkinGiftBubbleConfig) settingsManager.getValueSafely("live_fest25_gift_skin_change_config", skinGiftBubbleConfig);
        return skinGiftBubbleConfig2 != null ? skinGiftBubbleConfig2 : skinGiftBubbleConfig;
    }

    public final SkinGiftBubbleConfig getDEFAULT() {
        return DEFAULT;
    }

    public final Pair<Boolean, SkinGiftConfig> getSkinChangeGiftConfig(long j) {
        List<SkinGiftConfig> list = getBubbleConfig().gifts;
        if (list != null) {
            for (SkinGiftConfig skinGiftConfig : list) {
                if (skinGiftConfig != null && skinGiftConfig.giftID == j) {
                    return new Pair<>(Boolean.TRUE, skinGiftConfig);
                }
            }
        }
        return new Pair<>(Boolean.FALSE, null);
    }
}
