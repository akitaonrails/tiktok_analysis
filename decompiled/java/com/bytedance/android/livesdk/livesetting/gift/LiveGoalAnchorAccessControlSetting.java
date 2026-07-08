package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_stream_goal_streamer_access_control")
public final class LiveGoalAnchorAccessControlSetting {
    public static final LiveGoalAnchorAccessControlSetting INSTANCE = new LiveGoalAnchorAccessControlSetting();
    public static final ArrayList<String> DEFAULT = new ArrayList<>();

    public final List<String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ArrayList<String> arrayList = DEFAULT;
        List<String> list = (List) settingsManager.getValueSafely("live_stream_goal_streamer_access_control", arrayList);
        return list != null ? list : arrayList;
    }

    public final boolean showPreviewWidget() {
        return getValue().contains("live_goal_indicator_stream_goal");
    }
}
