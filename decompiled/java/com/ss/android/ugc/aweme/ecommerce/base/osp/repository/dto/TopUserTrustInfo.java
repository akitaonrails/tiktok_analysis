package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;

/* JADX INFO: loaded from: classes2.dex */
public final class TopUserTrustInfo {

    @C09CT("icon")
    public Icon icon;

    @C09CT("text")
    public String text;

    @C09CT("text_color")
    public Integer textColor;

    @C09CT("text_font")
    public Integer textFont;

    public TopUserTrustInfo() {
    }

    public TopUserTrustInfo(String str, Integer num, Integer num2, Icon icon) {
        this.text = str;
        this.textColor = num;
        this.textFont = num2;
        this.icon = icon;
    }
}
