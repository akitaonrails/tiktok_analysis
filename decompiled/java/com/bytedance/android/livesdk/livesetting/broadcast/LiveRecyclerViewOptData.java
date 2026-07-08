package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRecyclerViewOptData {
    public static final TypeAdapter ADAPTER = new LiveRecyclerViewOptData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("panel_dy_map")
    public Map<String, Integer> dyMap = new LinkedHashMap();

    @C09CT("enabled")
    public boolean enabled;
}
