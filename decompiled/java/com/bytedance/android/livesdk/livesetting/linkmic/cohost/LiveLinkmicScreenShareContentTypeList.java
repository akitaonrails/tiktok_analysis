package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_linkmic_screen_share_content_type_list")
public final class LiveLinkmicScreenShareContentTypeList {
    public static final LiveLinkmicScreenShareContentTypeList INSTANCE = new LiveLinkmicScreenShareContentTypeList();
    public static final List<Integer> DEFAULT = C1697810uHb.LJIIJJI(2, 3);

    public final List<Integer> get() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<Integer> list = DEFAULT;
        List<Integer> list2 = (List) settingsManager.getValueSafely("live_linkmic_screen_share_content_type_list", list);
        return list2 != null ? list2 : list;
    }
}
