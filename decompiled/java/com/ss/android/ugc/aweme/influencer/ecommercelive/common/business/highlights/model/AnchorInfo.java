package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public final class AnchorInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("can_delete")
    public final Boolean canDelete;

    @C09CT("content")
    public final String content;

    @C09CT("extra")
    public final String extra;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("keyword")
    public final String keyword;

    @C09CT("language")
    public final String language;

    @C09CT("subtype")
    public final String subtype;

    @C09CT("type")
    public final Integer type;

    @C09CT("url")
    public final String url;

    public AnchorInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        this.type = num;
        this.subtype = str;
        this.keyword = str2;
        this.url = str3;
        this.language = str4;
        this.content = str5;
        this.extra = str6;
        this.iconUrl = str7;
        this.canDelete = bool;
    }
}
