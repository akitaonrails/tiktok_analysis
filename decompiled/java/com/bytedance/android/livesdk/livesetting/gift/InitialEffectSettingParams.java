package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class InitialEffectSettingParams {
    public static final TypeAdapter ADAPTER = new InitialEffectSettingParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("load_timing")
    public int loadTiming;

    @C09CT("panel_name")
    public String panelName;

    @C09CT("resource_id")
    public String resourceId;

    public InitialEffectSettingParams() {
        this(false, 0, "", "");
    }

    public InitialEffectSettingParams(boolean z, int i, String str, String str2) {
        this.enabled = z;
        this.loadTiming = i;
        this.panelName = str;
        this.resourceId = str2;
    }
}
