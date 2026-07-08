package com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public final class ECLivePlaybackWatchLiveButton {

    @C09CT("da_info")
    public final Map<String, String> daInfo;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("room_schema")
    public final String schema;

    @C09CT("text")
    public final String text;

    public ECLivePlaybackWatchLiveButton() {
        this(null, null, null, null);
    }

    public ECLivePlaybackWatchLiveButton(String str, String str2, String str3, Map<String, String> map) {
        this.text = str;
        this.iconUrl = str2;
        this.schema = str3;
        this.daInfo = map;
    }
}
