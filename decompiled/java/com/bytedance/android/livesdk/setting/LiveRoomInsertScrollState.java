package com.bytedance.android.livesdk.setting;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_room_insert_scroll_state")
public final class LiveRoomInsertScrollState {
    public static final List<Integer> DEFAULT;
    public static final LiveRoomInsertScrollState INSTANCE = new LiveRoomInsertScrollState();
    public static final List<Integer> config;

    static {
        List<Integer> listLJIIJJI = C1697810uHb.LJIIJJI(0, 2);
        DEFAULT = listLJIIJJI;
        List<Integer> list = (List) SettingsManager.INSTANCE.getValueSafely("live_room_insert_scroll_state", listLJIIJJI);
        if (list != null) {
            listLJIIJJI = list;
        }
        config = listLJIIJJI;
    }

    public final List<Integer> getConfig() {
        return config;
    }
}
