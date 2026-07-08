package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class ReplaceCover implements Serializable {

    @C09CT("cover_url")
    public final UrlModel coverUrl;

    @C09CT("key_moment")
    public final Integer keyMoment;

    public ReplaceCover(UrlModel urlModel, Integer num) {
        this.coverUrl = urlModel;
        this.keyMoment = num;
    }
}
