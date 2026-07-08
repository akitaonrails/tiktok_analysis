package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class TermsOfService implements Serializable {
    public static final int $stable = 0;

    @C09CT("desc")
    public final String desc;

    @C09CT("highlight_text")
    public final String highlightText;

    @C09CT("schema")
    public final String schema;

    public TermsOfService() {
        this(null, null, null);
    }

    public TermsOfService(String str, String str2, String str3) {
        this.desc = str;
        this.schema = str2;
        this.highlightText = str3;
    }
}
