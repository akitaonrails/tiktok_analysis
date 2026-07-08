package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class Config {
    public static final TypeAdapter ADAPTER = new Config_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("feature_ids")
    public Map<String, Integer> featureIds;

    public Config() {
        this(false, new LinkedHashMap());
    }

    public Config(boolean z, Map<String, Integer> map) {
        this.enable = z;
        this.featureIds = map;
    }
}
