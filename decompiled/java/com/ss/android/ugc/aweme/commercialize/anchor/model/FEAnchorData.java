package com.ss.android.ugc.aweme.commercialize.anchor.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;

/* JADX INFO: loaded from: classes17.dex */
public final class FEAnchorData {

    @C09CT("anchor_index")
    public final Integer anchorIndex;

    @C09CT("author_id")
    public final String authorId;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("is_organic")
    public final String isOrganic;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("organic_log_extra")
    public final String organicLogExtra;

    @C09CT("origin_anchor_data")
    public final AnchorCommonStruct originAnchorData;

    @C09CT("page_data")
    public PageData pageData;

    public FEAnchorData(String str, String str2, String str3, String str4, String str5, String str6, Integer num, AnchorCommonStruct anchorCommonStruct, PageData pageData) {
        this.isOrganic = str;
        this.enterFrom = str2;
        this.itemId = str3;
        this.enterMethod = str4;
        this.authorId = str5;
        this.organicLogExtra = str6;
        this.anchorIndex = num;
        this.originAnchorData = anchorCommonStruct;
        this.pageData = pageData;
    }
}
