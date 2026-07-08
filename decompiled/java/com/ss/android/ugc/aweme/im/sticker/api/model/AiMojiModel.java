package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class AiMojiModel implements Serializable {

    @C09CT("high_resolution_url")
    public final UrlModel highResolutionUrl;

    @C09CT("low_resolution_url")
    public final UrlModel lowResolutionUrl;

    @C09CT("mid_resolution_url")
    public final UrlModel midResolutionUrl;

    @C09CT("uri")
    public final String uri;

    public AiMojiModel() {
        this(null, null, null, null);
    }

    public AiMojiModel(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, String str) {
        this.lowResolutionUrl = urlModel;
        this.midResolutionUrl = urlModel2;
        this.highResolutionUrl = urlModel3;
        this.uri = str;
    }
}
