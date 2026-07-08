package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiGuestOptPanelFixLayoutConfig {
    public static final TypeAdapter ADAPTER = new MultiGuestOptPanelFixLayoutConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_layout_loading_change")
    public boolean enableLayoutLoadingChange;

    @C09CT("version")
    public int version;

    public MultiGuestOptPanelFixLayoutConfig() {
        this(7, true);
    }

    public MultiGuestOptPanelFixLayoutConfig(int i, boolean z) {
        this.version = i;
        this.enableLayoutLoadingChange = z;
    }
}
