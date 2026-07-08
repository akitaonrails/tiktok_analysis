package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_sticker_composer_preload_setting")
public final class GiftStickerComposerPreloadSetting {
    public static final ComposerPreloadConfig DEFAULT;
    public static final GiftStickerComposerPreloadSetting INSTANCE = new GiftStickerComposerPreloadSetting();
    public static final ComposerPreloadConfig config;

    static {
        ComposerPreloadConfig composerPreloadConfig = new ComposerPreloadConfig(false, 2);
        DEFAULT = composerPreloadConfig;
        ComposerPreloadConfig composerPreloadConfig2 = (ComposerPreloadConfig) SettingsManager.INSTANCE.getValueSafely("gift_sticker_composer_preload_setting", composerPreloadConfig);
        if (composerPreloadConfig2 != null) {
            composerPreloadConfig = composerPreloadConfig2;
        }
        config = composerPreloadConfig;
    }

    public final int getPreloadCount() {
        return config.preloadCount;
    }

    public final boolean isEnable() {
        return config.isEnable;
    }

    public final ComposerPreloadConfig getDEFAULT() {
        return DEFAULT;
    }

    public static final class ComposerPreloadConfig {
        public static final TypeAdapter ADAPTER = new GiftStickerComposerPreloadSetting_ComposerPreloadConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean isEnable;

        @C09CT("preload_count")
        public int preloadCount;

        public ComposerPreloadConfig() {
            this(false, 2);
        }

        public ComposerPreloadConfig(boolean z, int i) {
            this.isEnable = z;
            this.preloadCount = i;
        }
    }
}
