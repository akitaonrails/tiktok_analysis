package com.ss.android.ugc.aweme.model.api.data;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviAnimatedGifDataModel implements Serializable {

    @C09CT("name")
    public String name;

    @C09CT("animation_url")
    public UrlModel url;

    public final void setName(String str) {
        this.name = str;
    }

    public final void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public ProfileNaviAnimatedGifDataModel(String str, UrlModel urlModel) {
        this.name = str;
        this.url = urlModel;
    }
}
