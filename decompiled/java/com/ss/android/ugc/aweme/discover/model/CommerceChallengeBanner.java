package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class CommerceChallengeBanner implements Serializable {

    @C09CT("icon")
    public final UrlModel icon;

    @C09CT("open_url")
    public final String openUrl;

    @C09CT("web_url")
    public final String webUrl;

    public CommerceChallengeBanner(UrlModel urlModel, String str, String str2) {
        this.icon = urlModel;
        this.webUrl = str;
        this.openUrl = str2;
    }
}
