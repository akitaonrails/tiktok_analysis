package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class TranslateSearchDesc implements Serializable {

    @C09CT("origin_language")
    public final String originLanguage;

    @C09CT("search_desc")
    public final String searchDesc;

    public TranslateSearchDesc() {
        this(null, null);
    }

    public TranslateSearchDesc(String str, String str2) {
        this.searchDesc = str;
        this.originLanguage = str2;
    }
}
