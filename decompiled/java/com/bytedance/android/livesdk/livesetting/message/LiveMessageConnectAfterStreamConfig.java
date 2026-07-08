package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveMessageConnectAfterStreamConfig {
    public static final TypeAdapter ADAPTER = new LiveMessageConnectAfterStreamConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("timeout")
    public long timeout = 3000;

    @C09CT("need_nqe_lower_than_equal")
    public int needNqeLowerThanEqual = -1;
}
