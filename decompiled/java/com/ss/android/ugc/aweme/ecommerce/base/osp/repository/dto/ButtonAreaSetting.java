package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ButtonAreaSetting {

    @C09CT("benefit_emphasis_style")
    public Integer benefitEmphasisStyle;

    @C09CT("hide_total_price")
    public Boolean hideTotalPrice;

    @C09CT("highlight_total_price")
    public Boolean highlightTotalPrice;

    @C09CT("style")
    public Integer style;

    public ButtonAreaSetting() {
        this(null, null, Boolean.FALSE, Boolean.FALSE);
    }

    public ButtonAreaSetting(Integer num, Integer num2, Boolean bool, Boolean bool2) {
        this.style = num;
        this.benefitEmphasisStyle = num2;
        this.highlightTotalPrice = bool;
        this.hideTotalPrice = bool2;
    }
}
