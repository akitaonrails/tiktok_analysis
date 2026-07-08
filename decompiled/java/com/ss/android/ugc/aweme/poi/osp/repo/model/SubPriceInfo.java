package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.LsRichText;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class SubPriceInfo implements Serializable {

    @C09CT("rich_text_title")
    public final LsRichText richTextTitle;

    @C09CT("sub_prices")
    public final List<PriceItem> subPrices;

    @C09CT("title")
    public final String title;

    public SubPriceInfo() {
        this(null, null, null);
    }

    public SubPriceInfo(String str, LsRichText lsRichText, List<PriceItem> list) {
        this.title = str;
        this.richTextTitle = lsRichText;
        this.subPrices = list;
    }
}
