package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_anim_params_setting")
public final class LiveGiftAnimParamsSetting {
    public static final LiveGiftAnimParamsSetting INSTANCE = new LiveGiftAnimParamsSetting();
    public static final GiftAnimParams DEFAULT = new GiftAnimParams(0.7f, 100, 1.3f, 10, 1.5f, 1.4f);

    private final GiftAnimParams getSettingParams() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GiftAnimParams giftAnimParams = DEFAULT;
        GiftAnimParams giftAnimParams2 = (GiftAnimParams) settingsManager.getValueSafely("live_gift_anim_params_setting", giftAnimParams);
        return giftAnimParams2 != null ? giftAnimParams2 : giftAnimParams;
    }

    public final float getConsumeD30Scale() {
        return getSettingParams().consumeD30Scale;
    }

    public final float getQueueBigScale() {
        return getSettingParams().queueBigSizeScale;
    }

    public final int getQueueBigSize() {
        return getSettingParams().queueBigSize;
    }

    public final int getQueueSmallSize() {
        return getSettingParams().queueSmallSize;
    }

    public final float getQueueSmallSizeScale() {
        return getSettingParams().queueSmallSizeScale;
    }

    public final float getUaConsumeD14ToAnchorScale() {
        return getSettingParams().uaConsumeD14ToAnchorScale;
    }

    public final GiftAnimParams getDEFAULT() {
        return DEFAULT;
    }
}
