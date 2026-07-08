package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaceOrderButtonStyle {

    @C09CT("main_text_font")
    public Integer mainTextFont;

    @C09CT("sub_text_font")
    public Integer subTextFont;

    public PlaceOrderButtonStyle() {
        this(null, null);
    }

    public PlaceOrderButtonStyle(Integer num, Integer num2) {
        this.mainTextFont = num;
        this.subTextFont = num2;
    }
}
