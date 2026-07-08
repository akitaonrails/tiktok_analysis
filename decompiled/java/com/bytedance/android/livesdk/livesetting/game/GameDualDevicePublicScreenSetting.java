package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_dual_device_public_screen_enable")
public final class GameDualDevicePublicScreenSetting {
    public static final int DEFAULT = 0;
    public static final GameDualDevicePublicScreenSetting INSTANCE = new GameDualDevicePublicScreenSetting();
    public static final int ENABLE = 1;

    public static final String getKey() {
        return "game_dual_device_public_screen_enable";
    }

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_dual_device_public_screen_enable", DEFAULT);
    }

    public final boolean isExperimentGroup() {
        return getValue() == ENABLE;
    }

    public final boolean isExperimentGroup(Map<String, ? extends Object> map) {
        Double d;
        Integer numValueOf;
        if (map == null) {
            return false;
        }
        Object obj = map.get(getKey());
        if (!(obj instanceof Double) || (d = (Double) obj) == null || (numValueOf = Integer.valueOf((int) d.doubleValue())) == null) {
            return false;
        }
        numValueOf.intValue();
        if (numValueOf.intValue() != ENABLE) {
            return false;
        }
        return true;
    }
}
