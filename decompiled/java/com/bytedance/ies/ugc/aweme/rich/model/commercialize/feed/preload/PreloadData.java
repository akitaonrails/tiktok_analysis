package com.bytedance.ies.ugc.aweme.rich.model.commercialize.feed.preload;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class PreloadData implements Serializable {

    @C09CT("site_id")
    public String siteId = "";

    public final String getSiteId() {
        return this.siteId;
    }

    public final void setSiteId(String str) {
        this.siteId = str;
    }
}
