package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class CentralInsetsBottomConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("feed_dp")
    public int feedDp;

    @C09CT("in_room_dp")
    public int inRoomDp;

    @C09CT("pad_landscape_dp")
    public int padLandscapeDp;

    @C09CT("pad_portrait_dp")
    public int padPortraitDp;

    @C09CT("search_dp")
    public int searchDp;

    static {
        NormalGson.singleton();
        ADAPTER = new CentralInsetsBottomConfig_OptTypeAdapter();
    }

    public CentralInsetsBottomConfig() {
        this(56, 156, 56, 56, 56);
    }

    public CentralInsetsBottomConfig(int i, int i2, int i3, int i4, int i5) {
        this.padLandscapeDp = i;
        this.padPortraitDp = i2;
        this.inRoomDp = i3;
        this.feedDp = i4;
        this.searchDp = i5;
    }
}
