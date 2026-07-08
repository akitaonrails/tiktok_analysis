package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CS;
import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public final class Text implements Serializable {

    @C09CT("default_format")
    @C09CS(RawStringJsonAdapter.class)
    public String defaultFormat;

    @C09CT("default_pattern")
    public String defaultPattern;

    @C09CT("key")
    public String key;

    @C09CT("pieces")
    @C09CS(RawStringJsonAdapter.class)
    public String pieces;

    public Text() {
        this("", "", "", "");
    }

    public final void setDefaultFormat(String str) {
        this.defaultFormat = str;
    }

    public final void setDefaultPattern(String str) {
        this.defaultPattern = str;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setPieces(String str) {
        this.pieces = str;
    }

    public Text(String str, String str2, String str3, String str4) {
        this.key = str;
        this.defaultPattern = str2;
        this.defaultFormat = str3;
        this.pieces = str4;
    }
}
