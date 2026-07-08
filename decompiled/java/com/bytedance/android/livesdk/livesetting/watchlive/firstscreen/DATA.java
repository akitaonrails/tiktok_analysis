package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class DATA {
    public static final TypeAdapter ADAPTER = new DATA_OptTypeAdapter(NormalGson.singleton());

    @C09CT("default_delay_time")
    public int defaultDelayTime;

    @C09CT("delay_list")
    public List<DeviceScoreLimit> delayList;

    @C09CT("enable")
    public boolean enable;

    public DATA() {
        this(false, new ArrayList(), 200);
    }

    public DATA(boolean z, List<DeviceScoreLimit> list, int i) {
        this.enable = z;
        this.delayList = list;
        this.defaultDelayTime = i;
    }
}
