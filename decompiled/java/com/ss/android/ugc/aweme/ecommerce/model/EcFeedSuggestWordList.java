package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EcFeedSuggestWordList implements Serializable {

    @C09CT("ttec_suggest_words")
    public List<EcSuggestWordStruct> suggestWords;

    public final List<EcSuggestWordStruct> getSuggestWords() {
        return this.suggestWords;
    }

    public final void setSuggestWords(List<EcSuggestWordStruct> list) {
        this.suggestWords = list;
    }
}
