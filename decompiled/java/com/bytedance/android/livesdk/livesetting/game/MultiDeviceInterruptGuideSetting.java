package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_live_multi_device_interrupt_guide")
public final class MultiDeviceInterruptGuideSetting {
    public static final MultiDeviceInterruptGuideSetting INSTANCE = new MultiDeviceInterruptGuideSetting();
    public static final MultiDeviceInterruptGuideData DEFAULT = new MultiDeviceInterruptGuideData(0, null, null);

    public final MultiDeviceInterruptGuideData getData() {
        MultiDeviceInterruptGuideData multiDeviceInterruptGuideData = (MultiDeviceInterruptGuideData) SettingsManager.INSTANCE.getValueSafely(MultiDeviceInterruptGuideSetting.class);
        return multiDeviceInterruptGuideData == null ? DEFAULT : multiDeviceInterruptGuideData;
    }

    public final boolean isEnable() {
        Integer num = getData().enable;
        return (num == null || num.intValue() == 0) ? false : true;
    }
}
