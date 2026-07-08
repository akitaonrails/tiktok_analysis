package com.bytedance.pipo.ttpay.portal.wallet;

import X.C09CT;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.TextDO;

/* JADX INFO: loaded from: classes27.dex */
public final class BalanceUnavailableDO {

    @C09CT("background")
    public final BackgroundDO background;

    @C09CT("height")
    public final String height;

    @C09CT("sub_title")
    public final TextDO subtitle;

    @C09CT("title")
    public final TextDO title;

    public BalanceUnavailableDO() {
        this(null, null, null, null);
    }

    public BalanceUnavailableDO(String str, TextDO textDO, TextDO textDO2, BackgroundDO backgroundDO) {
        this.height = str;
        this.title = textDO;
        this.subtitle = textDO2;
        this.background = backgroundDO;
    }
}
