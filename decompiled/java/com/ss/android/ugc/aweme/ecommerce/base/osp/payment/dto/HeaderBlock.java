package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;

/* JADX INFO: loaded from: classes2.dex */
public final class HeaderBlock {

    @C09CT("icon")
    public Icon icon;

    @C09CT("sub_title")
    public String subTitle;

    @C09CT("title")
    public String title;

    public HeaderBlock() {
        this(null, null, null);
    }

    public HeaderBlock(Icon icon, String str, String str2) {
        this.icon = icon;
        this.title = str;
        this.subTitle = str2;
    }
}
