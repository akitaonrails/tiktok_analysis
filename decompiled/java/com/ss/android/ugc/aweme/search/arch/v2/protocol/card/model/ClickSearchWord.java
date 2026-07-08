package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;

/* JADX INFO: loaded from: classes11.dex */
public final class ClickSearchWord {

    @C09CT("group_id")
    public final String groupId;

    @C09CT("penetrate_info")
    public final String penetrateInfo;

    @C09CT("sug_word")
    public final String word;

    @C09CT("word_record")
    public final Word wordRecord;

    public ClickSearchWord() {
        this(null, null, null, null);
    }

    public ClickSearchWord(String str, String str2, Word word, String str3) {
        this.word = str;
        this.groupId = str2;
        this.wordRecord = word;
        this.penetrateInfo = str3;
    }
}
