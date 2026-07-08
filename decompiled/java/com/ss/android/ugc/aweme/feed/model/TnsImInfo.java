package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class TnsImInfo implements Serializable {

    @C09CT("card_banner_label")
    public final String cardBannerLabel;

    @C09CT("caution_label")
    public final String cautionLabel;

    @C09CT("label_category")
    public final Integer labelCategory;

    @C09CT("thumbnail_label")
    public final String thumbnailLabel;

    public TnsImInfo(Integer num, String str, String str2, String str3) {
        this.labelCategory = num;
        this.cautionLabel = str;
        this.thumbnailLabel = str2;
        this.cardBannerLabel = str3;
    }
}
