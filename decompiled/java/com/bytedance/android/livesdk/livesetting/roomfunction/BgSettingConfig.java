package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class BgSettingConfig {
    public static final TypeAdapter ADAPTER = new BgSettingConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("anchor")
    public boolean anchor;

    @C09CT("audience")
    public boolean audience;
}
