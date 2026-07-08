package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetLoadStrategy {
    public static final TypeAdapter ADAPTER = new WidgetLoadStrategy_OptTypeAdapter(NormalGson.singleton());

    @C09CT("interval_between_priorities")
    public Map<String, Long> intervalBetweenPriorities;

    @C09CT("load_core_directly")
    public boolean loadCoreDirectly;

    @C09CT("load_until_pre_done")
    public Map<String, String> loadUntilPreDone;

    @C09CT("widgetsInfo")
    public Map<String, ? extends List<WidgetInfo>> widgetsInfo;

    public WidgetLoadStrategy() {
        this(C2097608Jq.LJ(), false, C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    public WidgetLoadStrategy(Map<String, ? extends List<WidgetInfo>> map, boolean z, Map<String, Long> map2, Map<String, String> map3) {
        this.widgetsInfo = map;
        this.loadCoreDirectly = z;
        this.intervalBetweenPriorities = map2;
        this.loadUntilPreDone = map3;
    }
}
