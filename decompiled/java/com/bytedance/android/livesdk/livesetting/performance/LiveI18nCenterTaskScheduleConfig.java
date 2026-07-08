package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveI18nCenterTaskScheduleConfig {
    public static final TypeAdapter ADAPTER = new LiveI18nCenterTaskScheduleConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("isEnable")
    public boolean isEnable;

    @C09CT("schedule_sources")
    public List<Integer> scheduleSources = C1697810uHb.LJIILJJIL(0);
}
