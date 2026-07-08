package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class MixFrameworkConfig {
    public static final TypeAdapter ADAPTER = new MixFrameworkConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_lynx_method_proxy")
    public boolean enableLynxMethodProxy = true;
}
