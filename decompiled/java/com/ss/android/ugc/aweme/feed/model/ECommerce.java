package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ECommerce implements Serializable {

    @C09CT("ttec_content_tag")
    public TTECContentTag ttecContentTag;

    public ECommerce() {
        this(null);
    }

    public ECommerce(TTECContentTag tTECContentTag) {
        this.ttecContentTag = tTECContentTag;
    }
}
