package com.ss.android.ugc.aweme.discover.model.suggest;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class TopHistoryWord {

    @C09CT("group_id")
    public final String groupId;

    @C09CT("icon_type")
    public final String iconType;

    @C09CT("is_top_word")
    public final Integer isTopWord;

    @C09CT("log_id")
    public final String logId;

    @C09CT("word")
    public final String word;

    public TopHistoryWord() {
        this(null, null, null, null, null);
    }

    public final Integer isTopWord() {
        return this.isTopWord;
    }

    public TopHistoryWord(String str, Integer num, String str2, String str3, String str4) {
        this.word = str;
        this.isTopWord = num;
        this.iconType = str2;
        this.groupId = str3;
        this.logId = str4;
    }
}
