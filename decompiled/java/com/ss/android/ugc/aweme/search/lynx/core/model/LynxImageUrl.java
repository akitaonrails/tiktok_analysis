package com.ss.android.ugc.aweme.search.lynx.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxImageUrl implements Serializable {
    public static final int $stable = 8;

    @C09CT("hot_link")
    public String imageUrl;

    @C09CT(alternate = {"avatar_thumb", "icon"}, value = "cover_thumb")
    public UrlModel urlModel;

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final UrlModel getUrlModel() {
        return this.urlModel;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setUrlModel(UrlModel urlModel) {
        this.urlModel = urlModel;
    }
}
