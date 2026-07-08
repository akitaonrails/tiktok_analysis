package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAwemePicAuthorStruct implements Serializable {

    @C09CT("link")
    public final UrlModel authorLink;

    @C09CT("icon")
    public final UrlModel icon;

    @C09CT("keyword")
    public final String keyword;

    public PoiAwemePicAuthorStruct() {
        this(null, null, null);
    }

    public PoiAwemePicAuthorStruct(String str, UrlModel urlModel, UrlModel urlModel2) {
        this.keyword = str;
        this.icon = urlModel;
        this.authorLink = urlModel2;
    }
}
