package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AutocaptionType implements Serializable {

    @C09CT("language")
    public String language;

    @C09CT("url")
    public UrlModel url;

    public AutocaptionType() {
        this(null, null);
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public AutocaptionType(String str, UrlModel urlModel) {
        this.language = str;
        this.url = urlModel;
    }
}
