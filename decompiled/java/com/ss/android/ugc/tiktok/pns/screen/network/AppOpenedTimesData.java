package com.ss.android.ugc.tiktok.pns.screen.network;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AppOpenedTimesData implements Serializable {

    @C09CT("app_open_times")
    public final List<AppOpenTimes> appOpenedTimes;

    @C09CT("current_top_screen")
    public final String currentTopScreen;

    @C09CT("trigger_scene")
    public final String triggerScene;

    @C09CT("upload_type")
    public final int type;

    @C09CT("upload_timestamp")
    public final long uploadTime;

    public AppOpenedTimesData() {
        this(0L, new ArrayList(), 0, "", "");
    }

    public AppOpenedTimesData(long j, List<AppOpenTimes> list, int i, String str, String str2) {
        this.uploadTime = j;
        this.appOpenedTimes = list;
        this.type = i;
        this.currentTopScreen = str;
        this.triggerScene = str2;
    }
}
