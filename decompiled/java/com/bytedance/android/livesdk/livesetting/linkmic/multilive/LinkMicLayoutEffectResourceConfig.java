package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicLayoutEffectResourceConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("linkmic_layout_effect_panel")
    public String panel;

    @C09CT("linkmic_layout_effect_resource_id")
    public String resourceId;

    static {
        NormalGson.singleton();
        ADAPTER = new LinkMicLayoutEffectResourceConfig_OptTypeAdapter();
    }

    public LinkMicLayoutEffectResourceConfig() {
        this("live_dance", "7592891457921356305");
    }

    public LinkMicLayoutEffectResourceConfig(String str, String str2) {
        this.panel = str;
        this.resourceId = str2;
    }
}
