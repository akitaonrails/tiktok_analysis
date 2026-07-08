package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLabel implements Serializable {

    @C09CT("attach_card_key")
    public final String attachCardKey;

    @C09CT("attach_card_source")
    public final Integer attachCardSource;

    @C09CT("jump_query")
    public final String jumpQuery;

    @C09CT("label_id")
    public final String labelId;

    @C09CT("label_text")
    public final String labelText;

    public SearchLabel() {
        this(null, null, null, null, null);
    }

    public SearchLabel(String str, String str2, String str3, Integer num, String str4) {
        this.labelId = str;
        this.labelText = str2;
        this.jumpQuery = str3;
        this.attachCardSource = num;
        this.attachCardKey = str4;
    }
}
