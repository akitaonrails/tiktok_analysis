package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C19748512Ol;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.internal.s;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("mix_stream_layout_param")
public final class LinkMicMixStreamLayoutParamSetting {
    public static final LinkMicMixStreamLayoutParamSetting INSTANCE = new LinkMicMixStreamLayoutParamSetting();
    public static final HashMap<String, s<String, Object>> DEFAULT = new HashMap<>();

    public final HashMap<String, s<String, Object>> getValue() {
        return (HashMap) SettingsManager.INSTANCE.getValueSafely("mix_stream_layout_param", DEFAULT);
    }

    public final LinkMicMixStreamLayoutParam getLinkMicMixStreamLayoutParam(String str) {
        s<String, Object> sVar;
        Gson gson = C19748512Ol.LIZIZ;
        HashMap<String, s<String, Object>> value = getValue();
        if (value != null) {
            sVar = value.get(str);
        } else {
            sVar = null;
        }
        return (LinkMicMixStreamLayoutParam) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJsonTree(gson, sVar), LinkMicMixStreamLayoutParam.class);
    }
}
