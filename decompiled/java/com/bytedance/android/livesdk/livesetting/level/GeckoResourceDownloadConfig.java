package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GeckoResourceDownloadConfig {
    public static final TypeAdapter ADAPTER = new GeckoResourceDownloadConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("client_resource_channels")
    public List<String> geckoResourceDownloadList;

    public GeckoResourceDownloadConfig() {
        this(null);
    }

    public GeckoResourceDownloadConfig(List<String> list) {
        this.geckoResourceDownloadList = list;
    }
}
