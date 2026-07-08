package com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class SearchLandingPageExtraData implements Serializable {
    public static final int $stable = 0;

    @C09CT("img_url")
    public final String cardImageUrl;

    @C09CT("title")
    public final String cardTitle;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("list_item_id")
    public final String listItemId;

    @C09CT("list_result_type")
    public final String listItemType;

    @C09CT("page_type")
    public final String pageType;

    @C09CT("search_id")
    public final String searchId;

    @C09CT("search_keyword")
    public final String searchKeyWord;

    @C09CT("search_result_id")
    public final String searchResultId;

    @C09CT("token_type")
    public final String tokenType;

    public SearchLandingPageExtraData() {
        this("", "", "", "", "", "", "", "", "", "");
    }

    public SearchLandingPageExtraData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.searchId = str;
        this.searchResultId = str2;
        this.listItemId = str3;
        this.listItemType = str4;
        this.enterFrom = str5;
        this.searchKeyWord = str6;
        this.tokenType = str7;
        this.pageType = str8;
        this.cardImageUrl = str9;
        this.cardTitle = str10;
    }
}
