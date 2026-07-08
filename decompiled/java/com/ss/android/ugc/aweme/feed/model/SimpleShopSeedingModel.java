package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class SimpleShopSeedingModel implements Serializable {

    @C09CT("cover")
    public final String cover;

    @C09CT("seed_id")
    public final String seedId;

    @C09CT("seed_tag")
    public final String seedTag;

    @C09CT("title")
    public final String title;

    @C09CT("url")
    public final String url;

    @C09CT("views")
    public final String views;

    public final String getCover() {
        return this.cover;
    }

    public final String getSeedId() {
        return this.seedId;
    }

    public final String getSeedTag() {
        return this.seedTag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getViews() {
        return this.views;
    }
}
