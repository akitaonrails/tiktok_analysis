package com.ss.android.ugc.tiktok.pns.screen.network;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ScreenTimeData implements Serializable {

    @C09CT("current_top_screen")
    public final String currentTopScreen;

    @C09CT("stm_enabled")
    public final int enabled;

    @C09CT("time_usage")
    public final List<ScreenTimeDailyUsage> timeUsage;

    @C09CT("trigger_scene")
    public final String triggerScene;

    @C09CT("upload_type")
    public final int type;

    @C09CT("upload_timestamp")
    public final long uploadTime;

    public ScreenTimeData() {
        this(0L, new ArrayList(), 0, 0, "", "");
    }

    public ScreenTimeData(long j, List<ScreenTimeDailyUsage> list, int i, int i2, String str, String str2) {
        this.uploadTime = j;
        this.timeUsage = list;
        this.type = i;
        this.enabled = i2;
        this.currentTopScreen = str;
        this.triggerScene = str2;
    }
}
