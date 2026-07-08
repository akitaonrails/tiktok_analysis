package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_zoom_layout_array")
public final class LinkMicZoomLayoutIdConfig {
    public static final LinkMicZoomLayoutIdConfig INSTANCE = new LinkMicZoomLayoutIdConfig();
    public static final List<String> DEFAULT = C13BV.INSTANCE;

    public final List<String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        List<String> list2 = (List) settingsManager.getValueSafely("multi_guest_zoom_layout_array", list);
        return list2 != null ? list2 : list;
    }

    public final boolean isZoomLayoutId(String str) {
        return getValue().contains(str);
    }
}
