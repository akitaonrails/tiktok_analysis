package com.ss.android.ugc.aweme.search.entry.searchbubble.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBubble implements Serializable {
    public static final int $stable = 8;

    @C09CT("content")
    public final String content;

    @C09CT("penetrate_info")
    public final String penetrateInfo;

    @C09CT("word_record")
    public final Word wordRecord;

    @C09CT("words_type")
    public final String wordsType;

    public SearchBubble(String str, String str2, Word word, String str3) {
        this.content = str;
        this.wordsType = str2;
        this.wordRecord = word;
        this.penetrateInfo = str3;
    }
}
