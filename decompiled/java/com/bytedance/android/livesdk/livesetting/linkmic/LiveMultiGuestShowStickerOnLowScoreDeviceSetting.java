package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_multi_guest_show_sticker_on_low_score_device_android")
public final class LiveMultiGuestShowStickerOnLowScoreDeviceSetting {
    public static final int DEFAULT = 0;
    public static final int V1 = 1;
    public static final int V2 = 2;
    public static final int V3 = 3;
    public static final LiveMultiGuestShowStickerOnLowScoreDeviceSetting INSTANCE = new LiveMultiGuestShowStickerOnLowScoreDeviceSetting();
    public static final C01GW solidifyValue$delegate = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(147));

    private final int getSolidifyValue() {
        return ((Number) solidifyValue$delegate.getValue()).intValue();
    }

    private final int getValue() {
        return LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("live_multi_guest_show_sticker_on_low_score_device_android") ? getSolidifyValue() : SettingsManager.INSTANCE.getIntValue("live_multi_guest_show_sticker_on_low_score_device_android", DEFAULT);
    }

    public final boolean canShowBroadCastStickers() {
        return getValue() % 3 == 0;
    }

    public final boolean canShowMoreIcon() {
        return getValue() % 3 == 0;
    }

    public final boolean canShowStickerEntrance() {
        return getValue() != 1;
    }

    public final boolean needLimitStickerCount() {
        return getValue() != 2;
    }
}
