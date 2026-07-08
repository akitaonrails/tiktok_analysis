package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class MixFeedApiConfigModel implements Serializable {

    @C09CT("path")
    public final String path;

    @C09CT("request_params")
    public final Map<String, Object> requestParams;

    public MixFeedApiConfigModel() {
        this(null, null);
    }

    public MixFeedApiConfigModel(String str, Map<String, ? extends Object> map) {
        this.path = str;
        this.requestParams = map;
    }
}
