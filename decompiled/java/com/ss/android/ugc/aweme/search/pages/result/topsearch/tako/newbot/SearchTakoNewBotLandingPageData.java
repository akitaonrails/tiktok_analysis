package com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.newbot;

import X.C09CT;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoNewBotLandingPageData implements Serializable {
    public static final int $stable = 8;

    @C09CT("landing_page_hint")
    public final String landingPageHint;

    @C09CT("placeholder_sources")
    public final Map<String, String> placeholderSources;

    @C09CT("full_rich_text_content")
    public final String richMessage;

    public SearchTakoNewBotLandingPageData() {
        this("", "", new LinkedHashMap());
    }

    public SearchTakoNewBotLandingPageData(String str, String str2, Map<String, String> map) {
        this.richMessage = str;
        this.landingPageHint = str2;
        this.placeholderSources = map;
    }
}
