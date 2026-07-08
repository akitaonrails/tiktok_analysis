package com.bytedance.android.livesdk.config;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveGameFloatMsgPanelConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("show_max_size")
    public int showMaxSize = 100;

    @C09CT("freq_limit_hot_room")
    public int freqLimitHotRoom = 10000;

    @C09CT("freq_limit_unhot_room")
    public int freqLimitUnHotRoom = LivePreCreateNextRoomPlayer.ENABLE;

    @C09CT("duplicated_check_period")
    public long duplicatedCheckPeriod = 10000;

    @C09CT("duplicated_check_count")
    public int duplicatedCheckCount = 3;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveGameFloatMsgPanelConfig_OptTypeAdapter();
    }
}
