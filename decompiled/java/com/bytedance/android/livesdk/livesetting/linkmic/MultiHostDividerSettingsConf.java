package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiHostDividerSettingsConf {
    public static final TypeAdapter ADAPTER = new MultiHostDividerSettingsConf_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    public MultiHostDividerSettingsConf() {
        this(false);
    }

    public MultiHostDividerSettingsConf(boolean z) {
        this.enable = z;
    }
}
