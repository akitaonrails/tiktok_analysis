package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class MultiCTAInfo implements Serializable {

    @C09CT("backup_bg_color")
    public final BackUpBgColor backupBgColor;

    @C09CT("card_name")
    public final String cardName;

    @C09CT("mask_info")
    public final MaskInfo maskInfo;

    @C09CT("product_cards")
    public final List<ProductCard> productCards;

    @C09CT("view_more")
    public final ViewMore viewMore;

    public MultiCTAInfo(String str, List<ProductCard> list, ViewMore viewMore, MaskInfo maskInfo, BackUpBgColor backUpBgColor) {
        this.cardName = str;
        this.productCards = list;
        this.viewMore = viewMore;
        this.maskInfo = maskInfo;
        this.backupBgColor = backUpBgColor;
    }
}
