package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class DetailBottomBanner implements Serializable {

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("desc")
    public final String desc;

    @C09CT("thumbnail")
    public final UrlModel thumbnail;

    @C09CT("title")
    public final String title;

    public DetailBottomBanner() {
        this(null, null, null, null);
    }

    public DetailBottomBanner(UrlModel urlModel, String str, String str2, String str3) {
        this.thumbnail = urlModel;
        this.title = str;
        this.desc = str2;
        this.buttonText = str3;
    }
}
