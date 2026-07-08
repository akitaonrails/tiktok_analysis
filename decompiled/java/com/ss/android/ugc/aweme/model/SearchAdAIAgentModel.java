package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.BotConfig;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdAIAgentModel {

    @C09CT("bot_config")
    public final BotConfig botConfig;

    @C09CT("icon")
    public final String icon;

    @C09CT("layout_type")
    public final Integer layoutType;

    @C09CT("query_params")
    public final String queryParams;

    @C09CT("title")
    public final String title;

    public SearchAdAIAgentModel() {
        this("", null, null, null, null);
    }

    public SearchAdAIAgentModel(String str, BotConfig botConfig, String str2, String str3, Integer num) {
        this.queryParams = str;
        this.botConfig = botConfig;
        this.icon = str2;
        this.title = str3;
        this.layoutType = num;
    }
}
