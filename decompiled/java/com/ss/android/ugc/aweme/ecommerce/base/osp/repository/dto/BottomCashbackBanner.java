package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes2.dex */
public final class BottomCashbackBanner {

    @C09CT("desc")
    public String desc;

    @C09CT("desc_rich_text")
    public ECRichText descRichText;

    @C09CT("desc_type")
    public Integer descType;

    public BottomCashbackBanner() {
    }

    public BottomCashbackBanner(String str, Integer num, ECRichText eCRichText) {
        this.desc = str;
        this.descType = num;
        this.descRichText = eCRichText;
    }
}
