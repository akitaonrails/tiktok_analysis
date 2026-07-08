package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftHighTrafficDropMessageConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("clear_percentage")
    public int clearPercentage;

    @C09CT("insert_big_gift_num")
    public int insertBigGiftNum;

    @C09CT("insertion_interval")
    public long insertInterval;

    @C09CT("insert_small_gift_num")
    public int insertSmallGiftNum;

    @C09CT("max_queue_length")
    public int maxQueueLength;

    static {
        NormalGson.singleton();
        ADAPTER = new GiftHighTrafficDropMessageConfig_OptTypeAdapter();
    }

    public GiftHighTrafficDropMessageConfig() {
        this(5000, 50, 500L, 1, 5);
    }

    public GiftHighTrafficDropMessageConfig(int i, int i2, long j, int i3, int i4) {
        this.maxQueueLength = i;
        this.clearPercentage = i2;
        this.insertInterval = j;
        this.insertBigGiftNum = i3;
        this.insertSmallGiftNum = i4;
    }
}
