package com.ss.android.ugc.aweme.search.caption;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CaptionAnchor implements Serializable {

    @C09CT("icon")
    public UrlModel icon;

    @C09CT("keyword")
    public String keyword = "";

    @C09CT("link")
    public String link = "";

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLink() {
        return this.link;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLink(String str) {
        this.link = str;
    }
}
