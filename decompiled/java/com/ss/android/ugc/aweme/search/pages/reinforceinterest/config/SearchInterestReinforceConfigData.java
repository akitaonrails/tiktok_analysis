package com.ss.android.ugc.aweme.search.pages.reinforceinterest.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchInterestReinforceConfigData implements Serializable {
    public static final int $stable = 0;

    @C09CT("interest_style")
    public final int style;

    @C09CT("interest_word_expired_time")
    public final int wordExpiredTime;

    @C09CT("interest_word_expose_uplimit")
    public final int wordExposeLimit;

    @C09CT("interest_word_local_saved_max_time")
    public final int wordLocalSavedMaxTime;

    @C09CT("interest_word_show_in_search_box")
    public final int wordShowInSearchBox;

    @C09CT("interest_word_unclick_uplimit")
    public final int wordUnClickLimit;

    public SearchInterestReinforceConfigData() {
        this(0, 0, 0, 1, 1, 2);
    }

    public SearchInterestReinforceConfigData(int i, int i2, int i3, int i4, int i5, int i6) {
        this.style = i;
        this.wordExposeLimit = i2;
        this.wordUnClickLimit = i3;
        this.wordShowInSearchBox = i4;
        this.wordExpiredTime = i5;
        this.wordLocalSavedMaxTime = i6;
    }
}
