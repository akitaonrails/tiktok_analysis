package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C13LP;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_filter_last_layout_id_map_update_by_layout_id_config")
public final class LinkMicFilterLastLayoutIdMapUpdateByLayoutIdConfig {
    public static final LinkMicFilterLastLayoutIdMapUpdateByLayoutIdConfig INSTANCE = new LinkMicFilterLastLayoutIdMapUpdateByLayoutIdConfig();
    public static final List<String> DEFAULT = Collections.singletonList("1019");

    public final List<String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        List<String> list2 = (List) settingsManager.getValueSafely("multi_guest_filter_last_layout_id_map_update_by_layout_id_config", list);
        return list2 != null ? list2 : list;
    }

    public final boolean isInFilter(String str) {
        return C13LP.LJJJJ(str, getValue());
    }
}
