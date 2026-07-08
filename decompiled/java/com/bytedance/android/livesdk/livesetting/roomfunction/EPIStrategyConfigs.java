package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_epi_strategy_configs")
public final class EPIStrategyConfigs {
    public static final EPIStrategyConfigs INSTANCE = new EPIStrategyConfigs();
    public static final List<String> DEFAULT = C1697810uHb.LJIIJJI("public_screen_line_margin", "remove_fold_message_with_new_comment_2", "toolbar_tips_decision", "toolbar_tips_guide", "fold_release_config_decision", "live_revenue_client_guide_trigger_strategy_screen", "live_revenue_client_guide_trigger_strategy_room_info", "live_revenue_client_guide_trigger_strategy_bubble", "live_revenue_client_guide_trigger_strategy_capsule");

    private final List<String> getOptionList() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        List<String> list2 = (List) settingsManager.getValueSafely("live_epi_strategy_configs", list);
        return (list2 == null || list2.size() <= 1) ? list : list2;
    }

    public final boolean isEPI(String str) {
        return getOptionList().contains(str);
    }
}
