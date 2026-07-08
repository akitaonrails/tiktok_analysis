package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBingItem implements Serializable {
    public static final int $stable = 8;

    @C09CT("link")
    public final Link link;

    @C09CT("name")
    public final String name;

    public SearchBingItem() {
        this(null, "");
    }

    public SearchBingItem(Link link, String str) {
        this.link = link;
        this.name = str;
    }
}
