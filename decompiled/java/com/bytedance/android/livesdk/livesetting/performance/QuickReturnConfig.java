package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class QuickReturnConfig {
    public static final TypeAdapter ADAPTER = new QuickReturnConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("whitelist")
    public List<String> whitelist = C13BV.INSTANCE;

    @C09CT("delay_seconds")
    public int delaySeconds = 3;
}
