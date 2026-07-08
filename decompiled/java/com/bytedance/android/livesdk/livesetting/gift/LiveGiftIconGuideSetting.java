package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_new_bubble_guide_config")
public final class LiveGiftIconGuideSetting {
    public static final LiveGiftIconGuideConfig DEFAULT;
    public static final LiveGiftIconGuideSetting INSTANCE = new LiveGiftIconGuideSetting();
    public static final LiveGiftIconGuideConfig config;

    static {
        LiveGiftIconGuideConfig liveGiftIconGuideConfig = new LiveGiftIconGuideConfig(false, 600, 100, false, false);
        DEFAULT = liveGiftIconGuideConfig;
        LiveGiftIconGuideConfig liveGiftIconGuideConfig2 = (LiveGiftIconGuideConfig) SettingsManager.INSTANCE.getValueSafely("live_gift_new_bubble_guide_config", liveGiftIconGuideConfig);
        if (liveGiftIconGuideConfig2 != null) {
            liveGiftIconGuideConfig = liveGiftIconGuideConfig2;
        }
        config = liveGiftIconGuideConfig;
    }

    public final int guideIdKVLimit() {
        return config.guideIdKVLimit;
    }

    public final int guideInfoCacheDuration() {
        return config.guideInfoCacheDuration;
    }

    public final boolean isEnable() {
        return config.isEnable;
    }

    public final boolean isEnableReplaceOldMagic() {
        LiveGiftIconGuideConfig liveGiftIconGuideConfig = config;
        return liveGiftIconGuideConfig.isEnable && liveGiftIconGuideConfig.replaceOldMagicBubbleGuide;
    }

    public final boolean isEnableReplaceOldOotd() {
        LiveGiftIconGuideConfig liveGiftIconGuideConfig = config;
        return liveGiftIconGuideConfig.isEnable && liveGiftIconGuideConfig.replaceOldOotdBubbleGuide;
    }

    public final LiveGiftIconGuideConfig getDEFAULT() {
        return DEFAULT;
    }

    public static final class LiveGiftIconGuideConfig {
        public static final TypeAdapter ADAPTER = new LiveGiftIconGuideSetting_LiveGiftIconGuideConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("guide_id_kv_limit")
        public int guideIdKVLimit;

        @C09CT("guide_info_cache_duration")
        public int guideInfoCacheDuration;

        @C09CT("is_enable")
        public boolean isEnable;

        @C09CT("replace_old_magic_bubble_guide")
        public boolean replaceOldMagicBubbleGuide;

        @C09CT("replace_old_ootd_bubble_guide")
        public boolean replaceOldOotdBubbleGuide;

        public LiveGiftIconGuideConfig() {
            this(false, 600, 100, false, false);
        }

        public LiveGiftIconGuideConfig(boolean z, int i, int i2, boolean z2, boolean z3) {
            this.isEnable = z;
            this.guideInfoCacheDuration = i;
            this.guideIdKVLimit = i2;
            this.replaceOldMagicBubbleGuide = z2;
            this.replaceOldOotdBubbleGuide = z3;
        }
    }
}
