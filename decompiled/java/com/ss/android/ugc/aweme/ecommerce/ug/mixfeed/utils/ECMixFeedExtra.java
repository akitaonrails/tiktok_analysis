package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.utils;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.MixFeedApiConfig;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes30.dex */
public final class ECMixFeedExtra implements Serializable {

    @C09CT("ad_live_json")
    public final String adLiveJson;

    @C09CT("api_config")
    public final MixFeedApiConfig apiConfig;

    @C09CT("author_id")
    public final String authorId;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("live_log_extra")
    public final HashMap<String, String> liveLogExtra;

    @C09CT("room_id")
    public final Long roomId;

    public ECMixFeedExtra() {
        this(null, null, null, null, null, null);
    }

    public ECMixFeedExtra(String str, String str2, Long l, String str3, HashMap<String, String> map, MixFeedApiConfig mixFeedApiConfig) {
        this.authorId = str;
        this.adLiveJson = str2;
        this.roomId = l;
        this.enterMethod = str3;
        this.liveLogExtra = map;
        this.apiConfig = mixFeedApiConfig;
    }
}
