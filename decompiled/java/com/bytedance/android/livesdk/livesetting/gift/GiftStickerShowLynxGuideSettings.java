package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_sticker_show_lynx_guide_setting")
public final class GiftStickerShowLynxGuideSettings {
    public static final StickerGiftShowLynxGuideParams DEFAULT;
    public static final GiftStickerShowLynxGuideSettings INSTANCE = new GiftStickerShowLynxGuideSettings();
    public static final StickerGiftShowLynxGuideParams settingParams;

    public static final class StickerGiftShowLynxGuideParams {
        public static final TypeAdapter ADAPTER = new GiftStickerShowLynxGuideSettings_StickerGiftShowLynxGuideParams_OptTypeAdapter(NormalGson.singleton());

        @C09CT("first_frame_timeout")
        public long firstFrameTimeOut;

        @C09CT("ignore_frequency_control")
        public boolean ignoreFrequencyControl;

        @C09CT("max_show_count")
        public int maxShowCount;

        @C09CT("show_interval_in_minute")
        public int showIntervalInMinute;

        public StickerGiftShowLynxGuideParams() {
            this(3000L, false, 3, 5);
        }

        public StickerGiftShowLynxGuideParams(long j, boolean z, int i, int i2) {
            this.firstFrameTimeOut = j;
            this.ignoreFrequencyControl = z;
            this.maxShowCount = i;
            this.showIntervalInMinute = i2;
        }
    }

    static {
        StickerGiftShowLynxGuideParams stickerGiftShowLynxGuideParams = new StickerGiftShowLynxGuideParams(3000L, false, 3, 5);
        DEFAULT = stickerGiftShowLynxGuideParams;
        StickerGiftShowLynxGuideParams stickerGiftShowLynxGuideParams2 = (StickerGiftShowLynxGuideParams) SettingsManager.INSTANCE.getValueSafely("gift_sticker_show_lynx_guide_setting", stickerGiftShowLynxGuideParams);
        if (stickerGiftShowLynxGuideParams2 != null) {
            stickerGiftShowLynxGuideParams = stickerGiftShowLynxGuideParams2;
        }
        settingParams = stickerGiftShowLynxGuideParams;
    }

    public final long getFirstFrameTimeOut() {
        return settingParams.firstFrameTimeOut;
    }

    public final int getMaxShowCount() {
        return settingParams.maxShowCount;
    }

    public final int getShowIntervalInMinute() {
        return settingParams.showIntervalInMinute;
    }

    public final boolean ignoreFrequencyControl() {
        return settingParams.ignoreFrequencyControl;
    }

    public final StickerGiftShowLynxGuideParams getDEFAULT() {
        return DEFAULT;
    }
}
