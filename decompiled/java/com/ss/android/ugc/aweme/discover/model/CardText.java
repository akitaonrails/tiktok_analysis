package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class CardText implements Serializable {

    @C09CT("text_content")
    public final String textContent;

    @C09CT("text_key")
    public final String textKey;

    public CardText() {
        this(null, null);
    }

    public CardText(String str, String str2) {
        this.textKey = str;
        this.textContent = str2;
    }
}
