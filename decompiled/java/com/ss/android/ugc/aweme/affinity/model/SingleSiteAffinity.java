package com.ss.android.ugc.aweme.affinity.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleSiteAffinity {

    @C09CT("items")
    public final List<SocialAffinityItem> items;

    @C09CT("site")
    public final int site;

    public SingleSiteAffinity() {
        this(0, null);
    }

    public SingleSiteAffinity(int i, List<SocialAffinityItem> list) {
        this.site = i;
        this.items = list;
    }
}
