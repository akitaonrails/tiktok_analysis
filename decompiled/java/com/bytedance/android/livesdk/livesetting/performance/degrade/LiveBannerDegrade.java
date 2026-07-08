package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBannerDegrade {
    public static final TypeAdapter ADAPTER = new LiveBannerDegrade_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_recycle_webview")
    public boolean enableRecycleWebview;

    @C09CT("enable_banner")
    public boolean enableBanner = true;

    @C09CT("delay_load_banner_time")
    public long delayLoadBannerTime = 3000;
}
