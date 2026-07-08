package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class RedEnvelopeUrls {
    public static final TypeAdapter ADAPTER;

    @C09CT("short_touch")
    public String shortTouchUrl = "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fshort_touch%2Ftemplate.js";

    @C09CT("send")
    public String sendUrl = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fsend%2Ftemplate.js&gravity=bottom&height=954rpx&radius=16rpx";

    static {
        NormalGson.singleton();
        ADAPTER = new RedEnvelopeUrls_OptTypeAdapter();
    }
}
