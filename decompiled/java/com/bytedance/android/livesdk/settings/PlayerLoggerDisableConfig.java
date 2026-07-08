package com.bytedance.android.livesdk.settings;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class PlayerLoggerDisableConfig {
    public static final TypeAdapter ADAPTER = new PlayerLoggerDisableConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("disableLogger")
    public boolean disable;

    @C09CT("disableAll")
    public boolean disableAll;

    @C09CT("disableKeys")
    public List<String> disableKeys;

    public PlayerLoggerDisableConfig() {
        this(false, new ArrayList(), false);
    }

    public PlayerLoggerDisableConfig(boolean z, List<String> list, boolean z2) {
        this.disable = z;
        this.disableKeys = list;
        this.disableAll = z2;
    }
}
