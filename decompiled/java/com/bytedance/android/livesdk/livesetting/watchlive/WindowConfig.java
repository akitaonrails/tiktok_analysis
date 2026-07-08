package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class WindowConfig implements Serializable {
    public static final TypeAdapter ADAPTER = new WindowConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("lynx")
    public Map<String, WindowPageConfig> lynx;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    @C09CT("native")
    public Map<String, WindowPageConfig> f38native;

    public WindowConfig() {
        this(null, null);
    }

    public final Map<String, WindowPageConfig> getLynx() {
        return this.lynx;
    }

    public final Map<String, WindowPageConfig> getNative() {
        return this.f38native;
    }

    public final void setLynx(Map<String, WindowPageConfig> map) {
        this.lynx = map;
    }

    public final void setNative(Map<String, WindowPageConfig> map) {
        this.f38native = map;
    }

    public WindowConfig(Map<String, WindowPageConfig> map, Map<String, WindowPageConfig> map2) {
        this.lynx = map;
        this.f38native = map2;
    }
}
