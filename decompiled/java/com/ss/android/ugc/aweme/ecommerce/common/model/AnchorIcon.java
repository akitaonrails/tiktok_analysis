package com.ss.android.ugc.aweme.ecommerce.common.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class AnchorIcon implements Serializable {

    @C09CT("icon_type")
    public final Integer iconType;

    @C09CT("icon_urls")
    public final List<String> iconUrls;

    public AnchorIcon() {
        this(null, null);
    }

    public AnchorIcon(Integer num, List<String> list) {
        this.iconType = num;
        this.iconUrls = list;
    }
}
