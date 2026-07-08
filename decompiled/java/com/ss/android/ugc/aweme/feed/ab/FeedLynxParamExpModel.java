package com.ss.android.ugc.aweme.feed.ab;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedLynxParamExpModel {

    @C09CT("common")
    public final Map<String, String> common;

    @C09CT("cards")
    public final Map<String, Map<String, String>> data;

    public FeedLynxParamExpModel() {
        this(C2097608Jq.LJ(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedLynxParamExpModel(Map<String, ? extends Map<String, String>> map, Map<String, String> map2) {
        this.data = map;
        this.common = map2;
    }
}
