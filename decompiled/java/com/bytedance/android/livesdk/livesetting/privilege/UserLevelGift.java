package com.bytedance.android.livesdk.livesetting.privilege;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class UserLevelGift {
    public static final TypeAdapter ADAPTER;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("grade")
    public int level;

    static {
        NormalGson.singleton();
        ADAPTER = new UserLevelGift_OptTypeAdapter();
    }

    public UserLevelGift() {
        this(0, 0L);
    }

    public UserLevelGift(int i, long j) {
        this.level = i;
        this.giftId = j;
    }
}
