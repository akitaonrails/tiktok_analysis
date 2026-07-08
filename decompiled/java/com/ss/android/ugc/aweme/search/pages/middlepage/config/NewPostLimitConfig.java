package com.ss.android.ugc.aweme.search.pages.middlepage.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class NewPostLimitConfig {

    @C09CT("search_history_default_words_intent_count")
    public final int defaultWordsCount;

    @C09CT("search_history_expanded_words_intent_count")
    public final int expandedWordsCount;

    public NewPostLimitConfig() {
        this(2, 3);
    }

    public NewPostLimitConfig(int i, int i2) {
        this.defaultWordsCount = i;
        this.expandedWordsCount = i2;
    }
}
