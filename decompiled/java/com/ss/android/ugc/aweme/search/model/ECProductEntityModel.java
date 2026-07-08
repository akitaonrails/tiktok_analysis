package com.ss.android.ugc.aweme.search.model;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.search.TagBoundBoxStruct;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class ECProductEntityModel implements Serializable {
    public final TagBoundBoxStruct bbox;
    public final String entityId;
    public final UrlModel url;

    public ECProductEntityModel(TagBoundBoxStruct tagBoundBoxStruct, String str, UrlModel urlModel) {
        this.bbox = tagBoundBoxStruct;
        this.entityId = str;
        this.url = urlModel;
    }
}
