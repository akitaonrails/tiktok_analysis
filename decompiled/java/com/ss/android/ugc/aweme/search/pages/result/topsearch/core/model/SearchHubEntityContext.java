package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchHubEntityContext implements Serializable {

    @C09CT("attach_card_key")
    public final String attachCardKey;

    @C09CT("attach_card_source")
    public final Integer attachCardSource;

    @C09CT("clicked_tab")
    public final String clickedTab;

    @C09CT("entity_name")
    public final String entityName;

    @C09CT("original_query")
    public final String oritinalQuery;

    @C09CT("tab_list")
    public final List<String> tabList;

    public SearchHubEntityContext(String str, String str2, String str3, List<String> list, Integer num, String str4) {
        this.clickedTab = str;
        this.entityName = str2;
        this.oritinalQuery = str3;
        this.tabList = list;
        this.attachCardSource = num;
        this.attachCardKey = str4;
    }
}
