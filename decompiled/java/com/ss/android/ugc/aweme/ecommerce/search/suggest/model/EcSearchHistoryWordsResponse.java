package com.ss.android.ugc.aweme.ecommerce.search.suggest.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EcSearchHistoryWordsResponse {

    @C09CT("code")
    public final Integer code;

    @C09CT("history_words_with_image")
    public final List<Object> historyWordsWithImages;

    @C09CT("impr_id")
    public final String imprId;

    @C09CT("message")
    public final String message;

    public EcSearchHistoryWordsResponse() {
        this(-1, null, null, null);
    }

    public EcSearchHistoryWordsResponse(Integer num, String str, String str2, List<Object> list) {
        this.code = num;
        this.imprId = str;
        this.message = str2;
        this.historyWordsWithImages = list;
    }
}
