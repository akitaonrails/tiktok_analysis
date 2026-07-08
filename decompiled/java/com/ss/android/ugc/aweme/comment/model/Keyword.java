package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class Keyword implements Serializable {

    @C09CT("content")
    public String content;

    @C09CT("font_path")
    public final String font;

    @C09CT("min_match_length")
    public final Long minMatchLength;

    public Keyword() {
        this(null, null, null);
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public Keyword(String str, String str2, Long l) {
        this.content = str;
        this.font = str2;
        this.minMatchLength = l;
    }
}
