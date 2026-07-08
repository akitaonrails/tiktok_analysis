package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class TakoStruct implements Serializable {

    @C09CT("tako_sug_word_list")
    public List<TakoSugWordList> sugWordList;

    @C09CT("word_hint")
    public String wordHint;

    public TakoStruct() {
        this(null, null);
    }

    public final void setSugWordList(List<TakoSugWordList> list) {
        this.sugWordList = list;
    }

    public TakoStruct(List<TakoSugWordList> list, String str) {
        this.sugWordList = list;
        this.wordHint = str;
    }
}
