package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class AuthorizedPageText implements Serializable {

    @C09CT("text_content")
    public final String textContent;

    @C09CT("text_key")
    public final String textKey;

    public AuthorizedPageText() {
        this(null, null);
    }

    public AuthorizedPageText(String str, String str2) {
        this.textKey = str;
        this.textContent = str2;
    }
}
