package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.BotConfig;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchSummaryModel {

    @C09CT("bot_config")
    public final BotConfig botConfig;

    @C09CT("text")
    public final String summary;

    public SearchSummaryModel() {
        this(null, null);
    }

    public SearchSummaryModel(String str, BotConfig botConfig) {
        this.summary = str;
        this.botConfig = botConfig;
    }
}
