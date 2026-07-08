package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_center_entrance_xml_opt")
public final class LiveCenterEntranceXmlOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveCenterEntranceXmlOptSetting INSTANCE = new LiveCenterEntranceXmlOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_center_entrance_xml_opt", DEFAULT) == 1;
    }
}
