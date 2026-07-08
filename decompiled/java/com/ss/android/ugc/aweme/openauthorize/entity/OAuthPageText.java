package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class OAuthPageText implements Serializable {

    @C09CT("text_content")
    public final String textContent;

    @C09CT("text_fill_in_values")
    public final List<String> textFillInValues;

    @C09CT("text_key")
    public final String textKey;

    @C09CT("text_starling_key")
    public final String textStarlingKey;

    public OAuthPageText() {
        this(null, null, null, null);
    }

    public OAuthPageText(String str, List<String> list, String str2, String str3) {
        this.textStarlingKey = str;
        this.textFillInValues = list;
        this.textKey = str2;
        this.textContent = str3;
    }
}
