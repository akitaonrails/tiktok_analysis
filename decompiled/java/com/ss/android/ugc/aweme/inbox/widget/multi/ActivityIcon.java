package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes15.dex */
public final class ActivityIcon {

    @C09CT("res_id")
    public final int resId;

    @C09CT("url")
    public final String url;

    @C09CT("url_model")
    public final UrlModel urlModel;

    public ActivityIcon() {
        this(null, -1, null);
    }

    public ActivityIcon(UrlModel urlModel, int i, String str) {
        this.urlModel = urlModel;
        this.resId = i;
        this.url = str;
    }
}
