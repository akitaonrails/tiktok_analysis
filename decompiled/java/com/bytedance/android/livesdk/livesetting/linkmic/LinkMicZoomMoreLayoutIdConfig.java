package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C13LP;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_zoom_both_layout_array")
public final class LinkMicZoomMoreLayoutIdConfig {
    public static final LinkMicZoomMoreLayoutIdConfig INSTANCE = new LinkMicZoomMoreLayoutIdConfig();
    public static final List<String> DEFAULT = C1697810uHb.LJIIJJI("9011", "9012");

    public final List<String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        List<String> list2 = (List) settingsManager.getValueSafely("multi_guest_zoom_both_layout_array", list);
        return list2 != null ? list2 : list;
    }

    public final boolean isDoubleZoomLayoutId(String str) {
        return C13LP.LJJJJ(str, getValue());
    }
}
