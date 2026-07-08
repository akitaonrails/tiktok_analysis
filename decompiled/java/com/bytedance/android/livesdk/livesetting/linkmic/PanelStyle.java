package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class PanelStyle {
    public static final TypeAdapter ADAPTER = new PanelStyle_OptTypeAdapter(NormalGson.singleton());

    @C09CT("panel_type")
    public int panelType;

    @C09CT("show_view_more")
    public boolean showViewMore;

    public PanelStyle() {
        this(0, false);
    }

    public PanelStyle(int i, boolean z) {
        this.panelType = i;
        this.showViewMore = z;
    }
}
