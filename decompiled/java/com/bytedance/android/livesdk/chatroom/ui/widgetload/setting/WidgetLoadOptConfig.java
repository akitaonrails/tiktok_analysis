package com.bytedance.android.livesdk.chatroom.ui.widgetload.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetLoadOptConfig {
    public static final TypeAdapter ADAPTER = new WidgetLoadOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("config")
    public Map<String, WidgetPhaseInfo> phaseConfig = new LinkedHashMap();
}
