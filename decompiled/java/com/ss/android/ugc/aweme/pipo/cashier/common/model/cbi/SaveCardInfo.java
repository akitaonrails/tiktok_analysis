package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class SaveCardInfo {

    @C09CT("more_content")
    public final String moreContent;

    @C09CT("more_title")
    public final String moreTitle;

    @C09CT("save_card_desc")
    public final String saveCardDesc;

    @C09CT("save_card_title")
    public final String saveCardTitle;

    public SaveCardInfo() {
        this(null, null, null, null);
    }

    public SaveCardInfo(String str, String str2, String str3, String str4) {
        this.saveCardTitle = str;
        this.saveCardDesc = str2;
        this.moreTitle = str3;
        this.moreContent = str4;
    }
}
