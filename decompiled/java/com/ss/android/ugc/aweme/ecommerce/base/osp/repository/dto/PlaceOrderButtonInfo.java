package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaceOrderButtonInfo {

    @C09CT("button_text")
    public String buttonText;

    @C09CT("button_text_list")
    public List<ButtonTextInfo> buttonTextList;

    @C09CT("button_text_rich_text")
    public ECRichText buttonTextRichText;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("hide_price_sub_text_savings")
    public Boolean hidePriceSubTextSavings;

    @C09CT("hide_total_price")
    public Boolean hideTotalPrice;

    @C09CT("subtext_area")
    public SubtextArea subtextArea;

    public PlaceOrderButtonInfo() {
        this(null, null, null, null, null, null, null);
    }

    public PlaceOrderButtonInfo(String str, SubtextArea subtextArea, Boolean bool, ECRichText eCRichText, String str2, List<ButtonTextInfo> list, Boolean bool2) {
        this.buttonText = str;
        this.subtextArea = subtextArea;
        this.hideTotalPrice = bool;
        this.buttonTextRichText = eCRichText;
        this.daInfo = str2;
        this.buttonTextList = list;
        this.hidePriceSubTextSavings = bool2;
    }
}
