package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class ShowTextInfo implements Serializable {

    @C09CT("format_text")
    public final String formatText;

    @C09CT("highlight_text")
    public final String highlightText;

    public ShowTextInfo() {
        this(null, null);
    }

    public ShowTextInfo(String str, String str2) {
        this.formatText = str;
        this.highlightText = str2;
    }
}
