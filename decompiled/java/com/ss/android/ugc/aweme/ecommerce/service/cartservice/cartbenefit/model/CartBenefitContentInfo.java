package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;

/* JADX INFO: loaded from: classes27.dex */
public final class CartBenefitContentInfo {

    @C09CT("delay_show_second")
    public final Integer delayShowSecond;

    @C09CT("description")
    public final String desc;

    @C09CT("desc_args")
    public final TextArgs descArgs;

    @C09CT("dynamic_duration_second")
    public final Integer dynamicDurationSecond;

    @C09CT("icon")
    public final Icon icon;

    @C09CT("schema")
    public final String schema;

    public CartBenefitContentInfo(Icon icon, String str, Integer num, Integer num2, String str2, TextArgs textArgs) {
        this.icon = icon;
        this.desc = str;
        this.delayShowSecond = num;
        this.dynamicDurationSecond = num2;
        this.schema = str2;
        this.descArgs = textArgs;
    }
}
