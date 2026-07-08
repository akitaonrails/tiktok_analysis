package com.bytedance.android.livesdk.livesetting.level;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_dynamic_guidance_business_strategy")
public final class FansClubDynamicGuidanceBusinessStrategySetting {
    public static final FansClubDynamicGuidanceBusinessStrategySetting INSTANCE = new FansClubDynamicGuidanceBusinessStrategySetting();
    public static final List<String> DEFAULT = C1697810uHb.LJIIJJI("live_revenue_client_guide_trigger_strategy_screen", "live_revenue_client_guide_trigger_strategy_room_info", "live_revenue_client_guide_trigger_strategy_bubble", "live_revenue_client_guide_trigger_strategy_capsule");

    public final List<String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        List<String> list2 = (List) settingsManager.getValueSafely("live_fans_club_dynamic_guidance_business_strategy", list);
        return (list2 == null || !(list2.isEmpty() ^ true)) ? list : list2;
    }
}
