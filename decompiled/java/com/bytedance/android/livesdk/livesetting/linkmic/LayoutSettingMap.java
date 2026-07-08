package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class LayoutSettingMap {
    public static final TypeAdapter ADAPTER = new LayoutSettingMap_OptTypeAdapter(NormalGson.singleton());

    @C09CT("setting_map")
    public Map<String, VoiceLayoutParam> map;

    public LayoutSettingMap() {
        this(C2097608Jq.LJ());
    }

    public LayoutSettingMap(Map<String, VoiceLayoutParam> map) {
        this.map = map;
    }
}
