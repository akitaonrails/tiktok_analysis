package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class FeedRequestParams {
    public static final TypeAdapter ADAPTER = new FeedRequestParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("req_feed_v3")
    public Map<String, Boolean> reqFeedV3;

    public FeedRequestParams() {
        this(C2097608Jq.LJ());
    }

    public FeedRequestParams(Map<String, Boolean> map) {
        this.reqFeedV3 = map;
    }
}
