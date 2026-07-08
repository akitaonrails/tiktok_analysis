package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftAnimParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("counsume_d30_scale")
    public float consumeD30Scale;

    @C09CT("queue_big_size")
    public int queueBigSize;

    @C09CT("queue_big_size_scale")
    public float queueBigSizeScale;

    @C09CT("queue_small_size")
    public int queueSmallSize;

    @C09CT("queue_small_size_scale")
    public float queueSmallSizeScale;

    @C09CT("ua_consume_d14_to_anchor_scale")
    public float uaConsumeD14ToAnchorScale;

    static {
        NormalGson.singleton();
        ADAPTER = new GiftAnimParams_OptTypeAdapter();
    }

    public GiftAnimParams() {
        this(0.7f, 100, 1.3f, 10, 1.5f, 1.4f);
    }

    public GiftAnimParams(float f, int i, float f2, int i2, float f3, float f4) {
        this.queueBigSizeScale = f;
        this.queueBigSize = i;
        this.queueSmallSizeScale = f2;
        this.queueSmallSize = i2;
        this.uaConsumeD14ToAnchorScale = f3;
        this.consumeD30Scale = f4;
    }
}
