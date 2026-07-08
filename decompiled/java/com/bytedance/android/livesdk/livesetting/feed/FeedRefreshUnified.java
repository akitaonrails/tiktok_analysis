package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class FeedRefreshUnified {
    public static final TypeAdapter ADAPTER = new FeedRefreshUnified_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("remove_swipe_refresh")
    public boolean removeSwipeRefresh;

    public FeedRefreshUnified() {
        this(false, false);
    }

    public FeedRefreshUnified(boolean z, boolean z2) {
        this.enable = z;
        this.removeSwipeRefresh = z2;
    }
}
