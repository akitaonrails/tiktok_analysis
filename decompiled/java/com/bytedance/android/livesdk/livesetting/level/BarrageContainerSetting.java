package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("new_barrage_container_switch")
public final class BarrageContainerSetting {
    public static final boolean DEFAULT = false;
    public static final BarrageContainerSetting INSTANCE = new BarrageContainerSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("new_barrage_container_switch", DEFAULT);
    }

    public final boolean enableNewBarrageContainer(int i) {
        if (getValue() && BarrageContainerMsgTypes.INSTANCE.isBarrageContainerMsgType(i)) {
            return true;
        }
        return false;
    }
}
