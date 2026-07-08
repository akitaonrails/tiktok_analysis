package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class DRMConfig {
    public static final TypeAdapter ADAPTER = new DRMConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable = true;
}
