package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public class FeedPreloadConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("live_feed_preload_in_room")
    public int feedPreloadInRoom;

    @C09CT("live_feed_preload_new_feed")
    public int feedPreloadNewFeed = 2;

    @C09CT("live_feed_preload_style_one")
    public int feedPreloadStyleOne;

    @C09CT("live_feed_preload_style_two")
    public int feedPreloadStyleTwo;

    static {
        NormalGson.singleton();
        ADAPTER = new FeedPreloadConfig_OptTypeAdapter();
    }
}
