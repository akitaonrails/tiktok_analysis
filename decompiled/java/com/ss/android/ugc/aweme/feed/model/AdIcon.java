package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdIcon implements Serializable {

    @C09CT("icon_type")
    public final Integer iconType;

    @C09CT("icon_urls")
    public final List<String> iconUrls;

    public AdIcon() {
        this(null, null);
    }

    public AdIcon(Integer num, List<String> list) {
        this.iconType = num;
        this.iconUrls = list;
    }
}
