package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class FeedbarDrawCreateInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme_photo_mode")
    public final List<String> imageUrls;

    @C09CT("query")
    public final String query;

    @C09CT("is_valid")
    public boolean valid;

    public FeedbarDrawCreateInfo() {
        this(false, null, null);
    }

    public final void setValid(boolean z) {
        this.valid = z;
    }

    public FeedbarDrawCreateInfo(boolean z, String str, List<String> list) {
        this.valid = z;
        this.query = str;
        this.imageUrls = list;
    }
}
