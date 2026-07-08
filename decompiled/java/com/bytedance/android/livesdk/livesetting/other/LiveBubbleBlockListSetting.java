package com.bytedance.android.livesdk.livesetting.other;

import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_message_platform_bubble_block_list")
public final class LiveBubbleBlockListSetting {
    public static final LiveBubbleBlockListSetting INSTANCE = new LiveBubbleBlockListSetting();
    public static final List<String> DEFAULT = C13BV.INSTANCE;

    public final List<String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        List<String> list2 = (List) settingsManager.getValueSafely("live_message_platform_bubble_block_list", list);
        return list2 != null ? list2 : list;
    }
}
