package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class ConfigData {
    public static final TypeAdapter ADAPTER = new ConfigData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_entrance_guidance")
    public List<GuidanceConfig> configs;

    @C09CT("live_fans_entrance_refactor")
    public int entranceRefactor;

    public ConfigData() {
        this(new ArrayList(), 0);
    }

    public ConfigData(List<GuidanceConfig> list, int i) {
        this.configs = list;
        this.entranceRefactor = i;
    }
}
