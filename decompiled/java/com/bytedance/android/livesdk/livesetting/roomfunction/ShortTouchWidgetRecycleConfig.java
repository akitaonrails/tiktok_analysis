package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ShortTouchWidgetRecycleConfig {
    public static final TypeAdapter ADAPTER = new ShortTouchWidgetRecycleConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("preview_widget")
    public boolean previewWidgetRecycle;

    @C09CT("view_widget")
    public boolean viewWidgetRecycle;

    public ShortTouchWidgetRecycleConfig() {
        this(true, true);
    }

    public ShortTouchWidgetRecycleConfig(boolean z, boolean z2) {
        this.viewWidgetRecycle = z;
        this.previewWidgetRecycle = z2;
    }
}
