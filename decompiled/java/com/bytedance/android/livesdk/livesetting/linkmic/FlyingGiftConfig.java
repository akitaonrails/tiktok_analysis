package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class FlyingGiftConfig {
    public static final TypeAdapter ADAPTER = new FlyingGiftConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("path_configs")
    public List<FlyingGiftPathConfig> configs;

    @C09CT("gift_id")
    public Long giftId;

    public FlyingGiftConfig() {
        this(null, null);
    }

    public FlyingGiftConfig(Long l, List<FlyingGiftPathConfig> list) {
        this.giftId = l;
        this.configs = list;
    }
}
