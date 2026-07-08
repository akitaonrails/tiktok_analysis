package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class SuggestionWordInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("impr_id")
    public final String imprId;

    @C09CT("raw_query")
    public final String rawQuery;

    @C09CT("recall_info")
    public final String recallInfo;

    @C09CT("search_intent")
    public final String searchIntent;

    @C09CT("tako_intent")
    public final String takoIntent;

    @C09CT("word_id")
    public final String wordId;

    @C09CT("words_content")
    public final String wordsContent;

    @C09CT("words_content_detail")
    public final String wordsContentDetail;

    @C09CT("words_source")
    public final String wordsSource;

    public SuggestionWordInfo() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public SuggestionWordInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.wordsSource = str;
        this.wordsContent = str2;
        this.wordsContentDetail = str3;
        this.rawQuery = str4;
        this.wordId = str5;
        this.imprId = str6;
        this.recallInfo = str7;
        this.searchIntent = str8;
        this.takoIntent = str9;
    }
}
