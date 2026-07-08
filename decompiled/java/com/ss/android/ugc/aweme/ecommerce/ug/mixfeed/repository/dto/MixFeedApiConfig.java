package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class MixFeedApiConfig implements Serializable {

    @C09CT("fetch_feed")
    public final MixFeedApiConfigModel fetchFeed;

    @C09CT("impression_write")
    public final MixFeedApiConfigModel impressionWrite;

    public MixFeedApiConfig() {
        this(null, null);
    }

    public MixFeedApiConfig(MixFeedApiConfigModel mixFeedApiConfigModel, MixFeedApiConfigModel mixFeedApiConfigModel2) {
        this.fetchFeed = mixFeedApiConfigModel;
        this.impressionWrite = mixFeedApiConfigModel2;
    }
}
