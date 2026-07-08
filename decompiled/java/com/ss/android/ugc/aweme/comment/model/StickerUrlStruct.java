package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class StickerUrlStruct implements Serializable {

    @C09CT("high_resolution_url")
    public UrlModel highResolutionUrl;

    @C09CT("low_resolution_url")
    public UrlModel lowResolutionUrl;

    @C09CT("mid_resolution_url")
    public UrlModel midResolutionUrl;

    @C09CT("uri")
    public String uri;

    public StickerUrlStruct() {
        this(null, null, null, null);
    }

    public final void setHighResolutionUrl(UrlModel urlModel) {
        this.highResolutionUrl = urlModel;
    }

    public final void setLowResolutionUrl(UrlModel urlModel) {
        this.lowResolutionUrl = urlModel;
    }

    public final void setMidResolutionUrl(UrlModel urlModel) {
        this.midResolutionUrl = urlModel;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public StickerUrlStruct(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, String str) {
        this.lowResolutionUrl = urlModel;
        this.midResolutionUrl = urlModel2;
        this.highResolutionUrl = urlModel3;
        this.uri = str;
    }
}
