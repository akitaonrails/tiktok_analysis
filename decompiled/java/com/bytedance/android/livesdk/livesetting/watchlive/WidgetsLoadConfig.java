package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetsLoadConfig {
    public static final TypeAdapter ADAPTER = new WidgetsLoadConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("strategies")
    public Map<String, WidgetLoadStrategy> strategies;

    public WidgetsLoadConfig() {
        this(C2097608Jq.LJ(), false);
    }

    public WidgetsLoadConfig(Map<String, WidgetLoadStrategy> map, boolean z) {
        this.strategies = map;
        this.enable = z;
    }
}
