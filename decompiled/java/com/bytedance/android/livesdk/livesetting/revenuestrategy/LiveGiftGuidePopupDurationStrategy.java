package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_guide_duration_ai_strategy")
public final class LiveGiftGuidePopupDurationStrategy {
    public static final LiveGiftGuidePopupDurationStrategy INSTANCE = new LiveGiftGuidePopupDurationStrategy();
    public static final Config DEFAULT = new Config(false, "live_gift_guide_optimize_strategy", 1, LSPassThroughRecordSizeConfig.DEFAULT, 10, C1697810uHb.LJIIJJI("gift_guide_ug_task_show_popup", "gift_guide_heartme_task_show_popup", "gift_guide_ug_task_gift_popup"));

    private final Config getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_gift_guide_duration_ai_strategy", config);
        return config2 != null ? config2 : config;
    }

    public final String algoPackageName() {
        return getConfig().packageName;
    }

    public final List<String> blockList() {
        return getConfig().blockList;
    }

    public final int defaultDuration() {
        return getConfig().defaultDuration;
    }

    public final boolean enable() {
        return getConfig().enable;
    }

    public final int executeMode() {
        return getConfig().executeMode;
    }

    public final int timeoutThreshold() {
        return getConfig().timeoutThreshold;
    }
}
