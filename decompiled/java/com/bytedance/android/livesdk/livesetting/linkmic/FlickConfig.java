package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class FlickConfig {
    public static final TypeAdapter ADAPTER = new FlickConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("alive")
    public long alive;

    @C09CT("cache_size")
    public int cacheSize;

    @C09CT("opt_feed")
    public boolean optFeed;

    @C09CT("opt_room_enter")
    public boolean optRoomEnter;

    @C09CT("opt_same_img")
    public boolean optSameImage;

    @C09CT("placeholder")
    public boolean placeholder;

    @C09CT("sample")
    public int sample;

    @C09CT("skip_for_layout")
    public boolean shouldSkipWhenLayoutNotMatch;

    public FlickConfig() {
        this(0, 10, 10800000L, false, true, false, true, true);
    }

    public FlickConfig(int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.cacheSize = i;
        this.sample = i2;
        this.alive = j;
        this.placeholder = z;
        this.shouldSkipWhenLayoutNotMatch = z2;
        this.optFeed = z3;
        this.optRoomEnter = z4;
        this.optSameImage = z5;
    }
}
