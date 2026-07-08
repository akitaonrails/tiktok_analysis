package com.bytedance.android.livesdk.settings;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class PlayerLoggerTaskScheduleConfig {
    public static final TypeAdapter ADAPTER = new PlayerLoggerTaskScheduleConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("disableKeys")
    public List<String> disableKeys;

    @C09CT("schedule_enable")
    public boolean scheduleEnable;

    public PlayerLoggerTaskScheduleConfig() {
        this(false, new ArrayList());
    }

    public PlayerLoggerTaskScheduleConfig(boolean z, List<String> list) {
        this.scheduleEnable = z;
        this.disableKeys = list;
    }
}
