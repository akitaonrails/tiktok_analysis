package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class TradeEntranceInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("title_en")
    public String entryName;

    @C09CT("icon_dark_url")
    public String iconDarkUrl;

    @C09CT("icon_url")
    public String iconUrl;

    @C09CT("schema")
    public String schema;

    @C09CT("tips")
    public String tips;

    @C09CT("title")
    public String title;

    @C09CT("to_review_count")
    public Integer toReviewCount;

    @C09CT("type")
    public final Integer type;

    public TradeEntranceInfo() {
        this(Integer.valueOf(OrderEntranceType.CLOSE.ordinal()), "", "", null, null, null, null, 0);
    }

    public final void setEntryName(String str) {
        this.entryName = str;
    }

    public final void setIconDarkUrl(String str) {
        this.iconDarkUrl = str;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setTips(String str) {
        this.tips = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setToReviewCount(Integer num) {
        this.toReviewCount = num;
    }

    public TradeEntranceInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Integer num2) {
        this.type = num;
        this.tips = str;
        this.schema = str2;
        this.title = str3;
        this.entryName = str4;
        this.iconUrl = str5;
        this.iconDarkUrl = str6;
        this.toReviewCount = num2;
    }
}
