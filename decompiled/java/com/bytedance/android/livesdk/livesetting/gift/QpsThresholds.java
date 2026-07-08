package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class QpsThresholds {
    public static final TypeAdapter ADAPTER;

    @C09CT("enter_qps")
    public float enterQps = 8.0f;

    @C09CT("chat_qps")
    public float chatQps = 6.0f;

    @C09CT("gift_qps")
    public float giftQPs = 5.0f;

    @C09CT("like_qps")
    public float likeQps = 5.0f;

    static {
        NormalGson.singleton();
        ADAPTER = new QpsThresholds_OptTypeAdapter();
    }
}
